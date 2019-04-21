package ru.hunters.common.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "doctor")
public class Doctor {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "identifier", nullable = false)
    private String identifier;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "issuer", nullable = false)
    private String issuer;

    @Column(name = "qualification", nullable = false)
    private String qualification;
}
