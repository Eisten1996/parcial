package com.dipper.parcial.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.dipper.parcial.entities.Film;

@RestController
@RequestMapping("/api")
public class FilmController {

	RestTemplate restTemplate = new RestTemplate();

	String url = "https://ghibliapi.herokuapp.com/films";
	Film[] response = restTemplate.getForObject(url, Film[].class);

	@GetMapping(value = "/films")
	public ResponseEntity<?> list_films() {
		return new ResponseEntity<Film[]>(response, HttpStatus.OK);

	}

	@GetMapping(value = "/films/{name}")
	public ResponseEntity<?> ver_film(@PathVariable String name) {
		Film film = new Film();
		for (int i = 0; i < response.length; i++) {
			if (response[i].getTitle() == name) {
				film = response[i];
			}
		}

		return new ResponseEntity<Film>(film, HttpStatus.OK);
	}

}
