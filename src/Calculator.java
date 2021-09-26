

public class Calculator {


    public static int matematic(String[] data) throws MyException {

        Converter converter = new Converter();
        int klei = 0;
        for(int i = 0; i < data.length; i++){

            for(int j = 0; j < converter.romanian.length; j++){
                if (data[i].equals(converter.romanian[j])) {
                    klei = klei + 1;
                }
            }

        }

        if (klei == 1) {
            throw new MyException("Оба числа должны быть либо арабскими, либо римскими");
        }

        int a = converter.getArabianIfRomanian(data[0]);
        int b = converter.getArabianIfRomanian(data[2]);
        if (a > 10 || b > 10 || a < 1 || b < 1) {

            throw new MyException("Вы ввели числа, не входящие в диапозон от 1 до 10");

        }  else {

            switch (data[1]) {
                case "+":
                    return a + b;
                case "-":
                    return a - b;
                case "*":
                    return a * b;
                case "/":
                    return a / b;

            }
            return -100;


        }

    }
}