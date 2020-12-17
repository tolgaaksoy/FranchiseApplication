# Franchise Application

Uygulama özellikleri:
* Appeal kayıtları üzerinde CRUD işlemleri yapılabilir.
* Customer kayıtları id ile veya liste olarak getirilebilir.
* Arayüz üzerinden Franchise başvurusu yapılabilir.

Paketler
* Configuration : Swagger burada tanımlandı.
* Controller : Spring Mvc Controller Sınıflarının bulunduğu paket.
* Dto : Data Transler objelerinin bulunduğu paket.
* Mapper: Data Transler objeleri ile models objelerinin dönüşümünü sağlauan paket.
* Models : Database entity objelerinin bulunduğu paket.
* Repositories : JpaRepository'nin implementasyonlarının gerçekleştiği paket.
* Request : Uygulamaya gelen isteklerin yapılarının bulunduğu paket.
* Response : Uygulamaya çıkan yanıtların yapılarının bulunduğu paket.
* Services : Servis Katmanı İşlemlerin gerçekleştirildiği paket.

### Kullanılan Teknolojiler ve Araçlar
#### Backend
* Java 8
* Spring Boot  (Spring Web MVC, Spring Data JPA)
* MySql Database
* Maven 
* Swagger
* Mapstruct
* Lombok

#### Frontend
* ReactJs
* Material UI

## :package: Maven ile Kurulum


Proje Dosyasında:

* `mvn clean install`

mylib/target dizinine franchiseApplication 0.0.1-SNAPSHOT.jar dosyası oluşturuldu.

## :clipboard: Çalıştırma

mylib/target dizininde:
```console
java -jar target/franchiseApplication 0.0.1-SNAPSHOT.jar
```
komutunu yazalım. Uygulama localhost:8080 adresinde ayağa çalışmaya başladı.

## Rest Servislerinin Dokümantasyonu

Dokümantasyona uygulamayı başlattıktan sonra

http://localhost:8080/swagger-ui.html#/

adresinden erişebilirsiniz.

Swagger dokümantasyonun ekran görüntüsü:
![swagger](https://user-images.githubusercontent.com/24254922/102424220-bfbc1080-401b-11eb-896f-985ef62d782a.png)

## Arayüz

![1](https://user-images.githubusercontent.com/24254922/102424223-c054a700-401b-11eb-91c9-e9a4f49a836e.png)
![2](https://user-images.githubusercontent.com/24254922/102424224-c0ed3d80-401b-11eb-9327-cdb5a9d46aa7.png)
![3](https://user-images.githubusercontent.com/24254922/102424225-c0ed3d80-401b-11eb-8062-9d08102274f1.png)
![4](https://user-images.githubusercontent.com/24254922/102424213-bdf24d00-401b-11eb-86af-040c1374abea.png)
![5](https://user-images.githubusercontent.com/24254922/102424217-bf237a00-401b-11eb-8b8c-91f5630e69b6.png)
![6](https://user-images.githubusercontent.com/24254922/102424218-bf237a00-401b-11eb-95bc-7d70d079fa7c.png)

Veritabanı ekran görüntüsü:
![database](https://user-images.githubusercontent.com/24254922/102424222-c054a700-401b-11eb-8996-2cc92050f4b5.png)




