package me.akashmaji;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	@GetMapping("/home")
	public String home() {
		return "Home Sweet Home Ka Beda";
	}
}
