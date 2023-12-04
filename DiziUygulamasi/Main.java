

public class Main {

    public static void main(String[] args) {

        Yigit d = new Yigit(10);

        d.push(10);
        d.push(5);
        d.push(7);
        d.push(20);
        d.push(13);
        d.push(44);
        d.push(77);
        d.push(251);
        d.push(67);
        d.push(212);

        d.yazdir(); 
    
        d.pop();

        d.yazdir();
    }

}
