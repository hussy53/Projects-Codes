package eecs2030.lab3;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

public class Testing {

	public static void main(String[] args) {
			
		String t = "2.0 - 2.34i";
		List<String> parts = Arrays.asList(t.split("\\s+"));
		// TODO Auto-generated method stub
		//String s3 = "1.0 - 2.73i";
		//Complex c3 = new Complex(1.0, -2.73);
		//assertEquals(c3, Complex.valueOf(s3));
		
		if ((parts.size() == 3)){
			if(parts.get(1).equals("+") || parts.get(1).equals("-")) {
				String img = parts.get(2);
				char [] check = img.toCharArray();
				String remove = String.valueOf(check[check.length - 1]);
				if(remove.equals("i")) {
					double real = Double.valueOf(parts.get(0));
					String str = img.replace("i", "");
					double imaginary = Double.valueOf(str);
					
					/*
					 * if(parts.get(1).equals("-")) { imaginary = -imaginary; } else { result = new
					 * Complex(real, imaginary); }
					 */
				}
				else {
					throw new IllegalArgumentException();
				}
			}
			else {
				throw new IllegalArgumentException();
			}
		}
		else {
			throw new IllegalArgumentException();
		}
		
		//return result;
	}

}
