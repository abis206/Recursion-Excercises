/**
 View Problem Here: https://practiceit.cs.washington.edu/problem/view/bjp4/chapter12/e19-countBinary
 */ 

public static void countBinary(int n) {
    if (n == 0) {
        System.out.println();
    } else {
        countBinary(0, (int)Math.pow(2, n), n);
    }
}

public static void countBinary(int min, int max, int n) {
    if (min < max) {
        String s = Integer.toBinaryString(min);
        s = String.format("%" + n + "s", s).replace(' ', '0');
        System.out.println(s);
        countBinary(min + 1, max, n);
    }
}
 
