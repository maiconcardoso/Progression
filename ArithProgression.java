/**
	Progressão aritmética
*/
public class ArithProgression extends Progression{
	/** Incremento */
	protected long inc;
	// Herda as variáveis first e cur.
	/**
	 * Construtor default inicializa com incremento de 1.
	*/
	ArithProgression() {
		this(1);
	}
	/**
	 * Construtor paramétrico fornece o incremento. 
	*/
	ArithProgression(long increment){
		this.inc = increment;
	}

	/**
	 * Avança a progressão acrescentando o incremento ao valor atual. 
	 * @return próximo valor da progressão
	*/
	protected long nextValue() {
		cur += inc;
		return cur;
	}

	// Herda os métodos firstValue() e printProgression(int)
}