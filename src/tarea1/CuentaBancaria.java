package tarea1;

public class CuentaBancaria {
/*
 *  Colocar modificador private a los atributos
	Colocar modificador public a los métodos
	Crear un método público ‘ingresarDinero’ que permita ingresar un monto de dinero y 
	sumarlo al atributo saldoActual.
	Imprimir los valores por pantalla

 */
	public CuentaBancaria(int numeroDeCuenta,String titular,double saldoActual) {
		this.numeroDeCuenta=numeroDeCuenta;
		this.titular=titular;
		this.saldoActual=saldoActual;
	}
	
	private int numeroDeCuenta;
	private String titular;
	private double saldoActual;
	
	
	public void ingresarDinero(double monto) {
		// this.saldoActual=this.saldoActual+monto;
		this.saldoActual+=monto;
		
		System.out.println("Nuevo saldo Actual"+this.saldoActual);
	}
	
	
}
