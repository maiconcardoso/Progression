/**
 * Progressão Geométrica 
*/
public class GeomProgression extends Progression{
	/** Base */
	protected long base;
	// Herda as variáveis first e cur.
	/**
	 * Construtor paramétrico fornece o valor base.
	*/
	GeomProgression() {
		this(2);
	}
	/**
	 * Construtor paramétrico fornece o valor base.
	 * @param base é o valor base da progressão
	*/
	GeomProgression(long b) {
		this.base = b;
		super.first = 1;
		super.cur = super.first;
	}
	/**
	 * Avança a progressão multiplicando a base pelo valor corrente.
	 * @return próximo valor da progressão.
	*/
	protected long nextValue() {
		super.cur *= this.base;
		return super.cur;
	}
	// Herda os métodos firstValue() e printProgression(int).
}