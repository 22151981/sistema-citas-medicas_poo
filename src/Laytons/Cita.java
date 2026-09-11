
package Laytons;


public class Cita {
    
    private Paciente paciente;
    private Medico medico;
    private String fecha;
    private String motivo;

    public Cita(Paciente paciente, Medico medico, String fecha, String motivo) {
        this.paciente = paciente;
        this.medico = medico;
        this.fecha = fecha;
        this.motivo = motivo;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
                this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        if (fecha !=null && !fecha.trim().isEmpty()) {
        this.fecha = fecha;
    }else {
            System.out.println(" La Fecha no puede  quedar vacio ..");
        }
        
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        if (motivo !=null && !motivo.trim().isEmpty()) {
        this.motivo = motivo;
    }else {
            System.out.println(" el Motivo no puede  quedar vacio ..");
        }
        
    }
    
    public void mostarDatos(){
        System.out.println(" Paciente:  "+ paciente.getNombre() + " Documento: " + paciente.getDocumento());
        System.out.println(" Medico:  "+ medico.getNombre() + " Especialidad: " + medico.getEspecialidad());
        System.out.println(" Fecha: " +fecha);
        System.out.println(" Motivo: " + motivo);
        System.out.println(" Valor Consulta: " + paciente.calcularValorconsulta());
    }
}
