


public class Persona {
	String name;
	String sexo;
	int edad;
	
	public void caminar(){
		System.out.println(name + "Esta caminando");
	}
	
	public void estudiar(){
		System.out.println(name + "Esta estudiando");
	}
	
	public void comer(){
	System.out.println(name + " Esta comiendo" + comida);
	}

	public void pedirCerveza(){
		if(edad >= 18){
		System.out.println("Dar cervesa");
	}else{
		System.out.println("No tienes edad para tomar")
	}
	}
	
}	
class Curso{
	
	public static void main (String args[]){
		Persona juan = new Persona();
		juan.name = "Juan Perez";
		juan.sexo = "M";
		juan.edad = 22;
		juan.caminar();
		juan.estudiar();
		juan.comer("Torta cubana + Guacamole");
		juan.pedirCervesa();
	
		Persona bety = new Persona();
		bety.name = "beatriz";
		bety.sexo = "F";
		bety.edad = 16;
		bety.caminar();
		bety.estudiar();
		bety.comer(" tacos al pstor + Refresquito")
		bety.pedirCervesa();
		}
}
	
