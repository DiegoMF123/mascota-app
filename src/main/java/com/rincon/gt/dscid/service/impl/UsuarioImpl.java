/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rincon.gt.dscid.service.impl;

import com.rincon.gt.dscid.common.CommonImpl;
import com.rincon.gt.dscid.models.UsuarioModel;
import com.rincon.gt.dscid.repository.UsuarioRepository;
import com.rincon.gt.dscid.svc.UsuarioSvc;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Diego_MF
 */
@Service
public class UsuarioImpl extends CommonImpl<UsuarioModel, UsuarioRepository> implements UsuarioSvc{
    
    @Autowired
    protected UsuarioRepository Repository;
    
    @Override
    public Optional<List<UsuarioModel>> obtenerUsuarioByContrasenia(String correoElectronico, String passwordUsuario) throws Exception {
       Optional<List<UsuarioModel>> usuario = Repository.obtenerUsuarioByContrasenia(correoElectronico, passwordUsuario);
       return usuario;
    }
    
}
