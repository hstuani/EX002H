
public class Piramide extends Solidos {
	public Piramide(double comprimento,double largura,double altura ) {
		super(comprimento,largura,altura);
		
	}
	@Override
    public double area(){
		return Math.sqrt(3)*Math.pow(getComprimento(), 2);
   	 
    }
	@Override
    public double perimetro() {
		return 12*getComprimento();
	}
	@Override
	public double volume() {
		
		return (1/3)*getComprimento()*getLargura()*getAltura() ;
	}
}
