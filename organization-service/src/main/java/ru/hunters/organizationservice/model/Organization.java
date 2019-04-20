package ru.hunters.organizationservice.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "organization")
public class Organization {

    @Id
    @Column(name = "identifier", nullable = false)
    private String identifier;

    @Column(name = "name", nullable = false)
    private String name;
}
