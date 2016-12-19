/**
 * 
 */
package objects;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Training
 *
 */
@XmlRootElement
public class ReturnObject implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String result1;
	String result2;

	public String getResult1() {
		return result1;
	}

	@XmlElement
	public void setResult1(String result1) {
		this.result1 = result1;
	}

	public String getResult2() {
		return result2;
	}

	@XmlElement
	public void setResult2(String result2) {
		this.result2 = result2;
	}
	
}
