package com.dominosoft.targetadigital.repository.imp;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.dominosoft.targetadigital.model.Tarjeta;
import com.dominosoft.targetadigital.repository.TarjetaRepository;

public class TarjetaRepositoryImp implements TarjetaRepository {

	private static List<Tarjeta> tarjetas = null;
	private Log LOGGER = LogFactory.getLog(TarjetaRepositoryImp.class);

	@Override
	public Tarjeta save(Tarjeta tarjeta) {
		if (tarjetas == null)
			tarjetas = new ArrayList<Tarjeta>();
		this.LOGGER.info(":::[Agregando tarjeta]:::");
		tarjetas.add(tarjeta);
		return tarjeta;
	}

	@Override
	public List<Tarjeta> getAll() {
		if (tarjetas == null)
			tarjetas = new ArrayList<Tarjeta>();
		this.LOGGER.info(":::[Listado de tarjetas]:::");
		return tarjetas;
	}

}
