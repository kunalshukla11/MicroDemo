package com.example.MicroDemo;

import com.example.MicroDemo.model.Team;
import com.example.MicroDemo.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

@SpringBootApplication/*(exclude = {ErrorMvcAutoConfiguration.class})*/

public class MicroDemoApplication {

	@Autowired
	TeamRepository teamRepository;
	public static void main(String[] args) {
		SpringApplication.run(MicroDemoApplication.class, args);
	}

	@PostConstruct
	public void init(){
		ArrayList<Team> list = new ArrayList<>();

		Team team;
		team = new Team();

		team.setLocation("Harlem");
		team.setName("Globetrotters");
		list.add(team);

		team = new Team();

		team.setLocation("Washington");
		team.setName("Generals");
		list.add(team);

		teamRepository.saveAll(list);
		//Doing some changes i

	}
	public void doNothing(){
		System.out.println("do notthing");
	}

}

