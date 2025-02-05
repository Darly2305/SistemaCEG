/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.SistemaWeb.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 *
 * @author jose_
 */
@Entity
public class Alumno {
    @Id
    private String CURP;
    private String nombreA;
    private String apellidoP;
    private String apellidoM;
    private int grado;
    private String grupo;
    private String genero;
    private String nombreT;
    private String telefonoT;

    public Alumno() {
    }

    public Alumno(String CURP, String nombreA, String apellidoP, String apellidoM, int grado, String grupo, String genero, String nombreT, String telefonoT) {
        this.CURP = CURP;
        this.nombreA = nombreA;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.grado = grado;
        this.grupo = grupo;
        this.genero = genero;
        this.nombreT = nombreT;
        this.telefonoT = telefonoT;
    }

    public String getCURP() {
        return CURP;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombreT() {
        return nombreT;
    }

    public void setNombreT(String nombreT) {
        this.nombreT = nombreT;
    }

    public String getTelefonoT() {
        return telefonoT;
    }

    public void setTelefonoT(String telefonoT) {
        this.telefonoT = telefonoT;
    }
    
    
}
