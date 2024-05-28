package com.samsung.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/samsung")
public class SamsungController {

	
	@GetMapping("/")
	public ResponseEntity<String> greeting(){
		String s = "Hello Samsung , Welcome to galaxy world ";
		return new ResponseEntity<String>(s,HttpStatus.OK);
	}
	
}
