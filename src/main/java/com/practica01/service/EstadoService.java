package com.practica01.service;

import com.practica01.domain.Estado;
import java.util.List;

public interface EstadoService {
    //Obtiene una lista de registro de la tabla de clientes y lo coloca en una 
    //lista de objetos cliente
    public List<Estado> getEstados();
    
    
    //obtiene el registro de la tabla cliente
    //que tiene el idCliente pasado por el cliente
    public Estado getEstado(Estado estado);
    
    
     //elimina el registro de la tabla cliente
    //que tiene el idCliente pasado por el cliente 
    public void deleteEstado(Estado estado);
    
    //si el idcliente pasado no existe o es nulo se crea un registro nuevo
    //en la tabla cliente 
    // si el id cliente existe se actualiza la informacion
    public void saveEstado(Estado estado);
}

