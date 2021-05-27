import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a,b,c;
		
		System.out.println("Óia!! Esse eclipse é porreta!!!");
		System.out.println("Digite um valor");
		a = teclado.nextInt();
		System.out.println("Digite outro valor");
		b = teclado.nextInt();
		
		c = a + b;
		System.out.println("Resultado = "+c);
		
		teclado.close();
	}
}

