package com.comedorinfantil.interfaz;

import com.comedorinfantil.modelo.Almuerzo;
import com.comedorinfantil.repositorio.RepositorioAlmuerzoEnMemoria;
import com.comedorinfantil.servicio.ServicioAlmuerzo;

import java.util.Scanner;

public class ConsolaAlmuerzo {
    public static void main(String[] args) {
        ServicioAlmuerzo servicio = new ServicioAlmuerzo(new RepositorioAlmuerzoEnMemoria());
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n---- MENÚ CRUD ALMUERZO ----");
            System.out.println("1. Registrar almuerzo");
            System.out.println("2. Listar almuerzos");
            System.out.println("3. Buscar almuerzo por ID");
            System.out.println("4. Actualizar almuerzo");
            System.out.println("5. Eliminar almuerzo");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("ID: ");
                    int id = scanner.nextInt(); scanner.nextLine();
                    System.out.print("Descripción: ");
                    String desc = scanner.nextLine();
                    System.out.print("Fecha: ");
                    String fecha = scanner.nextLine();
                    servicio.registrar(new Almuerzo(id, desc, fecha));
                    break;
                case 2:
                    servicio.listar().forEach(System.out::println);
                    break;
                case 3:
                    System.out.print("ID: ");
                    int idBuscar = scanner.nextInt();
                    Almuerzo encontrado = servicio.obtener(idBuscar);
                    System.out.println(encontrado != null ? encontrado : "No encontrado");
                    break;
                case 4:
                    System.out.print("ID del almuerzo a modificar: ");
                    int idMod = scanner.nextInt(); scanner.nextLine();
                    System.out.print("Nueva descripción: ");
                    String nuevaDesc = scanner.nextLine();
                    System.out.print("Nueva fecha: ");
                    String nuevaFecha = scanner.nextLine();
                    servicio.modificar(new Almuerzo(idMod, nuevaDesc, nuevaFecha));
                    break;
                case 5:
                    System.out.print("ID a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    servicio.eliminar(idEliminar);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);
    }
}
