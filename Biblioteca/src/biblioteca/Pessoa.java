
package biblioteca;

import java.util.Scanner;

public class Pessoa {
    private String nome;
    private String contacto;
    private String morada;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
         Scanner sc=new Scanner (System.in);
         nome=sc.nextLine();
        this.nome = nome;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
         Scanner sc=new Scanner (System.in);
         contacto=sc.nextLine();
        this.contacto = contacto;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
         Scanner sc=new Scanner (System.in);
         morada=sc.nextLine();
        this.morada = morada;
    }

    public String getEmail() {
         
        return email;
    }

    public void setEmail(String email) {
        Scanner sc=new Scanner (System.in);
        email=sc.nextLine();
        this.email = email;
    }
    
    public void inserir(){
        System.out.print("insira o nome: ");
        this.setNome(nome);
        System.out.print("insira o contacto: ");
        this.setContacto(contacto);
        System.out.print("insira a morada: ");
        this.setMorada(morada);
        System.out.print("insira o email: ");
        this.setEmail(email);
    }
    public void imprimir (){
        System.out.println("**************************");
        System.out.println("Nome: " +this.getNome());
        System.out.println("Contacto: " +this.getContacto());
        System.out.println("Morada: " +this.getMorada());
        System.out.println("Email:" +this.getEmail());
    }
 
    
}

