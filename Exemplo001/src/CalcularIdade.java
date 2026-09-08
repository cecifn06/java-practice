import java.util.Scanner;
import java.time.OffsetDateTime;

/*
Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"

 */

public class CalcularIdade {
    public static void main(String[] args) {
   
   int anoatual = OffsetDateTime.now().getYear();
        
   Scanner scanner = new Scanner(System.in);
   System.out.println("Informe o seu nome: ");
   String nome = scanner.nextLine();
   System.out.println("Informe seu ano de nascimento: ");
   int anoNascimento = scanner.nextInt();
   int idade = anoatual - anoNascimento;
   System.out.printf("Olá %s, você tem %d anos de idade.\n", nome, idade);


        }
    }

