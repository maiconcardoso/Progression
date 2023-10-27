/** Programa teste para as classe de progressão */
public class TestProgression {
	public static void main(String[] args) {
		Progression prog;
		
		// Testa arithProgression
		System.out.println("Arithmetic progression with default incriment: ");
		prog = new ArithProgression();
		prog.printProgression(10);
		System.out.println("Arithmetic progression with increment 5: ");
		prog = new ArithProgression(5);
		prog.printProgression(10);

		// Testa GeomProgression
		System.out.println("Geometric progression with default base: ");
		prog = new GeomProgression();
		prog.printProgression(10);
		System.out.println("Geometric Progression with base 3: ");
		prog = new GeomProgression(3);
		prog.printProgression(10);

		// Testa Fibonacci
		System.out.println("Fibonacci progression with default start values: ");
		prog = new FibonacciProgression();
		prog.printProgression(10);
		System.out.println("Fibonacci progression with start values 4 e 6: ");
		prog = new FibonacciProgression(4, 6);
		prog.printProgression(10);
	}
}