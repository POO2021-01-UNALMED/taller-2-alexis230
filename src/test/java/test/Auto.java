package test;

public class Auto {
	String modelo;
	int precio;
	Asiento asientos[] ;  
	String marca;
	Motor motor;
    int registro;
	int cantidadCreados;
	
	public void cantidadAsientos(int cantAsientos){
		cantAsientos=0;
		for(Asiento asiento:asientos){
			if(asiento!=null){
			   cantAsientos++;
			}
		}
		System.out.println(cantAsientos);
	}
	
	public String verificarIntegridad(){
		if(motor.registro != registro ){
			return "las piezas no son originales";
		}
		for(Asiento asiento :asientos){
			if(asiento!=null){
				if(asiento.registro!=registro){
				return "Las piezas no son originales";
			    }
			}
		}	
		return "el auto es original";
	}
}
