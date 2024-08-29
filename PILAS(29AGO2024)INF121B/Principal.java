package pru;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("nombre: marcelo aruquipa");
		System.out.println("TEma: PILA DE CARACTERES\n");
		
		PilaCar z = new PilaCar();
		//z.llenar(7);
		z.adi('a');
		z.adi('x');
		z.adi('a');
		z.adi('z');
		z.adi('e');
                z.adi('a');
		z.mostrar();
                System.out.println("Nro elementos:["+z.nroElem()+"]");
                /*z.eli();
                z.mostrar();
                System.out.println("Nro elementos:["+z.nroElem()+"]");
                
                PilaCar aux=new PilaCar();
                System.out.println("\nVaciar la Pila:");
                aux.vaciar(z);
                aux.mostrar();
                z.mostrar();
                z.vaciar(aux);*/
                
		//a) 
                System.out.println("\n[a] determinar cantidad de vocales que tiene la pila:");
                incisoA(z);
                System.out.println("\n[b] cuantas veces ocurre el caracter x:");
                incisoB(z,'a');
	}

    private static void incisoA(PilaCar z) {
        PilaCar b=new PilaCar();
        int cv=0;
        while(!z.esVacia()){
            char x=z.eli();
            if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u')
                cv++;
            b.adi(x);
        }
        z.vaciar(b);
        System.out.println("Nro vocales: ["+cv+"]");    
        
    }

    private static void incisoB(PilaCar z, char x) {
        PilaCar b=new PilaCar();
        int cx=0;
        while(!z.esVacia()){
            char y=z.eli();
            if(y==x)
                cx++;
            b.adi(y);
        }
        z.vaciar(b);
        System.out.println("Repite: ["+cx+"] veces");
    }
}
