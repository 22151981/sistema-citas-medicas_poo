package Laytons;

import Laytons.Clinica;
import java.util.Scanner;

public class PrincipalLaytonh {

    public static void main(String[] arg) {

        Scanner entrada = new Scanner(System.in);
        Clinica clinica = new Clinica();

        boolean salir = false;
        int opcion;

        while (!salir) {

            try {
                System.out.println(" \n=== BIENVENIDOS AL SISTEMA DE GESTIÓN DE LA CLÍNICA LAYTON === ");
                System.out.println(" == AQUÍ ENCONTRARÁS EL MEJOR SERVICIO DE SALUD == ");
                System.out.println();
                System.out.println(" === Trabajo eleborado por Javier LAyton Herrera ===");
                System.out.println(" CORPORACIÓN UNIVERSITARIA IBEROAMERICANA ");
                System.out.println();
                System.out.println(" 1. Registar Paciente General ");
                System.out.println(" 2. Registar Paciente Prioritario  ");
                System.out.println(" 3. Registar Medico  ");
                System.out.println(" 4. Listar pacientes ");
                System.out.println(" 5. Listar Medicos ");
                System.out.println(" 6. Buscar Paciente ");
                System.out.println(" 7. Buscar Madico ");
                System.out.println(" 8. Modificar nombre de Paciente ");
                System.out.println(" 9. Modificar Edad del paciente ");
                System.out.println(" 10. Eliminar Paciente ");
                System.out.println(" 11. Agendar Cita ");
                System.out.println(" 12. Listar citas ");
                System.out.println(" 13. Salir  ");
                System.out.println(" Seleccionar una Opcion: ");

                String lectura = entrada.nextLine();
                opcion = Integer.parseInt(lectura);

                switch (opcion) {

                    case 1:
                        registrarPacienteGeneral(entrada, clinica);
                        break;
                    case 2:
                        registrarPacientePrioritario(entrada, clinica);
                        break;
                    case 3:
                        registrarMedico(entrada, clinica);
                        break;
                    case 4:
                        clinica.listarPaciente();
                        break;
                    case 5:
                        clinica.listarmedicos();
                        break;
                    case 6:
                        buscarPaciente(entrada, clinica);
                        break;
                    case 7:
                        buscarMedico(entrada, clinica);
                        break;
                    case 8:
                        modificarNombrePaciente(entrada, clinica);
                        break;
                    case 9:
                        modificarEdadPaciente(entrada, clinica);
                        break;
                    case 10:

                        eliminarPaciente(entrada, clinica);
                        break;
                    case 11:
                        agendarCita(entrada, clinica);
                        break;
                    case 12:
                        clinica.listarCitas();
                        break;

                    case 13:
                        salir = true;
                        System.out.println(" === MISION CUMPLIDA=== Hasta la vista Profe 😂😂😂😂... !! ");
                        break;
                    default:
                        System.out.println(" Opcion Invalida !!! ");

                }

            } catch (Exception e) {
                System.out.println(" Error !! debe Ingresar una Opcion valida..Ok..");
                entrada.nextLine();
            }
        }
    }

    public static void registrarPacienteGeneral(Scanner entrada, Clinica clinica) {
        System.out.println("\n ==Registar Paciente General... ");
        String documento = Utilidades.leerTextoNoVacio(entrada, " Documento: ");
        String nombre = Utilidades.leerTextoNoVacio(entrada, " Nombre: ");
        int edad = Utilidades.leerEnteroPositivo(entrada, "Edad: ");
        double valorConsulta = Utilidades.leerDoubleNegativo(entrada, " Valor Consulta. ");
        PacienteGeneral paciente = new PacienteGeneral(documento, nombre, edad, valorConsulta);
        clinica.resgistarPaciente(paciente);
    }

    public static void registrarPacientePrioritario(Scanner entrada, Clinica clinica) {
        System.out.println("\n ==Registar Paciente Prioritario... ");
        String documento = Utilidades.leerTextoNoVacio(entrada, " Documento: ");
        String nombre = Utilidades.leerTextoNoVacio(entrada, " Nombre: ");
        int edad = Utilidades.leerEnteroPositivo(entrada, "Edad: ");
        double valorBase = Utilidades.leerDoubleNegativo(entrada, " Valor Consulta. ");
        double recargo = Utilidades.leerDoubleNegativo(entrada, " Recargo Prioritario. ");
        PacientePrioritario paciente = new PacientePrioritario(documento, nombre, edad, valorBase, recargo);
        clinica.resgistarPaciente(paciente);
    }

