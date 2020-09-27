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
public class Departamento {
    private String codigo;
    private String nome;
    private int contF=0;
    private Funcionario funcionarios[];
    private int MAX;
    
    public Departamento() {
        MAX = 100;
        contF = 0;
        funcionarios = new Funcionario[MAX];
        codigo = "";
        nome = "";
    }
    
    public Departamento(String codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
        MAX = 100;
        contF = 0;
        funcionarios = new Funcionario[MAX];
               
    }
    
    public void addFuncionario(Funcionario f) {
        if (contF < MAX) {
            funcionarios[contF] = f;
            contF++;
        }
    }
   
  
    public double gastoTotal() {
        double soma = 0;
        for (int i = 0; i < contF; i++) {
            soma = soma + funcionarios[i].calcularSalario();
        }
        return soma;
    }
    
    public Funcionario buscFuncCodigo(String codigo){
    for (int i = 0; i < contF; i++) {
            if (funcionarios[i].getCodigo().equals(codigo)) {
                return funcionarios[i];
            }
        }
        return null;
    }
    
       public String dadosSubs(){
         String dados = "";
         for (int i = 0; i < contF; i++) {
            if (funcionarios[i] instanceof Substituto) {
                dados = dados +"\nNome do funcionário: "+funcionarios[i].getNome()+"-- Código: "+funcionarios[i].getCodigo();
            } 
     }
        
        return dados;
     }
       
       
         public String dadosEfe(){
         String dados = "";
         for (int i = 0; i < contF; i++) {
            if (funcionarios[i] instanceof Efetivo) {
                dados = dados +"\nNome do funcionário: "+funcionarios[i].getNome()+"-- Código: "+funcionarios[i].getCodigo();
            } 
     }
        
        return dados;
     }
       
       public String dadosTec(){
         String dados = "";
         for (int i = 0; i < contF; i++) {
            if (funcionarios[i] instanceof Tecnico) {
                dados = dados +"\nNome do funcionário: "+funcionarios[i].getNome()+"-- Código: "+funcionarios[i].getCodigo();
            } 
     }
        
        return dados;
     }
       
       
        public String dadosDocentes(){
         String dados = "";
         for (int i = 0; i < contF; i++) {
            if (funcionarios[i] instanceof Docente) {
                dados = dados +"\nNome do funcionário: "+funcionarios[i].getNome()+"-- Código: "+funcionarios[i].getCodigo();
            } 
     }
        
        return dados;
     }
       
        public String dadosTodosFunc(){
         String dados = "";
         for (int i = 0; i < contF; i++) {
             dados = dados +"\nNome do funcionário: "+funcionarios[i].getNome()+"-- Código: "+funcionarios[i].getCodigo();
            
            }
        
        return dados;
     }
        
        
       public String relatorioGeral(){
        String dados = "";
         for (int i = 0; i < contF; i++) {
             dados = dados +"\nNome do funcionário: "+funcionarios[i].getNome()+"-- Código: "+funcionarios[i].getCodigo()
                     +"";
            
            }
        
        return dados;
       
       } 
        
      public String funcFaixaSalario(double ini, double fin) {
      String funcs="";
       for (int i = 0; i <contF ; i++){
           double gasto = funcionarios[i].calcularSalario();
           if ( ini <= gasto && gasto <= fin){
                funcs = funcs + "\nNome do funcionário: "+funcionarios[i].nome+"\nSalario"+funcionarios[i].salario;
                
           }
         }
       return funcs;
      }
      
      public String buscarFuncNome(String nome) {
       String func="";
       for (int i = 0; i <contF ; i++){
           if (funcionarios[i].nome.equals(nome)){    
                func= "\nNome do funcionário: "+funcionarios[i].getNome()+"\nCódigo: "+funcionarios[i].getCodigo()+
                        "\nSalario: "+funcionarios[i].calcularSalario();
                return func;
          
          }   
         }
        return func;
      }
    
     public String buscarFuncCod(String codigo) {
       String func="";
       for (int i = 0; i <contF ; i++){
           if ( (funcionarios[i].codigo).equals(codigo)){
                func= "\nNome do funcionário: "+funcionarios[i].nome+"\nCódigo: "+funcionarios[i].getCodigo()+
                        "\nSalario: "+funcionarios[i].calcularSalario();
        }   
         }
        return func;
      }
    
       
    public int qtdF(){
    return contF;
    }
    
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

    public int getContF() {
        return contF;
    }

    public void setContF(int contF) {
        this.contF = contF;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }
    
    
    
    
    
    
    
}
