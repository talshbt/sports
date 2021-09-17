package com.jb.sports.controllers;

import com.jb.sports.beans.Team;
import com.jb.sports.services.SportService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("sport")
@RequiredArgsConstructor
public class SportController {

    private final SportService sportService;

    @PostMapping("teams")
    @ResponseStatus(HttpStatus.CREATED)
    public void addTeam(@RequestBody Team team){
        sportService.addTeam(team);
    }

    @GetMapping("teams")
    public List<Team> getAllTeams(){
        return sportService.getAllTeams();
    }

}
