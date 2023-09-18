package co.simplon.hardwareTacticalAPI.services;
import java.util.Collection;

import co.simplon.hardwareTacticalAPI.dtos.ProductCreateDto;
import co.simplon.hardwareTacticalAPI.dtos.ProductView;

public interface ProductService {
    void create(ProductCreateDto inputs);

    void delete(Long id);

    Collection<ProductView> getAll();
}
