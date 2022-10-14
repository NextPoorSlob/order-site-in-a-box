package com.nextpoorslob.userservice.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
// Many databases have trouble with tables named 'user'.
@Table(name = "actor")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @OneToMany(mappedBy = "user")
    private Set<Address> addresses;

    public User(String firstName, String lastName) {
        id = null;
        this.firstName = firstName;
        this.lastName = lastName;
        addresses = null;
    }

    public void addAddress(Address address) {
        if (addresses == null) {
            addresses = new HashSet<>();
        }
        address.setUser(this);
        addresses.add(address);
    }
}
