/**
 * Progressão Fibonacci
*/
public class FibonacciProgression extends Progression {
	/** Valor anterior */
	long prev;
	// Herda as variáveis first e cur.
	/**
	 * Construtor default inicializa os dois primeiros valores como sendo 0 e 1.
	*/
	FibonacciProgression() {
		this(0, 1);
	}
	/**
	 * Construtor paramétrico fornece o primeiro e o segundo valores.
	 * @param value1 é o primeiro valor.
	 * @param value2 é o segundo valor.
	*/
	FibonacciProgression(long value1, long value2) {
		super.first = value1;
		this.prev = value2 -  value1; // Valor fictício que antecede o primeiro.
	}

	/**
	 * Avança a progressão somando o valor anterior no valor atual.
	 * @return próximo valor da progressão
	*/
	protected long nextValue() {
		long temp = this.prev;
		prev = super.cur;
		super.cur += temp;
		return super.cur;
	}
	// Herda os métodos firstValue() e printProgression(int);
}