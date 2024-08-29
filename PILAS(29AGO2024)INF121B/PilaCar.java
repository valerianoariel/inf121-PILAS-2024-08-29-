package pru;
import java.util.Scanner;


public class PilaCar extends VectorCar {
	private int tope;

	public PilaCar() {
		this.tope = -1;
	}
	
	public boolean esVacia(){
		if(this.tope == -1)
			return true;  //pila vacia
		else
			return false; //pila no es vacia
	}
	public boolean esLlena(){
		if(this.tope == max-1)
			return true;  //pila llena
		else 
			return false; //pila no es llena
	}
	public void adi(char elem){
		if(!esLlena()){ //si la pila no es llena
			this.tope++;  //incrementa en una unidad  tope = tope + 1
			this.v[this.tope] = elem;
		}
		else
			System.out.println("Pila Llena!!!");
	}
	public char eli(){
		char elem = 0;
		if(!esVacia()){ //si la pila no es vacia
			elem = this.v[this.tope];
			this.tope--; //decrementamos en una unidad
		}
		else
			System.out.println("Pila es vacia!!!!");
		return elem;
	}
	
	public void mostrar(){
		PilaCar aux = new PilaCar();
		System.out.println("\nDatos de la pila: ");
		while(!esVacia()){
			char elem = eli();
			System.out.println("\t¬ "+elem);
			aux.adi(elem);
		} 
		vaciar(aux);
	}
	public void vaciar(PilaCar p){
		while(!p.esVacia()){  //mientras la pila p NO es vacia
			adi(p.eli());
		}
	}
	public void llenar(int n){
		Scanner lee = new Scanner(System.in);
		System.out.println("Intr datos: ");
		for (int i = 1; i <= n; i++) {
			char elem = lee.next().charAt(0);
			this.adi(elem);
		}
	}
	public int nroElem(){
		return tope + 1;
	}
	public int NroElem(){
		PilaCar aux = new PilaCar();
		int c = 0;
		while(!esVacia()){
			char elem = eli();
			aux.adi(elem);
			c++;
		} 
		vaciar(aux);
		return c;
	}
}
