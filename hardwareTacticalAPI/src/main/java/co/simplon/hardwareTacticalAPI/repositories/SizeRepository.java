package co.simplon.hardwareTacticalAPI.repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.hardwareTacticalAPI.dtos.SizeView;
import co.simplon.hardwareTacticalAPI.entities.Size;


public interface SizeRepository
	extends JpaRepository<Size, Long> {

	Collection<SizeView> findAllProjectedBy();
}
