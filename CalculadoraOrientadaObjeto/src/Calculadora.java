
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Etec-User
 */
    
    //Classe 
public class Calculadora {
    //Atributos
    
     // Constante (usar palavra reservada final)
     public final double CONSTANTE_DE_PI = 3.14159; 
       // Constante estática (usar palavra reservada static)
     public static final double PI_ESTATICA = 3.14159;
    public Double n1,n2;
    
    //Construtor = instancia objeto,iniciar valores dos atributos da classe 
    public Calculadora() {
        System.out.println("Objeto criado com sucesso");
    }
    
    //Função; instruções encapsuladas que visam apresentar um resultado sobre o
    //processamento de um ou vários dados de entrada(parâmetros)
    //Métodos (ação).Equivalente à uma funcção da programção estruturada 
    //Void: método sem return
    //
    public void adicao(Double x,Double y){
        Double resultado = x+y;
     //classe JOptionPane:janela flutuante interativa   
        JOptionPane.showMessageDialog(null," resultado da adição:" + resultado);
        //se entrega double e retorna string
    } 
    //se o metodo nao e void se deve colocar o retorno
    public Double subtracao(Double x,Double y){
       Double resultado=x - y; 
       return resultado;
       //aqui recebe double e retorna double o mesmo tipo de dado
      
    }
    //aqui se entrega string e se pode retornar string
    public String multiplicacao(Double x, Double y){
    Double resultado = x*y;
    String resultadoString = "Resultado de multiplicação: "+ resultado;
    return resultadoString;
    
    }
    public Double divisao(){
        Double resultado = this.n1 / this.n2;
        //"this" especifica que são atributos da classe
        return resultado;
        
         //public void adicao(){} 
//        return ...método com assinatura diferente

    }
    
    public Double exponenciacao(Double base,Double exp){
        Double resultado = Math.pow(base, exp);
        return resultado ;
        
    }
    
     
    
}





