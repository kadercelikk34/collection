package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/*
List , Collection sınıfından türemiş bir arayüzdür.
1.Elemanların indis degerleri vardır.
2.indis degerleri ile elemanlara erişilir ve arama yapılır.
3.Listeleri Arraylerden ayıran en önemli özellik , listlerin boyutlarının önceden ayarlanmamış olmamasıdır.
4.Kopya eleman bulundurmaya izin verir.
 */

public class ListExample {
    public static void main(String[] args) {
        System.out.println("Colletion öğelerinden List in kullanımı");
        arrayListExample();
        listExample();
        linkedListExample();

    }

    /*1.Dizi biçimde saklar ve boyutu içine eleman ekledikce büyür.
    2.Depolanacak veri sayısı belli ve bu sayı oranı büyük oranda değişmiyorsa ise dizilerin kullanılması daha avantajlıdır.
    3.Veri sayısının belli olmadığı durumlarda ArrayList sınıfı kullanılır.
     */
    private static void arrayListExample() {
        System.out.println("***** ArrayList *****");
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("tree");
       /* ListIterator iterator = arrayList.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.nextIndex() +" indexli eleman: "+ iterator.next());

        }*/
       /* for (int i = 0;i<arrayList.size();i++){
            System.out.println(i +" indexli eleman: "+ arrayList.get(i));

        }*/
        arrayList.stream().forEach(a -> {
            System.out.println(a);
        });


    }

    private static void listExample() {
        System.out.println("***** List *****");
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("tree");
       /* for (int i = 0;i<arrayList.size();i++){
            System.out.println(i +" indexli eleman: "+ arrayList.get(i));

        }*/
        list.stream().forEach(a -> {
            System.out.println(a);
        });


    }

    /*
    1.List arayüzünün alt sınıfıdır.
    2.Listenin sonuna veri ekleme , listenin başından veri çekme gibi özelleşmiş metodları vardır.
    3.Liste yapısını özelleştirip kuyruk veya yığıt yapısına dönüştüreblirsiniz.
       }*/
    private static void linkedListExample() {
        System.out.println("***** LinkedList *****");
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.addFirst(4);
        linkedList.addLast(0);
        System.out.println(" Listenin tüm elemanları: " + linkedList);
        System.out.println(" Listenin ilk elemanı: " + linkedList.getFirst());
        System.out.println(" Listenin last elemanı: " + linkedList.getLast());


    }
}
