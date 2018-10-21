package com.spaceapps.canopener.SpaceAppCanOpener.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "natural_disasters_record")
public class NaturalDisasterListEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "disaster_name", nullable = false, updatable = false, unique = true)
    private String disasterName;

    public NaturalDisasterListEntity() {
    }

    public Long getId() {
        return id;
    }

    public String getDisasterName() {
        return disasterName;
    }

}
