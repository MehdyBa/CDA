package co.simplon.hardwareTacticalAPI.services;

import java.util.Collection;

import org.springframework.stereotype.Service;

import co.simplon.hardwareTacticalAPI.dtos.CategoriesView;
import co.simplon.hardwareTacticalAPI.repositories.CategoriesRepository;

@Service
public class CategoriesServiceImpl
	implements CategoriesService {

    private CategoriesRepository categories;

    public CategoriesServiceImpl(CategoriesRepository categories) {
	this.categories = categories;
    }

    @Override
    public Collection<CategoriesView> getAll() {
	return this.categories.findAllProjectedBy();
    }

}
