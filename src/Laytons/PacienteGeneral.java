
package Laytons;




public class PacienteGeneral extends Paciente {
    
    private double valorBaseConsulta;

    public PacienteGeneral(String documento, String nombre, int edad, double valorBaseConsulta) {
        super(documento, nombre, edad);
        this.valorBaseConsulta = valorBaseConsulta;
    }

    public double getValorBaseConsulta() {
        return valorBaseConsulta;
    }

    public void setValorBaseConsulta(double valorBaseConsulta) {
        
        if (valorBaseConsulta >=0){
        this.valorBaseConsulta = valorBaseConsulta;
    }
        else {
            System.out.println(" El valor base no puede ser negativo");
    
    
}
    }
    @Override
    public  double calcularValorconsulta (){
        return valorBaseConsulta;
}
    
    @Override
    public void mostarDatos(){
        mostrarDatosBase();
        System.out.println(" Tipo Paciente General ");
        System.out.println(" Valor Consulta: "+ calcularValorconsulta());
}
}