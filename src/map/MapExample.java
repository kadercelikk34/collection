package map;

import java.util.*;

/*
1.Map arayüzü , Collection arayüzünün bir parcası değildir.
2.Bu arayüz elemanlanları anahtar  degerlerle eşleştirerek saklar.
3.Anahtar degerler arasında kopya eleman bulundurmaya izin vermez.
 */
public class MapExample {
    public static void main(String[] args) {
        System.out.println("Map in kullanımı");
        hasMapExample();
        linkedHashMapExample();
        treeMapExample();

    }

    /*
    1.Map arayüzünün bir örneğidir.
    2.Her elemana  karşılık bir anahtar değeri saklar.
    3.Anahtar degerler veya veriler sıralı olmak zorunda değildir.
    4.HashMap den cekilen veriler n sırası belli değildir.
    5.HashMap öğesinin anahtarları tekrarlı öğe içermez
    6.put metodu : Aynı anahtar içeren veri eklenirse daha önce eklenmiş nahtarın verisiyle değiştirilir
     */
    private static void hasMapExample() {
        System.out.println("***** HashSet *****");
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        hashMap.put(4, "Four");
        hashMap.put(4, "Four");
        //hashMap öğesinin verileri Set  collectionuna atıldı
        Set veri = hashMap.entrySet();
        //hashMap öğesinin anahtarları Set  collectionuna atıldı
        Set anahtar = hashMap.keySet();

        Iterator iteratorVeri = veri.iterator();
        System.out.println("hashMap ögesinin verileri ");
        while (iteratorVeri.hasNext()) {
            System.out.println(iteratorVeri.next());
        }

        Iterator iteratorAnahtar = anahtar.iterator();
        System.out.println("hashMap ögesinin anahtarları ");
        while (iteratorAnahtar.hasNext()) {
            System.out.println(iteratorAnahtar.next());
        }

    }

    /*
    1.HashMap sınıfından türemiştir.Map öğesine benzemesine karşın bir özelliğiyle ayrılır.
    2.Öğeler birbirlerine çift yönlü bağlıdır.
    3.Kopya eleman bulundurmaz.
    4.Elemanlar artan sırada sıralı değil giriş sırasına göre sıralanır.
    5.LinkedList ve HashMap yapılarının özelliklerini içerir.
     */
    private static void linkedHashMapExample() {
        System.out.println("***** LinkedHashMap ;Giriş sırasına göre listemenir *****");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 65; i < 90; i++) {
            linkedHashMap.put((char) i, i);
        }
        Set anahtarlar = linkedHashMap.keySet();
        System.out.println("linkedHashMap ögeleri");
        System.out.println(linkedHashMap);
        System.out.println("hashMap ögesinin anahtarları :" + anahtarlar);

    }

    /*
   1.SortedMap , Map arayüzünün alt arayüzüdür.
   2.SortedMap , SortedSet olduğu gibi verileri artan sıralı olarak saklar
   3.SortedSet den farkı verileri anahtarlarla eşleyerek saklar
   4.öğeleri artan sırada sıralar

    */
    private static void treeMapExample() {
        System.out.println("***** TreeMap;öğeleri artan sırada sıralar *****");
        TreeMap treeMap = new TreeMap();
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");
        treeMap.put(4, "Five");
        System.out.println("TreeMap ögeleri " + treeMap);

    }
}
