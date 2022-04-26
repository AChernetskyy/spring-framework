package com.cydeo.entity;

import com.cydeo.enums.State;
import com.cydeo.enums.Type;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Movie extends BaseEntity{
    private String name;
    private BigDecimal price;
    @Enumerated(EnumType.STRING)
    private Type type;
    @Enumerated(EnumType.STRING)
    private State state;
    @Column(columnDefinition = "DATE")
    private LocalDate releaseDate;
    private Integer duration;
    @Column(columnDefinition = "text")
    private String summary;

    @OneToMany(mappedBy = "movie")
    private List<MovieCinema> movieCinema;

    @ManyToMany
    @JoinTable(name = "movie_genre_rel",
    joinColumns = @JoinColumn(name = "movie_id"),
    inverseJoinColumns = @JoinColumn(name = "genre_id"))
    private List<Genre>genre;


}
