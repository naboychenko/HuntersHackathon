package ru.hunters.common.domain;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "team")
public class Team {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private String id;

    @OneToMany
    @JoinColumn(name = "doctor_id")
    private List<Doctor> doctor;
}
