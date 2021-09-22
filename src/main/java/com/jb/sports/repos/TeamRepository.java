package com.jb.sports.repos;

import com.jb.sports.beans.Team;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeamRepository extends JpaRepository<Team, Long> {
    List<Team> findById(long id);

}
