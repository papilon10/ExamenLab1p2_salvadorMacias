/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlab1p2_salvadormacias;

/**
 *
 * @author Apple
 */
public class persona {

    public String nombre;
    public String apellido;
    public int birth_year;
    public String departamento;

    public persona() {
    }

    public persona(String nombre, String apellido, int birth_year, String departamento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.birth_year = birth_year;
        this.departamento = departamento;
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

    public int getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(int birth_year) {
        this.birth_year = birth_year;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", birth_year=" + birth_year + ", departamento=" + departamento + '}';
    }

}
