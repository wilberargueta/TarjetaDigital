package com.dominosoft.targetadigital.services.imp;

import java.util.List;

import javax.jws.WebService;

import com.dominosoft.targetadigital.model.Tarjeta;
import com.dominosoft.targetadigital.repository.TarjetaRepository;
import com.dominosoft.targetadigital.repository.imp.TarjetaRepositoryImp;
import com.dominosoft.targetadigital.services.TarjetaService;

@WebService(endpointInterface = "com.dominosoft.targetadigital.services.TarjetaService")
public class TarjetaServiceImp implements TarjetaService {
	
	private TarjetaRepository tarjetaRepository = new TarjetaRepositoryImp();

	@Override
	public Tarjeta save(Tarjeta tarjeta) {
		// TODO Auto-generated method stub
		return tarjetaRepository.save(tarjeta);
	}

	@Override
	public List<Tarjeta> getAll() {
		// TODO Auto-generated method stub
		return tarjetaRepository.getAll();
	}

}
