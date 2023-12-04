import java.util.Arrays;

public class Kuyruk {//ilk giren ilk çıkar.... first in first out
   
    int[] q;
    int es;

    public Kuyruk(int boyut) {
        q = new int[boyut];
        es = 0;
    }

    public void push(int a) {

        if (es == q.length) {
            System.out.println("dizi dolu");
        } else {
            q[es++] = a;
        }
    }

    public int pop() {

        int r = q[0];

        for (int i = 0; i < es-1; i++) {

            q[i] = q[i + 1];

        }
        q[--es] = 0;

        return r;
    }

    public void yazdir() {
        System.out.println(Arrays.toString(q));
    }
}
