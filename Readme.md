*******Java Collections (Koleksiyonları)*******
1.Veri Depolamak
2.Çekmek
3.Veriyi işlemek
4.Veri Aramak
5.Koleksiyon sıralı veya sırasız şekilde olabilir.
6.Belli bir boyutları yokdur.
7.Veri eklerken Collectionsun tipine göre veri ekleyebiliriz.

****Collections****
1.Set
  a)SortedSet
2.List
3.Queue

Map (Bir Collections sınıfı değildir , sadece bencerlik gösterir.)
 a)SortedMap
 
****Collections sınıflarına ait ortak bazı metodlar****
1.add :Referans verilen elemanı ekler.
2.remove : Referans verilen elemanı siler.
3.size: eleman sayısını verir.
4.isEmpty : boş olup olmadığını kontrol eder.
5.contains : Collection nesnesi içerinde referans olarak verilen elemanı arar.
6.iterator : Collection nesnesini iterasyon nesnesine referans olarak gönderir.

****ITERATOR****
1.Iterator() arayüzü koleksiyon nesnelerini yenilememizi sağlar
2.Elemanlar arasında başlangıçdan sonuna kadar tek tek geçiş yapmamızı 
3.Elemanları güvenle silmemizi sağlar.
****Iterator Arayüzünün Metodları****
1.hasNext : Koleksiyon nesnesinin bir sonraki elemanın var olup olmadığını kontrol eder.Mevcut ise true , degilse false döndürür.
2.next : iterasyon nesnesinin gösterdiği elemanı geri döndürür.
3.remove : Koleksion nesnesi üzerindeki iterasyon nesnesinin göserdiği elemanı siler.
****LISTITERATOR****
1.Küme yapılarındaki Iterator() metodu yerine Liste yapılarındada ListIterator() metodu kullanılır.
2.List yaplarında işlemler indis degerleri üzerinden yapılır.
3ListIterator indis işlemleri için özelleşmiştir.

****QUEUE (KUYRUK)***
1.İlk giren ilk çıkar (First In First Out)
2.LinkedList yapısında olmalarına rağmen özelleşmiş bir takım metodları vardır.
3.indis degerleriyle işlem yapmazlar.


