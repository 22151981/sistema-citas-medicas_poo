
package Laytons;




public class PacientePrioritario extends Paciente{
    
    private double valorBaseConsulta;
    private double RecargoPrioridad;

    public PacientePrioritario( String documento, String nombre, int edad, double valorBaseConsulta, double RecargoPrioridad) {
        super(documento, nombre, edad);
        this.valorBaseConsulta = valorBaseConsulta;
        this.RecargoPrioridad = RecargoPrioridad;
    }

    public double getValorBaseConsulta() {
        return valorBaseConsulta;
    }

    public void setValorBaseConsulta(double valorBaseConsulta) {
        if ( valorBaseConsulta>=0){
        this.valorBaseConsulta = valorBaseConsulta;
    } else {
            System.out.println(" El valor base no se puede ser negativo ");
        }
}

    public double getRecargoPrioridad() {
        return RecargoPrioridad;
    }

    public void setRecargoPrioridad(double RecargoPrioridad) {
        if (RecargoPrioridad>=0){
            this.RecargoPrioridad = RecargoPrioridad;
            
        }else {
        System.out.println(" El Recargo no puede se negativo ");
    }
    
    
    }
    
     @Override
    public  double calcularValorconsulta (){
        return valorBaseConsulta+RecargoPrioridad;
}
    
    @Override
    public void mostarDatos(){
        mostrarDatosBase();
        System.out.println(" Tipo Paciente Prioritario ");
        System.out.println(" Valor Base Consulta: "+ valorBaseConsulta);
        System.out.println(" Recargo: " +RecargoPrioridad);
        System.out.println(" Valor Total Consulta: " + calcularValorconsulta());
}
}
