/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rincon.gt.dscid.svc;

import com.rincon.gt.dscid.common.CommonSvc;
import com.rincon.gt.dscid.models.UsuarioModel;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Diego_MF
 */
public interface UsuarioSvc extends CommonSvc<UsuarioModel>{
    public Optional<List<UsuarioModel>> obtenerUsuarioByContrasenia(String correoElectronico, String passwordUsuario) throws Exception;
}
