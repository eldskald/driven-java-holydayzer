import java.util.Scanner;

public class App {
    private static Holiday[] holidays = {
        new Holiday("01/01/2023", "Confraternização mundial"),
        new Holiday("21/02/2023", "Carnaval"),
        new Holiday("17/04/2023", "Páscoa"),
        new Holiday("21/04/2023", "Tiradentes"),
        new Holiday("01/05/2023", "Dia do trabalho"),
        new Holiday("08/06/2023", "Corpus Christi"),
        new Holiday("07/09/2023", "Independência do Brasil"),
        new Holiday("12/10/2023", "Nossa Senhora Aparecida"),
        new Holiday("02/11/2023", "Finados"),
        new Holiday("15/11/2023", "Proclamação da República"),
        new Holiday("25/12/2023", "Natal")
    };

    private static void checkDate(String date) {
        for (int i = 0; i < holidays.length; i++) {
            if (holidays[i].checkDate(date)) {
                System.out.println(holidays[i].getHoliday());
                return;
            }
        }
        System.out.println("Não existe feriado nesse dia.");
    }

    private static void listHolidays() {
        for (int i = 0; i < holidays.length; i++) {
            System.out.println(holidays[i].getDate() + ": " + holidays[i].getHoliday());
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("HOLYDAYZER 1.0.0 - por Rafael Bordoni");
        System.out.println("");
        System.out.println("Digite a data no formato DD/MM/AAAA para checar se é feriado.");
        System.out.println("Digite 'todos' para obter a lista de feriados.");
        System.out.println("");
        String input = scanner.next();
        if (input.equals("todos")) {
            System.out.println("");
            App.listHolidays();
        }
        else {
            System.out.println("");
            App.checkDate(input);
        }
        scanner.close();
    }
}
