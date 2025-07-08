package com.comedorinfantil.interfaz;

import com.comedorinfantil.conexionBD.Conexion;
import com.comedorinfantil.conexionBD.Desconexion;
import com.comedorinfantil.modelo.Nino;
import com.comedorinfantil.servicio.NinoService;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Connection conexionBD = Conexion.ConectarBD("bd_said_alejandro_martelo_diaz_comedor_infantil_22", "saidm"
                , "saidmartelo123");

        int opcion;
        do {
            System.out.println("\n=============================");
            System.out.println("      MENÚ COMEDOR INFANTIL");
            System.out.println("=============================");
            System.out.println("1. Listar niños con fecha de nacimiento y de baja");
            System.out.println("2. Listar niños dados de baja con fecha de baja");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){
                case 1:
                    List<Nino> ninos = NinoService.obtenerTodosLosNinos(conexionBD);
                    System.out.println("-----------------------LISTA DE NINOS-------------------------");
                    for (Nino nino : ninos) {
                        if ("BAJA".equals(nino.getEstado())) {
                            System.out.println(
                                    "ID: " + nino.getNum_matricula() +
                                            " - NOMBRE: " + nino.getNombre_completo() +
                                            " - FECHA DE NACIMIENTO: " + nino.getFecha_nac() +
                                            " - ESTADO: " + nino.getEstado() +
                                            " (" + nino.getFecha_baja() + ")");
                        } else {
                            System.out.println(
                                    "ID: " + nino.getNum_matricula() +
                                            " - NOMBRE: " + nino.getNombre_completo() +
                                            " - FECHA DE NACIMIENTO: " + nino.getFecha_nac() +
                                            " - ESTADO: " + nino.getEstado());
                        }
                        System.out.println("---------------------------------------------------------------");
                    }

                    System.out.println("----------------------FIN DE LA LISTA--------------------------");
                    break;
                case 2:
                    List<Nino> ninosRetirados = NinoService.obtenerNinosDadosDeBaja(conexionBD);
                    System.out.println("--------- NIÑOS RETIRADOS Y FECHA DE BAJA ---------");
                    for (Nino nino : ninosRetirados) {
                        System.out.println("NOMBRE: " + nino.getNombre_completo() +
                                " - FECHA DE RETIRO: " + nino.getFecha_baja());
                    }
                    System.out.println("----------------------------------------------------");
                    break;

                case 3:


                case 0:
                    System.out.println("SALIENDO");
                    break;

                default: System.out.println("OPCION INVALIDA");
            }
        } while (opcion != 0);


        Desconexion.DesconectarBD(conexionBD);
    }
}
