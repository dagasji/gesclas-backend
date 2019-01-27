package es.binarycode.gesclas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.binarycode.gesclas.dto.UserDTO;
import es.binarycode.gesclas.services.security.UserAuthenticationService;

@RestController
@RequestMapping("/public/user")
@CrossOrigin(origins = "*")
public class AuthController {

	@Autowired
	UserAuthenticationService authentication;


	@PostMapping(value="/login")
	public UserDTO checkLogin(@RequestBody UserDTO req) {

		//En primer lugar se realiza una petición al servicio de autenticación 
		//En caso de recibir el valor, se añade al atributo token
		//Si no se recibe nada (Optional está vacio, lanzamos una excepción)
		req.setToken(authentication
				.login(req.getUsername(),req.getPassword())
				.orElseThrow(() -> new RuntimeException("invalid login and/or password")));
		return req;
	}

}
