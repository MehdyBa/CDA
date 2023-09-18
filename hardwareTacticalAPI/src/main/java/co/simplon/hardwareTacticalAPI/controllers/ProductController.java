package co.simplon.hardwareTacticalAPI.controllers;

import java.util.Collection;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.hardwareTacticalAPI.dtos.ProductCreateDto;
import co.simplon.hardwareTacticalAPI.dtos.ProductView;
import co.simplon.hardwareTacticalAPI.services.ProductService;

@RestController
@RequestMapping("/products")
@CrossOrigin
public class ProductController {

    private ProductService services;

    public ProductController(ProductService services) {
	this.services = services;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void create(
	    @Valid @RequestBody ProductCreateDto input) {
	services.create(input);
    }

    @GetMapping
    public Collection<ProductView> getAll() {
	return services.getAll();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
	services.delete(id);
    }

}
