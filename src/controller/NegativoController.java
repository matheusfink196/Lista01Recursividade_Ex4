package controller;

public class NegativoController {
	
	public NegativoController() {
		super();
	}
	
	public int numnegativos(int vetor[],int i, int neg) {
		
		if (i<0) {
			return neg;
//ponto de saida; contador (tamanho do vetor) chega a zero
		} else {
			 if (vetor[i]<0) {
				neg++;
// outro contator soma 1 quando numero menor que 0
				return numnegativos(vetor, i- 1, neg);
			} else {
				return numnegativos(vetor, i- 1, neg);
			}
	
		}
	}
}