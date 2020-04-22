package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        System.out.println("Colletion öğelerinden Queue in kullanımı");
        Queue queue = new LinkedList();
        //add metoduyla eleman eklerken hata alırsak uygulama exception fırlatır.
        queue.add(10);
        queue.add(55);
        queue.add(7);
        //offer metoduyla eleman eklerken hata alırsak geriye false deger döndürür.
        queue.offer(66);

        while (!queue.isEmpty()){
            System.out.println("Sırada bekleyen eleman : "+ queue.peek());
            System.out.println("Sırada bekleyen elemanı getir : "+ queue.poll());

        }

    }
}
