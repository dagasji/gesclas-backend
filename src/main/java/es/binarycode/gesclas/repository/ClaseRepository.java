package es.binarycode.gesclas.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import es.binarycode.gesclas.entity.Clase;


/**
 *
 * <p>Title: UserDao</p>
 *
 * <p>Description: Interface of a Data access object dealing with UserDao
 * persistence. It offers a set of methods which allow for saving,
 * deleting and searching user objects</p>
 *
 */
public interface ClaseRepository extends CrudRepository<Clase,Integer>{
	
	public List<Clase> findByidUsuario(Integer idUsuario);

}
