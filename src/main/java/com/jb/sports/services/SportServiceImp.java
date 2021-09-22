package com.jb.sports.services;

import com.jb.sports.beans.Team;
import com.jb.sports.repos.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class SportServiceImp implements SportService{
    private final TeamRepository teamRepository;

    @Override
    public void addTeam(Team team) {
        teamRepository.save(team);
    }

    @Override
    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }

    @Override
    public Team getTeamById(long teamId) {
         return teamRepository.findById(teamId).get();
    }


}
