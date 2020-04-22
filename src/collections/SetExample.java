package collections;

import java.util.*;

/*
Set , Collection sınıfından türemiş bir arayüzdür.
*/
public class SetExample {
    public static void main(String[] args) {
        System.out.println("Colletion öğelerinden Set in kullanımı");
        hashSetExample();
        linkedHashSetExample();
        hashSetAnotherExample();
        treeSetExample();
    }

    /*
    1.Set sınıfından türemiştir. Elemanların sıralı olması şartı yokdur.
    2.Her elemandan bir küme içerisinde yalnız bir tane bulunabilir.
    3.Erişim sırası belirsizdir.
    4.Tekrarsız elaman olması ,  hSet.add "add" hset içerisinde eleman varmı , varsa false yoksa true döndürür , yoksa ekler.
     */
    private static void hashSetExample() {
        System.out.println("***** HashSet *****");
        HashSet<String> hashSetSet = new HashSet();
        hashSetSet.add("One");
        hashSetSet.add("Two");
        hashSetSet.add("Three");
        hashSetSet.add("Four");
        hashSetSet.add("Four");


        hashSetSet.remove("Five"); //Five  elamanı sildik.

        Iterator i = hashSetSet.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

    }

    //liste yi HashSet dönüştürdük
    private static void hashSetAnotherExample() {
        System.out.println("***** ArrayList dekileri HashSete attık *****");
        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        HashSet hashSetSet = new HashSet(list);
        hashSetSet.stream().forEach(a -> System.out.println("item " + a));

    }

    /*
    1.HashSet sınıfından türemiştir.Set öğesine benzemesine karşın bir özelliğiyle ayrılır.
    2.Öğeler birbirlerine çift yönlü bağlıdır.
    3.Kopya eleman bulundurmaz.
    4.Elemanlar artan sırada sıralı değil giriş sırasına göre sıralanır.
     */
    private static void linkedHashSetExample() {
        System.out.println("***** LinkedHashSet;Giriş sırasına göre listemenir *****");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("One");
        linkedHashSet.add("Two");
        linkedHashSet.add("Three");
        linkedHashSet.add("Four");
        linkedHashSet.add("Four");

        Iterator i = linkedHashSet.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

    /*
   1.SortedSet , Set koleksiyon arayüzünün alt arayüzüdür.
   2.Aynı özelliklere sahiptir.Sadece sıralı tutulmasıyla HasSetden ayrılır.
   3.TreeSet , SortedSet arayüzünün alt sınıfıdır.
   4.Genel olarak HashSet ile aynı özelliklere sahiptir, tip  kontrolu yapılır.
   5.Farklı tipde eleman eklersek derleme anında hata verir.
   6.öğeleri artan sırada sıralar

    */
    private static void treeSetExample() {
        System.out.println("***** TreeSet;öğeleri artan sırada sıralar *****");
        TreeSet treeSet = new TreeSet();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(4);
        //Tip uyuşmazığı nedeniyle böyle bir eleman ekleyemeyiz
        //treeSet.add(1);

        Iterator i = treeSet.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
