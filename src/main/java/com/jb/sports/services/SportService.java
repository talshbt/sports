package com.jb.sports.services;

import com.jb.sports.beans.Team;
import com.jb.sports.exceptions.SportSystemException;

import java.util.List;

public interface SportService {

    void addTeam(Team team);
    List<Team> getAllTeams();
    Team getTeamById(long teamId) throws SportSystemException;

}
