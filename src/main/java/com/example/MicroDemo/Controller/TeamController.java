package com.example.MicroDemo.Controller;

import com.example.MicroDemo.model.Team;
import com.example.MicroDemo.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//@RestController
public class TeamController {

    @Autowired
    TeamRepository teamRepository;

    @GetMapping("/teams")
    public Iterable<Team> getTeams(){
      return teamRepository.findAll();
    }
}
