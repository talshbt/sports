package com.jb.sports.clr;

import com.jb.sports.beans.Player;
import com.jb.sports.beans.SportType;
import com.jb.sports.beans.Team;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Component
@Order(1)
@RequiredArgsConstructor
public class Testing implements CommandLineRunner {

    private final RestTemplate restTemplate;
    private static final String Url = "http://localhost:8080/sport/teams";
    @Override
    public void run(String... args) throws Exception {
        Player p1 = Player.builder().name("p1").shirtNumber(1).build();
        Player p2 = Player.builder().name("p2").shirtNumber(2).build();
        Player p3 = Player.builder().name("p3").shirtNumber(3).build();
        Player p4 = Player.builder().name("p4").shirtNumber(4).build();

        Team t1 = Team.builder().name("Team1").sportType(SportType.Soccer).players(Arrays.asList(p1,p2)).build();
        Team t2 = Team.builder().name("Team2").sportType(SportType.Soccer).players(Arrays.asList(p4,p2)).build();

    }
}
