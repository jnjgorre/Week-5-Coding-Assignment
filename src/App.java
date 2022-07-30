
public class App {

	public static void main(String[] args) {
		
// 9. Create a class named App that has a main method.
		
// 10. In this class instantiate an instance of each of your logger
//classes that implement the Logger interface.
	//AsteriskLogger
		Logger logger = new AsteriskLogger();
		
		logger.log("Hello");
		logger.error("Hello");
		
	//SpacedLogger
		Logger logger1 = new SpacedLogger();
		
		logger1.log("Hi");
		logger1.error("Hi");
		
		
		
	}

}
