package com.jb.sports.beans;

import com.jb.sports.utils.Age;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="players")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data

public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private Date Birthday ;
    private int shirtNumber;

    @Override
    public String toString(){
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Birthday=" + Birthday +
                ", Age=" + Age.calc(Birthday) +
                ", shirtNum" + shirtNumber +
                '}';
    }
}
