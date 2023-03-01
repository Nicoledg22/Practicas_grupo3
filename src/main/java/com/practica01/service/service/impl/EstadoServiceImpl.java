package com.practica01.service.service.impl;

import com.practica01.dao.EstadoDao;
import com.practica01.domain.Estado;
import com.practica01.service.EstadoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstadoServiceImpl implements EstadoService {

    @Autowired
    private EstadoDao estadoDao;
    
    @Override
    public List<Estado> getEstados() {
         return (List<Estado>) estadoDao.findAll();
    }

    @Override
    public Estado getEstado(Estado estado) {
     return estadoDao.findById(estado.getIdPais()).orElse(null);
    }

    @Override
    public void deleteEstado(Estado estado) {
       estadoDao.delete(estado);
    }

    @Override
    public void saveEstado(Estado estado) {
        estadoDao.save(estado);
    }
    
}
