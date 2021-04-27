package pcalculadorafracao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import pcalculadorafracao.PCalculadora;
/**
*
* @author john
*/
public class TesteCalculadora {
    int numerador;
    int denominador;

    public void Fracao(int n, int d){
        if(d== 0){
            thrownewIllegalArgumentException("Denominador não pode ser igual a zero");
        }
        this.numerador = n;
        this.denominador = d;
    }

    private void thrownewIllegalArgumentException(String denominador_não_pode_ser_igual_a_zero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
