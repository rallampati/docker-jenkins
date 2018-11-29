package com.example.dockerjenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * Created by ram on 11/29/18
 */

@RestController
public class HomeController {

	@GetMapping
	public Mono<String> testMe()
	{
		return Mono.just(new String("Hello"));

	}
}
