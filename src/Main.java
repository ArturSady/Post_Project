public class Main {

//    Zaprojektuj i przetestuj nowy, referencyjny typ danych: Paczka.
//    Paczki mogą mieć nadawcę, odbiorcę oraz wagę, wyrażoną z dokładnością do gramów.
//    Mogą również być priorytetowe lub nie, domyślnie nie są.
//    Tworząc paczkę trzeba podać nadawcę, odbiorcę oraz jej wagę.
//    Konstruktor powinien skontrolować te wartości i wyświetlić błąd jeśli:
//    adresat lub nadawca nie został podany
//    waga nie mieści się w zakresie 1- 1000.
//    skontroluj, czy cechy paczek ustawiają się poprawnie
//    Przygotuj drugi alternatywny sposób tworzenia paczek (👉konstruktor),
//    który będzie losował imię nadawcy,
//    imię odbiorcy, wagę paczki i to czy jest ona priorytetowa czy nie.
//    Przygotuj również metodę pozwalającą wyliczyć i zwrócić cenę paczki,
//    która zostanie wyliczona na
//    podstawie jej parametrów:
//    paczka do 0.5 kg  kosztuje 5 zł
//    do 1kg kosztuje 8zł
//    do 2 kg kosztuje 12 zł
//    powyżej 2kg doliczane jest 1 zł za każdy kilogram
//    paczka kosztuje 10% drożej jeśli jest priorytetowa
    public static void main(String[] args) {

        Parcel parcel = new Parcel(1000);
        System.out.println(parcel);

    }
}