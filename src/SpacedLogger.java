
public class SpacedLogger implements Logger{

// 6. The SpacedLogger should add spaces between each character of the 
//String argument passed into its methods.
	
	@Override
	public void log(String log) {
		StringBuilder logSpace = new StringBuilder();
		
		for (int i = 0; i < log.length(); i++) {
			logSpace = logSpace.append(log.charAt(i));
			logSpace = logSpace.append(" ");
		}
		
		System.out.println(logSpace.toString());
		
	}

	@Override
	public void error(String error) {
			StringBuilder errorSpace = new StringBuilder();
			
			for (int i = 0; i < error.length(); i ++) {
			
				errorSpace = errorSpace.append(error.charAt(i));
				errorSpace = errorSpace.append(" ");
			}
			System.out.println("ERROR: " + errorSpace.toString());
	}

}






// 6. The SpacedLogger should add spaces between each character of the 
//String argument passed into its methods.


// 7. If the log method received “Hello” as an argument, 
//it should print H e l l o


// 8. The error method should do the same, 
//but with “ERROR:” preceding the spaced out input (i.e. ERROR: H e l l o)
