package com.ezen.guru.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class ProducePlanerId implements Serializable {

    @Column(name = "produce_planer_id")
    private String producePlanerId;

    @Column(name = "bicycle_id")
    private int bicycleId;

    @Column(name = "material_id")
    private int materialId;
}
