package co.simplon.hardwareTacticalAPI.services;

import java.util.Collection;

import co.simplon.hardwareTacticalApi.dtos.CategoriesView;

public interface CategoriesService {
    Collection<CategoriesView> getAll();
}
