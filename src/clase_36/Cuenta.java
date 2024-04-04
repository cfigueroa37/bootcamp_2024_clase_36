package clase_36;

public class Cuenta {
	private int nroCuenta;
	private Cliente titular;
	private double saldo;
	
	
	public Cuenta() {
	}
	public Cuenta(int nroCuenta,Cliente titular,double saldo) {
		this.nroCuenta=nroCuenta;
		this.titular=titular;
		this.saldo= saldo;
	}
	public Cuenta(double saldo) {
		this.saldo= saldo;
	}
	public Cuenta(Cliente titular,double saldo) {
		this.saldo= saldo;
		this.titular=titular;
	}
	
	
	public int getNroCuenta() {
		return nroCuenta;
	}
	public void setNroCuenta(int nroCuenta) {
		this.nroCuenta = nroCuenta;
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void ingresarDinero(double monto) {
		
		// proceso de validacion
		
		saldo+=monto;
	}
	
	

}
