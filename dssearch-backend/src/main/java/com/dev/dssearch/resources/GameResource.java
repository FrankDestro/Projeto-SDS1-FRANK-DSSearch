package com.dev.dssearch.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.dssearch.config.dto.GameDTO;
import com.dev.dssearch.entities.Game;
import com.dev.dssearch.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameResource {
	
	@Autowired
	private GameService service;
	
	@GetMapping
	public ResponseEntity<List<GameDTO>> findAllGames(){
		List<GameDTO> list = service.findAllGames();
		return ResponseEntity.ok().body(list);
	}

}
