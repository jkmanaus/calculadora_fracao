/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcalculadorafracao;

/**
*
* @author john
*/
public class PCalculadora {
    // atributo
    private int resultado = 0;

    // método somar
    public double somar( int num1, int den1, int num2, int den2 ){
        //denominadores iguais
        if (den1 == den2){
            resultado = (num1 + num2)/ den1;
        }else{
        //denominadores diferentes
            int temp1 = den1;
            int temp2 = den2;
            num1 = num1 * temp1;
            den1 = den1 * temp1;
            num2 = num2 * temp2;
            den2 = den2 * temp2;
            resultado = (num1 + num2)/den1;
        }
        
        return resultado;
    }
    // método subtrair
    public double subtrair( int num1, int den1, int num2, int den2 ){
                //denominadores iguais
        if (den1 == den2){
            resultado = (num1 - num2)/ den1;
        }else{
        //denominadores diferentes
            int temp1 = den1;
            int temp2 = den2;
            num1 = num1 * temp1;
            den1 = den1 * temp1;
            num2 = num2 * temp2;
            den2 = den2 * temp2;
            resultado = (num1 - num2)/den1;
        }       
        return resultado;
    }
    // método multiplicar
    public double multiplicar( int num1, int den1, int num2, int den2 ){
        resultado = (num1 * num2) / (den1 * den2);
        return resultado;
    }
    // método dividir
    public double dividir( int num1, int den1, int num2, int den2 ){
        resultado = (num1 * den2) / (num2 * den1);
        return resultado;
    }
}