/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcalculadorafracao;
import javax.swing.JOptionPane;
/**
*
* @author john
*/
class PrincipalCalculadora {
    public static void main( String args[] ){
        int num1, den1, num2, den2;
        TesteCalculadora teste = new TesteCalculadora();

        String sNum1, sDen1, sNum2, sDen2;
        sNum1 = JOptionPane.showInputDialog( null, "Digite o primeiro numerador:","Primeiro numerador", JOptionPane.QUESTION_MESSAGE );
        num1 = Integer.parseInt( sNum1 );
        sDen1 = JOptionPane.showInputDialog( null, "Digite o primeiro denominador:",
        "Primeiro denominador", JOptionPane.QUESTION_MESSAGE );
        den1 = Integer.parseInt( sDen1 );
        teste.Fracao(num1, den1);
        sNum2 = JOptionPane.showInputDialog( null, "Digite o segundo numerador:","Segundo numerador", JOptionPane.QUESTION_MESSAGE );
        num2 = Integer.parseInt( sNum2 );
        sDen2 = JOptionPane.showInputDialog( null, "Digite o segundo denominador:",
        "Segundo denominador", JOptionPane.QUESTION_MESSAGE );
        den2 = Integer.parseInt( sDen2 );
        teste.Fracao(num2, den2);
        // instanciação de um objeto da classe calculadora
        PCalculadora calc = new PCalculadora();
        JOptionPane.showMessageDialog(null, "somar: " + calc.somar(num1, den1, num2, den2 ) );
        JOptionPane.showMessageDialog(null, "subtrair: " + calc.subtrair( num1, den1, num2, den2 )
        );
        JOptionPane.showMessageDialog(null, "multiplicar: " +
        calc.multiplicar(num1, den1, num2, den2 ) );
        JOptionPane.showMessageDialog(null, "dividir: " + calc.dividir( num1, den1, num2, den2 ) );

        System.exit( 0 );
    }
}
