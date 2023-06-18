package com.unla.grupo6.implementation;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//import com.unla.grupo6.converts.DisEstacionamientoConvert;
import com.unla.grupo6.entities.DisEstacionamiento;
import com.unla.grupo6.models.DisEstacionamientoModel;
import com.unla.grupo6.repositories.IEstacionamientoRepository;
import com.unla.grupo6.servicies.IEstacionamientoService;

@Service("estacionamientoService")
public class EstacionamientoService implements IEstacionamientoService{

	@Autowired
	@Qualifier("estacionamientoRepository")
	private IEstacionamientoRepository estacionamientoRepository;
	
//	@Autowired
//	@Qualifier("disEstacionamientoConvert")
//	private DisEstacionamientoConvert disEstacionamientoConvert;
	
	private ModelMapper modelMapper = new ModelMapper();

	
	@Override
	public List<DisEstacionamiento> getAll() {
		return estacionamientoRepository.findAll();
	}

	@Override
	public DisEstacionamientoModel insertOrUpdate(DisEstacionamientoModel objDisEstacionamiento) {
		DisEstacionamiento disEstacionamiento = estacionamientoRepository.save(modelMapper.map(objDisEstacionamiento, DisEstacionamiento.class));
		return modelMapper.map(disEstacionamiento, DisEstacionamientoModel.class);
	}

}