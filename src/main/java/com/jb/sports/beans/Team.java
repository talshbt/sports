package com.jb.sports.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="teams")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @Enumerated(EnumType.STRING)
    private SportType sportType;

    @OneToMany (cascade = CascadeType.ALL)
    List<Player> players = new ArrayList<>();


}
