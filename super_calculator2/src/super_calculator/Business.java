/**
 * 
 */
package super_calculator;

/**
 * @author Training
 *
 */
public class Business {
	
	public String getResult(double number1, String operator, double number2) {
		String result = "";
		
		switch(operator) {
			case "+": result = sum(number1, number2);
			break;
			case "-": result = sub(number1, number2);
			break;
			case "/": result = mul(number1, number2);
			break;
			case "*": result = div(number1, number2);
			break;
			default: result = "Not a valid operator";
		}
		return result;
	}
	
	public String sum(double number1, double number2) {
		double result = (number1 + number2); 
		return String.valueOf(result); 
	}
	
	public String sub(double number1, double number2) {
		double result = (number1 - number2); 
		return String.valueOf(result); 
	}
	
	public String mul(double number1, double number2) {
		double result = (number1 * number2); 
		return String.valueOf(result); 
	}
	
	public String div(double number1, double number2) {
		double result = (number1 / number2); 
		return String.valueOf(result); 
	}
	
}
