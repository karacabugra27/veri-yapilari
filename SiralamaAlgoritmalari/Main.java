package SiralamaAlgoritmalari;
public class Main {
    public static void main(String[] args) {

        int array[] = {2,1,77,32,65,28,98,52};

        SimpleSorting bubble = new SimpleSorting(array);
        

        bubble.yazdir();

        bubble.selectionSorting();

        bubble.yazdir();
    }
}
