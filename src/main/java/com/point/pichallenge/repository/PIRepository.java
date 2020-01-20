package com.point.pichallenge.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.point.pichallenge.entity.PI;

@Repository
public interface PIRepository extends CrudRepository<PI, Long> {

	@Query(value = "SELECT * FROM pi WHERE CORD_CALCULATED  <= :cordCalculated",nativeQuery = true)
	Iterable<PI> findAllNextPI(@Param("cordCalculated") int cordCalculated);
	
	
}
