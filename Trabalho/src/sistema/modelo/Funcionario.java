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
public abstract class Funcionario {
    protected String codigo;
    protected String nome;
    protected  double salario;
    protected String nivel;

   
     
    public Funcionario(){
    
    
    }
    
    
    public Funcionario(String codigo, String nome, double salario, String nivel) {
        this.nome = nome;
        this.codigo = codigo;
        this.salario = salario;
        this.nivel = nivel;
        
        
    }
    
    public void exibir(){
        System.out.println("Código: "+codigo);
        System.out.println("Nome: "+nome);
        System.out.println("Salário: R$ "+salario);
        System.out.println("Nivel: R$ "+nivel);
        
        
    }

    
    public abstract double calcularSalario();

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
    
}
