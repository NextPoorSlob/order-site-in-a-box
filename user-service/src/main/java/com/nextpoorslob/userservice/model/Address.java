package com.nextpoorslob.userservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "address")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String data;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Address(String data) {
        id = null;
        this.data = data;
        user = null;
    }
}
