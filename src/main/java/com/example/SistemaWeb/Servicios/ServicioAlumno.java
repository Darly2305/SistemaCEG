/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.SistemaWeb.Servicios;

import com.example.SistemaWeb.Entidades.Alumno;
import com.example.SistemaWeb.Repositorio.RepositorioAlumno;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jose_
 */
@Service
public class ServicioAlumno {
    @Autowired
    RepositorioAlumno rAlumno;
    
    public List<Alumno> obtenerTodosLosAlumnos(){
        return rAlumno.findAll();
    }
    
    public Alumno obtenerUno(String nombre){
        Optional <Alumno> alumno = rAlumno.findById(nombre);
        if(alumno.isEmpty()){
            return null;
        } else{
            return alumno.get();
        }
    }
    
    
    public boolean insertarAlumno(Alumno a){
        boolean respuesta=false;
        try{
            rAlumno.save(a);
            respuesta = true;
        }catch(Exception ex){
            respuesta = false;
        }
        return respuesta;
    }
    
    public boolean actualizarAlumno(Alumno a){
        boolean respuesta;
        
        Alumno alumnoBuscado = obtenerUno(a.getCURP());
        if (alumnoBuscado == null) {
            respuesta = false;
        } else {
            try {
                rAlumno.save(a);
                respuesta = true;
            } catch (Exception ex) {
                respuesta = false;
            }
        }
        return respuesta;
    }
    
   
    public boolean eliminarAlumno(Alumno a){
        boolean respuesta=false;
        try{
            rAlumno.delete(a);
            respuesta = true;
        }catch(Exception ex){
            respuesta = false;
        }
        return respuesta;
    }
    
    
}
