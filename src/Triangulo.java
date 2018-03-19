
public class Triangulo extends Poligono {
	
	private double lado1;
	private double lado2;
	public Triangulo(double base,double altura,double lado1,double lado2) {
		super(base,altura);
		this.setLado1(lado1);
		this.setLado2(lado2);
	}
	
	public double getLado1() {
		return lado1;
	}
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}
	public double getLado2() {
		return lado2;
	}
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	@Override
    public double area(){
		return (getBase()*getAltura())/2;
   	 
    }
   
	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return lado1 + lado2 + getBase() ;
	}

	@Override
	public double volume() {
		
		return 0;
	}
}
