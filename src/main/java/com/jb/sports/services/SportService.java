package com.jb.sports.services;

import com.jb.sports.beans.Team;

import java.util.List;

public interface SportService {

    void addTeam(Team team);
    List<Team> getAllTeams();
    List<Team> getAllTeams(long teamId);

}
