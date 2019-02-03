package es.binarycode.gesclas.services;

import java.util.List;

import org.apache.commons.collections4.IterableUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	
	private static final Logger logger = LoggerFactory.getLogger(GeneralServiceImpl.class);
	
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
	public void update(E dto) {
		
		T entity = this.getMapper().dtoToEntity(dto);
		entity = this.repo.save(entity);
		
		logger.info("[" + this.getClass() + "] " + "update entity " + entity.toString());
		
	}

	@Override
	public void create(E dto) {
		
		T entity = this.getMapper().dtoToEntity(dto);
		entity = this.repo.save(entity);
		
		logger.info("[" + this.getClass() + "] " + "create entity " + entity.toString());
		
	}

	@Override
	public void delete(E dto) {

		T entity = this.getMapper().dtoToEntity(dto);
		this.repo.delete(entity);
		
		logger.info("[" + this.getClass() + "] " + "delete entity " + entity.toString());
		
		
	}
}
