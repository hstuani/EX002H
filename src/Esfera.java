//importante notar que nesse caso utilizei o comprimento como sendo igual ao diametro da figura
public class Esfera extends Solidos {
	
	public Esfera(double comprimento,double largura,double altura ) {
		super(comprimento,largura,altura);
		
	}
	@Override
    public double area(){
		return 4*Math.PI*Math.pow(getComprimento()/2, 2) ;
   	 
    }
	@Override
    public double perimetro() {
		return 2*Math.PI*(getComprimento()/2);
	}
	@Override
	public double volume() {
		
		return (4/3)*Math.PI*Math.pow(getComprimento()/2, 3) ;
	}
}
