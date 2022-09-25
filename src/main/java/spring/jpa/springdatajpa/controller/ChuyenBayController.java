package spring.jpa.springdatajpa.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChuyenBayController {
	@GetMapping("/home")
	public ResponseEntity hetHome() {
		return ResponseEntity.ok("helo cac ban nha");
	}

}
