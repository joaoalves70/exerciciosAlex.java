/************************************************************************************
 *  9.
 *  Faça um programa que leia a idade de uma pessoa e informe a sua classe eleitoral: 
 *  - não eleitor (abaixo de 16 anos); 
 *  - eleitor obrigatório (entre a faixa de 18 e menor de 65 anos); 
 *  - eleitor facultativo (de 16 até 18 anos e maior de 65 anos, inclusive)
*************************************************************************************/
import java.util.Scanner; 
public class Eleicao { 

    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);   
    int  idade; 
    
    System.out.println("Digite sua idade: ");
    idade = ler.nextInt();
    
    if(idade < 16) {
        System.out.println("Não eleitor.");
    }
    else if (idade >= 18 && idade < 65) {
        System.out.println("Eleitor obrigatório."); 
    } 
    else if(idade >= 16 && idade < 18 && idade < 65) {
        System.out.println("Eleitor facultativo."); 
    }
}
}
