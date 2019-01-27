package es.binarycode.gesclas.repository;


import org.springframework.data.repository.CrudRepository;

import es.binarycode.gesclas.entity.TipoClase;


/**
 *
 * <p>Title: UserDao</p>
 *
 * <p>Description: Interface of a Data access object dealing with UserDao
 * persistence. It offers a set of methods which allow for saving,
 * deleting and searching user objects</p>
 *
 */
public interface TipoClaseRepository extends CrudRepository<TipoClase,Integer>{

}
