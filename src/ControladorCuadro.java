import java.awt.Color;


public class ControladorCuadro {
	
	private Dato[] arreglo;
	private int maximo;
	
	public ControladorCuadro(int elem){
		arreglo=new Dato[elem];
		this.maximo=elem;
	}
	
	public void agregarElementos(Dato cuadro){
		for(int i=0;i<maximo;i++)
			if(arreglo[i]==null){
				arreglo[i]=cuadro;
				break;
			}
	}
		
	public void mostrar(){
			for(int i=0;i<maximo;i++)
				if(arreglo[i]!=null){
					System.out.println("x: "+arreglo[i].getX());
					System.out.println("y: "+arreglo[i].getY());
					System.out.println("color: "+arreglo[i].getColor());
				}
	}
	
	public Color getColorArreglo(int pos){
		return arreglo[pos].getColor();
	}
	
	public int getArregloX(int pos){
		return arreglo[pos].getX();
	}
	
	public int getArregloY(int pos){
		return arreglo[pos].getY();
	}
		
}
