/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto2;

/**
 *
 * @author Luis Seia
 */
public final  class Bolsista extends Aluno {
    private float bolsa;

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    public void renovarBolsa(){
        System.out.println("Bolsa renovada para o aluno " +this.nome);
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println("Pagamento do bolsista feito com sucesso");
    }
}
