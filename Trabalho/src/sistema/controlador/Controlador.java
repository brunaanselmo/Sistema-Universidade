/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.controlador;

import sistema.modelo.Departamento;
import sistema.modelo.Universidade;
import sistema.modelo.Funcionario;
import sistema.modelo.Efetivo;
import sistema.modelo.Substituto;
import sistema.modelo.Tecnico;

/**
 *
 * @author bruna
 */
public class Controlador {
    private Universidade x = new Universidade();
    
    
    
     public void addDepartamento(String codigo, String nome) {
        x.addDepartamento(codigo, nome);
        }     
    

      public void addTecnico(String codigo, String nome, double salario, String nivel,String funcao) {
        x.addTecnico(codigo, nome, salario, nivel, funcao);
    }
  
      
      public void addEfetivo(String codigo, String nome, double salario, String nivel, String area) {
          x.addEfetivo(codigo, nome, salario, nivel, area);
        }
      
      public void addSubstituto(String codigo, String nome, double salario, String nivel, int cargaHoraria) {
          x.addSubstituto(codigo, nome, salario, nivel, cargaHoraria);
        }
      
     
      public void exibirDepartamentos (){
          x.exibirDepartamentos();
      }
      
      public Funcionario buscarFuncNome(String nome){
         return x.buscarFuncNome(nome);
                  
      }
      
      public Funcionario buscarFuncCod(String codigo){
          return x.buscarFuncCod(codigo);
                   
      }
      
      
     public String buscaFuncNome(String nome) {
          return x.buscaFuncNome(nome);
           
    }
    
     public String buscaFuncCod(String codigo) {
        return x.buscaFuncCod(codigo);
    }
     
      
      public String FunFaixaSalario(double ini, double fim){
      return x.FunFaixaSalario(ini, fim);
      
      }
      
      public String DepFaixaSalario(double ini, double fim){
      return x.DepFaixaSalario(ini, fim);
      
      }
      
      public String resumo(){
      return x.resumo();
      
      
      }
 
      public void gastoTotal(){
      x.gastoTotal();
      }
      
      
      public Departamento buscarDep(String nome){
      return x.buscarDep(nome);
      }
    
      public double calculaSalario(String nivel, double salario){
      return x.calculaSalario(nivel, salario);
      
      }
      
      public String dadosSubs(){
      return x.dadosSubs();
      
      }
    
       public Departamento buscarDeptoCod(String codigo){
       return x.buscarDeptoCod(codigo);
       }
    
       public String dadosEfe(){
         return x.dadosEfe();
         
     }
     
       public String dadosTec(){
         return x.dadosTec();
     }
       
       
        public String dadosDoc(){
        return x.dadosDoc();
     }
        
       public String dadosTodosFunc(){
        return x.dadosTodosFunc();
      
       
     }
       
    public String relatorioGeral(){
    return x.relatorioGeral();
    }
            
       
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
    
    
 
