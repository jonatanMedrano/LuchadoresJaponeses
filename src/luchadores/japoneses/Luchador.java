package luchadores.japoneses;

public class Luchador {

	private double peso;
	private double altura;
	
	
	/**
	 * Constructor de la clase
	 */
	public Luchador(double p, double a)
	{
		this.peso=p;
		this.altura=a;
	}
	
	public Luchador() {
		this(0,0);
	}

	/**
	 * metodo domina a otro luchador
	 */
	
	boolean domina(Luchador l1, Luchador l2)
	{
		if(l1.peso > l2.peso && l1.altura > l2.altura)
			return true;
		if(l1.peso == l2.peso && l1.altura > l2.altura)
			return true;
		if(l1.peso > l2.peso && l1.altura == l2.altura)
			return true;

		return false;		
	}
	
	/**
	 * sobre cargo el metodo domina para que pueda hacer
	 * luchador.domina(lucahdor3)
	 * @param l
	 * @return
	 */
	boolean domina(Luchador l)
	{
		if (this.peso > l.peso && this.altura > l.altura)
			return true;
		if(this.peso == l.peso && this.altura > l.altura)
			return true;
		if(this.peso > l.peso && this.altura == l.altura)
			return true;

		return false;		
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
}
