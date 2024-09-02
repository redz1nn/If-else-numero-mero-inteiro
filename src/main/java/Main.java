import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new
      Scanner(System.in);

System.out.println("**{Digite um número inteiro:}**");

  int número = sc.nextInt();
    if (número < 0) {
  
      System.out.println("*{Número negativo!}*");
    } else {
        System.out.println("*{Número positivo!}*");
    }     
sc.close();
  }
}