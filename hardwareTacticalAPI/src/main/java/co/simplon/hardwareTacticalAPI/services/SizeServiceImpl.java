package co.simplon.hardwareTacticalAPI.services;

import java.util.Collection;

import org.springframework.stereotype.Service;

import co.simplon.hardwareTacticalAPI.dtos.SizeView;
import co.simplon.hardwareTacticalAPI.repositories.SizeRepository;

@Service
public class SizeServiceImpl implements SizeService {

    private SizeRepository sizes;

    public SizeServiceImpl(SizeRepository sizes) {
	this.sizes = sizes;
    }

    @Override
    public Collection<SizeView> getAll() {
	return this.sizes.findAllProjectedBy();
    }

}
