package ru.hunters.organizationservice.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Table(name = "organization")
public class Organization {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "identifier", nullable = false)
    private String identifier;

    @Column(name = "name", nullable = false)
    private String name;
}
