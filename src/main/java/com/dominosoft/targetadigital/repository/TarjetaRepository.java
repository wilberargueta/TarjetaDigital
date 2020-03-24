package com.dominosoft.targetadigital.repository;

import java.util.List;

import com.dominosoft.targetadigital.model.Tarjeta;

public interface TarjetaRepository {
	/**
	 * Metodo para crear una tarjeta
	 * @param tarjeta
	 * @return tarjeta creada
	 */
	public Tarjeta save(Tarjeta tarjeta);

	/**
	 * Metodo para listar todas las tarjetas
	 * @return listado de tarjetas
	 */
	public List<Tarjeta> getAll();
	
}
