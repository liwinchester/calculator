

public class Main {
    public static void main(String[] args) throws MyException {
        init();
    }

    private static void init() throws MyException {
        Read read = new Read();
        Calculator calculator = new Calculator();
        Converter converter = new Converter();

        String string = read.readIn();
        String[] string1 = string.split(" ");

        if (string1.length != 3) {
            throw new MyException("Вы ввели выражение не в формате a + b");
        }

        for (int i = 0; i < converter.romanian.length; i++) {
            if (string1[0].equals(converter.romanian[i])) {

                try {
                    int result = calculator.matematic(string1);
                    if (result <= 0) {
                        throw new MyException("Результат выражения при работе с римскими числами не может быть равен 0 или меньше");
                    }
                    System.out.println(converter.romanian[result - 1]);
                }catch (Exception e) {
                    e.printStackTrace();
                }
                System.exit(0);
            }

        }

        try {
            System.out.println(calculator.matematic(string1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}


