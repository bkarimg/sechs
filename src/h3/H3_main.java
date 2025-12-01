package h3;

public class H3_main {
	public static boolean compareArraysVal(int[] a, int[] b) {
	    if (a == null || b == null) return false;
	    if (a.length != b.length) return false;


	    int[] aCopy = a.clone();
	    int[] bCopy = b.clone();

	    
	    java.util.Arrays.sort(aCopy);
	    java.util.Arrays.sort(bCopy);

	   
	    for (int i = 0; i < aCopy.length; i++) {
	        if (aCopy[i] != bCopy[i]) return false;
	    }

	    return true;
	}
}

