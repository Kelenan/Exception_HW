import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные через пробел: Фамилия Имя Отчество дата_рождения(ДД.ММ.ГГГГ) номер_телефона пол(m/f)");
        String next = scanner.next();

        String[] split = next.split(" ");
        if(split.length != 6) {
            System.out.println("Неверное количество данных в строке");
        }
        String lastname = split[0];
        String name = split[1];
        String surname = split[2];
        String date = split[3];
        String telephone = split[4];
        String gender = split[5];

        if(!Validator.isValidData(date)) {
            System.out.println("Дата указана неверно! Введите дату в формате: ДД.ММ.ГГГГ");
        }

        if(!Validator.isValidTelephone(telephone)) {
            System.out.println("Телефон указан неверно!");
        }

        if(!Validator.isValidGender(gender)) {
            System.out.println("Пол указан неверно! m - мужской, f - женский");
        }



    }
}