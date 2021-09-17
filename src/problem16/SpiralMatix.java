package problem16;

import java.lang.reflect.Array;

public class SpiralMatix {

	public SpiralMatix() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] array = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		new SpiralMatix().printSpiral(array);
		
	}
	
	void printSpiral(int[][] array) {
		int primeraFila = 0;
		int ultimaFila = array.length-1;
		int primeraColumna = 0;
		int ultimaColumna = array[0].length-1;
		
		while(primeraFila < ultimaFila && primeraColumna<ultimaColumna) {
			
			//up
			
			for(int i = primeraColumna ; i <= ultimaColumna ; i++) {
				System.out.println(array[primeraFila][i]);
			}
			
			for(int i = primeraFila+1 ; i <= ultimaColumna ; i++) {
				System.out.println(array[i][ultimaColumna]);
			}
					
			
			primeraFila++;
			ultimaFila--;
			primeraColumna++;
			ultimaColumna--;
		}
	}

}
