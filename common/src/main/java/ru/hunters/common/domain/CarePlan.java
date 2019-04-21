package ru.hunters.common.domain;

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
@Table(name = "care_plan")
public class CarePlan {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "description", nullable = false)
    private String description;

    @OneToOne
    @JoinColumn(name = "eoc_id")
    private EpisodeOfCare eoc;
}
