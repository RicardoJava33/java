


public class SayHello {
	
	public static void main(String[] args) {  
	try {
	System.out.print("HOla " + args[0]);
    }catch(Exeption e){
		System.out.println("La ejecucion correcta es:");
		System.out.println("java SayHello [Tu nombre]");
		System.out.println(e);
	}
	
}
