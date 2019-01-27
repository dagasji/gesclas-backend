package es.binarycode.gesclas.services;

import java.util.List;

/**
 * General Service
 * 
 * @author dagasji
 */
public interface GeneralService<E, T> {

	E findById(Integer id);
	
	List<E> findAll(); 

	void update(E entity);

	void create(E entity);
	
	void delete(E entity);
}
