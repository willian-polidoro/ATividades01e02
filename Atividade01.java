import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        // Inicializar as variáveis
        String nome = "";
        String curso = "";
        int periodo = 0;
        int idade = 0;
        // Scanner é uma classe
        //sc é o nome
        //new instancia (cria) um objeto
        //new scanner indica o tipo de objeto criado
        //(System.in) é um parametro

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é o seu nome ?");
        nome = sc.nextLine();

        System.out.println(" Qual é o seu curso ?");
        curso = sc. nextLine();

        System.out.println(" Qual é o período ?");
        periodo = sc.nextInt();

        System.out.println("Qual é a sua idade ?");
        idade = sc.nextInt();

        System.out.println("Nome do aluno é :"+nome);
        System.out.println("Seu curso é : "+curso);
        System.out.println("Voçê está no período : " + periodo);
        System.out.println("Sua idade é : " + idade + " anos");

    }


    }

