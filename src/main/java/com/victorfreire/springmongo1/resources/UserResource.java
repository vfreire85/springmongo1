package com.victorfreire.springmongo1.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.victorfreire.springmongo1.domain.User;
import com.victorfreire.springmongo1.dto.UserDTO;
import com.victorfreire.springmongo1.services.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@Autowired	
	private UserService service;
		
		@RequestMapping(method=RequestMethod.GET)
		public ResponseEntity<List<UserDTO>> findAll() {
			List<User> list = service.findAll();
			List<UserDTO> listDto = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
			return ResponseEntity.ok().body(listDto);
		}
}
