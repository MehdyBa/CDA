package co.simplon.hardwareTacticalAPI.repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.hardwareTacticalApi.dtos.ProductView;
import co.simplon.hardwareTacticalApi.entities.Product;

public interface ProductRepository
	extends JpaRepository<Product, Long> {
    Collection<ProductView> findAllProjectedBy();
}
