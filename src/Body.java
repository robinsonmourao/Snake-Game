import java.util.ArrayList;

public class Body {
	
	private Body body;
	private ArrayList <Body> listaDeBody = new ArrayList<>();

	public void increaseBody(){
		for(int k = 0; listaDeBody.size()<k;k++) {
			if(listaDeBody.size()==(k)) {
				listaDeBody.add(this);
			}					
		}		
	}
	public void decreaseBody() {
		for(int k=0; listaDeBody.size()<k;k++) {
			if(listaDeBody.get(k)==(this)) {
				listaDeBody.remove(this);
			}
		}
	}	
	public int tamanho(){
		return listaDeBody.size();
	}
}
