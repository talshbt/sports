package com.jb.sports.repos;

import com.jb.sports.beans.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Integer> {
}
