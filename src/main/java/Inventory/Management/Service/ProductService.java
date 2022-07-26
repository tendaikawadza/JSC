package Inventory.Management.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import Inventory.Management.Entity.Product;
import Inventory.Management.repository.ProductRepository;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class ProductService {
	private final ProductRepository productRepository;
    @Autowired
    public ProductService( ProductRepository productRepository) {
		this.productRepository = productRepository;

}

	@RequestMapping(value = "/products")
	public ResponseEntity<Object> getProduct() {
		return new ResponseEntity<>(productRepository, HttpStatus.OK);
	}



public Product addProduct(Product product){

    productRepository.put(product.getProductId(),product);
	return product;
}
public  List<Product> findAllProducts(){
	
	return productRepository.findAll();
}



public Product updateProduct(Product product) {
	
	return productRepository.save(product);
	
}

public void deleteProduct(Long id) {
	productRepository.deleteById(id);
	
	
}


}
