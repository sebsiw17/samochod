import java.util.Scanner;

public class Samochod {
    // Pola klasy
    private String marka;
    private String model;
    private int rokProdukcji;
    private double przebieg;

    // Konstruktor domyślny (bez argumentów)
    public Samochod() {
        this.marka = "Nieznana";
        this.model = "Nieznany";
        this.rokProdukcji = 0;
        this.przebieg = 0.0;
    }

    // Konstruktor z wszystkimi argumentami
    public Samochod(String marka, String model, int rokProdukcji, double przebieg) {
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.przebieg = przebieg;
    }

    // Metoda wyświetlająca informacje o samochodzie
    public void wyswietlInformacje() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Rok produkcji: " + rokProdukcji);
        System.out.println("Przebieg: " + przebieg + " km");
    }

    // Metoda aktualizująca przebieg samochodu
    public void zaktualizujPrzebieg(double nowyPrzebieg) {
        if (nowyPrzebieg > przebieg) {
            this.przebieg = nowyPrzebieg;
            System.out.println("Przebieg został zaktualizowany do: " + nowyPrzebieg + " km");
        } else {
            System.out.println("Nowy przebieg musi być większy niż obecny.");
        }
    }

    // Metoda sprawdzająca, czy samochód jest starszy niż podany rok
    public boolean czyJestStarszyNiz(int rok) {
        return this.rokProdukcji < rok;
    }

    // Metoda main do testowania klasy z wprowadzaniem danych z konsoli
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobieranie danych od użytkownika
        System.out.print("Podaj markę samochodu: ");
        String marka = scanner.nextLine();

        System.out.print("Podaj model samochodu: ");
        String model = scanner.nextLine();

        System.out.print("Podaj rok produkcji samochodu: ");
        int rokProdukcji = scanner.nextInt();

        System.out.print("Podaj przebieg samochodu: ");
        double przebieg = scanner.nextDouble();

        // Tworzenie obiektu klasy Samochod na podstawie danych wprowadzonych przez użytkownika
        Samochod mojSamochod = new Samochod(marka, model, rokProdukcji, przebieg);

        // Wyświetlanie informacji o samochodzie
        System.out.println("\nInformacje o samochodzie:");
        mojSamochod.wyswietlInformacje();

        // Aktualizacja przebiegu samochodu na podstawie danych wprowadzonych przez użytkownika
        System.out.print("\nPodaj nowy przebieg (musi być większy niż obecny): ");
        double nowyPrzebieg = scanner.nextDouble();
        mojSamochod.zaktualizujPrzebieg(nowyPrzebieg);

        // Sprawdzanie, czy samochód jest starszy niż rok podany przez użytkownika
        System.out.print("\nPodaj rok, aby sprawdzić, czy samochód jest starszy: ");
        int rok = scanner.nextInt();
        boolean czyStarszy = mojSamochod.czyJestStarszyNiz(rok);
        System.out.println("Czy samochód jest starszy niż " + rok + "? " + czyStarszy);

        // Zamknięcie skanera
        scanner.close();
    }
}
