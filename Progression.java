/**
 * Uma classe de progressão numérica
*/

public class Progression {

	/**
	 * Primeiro valor da progressão
	*/
	protected long first;

	/**
	 * Valor atual da progressão
	*/
	protected long cur;

	/**
	 * Construtor default
	*/
	Progression() {
		cur = first = 0;
	}

	/**
	 * Reinicializa a progressão com valor inicial
	 * @return valor inicial
	*/
	protected long firstValue() {
		cur = first;
		return cur;
	}

	/**
	 * Avança a progressão para o próximo valor
	 * @return próximo valor da progressão
	*/
	protected long nextValue() {
		return ++cur; // próximo valor default
	}

	/**
	 * Imprime os primeiros valores a serem impressos
	 * @param número n de valores a serem impressos 
	*/
	public void printProgression(int n) {
		System.out.print(firstValue());
		for (int i=2; i<=n; i++) {
			System.out.print(" " + nextValue());
		}
		System.out.println(); // termina a linha
	}

}