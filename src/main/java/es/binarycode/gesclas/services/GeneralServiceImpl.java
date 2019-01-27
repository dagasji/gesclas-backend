package es.binarycode.gesclas.services;

import java.util.List;

import org.apache.commons.collections4.IterableUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import es.binarycode.gesclas.mappers.GenericMapper;
/**
 * 
 * @author Dani
 *
 * @param <E> DTO entrada
 * @param <T> Entidad
 * 
 */
@Service
public abstract class GeneralServiceImpl<E, T> implements GeneralService<E, T>{
	
	@Autowired
	private CrudRepository<T, Integer> repo;	
	
	
	public abstract GenericMapper<E, T> getMapper();

	public E findById(Integer id) {
		T result = repo.findById(id).get();
		
		E entity = getMapper().entityToDTO(result);
		
		return entity;
	}


	@Override
	public List<E> findAll() {
		List<T> list = IterableUtils.toList(repo.findAll());
		
		List<E> listaDTO = this.getMapper().listToDTOList(list);
		
		return listaDTO;
	}

	@Override
	public void update(E entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(E entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(E entity) {
		// TODO Auto-generated method stub
		
	}
}
