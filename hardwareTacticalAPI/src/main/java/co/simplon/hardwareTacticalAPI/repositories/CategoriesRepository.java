package co.simplon.hardwareTacticalAPI.repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.hardwareTacticalAPI.dtos.CategoriesView;
import co.simplon.hardwareTacticalAPI.entities.Categories;

public interface CategoriesRepository
	extends JpaRepository<Categories, Long> {
    Collection<CategoriesView> findAllProjectedBy();
}