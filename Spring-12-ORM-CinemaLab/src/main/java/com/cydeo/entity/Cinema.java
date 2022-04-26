package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Cinema extends BaseEntity{
    private String name;
    private String sponsoredName;


    @OneToMany(mappedBy = "cinema")
    private List<MovieCinema> movieCinema;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id")
    private Location location;



}
