package in.com.app.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		return "Welcome to the Spring REST API development";
	}

	@GetMapping("/wish")
	public ResponseEntity<String> getWishMsg() {
		return new ResponseEntity<String>("Good Morning !!!!", HttpStatus.OK);
	}
}
