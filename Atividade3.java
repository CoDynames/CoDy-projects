import java.util.Scanner;
public class Atividade3{
        public static void main(String[] args) {
        Scanner pila = new Scanner (System.in);
        System.out.print ("Qual e o seu nome? ");
        String nome = pila.nextLine();
        System.out.print ("Qual e a sua idade? ");
        int idade = pila.nextShort();
        System.out.println("ola," + nome + " voce tem " + idade + " anos");
        pila.close();

        }
}