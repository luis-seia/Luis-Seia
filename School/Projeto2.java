

package projeto2;

public class Projeto2 {

    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setNome("Jonas");
        a1.setMatricula(1111);
        a1.setIdade(18);
        a1.setCurso("informatica");
        a1.setSexo("M");
        a1.pagarMensalidade();
        Bolsista b1 = new Bolsista();
        b1.setNome("Andre");
        b1.setCurso("biologia");
        b1.setMatricula(1112);
        b1.setSexo("M");
        b1.setIdade(18);
        b1.pagarMensalidade();
    }
    
}
