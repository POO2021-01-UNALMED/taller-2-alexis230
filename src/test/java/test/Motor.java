package test;

public class Motor {
	int numeroCilindros;
	static String tipo;
	int registro;
	
	public void cambiarRegistro(int registro){
		this.registro = registro;
	}
	
	public void asignarTipo(String tipoMotor){
		if(tipoMotor.equals("electrico")){
			Motor.tipo.equals("electrico");
		}else if(tipoMotor.equals("gasolina")){
			Motor.tipo.equals("gasolina");
		}
	}
}
