/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.Database;

import sistema.modelo.Constantes;
import sistema.modelo.Departamento;
import sistema.modelo.Docente;
import sistema.modelo.Efetivo;
import sistema.modelo.Funcionario;
import sistema.modelo.Substituto;
import sistema.modelo.Tecnico;

/**
 *
 * @author bruna
 */
public final class Database {
    private int MAX;
    private Departamento[] departamentos;
    private int contDep;
    private Funcionario funcionarios[];
    private int contF;
    private static Database instance = null;
    private Constantes c;
    
    
    private Database(){
         this.MAX = 100;
         this.contDep= 0;
         this.contF = 0;
         departamentos = new Departamento[MAX];
         funcionarios = new Funcionario[MAX];
         c = new Constantes();
    }
    
    public static Database getInstance(){
        if (instance == null){
            instance = new Database();
        }
        return instance;
    }
      
    

    public Departamento[] getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamento[] departamentos) {
        this.departamentos = departamentos;
    }
   

    public int getContDep() {
        return contDep;
    }

    public void setContDep(int contDep) {
        this.contDep = contDep;
    }
    
  
    
     public void addDepartamento(Departamento x){
        if ( contDep < MAX){
            departamentos[contDep] = x;
            contDep++;
        }
    }
     
    public void addFuncionario(Funcionario f) {
       departamentos[contDep-1].addFuncionario(f);
       contF++;    
       
    }
  
    public double gastoTotal() {
        double soma = 0;
        for (int i = 0; i < contF; i++) {
            soma = soma + funcionarios[i].calcularSalario();
        }
        return soma;
    } 
     
     
     public String dadosSubs(){
         String dados = "";
         for (int i = 0; i < contDep; i++) {
             dados = dados +departamentos[i].dadosSubs();
         }
         return dados;
     }

     
      public String dadosEfe(){
             String dados = "";
         for (int i = 0; i < contDep; i++) {
             dados = dados +departamentos[i].dadosEfe();
         }
         return dados;
     }
        
    
     
       public String dadosTec(){
         String dados = "";
         for (int i = 0; i < contDep; i++) {
             dados = dados +departamentos[i].dadosTec();
         }
         return dados;
     }
       
       
        public String dadosDoc(){
         String dados = "";
         for (int i = 0; i < contDep; i++) {
             dados = dados +departamentos[i].dadosDocentes();
         }
         return dados;
     }
        
       public String dadosTodosFunc(){
         String dados = "";
         for (int i = 0; i < contDep; i++) {
             dados = dados +departamentos[i].dadosTodosFunc();
         }
         return dados;
       
       
       }

    public String funcFaixaSalario(double ini, double fin) {
      String funcs="";
       for (int i = 0; i <contDep ; i++){
                funcs = funcs + departamentos[i].funcFaixaSalario(ini, fin);
               
         }
       return funcs;
    
    }

   

    public Funcionario buscarFuncNome(String nome) {
        for (int i = 0; i < contF; i++) {
            if (funcionarios[i].getNome().equals(nome)) {
                return funcionarios[i];
            }
        }
        return null;
    }
    
     public Funcionario buscarFuncCod(String codigo) {
         Funcionario f = departamentos[contDep-1].buscFuncCodigo(codigo);
            if ( f != null){
                    return f;
             }
      return null;
    }
     
     public String buscaFuncNome(String nome) {
        String func = "";
        for (int i = 0; i < contDep; i++) {
            func = departamentos[i].buscarFuncNome(nome);
            return func;
                }
        return func;
           
    }
    
     public String buscaFuncCod(String codigo) {
        String func = "";
        for (int i = 0; i < contDep; i++) {
            func = departamentos[i].buscarFuncCod(codigo);
                }
        return func;
    }

    
     
     
     
     
     
     

    
     public Departamento buscarDeptoNome(String nome){
        for (int i = 0; i < contDep; i++) {
            if (departamentos[i].getNome().equals(nome)){
                return departamentos[i];
            }
        }
        return null;
    }
     
         public Departamento buscarDeptoCod(String codigo){
        for (int i = 0; i < contDep; i++) {
            if (departamentos[i].getCodigo().equals(codigo)){
                return departamentos[i];
            }
        }
        return null;
    }
     
     
    
    public String deptoFaixaSalario(double ini, double fin){
        String deps="";
       for (int i = 0; i <contDep ; i++){
           double gasto = departamentos[i].gastoTotal();
           if ( ini <= gasto && gasto <= fin){
                String info = "\nDepartamento: "+departamentos[i].getNome()+ "\n Código: "+ departamentos[i].getCodigo()
                        +" Gasto total: "+departamentos[i].gastoTotal();
                deps = deps + info;
           }
         }
       return deps;
    }
    
    public void exibirDepartamentos(){
        for (int i = 0; i < contDep; i++) {
            System.out.println("\nCodigo do departamento: "+departamentos[i].getCodigo()
                    +" Nome: "+departamentos[i].getNome()+"\n-------------\n");
        }
    }
    
    public String resumoDeps(){
     String dados="";
     String resumo="";
     for (int i = 0; i < contDep; i++) {
            dados = "\nNome do departamento: "+departamentos[i].getNome()
                    +"\nQuantidade de funcionarios: "+departamentos[i].qtdF()+"\nGasto total: "+departamentos[i].gastoTotal()+ "\n-------------\n";
            resumo = resumo+dados;
     }
    return resumo;
    }
    
    public String relatorioGeral(){
    String geral="";
    String dados ="";
    for (int i = 0; i < contDep; i++) {
    dados="\nNome do departamento: "+departamentos[i].getNome()+"\nCódigo: "+departamentos[i].getCodigo()
            +"\nGasto total: "+departamentos[i].gastoTotal()+"\nFuncionários:";
    dados = dados+departamentos[i].relatorioGeral();
    geral = geral+dados;
    }
    return geral;
    }
            
            
    public Departamento[] departamentos(){
        Departamento deps[] = new Departamento[contDep];
        for(int i=0; i<contDep;i++){
            deps[i] = departamentos[i];
        }
        return deps;
    }
    
   
    public double calculaSalario(String nivel, double salario){
      double salarioC = c.salario(nivel, salario);               
      return salarioC;
    
    }

    public void gastoTotal(Departamento v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    
    
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

