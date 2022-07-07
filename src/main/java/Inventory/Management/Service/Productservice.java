package Inventory.Management.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Inventory.Management.Entity.Product;
import Inventory.Management.repository.ProductRepository;
@Service
public class Productservice {
	private final ProductRepository productRepository;
	
@Autowired	
	
	public Productservice( ProductRepository productRepository) {
		this.productRepository = productRepository;}





//public Optional<Product> findProductById(Long id) {
//return productRepository.findById(id);
//}

public Optional<Product> findUserById(Long id) {
Optional<Product> user = Optional.ofNullable(productRepository.findById(id).orElseThrow(RuntimeException::new));
return user;
}





public  List<Product> findAllProducts(){
	
	
	return productRepository.findAll();
}

public Product updateProduct(Product product) {
	
	return productRepository.save(product);
	
}


public void deleteProduct(Long id) {
	
	productRepository.deleteProductById(id);
	
}


}
