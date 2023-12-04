import java.util.Arrays;

public class Yigit {
    // first in last out

    int[] s;
    int es;

    public Yigit(int boyut) {
        s = new int[boyut];
        es = 0;
    }

    public void push(int a) {

        if (es == s.length) {
            System.out.println("Yigit dolu");
        } else {
            s[es++] = a;
        }
    }

    public int pop() {

        int r = s[es - 1];

        s[--es] = 0;
        
        return r;
    }

    public void yazdir(){
        System.out.println(Arrays.toString(s));
    }
}
