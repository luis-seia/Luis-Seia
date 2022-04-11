
package biblioteca;

import java.util.Scanner;


public class Livro {
	// Atributos
    private String autor;
    private String titulo;
    private String categoria;
    private String codigo;
    private String data_emprestimo;
    private String data_validade;
    // Metodos Acessores
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        Scanner sc=new Scanner (System.in);
        autor=sc.nextLine();
        this.autor = autor;
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        Scanner sc=new Scanner (System.in);
        titulo=sc.nextLine();
        this.titulo = titulo;
        
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        Scanner sc=new Scanner (System.in);
        categoria=sc.nextLine();
        this.categoria = categoria;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        Scanner sc=new Scanner (System.in);
        codigo=sc.nextLine();
        this.codigo = codigo;
    }

    public String getData_emprestimo() {
        return data_emprestimo;
    }

    public void setData_emprestimo(String data_emprestimo) {
        Scanner sc=new Scanner(System.in);
       
        data_emprestimo=sc.nextLine();
        
        this.data_emprestimo = data_emprestimo;
    }

    public String getData_validade() {
        return data_validade;
    }

    public void setData_validade(String data_validade) {
        Scanner sc=new Scanner(System.in);
        
        data_validade=sc.nextLine();
        this.data_validade = data_validade;
    }
  
    // metodos
    public void operacoes(){
        System.out.print("insira o nome do autor:");
        this.setAutor(autor);
        System.out.print("insira o titulo do livro:");
        this.setTitulo(titulo);
        System.out.print("insira a categoria do livro:");
        this.setCategoria(categoria);
        System.out.print("insira o codigo do livro:");
        this.setCodigo(codigo);
        System.out.print("insira a data de emprestimo: ");
        this.setData_emprestimo(data_emprestimo);
        System.out.print("insira a data de validade do emprestimo: ");
        this.setData_validade(data_validade);
       
    }

    @Override
    public String toString() {
        System.out.println("***************************");
        return "Livro{" + "autor=" + autor + ", titulo=" + titulo + ", categoria=" + categoria + ", codigo=" + codigo + ", data_emprestimo=" + data_emprestimo + ", data_validade=" + data_validade + '}';
    }
}
