package com.Hefshine.HefshineProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hefshine.HefshineProject.Model.OurTeam;

@Repository
public interface OurTeamRepo extends JpaRepository<OurTeam, Integer>{

}
