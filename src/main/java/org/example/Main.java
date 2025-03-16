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
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorEmpleados gestor = new GestorEmpleados();

        while (true) {
            System.out.println("\n1. Agregar empleado\n2. Listar empleados\n3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nombre del empleado: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese salario del empleado: ");
                    double salario = scanner.nextDouble();
                    gestor.agregarEmpleado(nombre, salario);
                    break;
                case 2:
                    gestor.listarEmpleados();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        }
    }
}