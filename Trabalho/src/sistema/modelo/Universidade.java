/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.modelo;

import sistema.Database.Database;
import sistema.modelo.Departamento;

/**
 *
 * @author bruna
 */
public class Universidade {
    private String nome;
    private Departamento departamentos[];
    private int cont;
    private int MAX;
    private Database database = Database.getInstance();
    
    public Universidade(){
        this.nome = nome;
        this.cont= cont;
        this.MAX= MAX;
        departamentos = new Departamento[cont];
               
    }

    public Universidade(String nome, Departamento[] departamentos) {
        this.nome = nome;
        this.departamentos = departamentos;
    }
    
    
    
    
    
    
       public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    
     public void addDepartamento(String codigo, String nome) {
        Departamento d = new Departamento(codigo,nome);
        database.addDepartamento(d);
        cont++;
       
        }     
    

      public void addTecnico(String codigo, String nome, double salario, String nivel,String funcao) {
        if ( departamentos != null){
        Tecnico i = new Tecnico(codigo, nome, salario, nivel, funcao) ;
        database.addFuncionario(i);
        }
    }
  
      
      public void addEfetivo(String codigo, String nome, double salario, String nivel, String area) {
        if ( departamentos != null){
        Efetivo x = new Efetivo (codigo, nome, salario, nivel, area) ;
        database.addFuncionario(x);
        }
      }
      
      public void addSubstituto(String codigo, String nome, double salario, String nivel, int cargaHoraria) {
        if ( departamentos != null){
        Substituto e = new Substituto (codigo, nome, salario, nivel, cargaHoraria) ;
        database.addFuncionario(e);
        }
      }
      
     
      public void exibirDepartamentos (){
      database.exibirDepartamentos();
      }
      
      public Funcionario buscarFuncNome(String nome){
       return database.buscarFuncNome(nome);
                  
      }
      
      public Funcionario buscarFuncCod(String codigo){
       return database.buscarFuncCod(codigo);
                   
      }
      
      
      public String buscaFuncNome(String nome) {
          return database.buscaFuncNome(nome);
           
    }
    
     public String buscaFuncCod(String codigo) {
        return database.buscaFuncCod(codigo);
    }
      
      
      
           
      public String FunFaixaSalario(double ini, double fim){
      return database.funcFaixaSalario(ini, fim);
      
      }
      
      public String DepFaixaSalario(double ini, double fim){
      return database.deptoFaixaSalario(ini, fim);
      
      }
      
      public String resumo(){
      return database.resumoDeps();
       
      }
      
      
 
      public void gastoTotal(){
         database.gastoTotal();
      }
      
      
      public Departamento buscarDep(String nome){
      return database.buscarDeptoNome(nome);
      }

      public double calculaSalario(String nivel, double salario){
      double salarioCerto = database.calculaSalario(nivel, salario);
      return salarioCerto;
      
      }
      public String dadosSubs(){
      String dados = database.dadosSubs();
      return dados;      
      
      }
          
       public Departamento buscarDeptoCod(String codigo){
          return database.buscarDeptoCod(codigo);
       }
      
      public String dadosEfe(){
         String dados = database.dadosEfe();
         return dados;
     }
        
    
     
       public String dadosTec(){
         String dados = database.dadosTec();
         return dados;
     }
       
       
        public String dadosDoc(){
         String dados = database.dadosDoc();
         return dados;
     }
        
       public String dadosTodosFunc(){
         String dados = database.dadosTodosFunc();
         return dados;
       
       
       }
  
       
    public String relatorioGeral(){
    return database.relatorioGeral();
    }
            
    
    

}