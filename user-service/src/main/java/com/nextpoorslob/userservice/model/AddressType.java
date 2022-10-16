package com.nextpoorslob.userservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "address_type")
public class AddressType {

    public AddressType(Value value, String description) {
        this.value = value;
        this.description = description;
    }

    public enum Value {
        BILLING,
        MAILING,
        EMAIL,
        PHONE
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(name = "type_name")
    private Value value;

    private String description;

    public String getType() {
        return value.name();
    }

    public void setType(String name) {
        if (StringUtils.isBlank(name)) {
            throw new IllegalArgumentException("AddressType name is required!");
        }
        value = Value.valueOf(name.toUpperCase());
    }
}
