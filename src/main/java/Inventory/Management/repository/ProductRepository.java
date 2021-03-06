package Inventory.Management.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Inventory.Management.Entity.Product;

@Repository
public interface ProductRepository  extends JpaRepository   <Product,Long> {
    void put(Long productId, Product product);
}
