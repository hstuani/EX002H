   
public class Trapezio extends Poligono {
	private double base_menor;
	private double lado_a;
	private double lado_b;
	
	public Trapezio(double base_menor,double base,double altura,double lado_a,double lado_b) {
		super(base,altura);
		this.base_menor=base_menor;
		this.lado_a=lado_a;
		this.lado_b=lado_b;
	}
	
	public double getLado_a() {
		return lado_a;
	}

	public void setLado_a(double lado_a) {
		this.lado_a = lado_a;
	}

	public double getLado_b() {
		return lado_b;
	}

	public void setLado_b(double lado_b) {
		this.lado_b = lado_b;
	}

	public double getBase_menor() {
		return base_menor;
	}
	public void setBase_menor(double base_menor) {
		this.base_menor = base_menor;
	}
	@Override
    public double area(){
		return ((getBase()+getBase_menor())*getAltura())/2;
   	 
    }
	@Override
    public double perimetro() {
		return getBase() + getBase_menor() + getLado_a() + getLado_b();
	}

	@Override
	public double volume() {
		
		return 0;
	}
}
