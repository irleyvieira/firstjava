package equation;
import java.util.Locale;
import java.util.Scanner;


public class Equation {

	public static void main(String[] args) {
		
		Scanner escaneador = new Scanner(System.in);
		
		System.out.println("Ola, voce esta no programa da equacao do segundo grau! com lei de formação ax² + bx + c");
		
		double a, b, c, delta, x1, x2;
		
		System.out.println("Digite o a da funcao: ");
		a = escaneador.nextDouble();
		
		System.out.println("Digite o b da funcao: ");
		b = escaneador.nextDouble();
		
		System.out.println("Digite o c da funcao: ");
		c = escaneador.nextDouble();
		escaneador.close();
		
		delta = (Math.pow(b, 2)) - (4 * a * c);
		
		
		System.out.printf("%nO valor do delta deu: %.0f%n%n", delta);
		
		
		
		x1 = (-b + Math.sqrt(delta)) / (2 * a);
		x2 = (-b - Math.sqrt(delta)) / (2 * a);
		
		System.out.printf("As duas raizes da equacao sao: %.0f e %.0f", x1, x2);
	}

}
