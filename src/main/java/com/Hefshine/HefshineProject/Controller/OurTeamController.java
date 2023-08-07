package com.Hefshine.HefshineProject.Controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Hefshine.HefshineProject.Model.OurTeam;
import com.Hefshine.HefshineProject.Service.OurTeamService;

@RestController
public class OurTeamController {
	
	@Autowired
	OurTeamService ourteam;
	
	@PostMapping("addteam")
	public ResponseEntity<String> addteam( @RequestBody OurTeam team)
	{
		return ourteam.addteam(team);
	}
	
	
	@GetMapping("getteam")
	public List<OurTeam> getteam()
	{
		return ourteam.getallteam();
	}
	

}
