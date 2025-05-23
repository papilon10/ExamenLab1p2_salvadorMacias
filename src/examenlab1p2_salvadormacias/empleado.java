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

public class empleado extends persona {

    public String puesto;
    public String years_xp;
    public String ID;

    public empleado() {
    }

    public empleado(String puesto, String years_xp, String nombre, String apellido, String birth_year, String departamento) {
        super(nombre, apellido, birth_year, departamento);
        this.puesto = puesto;
        this.years_xp = years_xp;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getYears_xp() {
        return years_xp;
    }

    public void setYears_xp(String years_xp) {
        this.years_xp = years_xp;
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

      
        if (this.getDepartamento().equals("francisco morazan")) {
            setID("01");

        } else if (this.getDepartamento().equals("comayagua")) {

        } else if (this.getDepartamento().equals("cortes")) {
        }
    }

    @Override
    public String toString() {
        return "Empleado"
                + "\nNombre: " + nombre
                + "\nPuesto: " + puesto
                + "\nAños de experiencia: " + years_xp
                + "\nDepartamento: " + departamento
                + "\nID:";
    }

}
