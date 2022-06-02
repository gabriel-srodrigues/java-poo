import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        String fabricante = "Foo";
        LocalDate data = LocalDate.of(2021, 11, 21);
        String modelo = "Modelo";

        Impressora impressora1 = new Impressora(fabricante, data, modelo);



    }
}