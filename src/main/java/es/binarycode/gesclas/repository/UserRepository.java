package es.binarycode.gesclas.repository;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import es.binarycode.gesclas.entity.User;



/**
 *
 * <p>Title: UserDao</p>
 *
 * <p>Description: Interface of a Data access object dealing with UserDao
 * persistence. It offers a set of methods which allow for saving,
 * deleting and searching user objects</p>
 *
 */
@Repository
public interface UserRepository extends CrudRepository<User,String>{

	Optional<User> findByUsernameOrEmail(String username, String email);
}
