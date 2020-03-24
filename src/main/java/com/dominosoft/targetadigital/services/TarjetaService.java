package com.dominosoft.targetadigital.services;

import java.util.List;

import javax.jws.WebService;

import com.dominosoft.targetadigital.model.Tarjeta;

@WebService
public interface TarjetaService {
	/**
	 * Metodo para crear una tarjeta
	 * 
	 * @param tarjeta
	 * @return tarjeta creada
	 */
	public Tarjeta save(Tarjeta tarjeta);

	/**
	 * Metodo para listar todas las tarjetas
	 * 
	 * @return listado de tarjetas
	 */
	public List<Tarjeta> getAll();
}
