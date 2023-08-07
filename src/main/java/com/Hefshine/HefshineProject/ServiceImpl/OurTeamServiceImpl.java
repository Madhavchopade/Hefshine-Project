package com.Hefshine.HefshineProject.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.Hefshine.HefshineProject.Model.OurTeam;
import com.Hefshine.HefshineProject.Repository.OurTeamRepo;
import com.Hefshine.HefshineProject.Service.OurTeamService;


@Component
public class OurTeamServiceImpl implements OurTeamService {
	
	@Autowired
	OurTeamRepo ourteam;

	@Override
	public ResponseEntity<String> addteam(OurTeam team) {
		 ourteam.save(team);
		return ResponseEntity.ok("team member addedd successfully");
	}

	@Override
	public List<OurTeam> getallteam() {
		
		return ourteam.findAll();
	}

}
