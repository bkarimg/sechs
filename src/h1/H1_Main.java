package h1;

public class H1_Main {
	public static boolean isMirrorArray(int[] a, int[] b) {
	    if (a == null || b == null) return false;
	    if (a.length != b.length) return false;

	    for (int i = 0; i < a.length; i++) {
	        if (a[i] != b[b.length - 1 - i]) {
	            return false;
	        }
	    }
	    return true;
	}
}
