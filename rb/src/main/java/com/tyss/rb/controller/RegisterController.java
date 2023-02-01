package com.tyss.rb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.rb.dto.UserDto;
import com.tyss.rb.response.AppResponse;
import com.tyss.rb.service.ResumeService;

@RestController
public class RegisterController {

	@Autowired
	private AppResponse appResponse;

	@Autowired
	private ResumeService userService;

	@PostMapping(path = "/addUser")
	public ResponseEntity<AppResponse> addUser(@RequestBody UserDto userDto) {
		UserDto returnDto = userService.addUser(userDto);
		if (returnDto != null) {
			appResponse.setError(false);
			appResponse.setMessage("User Saved Successfully");
			appResponse.setData(returnDto.getUsername() + " " + returnDto.getEmail());
			appResponse.setStatus(HttpStatus.OK.value());
			return new ResponseEntity<AppResponse>(appResponse, HttpStatus.OK);
		} else {
			appResponse.setError(false);
			appResponse.setMessage("User not Saved Successfully");
			appResponse.setData(null);
			appResponse.setStatus(HttpStatus.NOT_FOUND.value());
			return new ResponseEntity<AppResponse>(appResponse, HttpStatus.NOT_FOUND);
		}

	}

}
