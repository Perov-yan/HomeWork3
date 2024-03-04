public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1:");
        int q = 2147483647;
        byte w = 127;
        short e = 32767;
        long r = 9000000000000001L;
        float t = 7.123456f;
        double y = 8.12332112332112;
        System.out.println("Значение переменной w с типом byte = " + w);
        System.out.println("Значение переменной e с типом short = " + e);
        System.out.println("Значение переменной q с типом int = " + q);
        System.out.println("Значение переменной r с типом long = " + r);
        System.out.println("Значение переменной t с типом float = " + t);
        System.out.println("Значение переменной y с типом double = " + y);
        System.out.println(" ");

        System.out.println("Задача 2:");
        float a = 27.12f;
        long s = 987678965549L;
        float d = 2.786f;
        short f = 569;
        short g = - 159;
        short h = 27897;
        byte j = 67;
        System.out.println("Данное значение: " + a + " можно отнести к float");
        System.out.println("Данное значение: " + s + " можно отнести к long");
        System.out.println("Данное значение: " + d + " можно отнести к float");
        System.out.println("Данное значение: " + f + " можно отнести к short");
        System.out.println("Данное значение: " + g + " можно отнести к short");
        System.out.println("Данное значение: " + h + " можно отнести к short");
        System.out.println("Данное значение: " + j + " можно отнести к byte");
        System.out.println(" ");

        System.out.println("Задача 3:");
        byte pavlovnaClass = 23;
        byte sergeevnaClass = 27;
        byte andreevnaClass = 30;
        short paper = 480;
        int paperForOneStudent = paper / (pavlovnaClass + sergeevnaClass + andreevnaClass);
        System.out.println("В классе Людмилы Павловны " + pavlovnaClass + " учеников");
        System.out.println("В классе Анны Сергеевны " + sergeevnaClass + " учеников");
        System.out.println("В классе Екатерины Андреевны " + andreevnaClass + " учеников");
        System.out.println("Всего  " + paper + " листов бумаги");
        System.out.println("На каждого ученика рассчитано " + paperForOneStudent + " листов бумаги");
        System.out.println(" ");

    }
}