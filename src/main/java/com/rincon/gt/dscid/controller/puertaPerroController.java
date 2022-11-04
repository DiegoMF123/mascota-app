/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rincon.gt.dscid.controller;

import com.rincon.gt.dscid.common.CommonController;
import com.rincon.gt.dscid.models.UsuarioMascotaModel;
import com.rincon.gt.dscid.svc.UsuarioMascotaSvc;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Diego_MF
 */
@Api
@RestController
@RequestMapping("/puerta/mascota")
@CrossOrigin(origins = "http://localhost:4200")
public class puertaPerroController extends CommonController<UsuarioMascotaModel, UsuarioMascotaSvc>{
    
}
