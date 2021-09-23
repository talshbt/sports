package com.jb.sports.clr;

import com.jb.sports.beans.Player;
import com.jb.sports.beans.SportType;
import com.jb.sports.beans.Team;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
@Order(1)
@RequiredArgsConstructor
public class Testing implements CommandLineRunner {

    private final RestTemplate restTemplate;
    private static final String URL = "http://localhost:8080/sport/teams";
    private ResponseEntity<String> res = null;
    @Override
    public void run(String... args) throws Exception {
        Player p1 = Player.builder().name("p1").Birthday(Date.valueOf(LocalDate.now().minusYears(10).plusDays(3))).shirtNumber(1).build();
        Player p2 = Player.builder().name("p2").Birthday(Date.valueOf(LocalDate.now().minusYears(30).minusMonths(12))).shirtNumber(2).build();
        Player p3 = Player.builder().name("p3").Birthday(Date.valueOf(LocalDate.now().minusYears(25))).shirtNumber(3).build();
        Player p4 = Player.builder().name("p4").Birthday(Date.valueOf(LocalDate.now().minusYears(14))).shirtNumber(4).build();

        Team t1 = Team.builder().name("Team1").sportType(SportType.Soccer).players(Arrays.asList(p1,p2)).build();
        Team t2 = Team.builder().name("Team2").sportType(SportType.Soccer).players(Arrays.asList(p4,p2)).build();


        //Adding Teams
       res =  restTemplate.postForEntity(URL,t1,String.class);
        System.out.println("res of " + t1.getName() + "=" + res.getStatusCode().value());
       res = restTemplate.postForEntity(URL,t2,String.class);
        System.out.println("res of " + t2.getName() + "=" + res.getStatusCode().value());

        //Get Teams
        Arrays.stream(Objects.requireNonNull(restTemplate.getForEntity(URL, Team[].class).getBody())).collect(Collectors.toList()).forEach(System.out::println);

    }
}
