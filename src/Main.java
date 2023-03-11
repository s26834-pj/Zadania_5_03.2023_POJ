import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Zadania z zajec z 5 marca 2023 r.");

        int numerZadania;
        System.out.println("Proszę podać numer zadania:");
        numerZadania = getInt();
        switch (numerZadania) {
            case 1:
                zadanie_01();
                break;
            case 2:
                zadanie_02();
                break;
            case 3:
                zadanie_03();
                break;
            case 4:
                zadanie_04();
                break;
            case 5:
                zadanie_05();
                break;
            case 6:
                zadanie_06();
                break;
            case 7:
                zadanie_07();
                break;
            case 8:
                zadanie_08();
                break;
            case 9:
                zadanie_09();
                break;
            case 10:
                zadanie_10();
                break;
            case 11:
                zadanie_11();
                break;
            case 12:
                zadanie_12();
                break;
            default:
                System.out.println("Bledny numer zadania. Proszę podać liczbe z zakresu:  od 1 do 12");
        }
    }

    static void zadanie_01() {
        int a, b;
        System.out.println("Podaj bok a: ");
        a = getInt();
        System.out.println("Podaj bok b: ");
        b = getInt();
        if (a > 0 && b > 0) {
            System.out.println("Pole wynosi " + a * b);
        } else {
            System.out.println("Nieprawidlowe dane.");
        }
    }

    static int getInt() {
        return new Scanner(System.in).nextInt();
    }

    static void zadanie_02() {
        System.out.println("zadanie_02");
        System.out.printf("Pierwiastek kwadratowy liczby PI wynosi: " + "%2.2f\n", Math.sqrt(Math.PI));
    }

    static void zadanie_03() {
        System.out.println("zadanie_03");
        Scanner scanner = new Scanner(System.in);
        String slowo1, slowo2;
        System.out.println("Wpisz dwa slowa rozdzielone spacja: ");
        slowo1 = scanner.next();
        slowo2 = scanner.next();
        System.out.println(slowo2 + " " + slowo1);
    }

    static void zadanie_04() {
        System.out.println("zadanie_04");
        int a, b, c;
        System.out.println("Podaj bok a: ");
        a = getInt();
        System.out.println("Podaj bok b: ");
        b = getInt();
        System.out.println("Podaj bok c: ");
        c = getInt();
        if ((a <= 0) || (b <= 0) || (c <= 0)) {
            System.out.println("BŁĄD");
        } else if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("TAK ");
        } else {
            System.out.println("NIE");
        }
    }

    static void zadanie_05() {
        System.out.println("zadanie_05");
        int numerMiesiaca;
        System.out.println("Podaj numer miesiaca:");
        numerMiesiaca = getInt();
        switch (numerMiesiaca) {
            case 1:
                System.out.println("Styczeń: 31 dni");
                break;
            case 2:
                System.out.println("Styczeń: 28 dni");
                break;
            case 3:
                System.out.println("Marzec: 31 dni");
                break;
            case 4:
                System.out.println("Kwiecien: 30 dni");
                break;
            case 5:
                System.out.println("Maj: 31 dni");
                break;
            case 6:
                System.out.println("Czerwiec: 30 dni");
                break;
            case 7:
                System.out.println("Lipiec: 31 dni");
                break;
            case 8:
                System.out.println("Sierpien: 31 dni");
                break;
            case 9:
                System.out.println("Wrzesien: 30 dni");
                break;
            case 10:
                System.out.println("Pazdziernik: 31 dni");
                break;
            case 11:
                System.out.println("Listopad: 30 dni");
                break;
            case 12:
                System.out.println("Grudzien: 31 dni");
                break;
            default:
                System.out.println("Bledny numer miesiaca. Podaj liczbe z zakresu:  od 1 do 12");
        }
    }

    static void zadanie_06() {
        System.out.println("zadanie_06");
        double a, b, c;
        System.out.println("Podaj pierwszą liczbę:");
        a = getDouble();
        System.out.println("Podaj druga liczbę:");
        b = getDouble();
        System.out.println("Podaj trzecią liczbę:");
        c = getDouble();
        if (a < b) {
            if (b > c) {
                if (a < c) System.out.println(+a + " " + c + " " + b + "\n" + b + " " + c + " " + a);
                else System.out.println(+c + " " + a + " " + b + "\n" + b + " " + a + " " + c);
            } else System.out.println(+a + " " + b + " " + c + "\n" + c + " " + b + " " + a);
        } else {
            if (a > c) {
                if (b < c) System.out.println(+b + " " + c + " " + a + "\n" + a + " " + c + " " + b);
                else System.out.println(+c + " " + b + " " + a + "\n" + a + " " + b + " " + c);
            } else System.out.println(+b + " " + a + " " + c + "\n" + c + " " + a + " " + b);
        }
    }

    static Double getDouble() {
        return new Scanner(System.in).nextDouble();
    }

    static void zadanie_07() {
        System.out.println("zadanie_07");
        Scanner scanner = new Scanner(System.in);
        int[] tab1 = new int[7];
        int[] tab2 = new int[7];
        int n, m;
        System.out.println("Podaj liczbe elementów pierwszej tablicy (nie wieksza niz 7): ");
        n = scanner.nextInt();
        System.out.println("Podaj liczbe elementów drugiej tablicy (nie wieksza niz 7): ");
        m = scanner.nextInt();
        if ((n <= 0) || (m <= 0)) {
            System.out.println("BŁĄD");
        } else if (n != m) {
            System.out.println("Tablice mają różne ilości elementów. Nie można obliczyć iloczynu skalarnego");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.println("Podaj element " + (i + 1) + " tablicy 1: ");
                tab1[i] = scanner.nextInt();
            }
            for (int j = 0; j < m; j++) {
                System.out.println("Podaj element " + (j + 1) + " tablicy 2: ");
                tab2[j] = scanner.nextInt();
            }
            int iloczyn = 0;
            for (int i = 0; i < n; i++) {
                iloczyn += tab1[i] * tab2[i];
            }
            System.out.println("Iloczyn skalarny wartości zawartych w tablicy 1 i 2 wynosi: " + iloczyn);
        }
    }

    static void zadanie_08() {
        System.out.println("zadanie_08");
        int a;
        System.out.println("Podaj ilość gwiazdek");
        a = getInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
        for (int i = 1; i <= a; i++) {
            for (int j = a; j >= i; j--)
                System.out.print("*");
            for (int j = 1; j < i; j++)
                System.out.print(" ");
            System.out.println();
        }
        for (int i = a; i > 0; i--) {
            for (int j = a - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void zadanie_09() {
        System.out.println("zadanie_09");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz: ");
        String wyraz = scanner.next();
        char[] tab = new char[100];
        tab = wyraz.toCharArray();
        int n = tab.length;
        int i = 0,
                j = n - 1;
        while (i < n / 2) {
            if (tab[i] != tab[j]) break;
            i++;
            j--;
        }
        if (i < j) System.out.println("Wyraz nie jest palindromem.");
        else System.out.println("Wyraz jest palindromem.");
    }

    static void zadanie_10() {
        System.out.println("zadanie_10");
        int[][] tablica = new int[7][7];
        int a, b;
        System.out.println("Podaj liczbe wierszy (nie wieksza niz 7): ");
        a = getInt();
        System.out.println("Podaj liczbe kolumn (nie wieksza niz 7): ");
        b = getInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println("Podaj element " + (i + 1) + " wiersza i " + (j + 1) + " kolumny tablicy: ");
                tablica[i][j] = getInt();
            }
        }
        System.out.println("Tablica wejściowa:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(tablica[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Tablica transponowana:");
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(tablica[j][i] + " ");
            }
            System.out.println();
        }
    }

    static void zadanie_11() {
        System.out.println("zadanie_11");
        Scanner scaner = new Scanner(System.in);
        System.out.println("Wprowadz zdanie: ");
        String zdanie = scaner.nextLine();
        zdanie = zdanie.replaceAll("", "").toLowerCase();
        String puste = "";
        for (char i = 'a'; i <= 'z'; i++) {
            if (zdanie.indexOf(i) != -1) {
                puste = puste + i;
            }
        }
        if (puste.length() == 26) {
            System.out.println("Zdanie jest pangramem");
        } else {
            System.out.println("Zdanie nie jest pangramem");
        }
    }

    static void zadanie_12() {
        System.out.println("zadanie_12");
        Scanner scanner = new Scanner(System.in);
        String Planeta;
        double wiekWsekundach;
        System.out.println("Podaj nazwę planety, a obliczymy wiek liczony w sekundach na tej planecie:");
        Planeta = scanner.next();
        System.out.println("Podaj wiek w sekundach");
        wiekWsekundach = getDouble();
        switch (Planeta) {
            case "Merkury":
                System.out.printf("Wiek w latach wynosi: " + "%4.2f\n", wiekWsekundach / (0.2408467 * 31557600));
                break;
            case "Wenus":
                System.out.printf("Wiek w latach wynosi: " + "%4.2f\n", wiekWsekundach / (0.6151972 * 31557600));
                break;
            case "Ziemia":
                System.out.printf("Wiek w latach wynosi: " + "%4.2f\n", wiekWsekundach / (1 * 31557600));
                break;
            case "Mars":
                System.out.printf("Wiek w latach wynosi: " + "%4.2f\n", wiekWsekundach / (1.8808158 * 31557600));
                break;
            case "Jowisz":
                System.out.printf("Wiek w latach wynosi: " + "%4.2f\n", wiekWsekundach / (11.862615 * 31557600));
                break;
            case "Saturn":
                System.out.printf("Wiek w latach wynosi: " + "%4.2f\n", wiekWsekundach / (29.447498 * 31557600));
                break;
            case "Uran":
                System.out.printf("Wiek w latach wynosi: " + "%4.2f\n", wiekWsekundach / (84.01684 * 31557600));
                break;
            case "Neptun":
                System.out.printf("Wiek w latach wynosi: " + "%4.2f\n", wiekWsekundach / (164.79132 * 31557600));
                break;
            default:
                System.out.println("Podałeś błędne dane");
        }
    }
}