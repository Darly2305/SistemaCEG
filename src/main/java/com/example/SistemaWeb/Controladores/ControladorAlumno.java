/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.SistemaWeb.Controladores;

import com.example.SistemaWeb.Entidades.Alumno;
import com.example.SistemaWeb.Servicios.ServicioAlumno;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jose_
 */
@RestController
@RequestMapping("alumnos")
public class ControladorAlumno {
    @Autowired
    ServicioAlumno sAlumno;
    
    @GetMapping("")
    public List<Alumno> obtenerAlumnos(){
        return sAlumno.obtenerTodosLosAlumnos();
    }
    
    @GetMapping("/")
    public Alumno obtenerUnAlumno(String CURP){
        return sAlumno.obtenerUno(CURP);
    }
    
    @PostMapping("")
    public  List<Alumno> agregarAlumno(@RequestBody Alumno a){
        if(sAlumno.insertarAlumno(a)){
            return sAlumno.obtenerTodosLosAlumnos();
        }else {
            return null;
        }
    } 
    
    @PutMapping("")
    //En el request body, no usamos MAP
    public  List<Alumno> actualizarAlumno(@RequestBody Alumno a){
        if(sAlumno.actualizarAlumno(a)){
            return sAlumno.obtenerTodosLosAlumnos();
        }else {
            return null;
        }
    }
    
    @DeleteMapping("")
    //En el request body, no usamos MAP
    public  List<Alumno> eliminarAlumno(@RequestBody Alumno a){
        if(sAlumno.eliminarAlumno(a)){
            return sAlumno.obtenerTodosLosAlumnos();
        }else {
            return null;
        }
    }
    
    
    
}
