package org.aboytsov.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
public class Profile {

    @Id
    @GeneratedValue
    private UUID id;

    @Column
    private String email;

    @Column
    private String firstName;

    @Column
    private String lastName;

}
