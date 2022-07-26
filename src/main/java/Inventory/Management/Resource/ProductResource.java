package Inventory.Management.Resource;
import java.util.List;

import Inventory.Management.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import Inventory.Management.Entity.Product;
import Inventory.Management.Service.ProductService;
@RestController
@RequestMapping("/product")
public class ProductResource {
	@Autowired
	private final ProductService  productService;

	public ProductResource(ProductService productService) {
		
		this.productService=productService;
			}
	@GetMapping("/all")
	public ResponseEntity<List<Product>>getAllProducts(){
		
		List<Product> products=productService.findAllProducts();
		return new ResponseEntity<>(products,HttpStatus.OK);
		}

	@GetMapping("/find/{id}")
	public ResponseEntity<Product>getProductById(@PathVariable("id")Long id){
		ResponseEntity<Object> products=productService.getProduct( );
		return new ResponseEntity<Product>(HttpStatus.OK);
	}

	@PostMapping("/add")
	public ResponseEntity<Product>addProduct(@RequestBody Product product){

		Product newProduct=productService.addProduct(product);
		return new ResponseEntity<>( newProduct , HttpStatus.CREATED);

	}


	@PutMapping("/update")
	public ResponseEntity<Product>updateProduct(@RequestBody Product product){

		Product updateProduct=productService.addProduct(product);
		return new ResponseEntity<>( updateProduct , HttpStatus.CREATED);

	}


	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?>deleteProduct(@PathVariable("id")Long id){	

		productService.deleteProduct(id);
		return new ResponseEntity<>( HttpStatus.OK);
		
	}

}
		
		
		
	
	
	
	


