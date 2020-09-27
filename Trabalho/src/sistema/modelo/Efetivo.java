/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.modelo;

/**
 *
 * @author bruna
 */
public class Efetivo extends Docente{
    private String area;
    private Constantes constantes;
    
    public Efetivo(){
    this.area = area;
    }
    
    public Efetivo(String codigo, String nome, double salario, String nivel, String area){
        super(codigo,nome,salario,nivel);
        this.area = area;
        constantes = new Constantes();
        
    }
    
    @Override
    public double calcularSalario(){
      
      double ad, calculo;
      ad = constantes.salario(nivel,salario);
      calculo = salario + ad;
      return calculo;
      }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    
    
    
}
