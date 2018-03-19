//importante notar que nesse caso utilizei o comprimento como sendo igual ao diametro da base da figura
public class Cilindro extends Solidos {
	public Cilindro(double comprimento,double largura,double altura ) {
		super(comprimento,largura,altura);
		
	}
	@Override
    public double area(){
		return 2*Math.PI*(getComprimento()/2)*getAltura()+  2*Math.PI*Math.pow(getComprimento()/2, 2) ;
   	 
    }
	@Override
    public double perimetro() {
		return 2*Math.PI*(getComprimento()/2)*getAltura();
	}
	@Override
	public double volume() {
		
		return Math.pow(getComprimento()/2, 2)*getAltura()  ;
	}
}
