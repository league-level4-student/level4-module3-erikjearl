package _02_gotta_catchem_all;

public class ExceptionMethods {
	
	public double divide (double n, double d) {
		if(d == 0.0) {
			throw new IllegalArgumentException();
		}
		return n / d;
	}
	
	public String reverse (String s) {
		char[] arr = s.toCharArray(); 
		String r = "";
        for (int i = arr.length-1; i>=0; i--) {
            r+=arr[i];
        }
        return r;
	}

}
