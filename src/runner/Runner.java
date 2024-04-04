package runner;

import clase_36.*;


public class Runner {

	public static void main(String[] args) {
		
		
		
		Cliente clienteJose=new Cliente();
		clienteJose.setNombre("  Jose Sanchez  ");
		clienteJose.setEmail("  JOSEElGenio@correo.com ");
		clienteJose.setRut("1-8");
		
		Cuenta cuentaJose= new Cuenta();
		cuentaJose.setNroCuenta(321654);
		cuentaJose.setTitular(clienteJose);
		
		cuentaJose.ingresarDinero(500000);
		
		
		
		System.out.println("Saldo de la cuenta del cliente "+clienteJose.getNombreCompleto()+" es "+cuentaJose.getSaldo());
	}

}
