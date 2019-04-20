package ru.hunters.patientservice.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "patient")
public class Patient {

    @Id
    @Column(name = "patient_id", nullable = false)
    private String patientId;

    @Column(name = "organization_id", nullable = false)
    private String organizationId;

    @Column(name = "product_name", nullable = false)
    private String productName;

    @Column(name = "patient_type", nullable = false)
    private String patientType;

    @Column(name = "patient_max", nullable = false)
    private Integer patientMax;

    @Column(name = "patient_allocated", nullable = false)
    private Integer patientAllocated;

    @Column(name="comment")
    private String comment;
}
