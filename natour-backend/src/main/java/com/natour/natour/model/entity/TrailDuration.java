package com.natour.natour.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.natour.natour.model.dto.DurationDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "NT_TRAIL_DURATION")
public class TrailDuration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int mouths, days, hours, minutes;

    public TrailDuration(DurationDto duration) {
        mouths = duration.getMonths();
        days = duration.getDays();
        hours = duration.getHours();
        minutes = duration.getMinutes();
    }
}
