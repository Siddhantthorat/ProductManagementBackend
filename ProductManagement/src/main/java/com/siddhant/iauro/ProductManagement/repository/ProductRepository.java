package com.siddhant.iauro.ProductManagement.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.siddhant.iauro.ProductManagement.models.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product,Integer> {

//	boolean findById(int id);

	List<Product> findByVisible(boolean b);

	Product getById(int id);

}
