/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rincon.gt.dscid.controller;

import com.rincon.gt.dscid.common.CommonController;
import com.rincon.gt.dscid.models.PuertaModel;
import com.rincon.gt.dscid.svc.PuertaSvc;
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
@RequestMapping("/puerta")
@CrossOrigin(origins = "http://localhost:4200")
public class PuertaController extends CommonController<PuertaModel, PuertaSvc> {

}
