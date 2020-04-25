/**
View Problem Here: https://practiceit.cs.washington.edu/problem/view/bjp4/chapter12/e11-repeat
*/

public static String repeat(String s, int n) {
    if (n < 0) {
        throw new IllegalArgumentException();
    } else if (n == 1) {
        return s;
    } else {
        System.out.print(s);
        return repeat(s, n - 1);
    }

}
