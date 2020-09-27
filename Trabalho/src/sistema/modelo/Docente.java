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
public abstract class Docente extends Funcionario {
    private String titulacao;
       
    public Docente(String codigo, String nome, double salario, String nivel){
        super(codigo, nome, salario, nivel);
        this.titulacao = titulacao;
    }
    
    public Docente(){
    codigo = "";
    nome = "";
    nivel = "";
    salario = 0;
    
    
    }
    
    
    
    
    
    
    
    
    
    
    @Override
    public abstract double calcularSalario();
    
    public void exibir(){
        super.exibir();
        System.out.println("Titulação: "+titulacao);
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
    
    
    
    
}
