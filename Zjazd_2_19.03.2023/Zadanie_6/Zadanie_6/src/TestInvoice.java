/*
Polecenie:
Zaimplementuj klasę `Invoice` reprezentującą fakturę dla sklepu.
Klasa przechowuje następujące informacje:
`product_number (typ String)`, `prodcut_description` (typ String),
`quantity`(typ int) i` `pricePerItem`(typ double).
Klasa powinna mieć konstruktor, który umożliwi podanie wszystkich 4 parametrów.
Zaimplementuj metody set i get dla każdej zmiennej.
Dodaj metodę:
- `Amount`, które zwraca iloczyn quantity i pricePerItem.
Jeżeli pricePerItem nie jest dodatnia, `Amount` powinien zwrócić 0.
Jeżeli quantity nie jest dodatnie, `Amount` powinna zwrócić 0.
Przetestuj zaimplementowany program.
Autor: Hanna Paczoska
 */
public class TestInvoice {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("001", "winogrona", 5, 17.00);
        System.out.println("Numer produktu: " + invoice1.getProduct_number() + ", Nazwa: "
                + invoice1.getProduct_description() + ", Ilość: " + invoice1.getQuantity()
                + ", Cena jednostkowa: " + invoice1.getPricePerItem() + " zł");
        System.out.println("Wartość faktury: " + invoice1.Amount() + " zł");
        invoice1.setQuantity(-1);
        System.out.println("Wartość faktury przy ilości niższej od 0: " + invoice1.Amount() + " zł");
    }
}
