/**
 * 
 */
package super_calculator;

import javax.jws.WebMethod;
import javax.jws.WebService;

import objects.ReturnObject;

/**
 * @author Training
 *
 */
@WebService
public class Calculator {

	@WebMethod
	public ReturnObject getResult(int number1, String operator, int number2) {
		Business business = new Business();
		ReturnObject obj = new ReturnObject();
		obj.setResult1("The result in number is: " + business.getResult(number1, operator, number2));
		//obj.setResult2("The result in words is: " + EnglishNumberToWords.convert(Integer.getInteger(business.getResult(number1, operator, number2))));
		return obj;
	}
}
