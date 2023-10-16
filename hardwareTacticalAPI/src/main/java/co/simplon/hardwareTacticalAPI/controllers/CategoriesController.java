package co.simplon.hardwareTacticalAPI.controllers;

import java.util.Collection;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.hardwareTacticalAPI.dtos.CategoriesView;
import co.simplon.hardwareTacticalAPI.services.CategoriesService;

@RestController
@RequestMapping("/categories")
@CrossOrigin
public class CategoriesController {

    private CategoriesService service;

    public CategoriesController(CategoriesService service) {
	this.service = service;
    }

    @GetMapping
    public Collection<CategoriesView> getAll() {
	return service.getAll();
    }
}
