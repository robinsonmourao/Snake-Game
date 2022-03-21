import java.util.ArrayList;

public class Body {
	
	private Body body;
	private ArrayList <Body> listaDeBody = new ArrayList<>();

	public void increaseBody(){
		for(int k = 0; listaDeBody.size()<k;k++) {
			if(listaDeBody.size()==(k)) {
				listaDeBody.add(this.body);
			}					
		}		
	}
	public void decreaseBody() {
		for(int k=0; listaDeBody.size()<k;k++) {
			if(listaDeBody.get(k)==(this.body)) {
				listaDeBody.remove(this.body);
			}
		}
	}	
	public int tamanho(){
		return listaDeBody.size();
	}
}
