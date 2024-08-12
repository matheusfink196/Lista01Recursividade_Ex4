package view;
import controller.NegativoController;
public class Principal {
	
	public static void main (String args[]) {
		NegativoController negCont = new NegativoController();
		
		int[] vetor = {-8,5,2,-1,3,-4};
		int tam = vetor.length;
		int cont = 0;
		int resul = negCont.numnegativos(vetor, tam-1,cont);
		System.out.println(resul);		
			
		
	}
}
