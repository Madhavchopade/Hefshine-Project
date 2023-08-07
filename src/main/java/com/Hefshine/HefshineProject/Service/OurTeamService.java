package com.Hefshine.HefshineProject.Service;

import java.util.*;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Hefshine.HefshineProject.Model.OurTeam;

@Service
public interface OurTeamService {
	
	public ResponseEntity<String> addteam(OurTeam team);
	
	public List<OurTeam> getallteam();

	
}
