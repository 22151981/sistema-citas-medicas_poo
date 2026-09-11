
package Laytons;




public abstract class Paciente {
    
  private String documento;
private String nombre;
private int edad;

    public Paciente(String documento, String nombre, int edad) {
        this.documento = documento;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        if (documento != null && !documento.trim().isEmpty()) {
            this.documento = documento;
    }else {
            System.out.println(" El documento no debe estar vacio  ");
        }
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre !=null && !nombre.trim().isEmpty()){
           this.nombre = nombre;
        }else {
            System.out.println(" El nombre no puede estar vacio ");
               
        }
        
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad>0) {
        this.edad = edad;
    }else {
            System.out.println(" La edad debe ser mayor que cero ");
        }

    }  
    
    public void mostrarDatosBase(){
        System.out.println(" Documento: " + documento);
        System.out.println(" NOmbre: "  + nombre);
        System.out.println(" Edad " + edad);
    }
    public abstract  double calcularValorconsulta ();
    public abstract void mostarDatos();
}
