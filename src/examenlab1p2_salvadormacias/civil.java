/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlab1p2_salvadormacias;

/**
 *
 * @author Apple
 */

import java.util.Random;


public class civil extends persona {

    public String motivo_registro;
    public String ID;

    public civil() {
    }

    public civil(String motivo_registro, String nombre, String apellido, String birth_year, String departamento) {
        super(nombre, apellido, birth_year, departamento);
        this.motivo_registro = motivo_registro;
    }

    public String getMotivo_registro() {
        return motivo_registro;
    }

    public void setMotivo_registro(String motivo_registro) {
        this.motivo_registro = motivo_registro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(String birth_year) {
        this.birth_year = birth_year;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void mostrarInfo() {

    }
      public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    

    @Override
    public String toString() {
        return "civil"
                + "\nNombre: " + nombre
                + "\nMotivo del registro : " + motivo_registro
                + "\nDepartamento: " + departamento
                + "\nID:";
    }

}
