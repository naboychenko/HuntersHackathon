package ru.hunters.common.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "eoc")
public class EpisodeOfCare {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "identifier", nullable = false)
    private String identifier;

    @Column(name = "timestamp", nullable = false)
    private Timestamp timestamp;

    @OneToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @OneToOne
    @JoinColumn(name = "team_id")
    private Team team;

    @OneToOne
    @JoinColumn(name = "organization_id")
    private Organization organization;
}
