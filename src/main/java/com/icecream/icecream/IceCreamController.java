package com.icecream.icecream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IceCreamController {

	@GetMapping("/ping")
	public String ping() {
		return "I am there";
	}
}
