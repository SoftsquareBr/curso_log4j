

import org.apache.log4j.Logger;

public class HelloWordLog4j {
	
	final static Logger logger = Logger.getLogger(HelloWordLog4j.class);
	
	public static void main(String []args){
		
		
		HelloWordLog4j hello =new HelloWordLog4j();
		try{
		hello.dividir();
		}catch(ArithmeticException ex){
			logger.error("Desculpe mas não foi possivel dividir este valor", ex);
		}
		
		
	}
	private void dividir(){
		int i = 20 / 0;
		System.out.println("Soma!");
	}

}
