package br.com.nogueira.bluefood.infrastructure.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping(params = { "/login", "/" })
	public String login() {
		return "login";
	}

}
