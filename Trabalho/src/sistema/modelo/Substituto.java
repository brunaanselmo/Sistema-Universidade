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
public class Substituto extends Docente{
    private int cargaHoraria;
    private Constantes constantes;
    
    public Substituto(String codigo, String nome, double salario, String nivel, int cargaHoraria){
        super(codigo, nome, salario, nivel);
        this.cargaHoraria = cargaHoraria;
        constantes = new Constantes();
        
    }

    public Substituto() {
        this.cargaHoraria = cargaHoraria;
    }
    
    @Override
    public double calcularSalario(){
      double ad, calculo;
      ad = constantes.salario(nivel,salario);
      calculo = salario + ad;
      return calculo;
        
    }

    
     
     
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    
    
}
