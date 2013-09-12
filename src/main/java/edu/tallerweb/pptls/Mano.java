package edu.tallerweb.pptls;

/**
 * Representa una de las Manos involucradas en el juego
 */
public class Mano {
	private Forma forma;



	/**
	 * Toda Mano debe crearse con una forma dada, que será
	 * la que determine su condición en el juego.
	 * @param forma, la Forma que adopta la Mano.
	 */
	public Mano(final Forma forma) {
		this.forma=forma;
	}



	/**
	 * Evaluará el resultado de la partida según las reglas
	 * del juego.
	 * @param otra, la otra Mano.
	 * @return un Resultado, de acuerdo al estado del juego.
	 */
	public Resultado jugarCon(final Mano otra) {
		if (this.forma==otra.forma){
			return Resultado.EMPATA;
		}
		if (this.forma==Forma.PIEDRA&&otra.forma==Forma.TIJERA||this.forma==Forma.PAPEL&&otra.forma==Forma.PIEDRA||this.forma==Forma.TIJERA&&otra.forma==Forma.PAPEL||this.forma==Forma.LAGARTO&&otra.forma==Forma.SPOCK||this.forma==Forma.SPOCK&&otra.forma==Forma.TIJERA||this.forma==Forma.TIJERA&&otra.forma==Forma.LAGARTO||this.forma==Forma.LAGARTO&&otra.forma==Forma.PAPEL||this.forma==Forma.PAPEL&&otra.forma==Forma.SPOCK||this.forma==Forma.SPOCK&&otra.forma==Forma.PIEDRA||this.forma==Forma.PIEDRA&&otra.forma==Forma.LAGARTO)
		{
			return Resultado.GANA;
		}
		else
		{
			return Resultado.PIERDE;
		}
	
	}
}
