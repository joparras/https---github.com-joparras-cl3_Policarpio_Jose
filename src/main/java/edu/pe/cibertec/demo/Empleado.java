package edu.pe.cibertec.demo;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


@Entity
public class Empleado {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String nombre;
    String apellido;
    BigDecimal salario;
    String puesto;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name ="fechaRegistro", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    Date fechaRegistro; 

    Empleado(){}

    Empleado(String nombre, String apellido, BigDecimal salario, String puesto, Date fechaRegistro ) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.salario = salario;
    this.puesto = puesto;
    this.fechaRegistro = fechaRegistro;
    }
   
    public Integer getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }

    public BigDecimal getSalario() {
        return salario;
    }
    public String getPuesto() {
        return puesto;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

}
