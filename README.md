# Araç Kiralama Sistemi
Java dilinde  OOP ve SOLID prensiplerine uygun olarak geliştirdiğim bu proje çeşitli araç tiplerini (SUV, Sedan, Hatchback), müşteri türlerini (bireysel müşteri ve şirket) ve kiralama koşullarını (günlük ve aylık) yönetir.

## Özellikler

- **Araç Tipleri**:
  - Sedan
  - Hatchback
  - SUV (Sadece günlük kiralama)

- **Müşteri Türleri**:
  - Bireysel Müşteri (Hatchback ve Sedan araçları kiralayabilir)
  - Şirket (Tüm araç tiplerini kiralayabilir)

- **Kiralama Koşulları**:
  - Sedan ve Hatchback araçlar günlük veya aylık kiralanabilir.
  - SUV araçlar sadece günlük kiralanabilir.
  - Aylık kiralama bedeli, günlük kiralama bedelinden hesaplanır ve her araç için değişebilir.

## Kullanım

Proje çalıştırıldığında, `Main` sınıfı çeşitli araçlar, müşteriler ve kiralamalar oluşturur ve kiralama maliyetlerini hesaplar. Aşağıdaki sınıflar proje içinde bulunur:

- **vehicles.Car**: Araç sınıfının temel özelliklerini tanımlar.
- **vehicles.Sedan**: Sedan araçları için özellikleri ve aylık kiralama bedelini hesaplar.
- **vehicles.Hatchback**: Hatchback araçları için segmentlere göre katsayı kullanarak aylık kiralama bedelini hesaplar.
- **vehicles.SUV**: SUV araçları için günlük kiralama bedelini hesaplar.
- **customers.Customer**: Müşteri sınıfının temel özelliklerini tanımlar. 
- **customers.IndividualCustomer**: Bireysel müşteri bilgilerini yönetir.
- **customers.CorporateCustomer**: Şirket müşteri bilgilerini yönetir.
- **rental.Rental**: Araç kiralamalarını yönetir ve toplam kiralama maliyetini hesaplar.


