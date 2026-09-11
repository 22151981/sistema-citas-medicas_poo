
package Laytons;

public class Medico {
    
    private String documentoProfecional;
    private String nombre;
   private String especialidad;

    public Medico(String documentoProfecional, String nombre, String especialidad) {
        this.documentoProfecional = documentoProfecional;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getDocumentoProfecional() {
        return documentoProfecional;
    }

    public void setDocumentoProfecional(String documentoProfecional) {
        if (nombre !=null && !nombre.trim().isEmpty()) {
        this.documentoProfecional = documentoProfecional;
    }else {
            System.out.println(" El Documento del medico no puede quedar vacio ..");
        }
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre !=null && !nombre.trim().isEmpty()) {
        this.nombre = nombre;
    }else {
            System.out.println(" El NOmbre del medico no puede quedar vacio ..");
        }
    
        
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        if (especialidad !=null && !especialidad.trim().isEmpty()) {
        this.especialidad = especialidad;
    }else {
            System.out.println(" La Especialidad del medico no puede quedar vacio ..");
        }
    }
   
   public void mostrarDatos(){
       System.out.println("Documento Profecional:  " +documentoProfecional);
       System.out.println(" NOmbre del Medico: " + nombre);
       System.out.println(" Especialidad: " + especialidad);
   }
    
}
