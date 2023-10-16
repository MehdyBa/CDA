package co.simplon.hardwareTacticalAPI.repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.hardwareTacticalAPI.dtos.ProductView;
import co.simplon.hardwareTacticalAPI.entities.Product;


public interface ProductRepository
	extends JpaRepository<Product, Long> {

	Collection<ProductView> findAllProjectedBy();
}