    public static void registrarMedico(Scanner entrada, Clinica clinica) {
        System.out.println("\n ==Registar Medico... ");
        String documento = Utilidades.leerTextoNoVacio(entrada, " Documento: ");
        String nombre = Utilidades.leerTextoNoVacio(entrada, " Nombre: ");
        String especialidad = Utilidades.leerTextoNoVacio(entrada, " Especialidad: ");
        Medico medico = new Medico(documento, nombre, especialidad);
        clinica.resgistarMedico(medico);
    }

    public static void buscarPaciente(Scanner entrada, Clinica clinica) {
        System.out.println(" \n == Buscar Paciente..");
        String documento = Utilidades.leerTextoNoVacio(entrada, "Documentodel Paciente. ");
        Paciente paciente = clinica.buscarPacientePorDocumento(documento);

        if (paciente != null) {
            paciente.mostarDatos();
        } else {
            System.out.println(" Paciente no Encontrado");
        }
    }

    public static void buscarMedico(Scanner entrada, Clinica clinica) {
        System.out.println(" \n == Buscar Paciente..");
        String documento = Utilidades.leerTextoNoVacio(entrada, "Documentodel Profecional:");
        Medico medico = clinica.buscarMedicoPorDocumento(documento);

        if (medico != null) {
            medico.mostrarDatos();
        } else {
            System.out.println(" Medico no Encontrado");
        }
    }

    public static void modificarNombrePaciente(Scanner entrada, Clinica clinica) {
        System.out.println(" \n == Modificar Nombre del Paciente...");
        String documento = Utilidades.leerTextoNoVacio(entrada, "Documentodel Paciente. ");
        String nuevoNombre = Utilidades.leerTextoNoVacio(entrada, "Nuevo Nombre. ");

        if (clinica.modificarNombrePaciente(documento, nuevoNombre)) {
            System.out.println(" NOmbre Actualizado Correctamente. ");
        } else {
            System.out.println(" Paciente no Encontrado  ");

        }
    }

    public static void modificarEdadPaciente(Scanner entrada, Clinica clinica) {
        System.out.println(" \n == Modificar Edad del Paciente...");
        String documento = Utilidades.leerTextoNoVacio(entrada, "Documentodel Paciente. ");
        int nuevoEdad = Utilidades.leerEnteroPositivo(entrada, "Nuevo Nombre. ");

        if (clinica.modificarEdadPaciente(documento, nuevoEdad)) {
            System.out.println(" La Edad fue Actualizada Correctamente. ");
        } else {
            System.out.println(" Paciente no Encontrado  ");
        }
    }

    public static void eliminarPaciente(Scanner entrada, Clinica clinica) {
        System.out.println(" \n == Eliminar el Paciente...");
        String documento = Utilidades.leerTextoNoVacio(entrada, "Documentodel Paciente. ");

        if (clinica.eliminarPaciente(documento)) {
            System.out.println(" Paciente fue Eliminado Correctamente. ");
        } else {
            System.out.println(" Paciente no Encontrado  ");
        }
    }

    public static void agendarCita(Scanner entrada, Clinica clinica) {

        System.out.println(" === Agendar Cita === ");
        String documentoPacinet = Utilidades.leerTextoNoVacio(entrada, " Documento del Paciente. ");
        Paciente paciente = clinica.buscarPacientePorDocumento(documentoPacinet);

        if (paciente == null) {
            System.out.println(" No existe un paciente con este Documento.  ");
            return;

        }
        String documentoMedico = Utilidades.leerTextoNoVacio(entrada, " Docuemnto del Madico. ");
        Medico medico = clinica.buscarMedicoPorDocumento(documentoMedico);

        if (medico == null) {
            System.out.println(" No Existe un Medico con ese Documento. ");
            return;
        }
        String fecha = Utilidades.leerTextoNoVacio(entrada, "Fecha de la Cita: ");
        String motivo = Utilidades.leerTextoNoVacio(entrada, "Motico dela Consulta: ");

        Cita cita = new Cita(paciente, medico, fecha, motivo);
        clinica.agendarCita(cita);

    }
}
