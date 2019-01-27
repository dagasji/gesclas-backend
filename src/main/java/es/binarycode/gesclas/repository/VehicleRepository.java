package es.binarycode.gesclas.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import es.binarycode.gesclas.entity.Vehicle;


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
public interface VehicleRepository extends CrudRepository<Vehicle,String>{

	List<Vehicle> findByOnRepair(boolean onRepair);
	
	List<Vehicle> findByGas(String gas);
}
