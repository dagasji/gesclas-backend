package es.binarycode.gesclas.services;

import java.util.Optional;

import es.binarycode.gesclas.dto.UserDTO;

public interface UserService {

	Optional<UserDTO> findByUsername(String username);

	UserDTO getUserByName(String name);

	void updateUser(String username, UserDTO user);

	void createUser(UserDTO user);

	/**
	 * Creates a random password for user and sends an email.
	 * @param username Username to reset password.
	 */
	void resetPassword(String username);
}
