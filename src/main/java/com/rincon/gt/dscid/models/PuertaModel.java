/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rincon.gt.dscid.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicUpdate;

/**
 *
 * @author Diego_MF
 */
@Entity
@DynamicUpdate
@Table(name = "puerta",
        schema = "bd_mascota"
)
public class PuertaModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_puerta")
    private Integer idPuerta;

    @Column(name = "id_user")
    private Integer idUser;
    
    @Column(name = "id_mascota")
    private Integer idMascota;
    
    @Column(name = "estado_puerta")
    private Integer estadoPuerta;

    @Column(name = "comando_voz")
    private String comadoVoz;

    public PuertaModel() {
    }

    public PuertaModel(Integer idPuerta, Integer idUser, Integer idMascota, Integer estadoPuerta, String comadoVoz) {
        this.idPuerta = idPuerta;
        this.idUser = idUser;
        this.idMascota = idMascota;
        this.estadoPuerta = estadoPuerta;
        this.comadoVoz = comadoVoz;
    }

    public Integer getIdPuerta() {
        return idPuerta;
    }

    public void setIdPuerta(Integer idPuerta) {
        this.idPuerta = idPuerta;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public Integer getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(Integer idMascota) {
        this.idMascota = idMascota;
    }

    public Integer getEstadoPuerta() {
        return estadoPuerta;
    }

    public void setEstadoPuerta(Integer estadoPuerta) {
        this.estadoPuerta = estadoPuerta;
    }

    public String getComadoVoz() {
        return comadoVoz;
    }

    public void setComadoVoz(String comadoVoz) {
        this.comadoVoz = comadoVoz;
    }

    @Override
    public String toString() {
        return "PuertaModel{" + "idPuerta=" + idPuerta + ", idUser=" + idUser + ", idMascota=" + idMascota + ", estadoPuerta=" + estadoPuerta + ", comadoVoz=" + comadoVoz + '}';
    }
}
