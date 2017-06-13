package lessons.lessons012;

import java.security.Signature;

// 5! = 1*2*3*4*5
public class Recursion {

    public int fact(int n) {
        if (n == 1)
            return 1;
        return n * fact(n-1);
    }
}

