
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Etec-User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //define a visibilidaed de um atributo (acesso);
        //modificadorDeAcesso - tipoDeDado - nomeAtributo;
        //Opcional (Padrão:Public,Protecded,Private;
        //public: manipulável "fora" da classe (todo o projeto);
        //protected: somente no pacote;
        //private: somente dentro da classe;
        //modificadorDeAcesso define a visibilidade do método; NomeClasse(){};
        //modificadorDeAcesso tipoDeValorRetornad nomeMetodo(){} = Assinatura do método;
        //tipoDeValorRetornado: resultado do procerssamento do método.
        //Definido pelo tipo de dado da classe;
        //Função: instruções encapsuladas que visam apresentavar um
        //resultado sobre o processamento de um ou vários dados de entrada
        //(parâmetros);
        //-final: atributo imutável (constante)
        //-static: manipulável sem a necessidade de um objeto
        //-String.format():formatação de um texto ou número;
        //Herança: atributos e métodos;
        //Classe a ser herdada: superClasse, classe-mãe, classe-pai,
        //Instancia
        //<NomeClass> <nomeObjeto> = newClasse()>
        Calculadora calculadora = new Calculadora ();
        //aqui estamos instanciando a classe 
        //nomeObjeto.nomeMétodo
        
        String algarismo1,algarismo2;
        // declaramos duas variáveis
        
        //capturamos as entradas do usuário
       algarismo1 =  JOptionPane.showInputDialog("Forneça o primeiro número:");
       algarismo2 =  JOptionPane.showInputDialog("Forneça o segundo número:");
       //declaramos as variáveis
       Double num1,num2;
       //palavra parse indica uma conversão
       //converte String para Double
       num1 = Double.parseDouble(algarismo1);
       num2 = Double.parseDouble(algarismo2);
       //sintaxis <objeto>.<método (<parametros>)
       calculadora.adicao(num1, num2);
       //construtor:instanciar objeto/criar objeto
       //Modificadores de acesso:visibilidade/ acesso de uma classe, método ou atributo
       //Métodos: ação equivalente a uma função. Encapsula instruções visando um tesultado.
       //Parâmetros : dados de entrada do método
       //como é um metodo void nao posso manipular a adicao porque é um metodo void
       Double resultadoSubtracao = calculadora.subtracao(num1,num2);
       JOptionPane.showMessageDialog(null," resultado da subtracao: " + resultadoSubtracao);
       // metodo com retorno do mesmo tipo da dados dos parametros
       
       String resultadoMult = calculadora.multiplicacao(num1,num2);
       JOptionPane.showMessageDialog(null,  resultadoMult);
       //metodo com retorno com tipo de dado diferente dos parametros
       
       
       //<nomeObjto>.<atributo>
       //inicialização e a primeiora atribucao
       //se quiser se pode usar os numeros num1 e num2 é só trocar nestas duas linhas abaixo
       calculadora.n1 = 3.1416;
       calculadora.n2 = 5.6;
       //se pode a classe é public mas se for private não se pode, porque ese modificador de acesso
       //metodo sem parametros mas va retornar variaveis, por meio dos atributos da minha classe
       Double resultadoDivisao= calculadora.divisao();
       
       JOptionPane.showMessageDialog(null,"resultado da divisão: " + resultadoDivisao);
       
       
       
       
       Double resultadoExpo = calculadora.exponenciacao(num1, num2);
       JOptionPane.showMessageDialog(null, "Resultado da exponenciação: " + resultadoExpo);
       JOptionPane.showMessageDialog(null, String.format("Resultado da exponenciação: %.2f", resultadoExpo));
       
    
       
       JOptionPane.showMessageDialog(null,"Acesso constante convencional : " + calculadora.CONSTANTE_DE_PI);
       JOptionPane.showMessageDialog(null,"Acesso constante estatica : " + calculadora.PI_ESTATICA);
       
       Calculadora calculadora2 = new Calculadora();
       Calculadora calculadora3 = new Calculadora();
       
    
      
       
       
        CalculadoraCientifica calcCientifica = new CalculadoraCientifica(100,0.99);
       
       
       
       
       
       
       
    }
    
    
}
