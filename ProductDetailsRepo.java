package com.shoppingApplication;
import org.springframework.data.repository.CrudRepository;
import com.shoppingApplication.ProductDetails;

public interface ProductDetailsRepo extends CrudRepository<ProductDetails, Integer>{
    
}
