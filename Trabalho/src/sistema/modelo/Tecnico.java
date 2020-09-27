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
public class Tecnico extends Funcionario {
    private String funcao;
    private Constantes constantes;
    
    

    public Tecnico() {
        this.funcao = funcao;
    }
    
    
    
    public Tecnico(String codigo, String nome, double salario, String nivel, String funcao){
        super(codigo, nome, salario, nivel);
        this.funcao = funcao;
        constantes = new Constantes();
        
       
    }
    
    @Override
    public double calcularSalario(){ 
      double ad, calculo;
      ad = constantes.salario(nivel,salario);
      calculo = salario + ad;
      return calculo;
    }
                   
    public void exibir(){
        super.exibir();
        System.out.println("Funcao: "+funcao);
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    
}
