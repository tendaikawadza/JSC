package Inventory.Management.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Inventory.Management.Entity.Product;
import Inventory.Management.repository.ProductRepository;
@Service
public class ProductService {
	private final ProductRepository productRepository;
	
@Autowired	
	
	public ProductService( ProductRepository productRepository) {
		this.productRepository = productRepository;		


}
public Product  addProuct(Product  product) {
	product.setProductCode(UUID.randomUUID().toString());	
	return  productRepository.save(product);
}
public Product findProductById(Long id){
return productRepository.findById(id).get();
}




//public Optional<Product> findProductById(Long id) {
//return productRepository.findById(id);
//}


public  List<Product> findAllProducts(){



	
	return productRepository.findAll();
}

public Product updateProduct(Product product) {
	
	return productRepository.save(product);
	
}
//public Optional<Product> findProductById(Long id) {
//Optional<Product> Product = Optional.ofNullable(productRepository.findById(id).orElseThrow(RuntimeException::new));
//return Product;
//}


public void deleteProduct(Long id) {
	productRepository.deleteById(id);
	
	
}


}
