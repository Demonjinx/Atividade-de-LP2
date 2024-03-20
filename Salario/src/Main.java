//número de um funcionário,seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();
        int horastrabalho = scan.nextInt();
        float valorhrs = scan.nextFloat();

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f ", horastrabalho * valorhrs);
    }
}