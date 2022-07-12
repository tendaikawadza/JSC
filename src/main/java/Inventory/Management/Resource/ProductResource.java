package Inventory.Management.Resource;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Inventory.Management.Entity.Product;
import Inventory.Management.Service.ProductService;
@RestController
@RequestMapping("/product")
public class ProductResource {
	private final ProductService  productService;
	

	public ProductResource(ProductService productService) {
		
		this.productService=productService;
		
		
	}
	
	
	@GetMapping("/all")
	public ResponseEntity<List<Product>>getAllProducts(){
		
		List<Product> products=productService.findAllProducts();
		return new ResponseEntity<>(products,HttpStatus.OK);
		
	}
	@GetMapping("/find/id")
	public ResponseEntity<Product>getProductById(@PathVariable("id") Long id){
	Product product = productService.findProductById(id);
	return new ResponseEntity<>(product, HttpStatus.OK);
	}
	@PostMapping("/add")
	public ResponseEntity<Product>addProduct(@RequestBody Product product){
		

		Product newProduct=productService.addProuct(product);
		return new ResponseEntity<>(newProduct, HttpStatus.CREATED);
		
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<Product>updateProduct(@RequestBody Product product){
		

		Product updateProduct=productService.addProuct(product);
		return new ResponseEntity<>(updateProduct, HttpStatus.OK);
		
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?>deleteProduct(@PathVariable("id")Long id){	

		productService.deleteProduct(id);
		return new ResponseEntity<>( HttpStatus.OK);
		
		
	}
	
	
	
	
	
	
	
	
	

}
		
		
		
	
	
	
	


