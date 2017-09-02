package luchadores.japoneses;

public class Torneo {

	
	public int[] calculaContrincante(Luchador[] luchadores) 
	{
		int[] contrincantes = new int[luchadores.length];
		int rivales=0;
		
		for(int i=0; i < luchadores.length ; i++)
		{
			for(int j=0; j < luchadores.length  ; j++)
			{
				if(luchadores[i].domina(luchadores[j]))
					rivales++;
			}
			contrincantes[i]=rivales;
			rivales=0;
		}
		
		return contrincantes;
	}
}
