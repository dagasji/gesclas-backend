package es.binarycode.gesclas.repository;


import org.springframework.data.repository.CrudRepository;

import es.binarycode.gesclas.entity.Indicador;


/**
 *
 * <p>Title: UserDao</p>
 *
 * <p>Description: Interface of a Data access object dealing with UserDao
 * persistence. It offers a set of methods which allow for saving,
 * deleting and searching user objects</p>
 *
 */
public interface IndicadorRepository extends CrudRepository<Indicador,Integer>{

}
