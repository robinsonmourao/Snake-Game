import java.util.ArrayList;

public class Matriz {
	private Head head;
	private Body body;
	private ArrayList <Snake> snake = new ArrayList<>();
	private ArrayList <Integer> matriz = new ArrayList<>(9);	
	
	int matrizSize = matriz.size();
	int matrizHorizontalSize = 9; 
	int matrizVerticalSize = 9;
	
	int cont = 0;
	int x,y;
	
	public void escreverMatriz(){
		for(x = 0; x < matrizHorizontalSize; x++) {
			System.out.println(matriz);
			cont++;
			System.out.print(cont);
			for(y = 0; y < matrizVerticalSize; y++) {
				System.out.print(matriz);
			}			
		}
	}
}