package atv1;

class TrianguloRetangulo {
	private double h;
	private double c1;
	private double c2;
		
	public double getC1() {
		return this.c1;
	}	
	public void setC1(double c1) {
		this.c1 = c1;
	}
	
	public double getC2() {
		return this.c2;
	}	
	public void setC2(double c2) {
		this.c2 = c2;
	}
	
	public double CalculaHipotenusa (double c1, double c2) {
		this.c1 = c1;
		this.c2 = c2;
		this.h = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
		return this.h;
	}
	
	
	public double CalculaArea () {
		return (this.c1 * this.c2) / 2;
	}
}