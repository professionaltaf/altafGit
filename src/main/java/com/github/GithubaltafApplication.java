package com.github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

@SpringBootApplication
public class GithubaltafApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubaltafApplication.class, args);

		System.out.println("altaf");
	}



}
