package com.inatel.controller;

import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/item", produces = "application/json")
public class ItemController {

	@GetMapping("/")
	public String index() {
		return "It works!";
	}

	@PostMapping("/")
	public ResponseEntity<Object> name(@RequestBody String name) {
		JSONObject entity = new JSONObject();
		entity.put("success", "true");
		entity.put("message:", "Item XXXX was added!");
		return ResponseEntity.status(HttpStatus.CREATED).body(entity.toMap());
	}
}