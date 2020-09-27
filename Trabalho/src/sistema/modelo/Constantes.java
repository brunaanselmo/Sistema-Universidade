/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.modelo;

/**
 *
 * @author bruna e gabriela
 */
public class Constantes {
    
    private double adicional;

    public Constantes() {
        this.adicional = adicional;
    }
    
    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }
       
    public double salario(String nivel, double salario){
    switch(nivel){
        case "T1":
            adicional = (salario * 0.1);
            break;
        case "T2":
            adicional = (salario * 0.2);
            break;
        case "D1":
            adicional = (salario * 0.05);
            break;
        case "D2":
            adicional = (salario * 0.1);
            break;
        case "D3":
            adicional = (salario * 0.2);
            break;
        case "S1":
            adicional = (salario * 0.05);
            break;
        case "S2":
            adicional = (salario * 0.1);
            break;  
        default:
            adicional = 0.0;
            break;
    }
    return adicional;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
