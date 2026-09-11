package Laytons;

import java.util.ArrayList;

public class Clinica {

    private ArrayList<Paciente> pacientes;
    private ArrayList<Medico> medicos;
    private ArrayList<Cita> citas;

    public Clinica() {
        this.pacientes = new ArrayList<>();
        this.medicos = new ArrayList<>();
        this.citas = new ArrayList<>();
    }

    public void resgistarPaciente(Paciente paciente) {
        if (buscarPacientePorDocumento(paciente.getDocumento()) == null) {
            pacientes.add(paciente);
            System.out.println(" Paciente Registrado Correctamente ");
        } else {
            System.out.println(" Ya existe este numero de documento ");
        }
    }

    public void resgistarMedico(Medico medico) {
        if (buscarMedicoPorDocumento(medico.getDocumentoProfecional()) == null) {
            medicos.add(medico);
            System.out.println(" Medico Registrado Correctamente ");
        } else {
            System.out.println(" Ya existe este numero de documento ");
        }
    }

    public Paciente buscarPacientePorDocumento(String documento) {
        for (Paciente paciente : pacientes) {
            if (paciente.getDocumento().equals(documento)) {
                return paciente;
            }
        }
        return null;

    }

    public Medico buscarMedicoPorDocumento(String documentoProfecional) {
        for (Medico medico : medicos) {
            if (medico.getDocumentoProfecional().equals(documentoProfecional)) {
                return medico;
            }
        }
        return null;
    }

    public void listarPaciente() {
        if (pacientes.isEmpty()) {
            System.out.println(" No hat pacientes registrados. ");
        } else {
            for (int i = 0; i < pacientes.size(); i++) {
                System.out.println("\nPaciente Nº: " + (i + 1));
                pacientes.get(i).mostrarDatosBase();
            }
        }
    }

    public void listarmedicos() {
        if (medicos.isEmpty()) {
            System.out.println(" No hay Medicos registrados. ");
        } else {
            for (int i = 0; i < medicos.size(); i++) {
                System.out.println("\nMedico Nº: " + (i + 1));
                medicos.get(i).mostrarDatos();
            }
        }
    }

    public void agendarCita(Cita cita) {
        citas.add(cita);
        System.out.println(" Cita Registrada Correctamente");
    }

    public void listarCitas() {
        if (citas.isEmpty()) {
            System.out.println(" No hay Citas registradas. ");
        } else {
            for (int i = 0; i < citas.size(); i++) {
                System.out.println("\nCita Nº: " + (i + 1));
                citas.get(i).mostarDatos();
            }
        }

        }

    public boolean eliminarPaciente(String documento) {
        Paciente paciente = buscarPacientePorDocumento(documento);
        if (paciente != null) {
            pacientes.remove(paciente);
            return true;
        }
return false;
    }
public boolean modificarNombrePaciente(String documento, String nuevoNombre) {
        Paciente paciente = buscarPacientePorDocumento(documento);
        if (paciente != null) {
            paciente.setNombre(nuevoNombre);
            return true;
        }
return false;
    }
public boolean modificarEdadPaciente(String documento, int nuevaedad) {
        Paciente paciente = buscarPacientePorDocumento(documento);
        if (paciente != null) {
            paciente.setEdad(nuevaedad);
            return true;
            
}
return false;

}
}
