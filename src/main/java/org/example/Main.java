package org.example;

import java.util.ArrayList;
import java.util.Scanner;

class Empleado {
    private static int contadorEmpleados = 0;
    private int id;
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.id = ++contadorEmpleados;
        this.nombre = nombre;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Empleado{id=" + id + ", nombre='" + nombre + "', salario=" + salario + "}";
    }
}
class GestorEmpleados {
    private ArrayList<Empleado> empleados;

    public GestorEmpleados() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(String nombre, double salario) {
        Empleado nuevo = new Empleado(nombre, salario);
        empleados.add(nuevo);
        System.out.println("Empleado agregado: " + nuevo);
    }

    public void listarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            System.out.println("Lista de empleados:");
            for (Empleado e : empleados) {
                System.out.println(e);
            }
        }
    }
}
