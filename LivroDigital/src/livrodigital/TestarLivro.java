
package livrodigital;

import static livrodigital.LivroDigital.numlivros;

public class TestarLivro {
    public static void main(String[] args) {
        LivroDigital l1 = new LivroDigital(100,20,"bela");
         LivroDigital l2 = new LivroDigital("bela");
        l2.setPaginas(450);
          l2.setPaginaslidas(220);
          l1.status();
        l1.verificarprocesso();
        l2.status();
        l2.verificarprocesso();
        LivroDigital l3 = new LivroDigital(120,10,"guerra");
        LivroDigital l4 = new LivroDigital(600,200,"paz");
        LivroDigital l5 = new LivroDigital(100,100,"JAVA");
        LivroDigital l6 = new LivroDigital(300,20,"pessoas");
        
        System.out.println("Foram criados "+numlivros+" Livros");
    }
}
