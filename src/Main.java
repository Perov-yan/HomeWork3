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
        short g = -159;
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

        System.out.println("Задача 4:");
        byte bottle = 16;
        int time = 2;
        byte hour = 60;
        byte day = 24;
        byte mount = 31;
        int bottlesPerMinut = bottle / time;
        int bottlesRusult = bottlesPerMinut * time;
        System.out.println("За " + time + " минуты машина произвела " + bottle + " штук бутылок");
        System.out.println("За 1 минуту машина произвела " + bottlesPerMinut + " штук бутылок");
        time = 20;
        System.out.println("За " + time + " минут машина произвела " + bottlesRusult + " штук бутылок");
        time = day * hour;
        bottlesRusult = bottlesPerMinut * time;
        System.out.println("За сутки (" + time + " минут) машина произвела " + bottlesRusult + " штук бутылок");
        time = day * 3 * hour;
        bottlesRusult = bottlesPerMinut * time;
        System.out.println("За трое суток (" + time + " минут) машина произвела " + bottlesRusult + " штук бутылок");
        time = mount * day * hour;
        bottlesRusult = bottlesPerMinut * time;
        System.out.println("За месяц (" + time + " минут) машина произвела " + bottlesRusult + " штук бутылок");
        System.out.println(" ");

        System.out.println("Задача 5:");
        byte totalPaint = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int paintForClass = whitePaint + brownPaint;
        int totalClass = totalPaint / paintForClass;
        int totalWhitePaint = totalClass * whitePaint;
        int totalBrownPaint = totalClass * brownPaint;
        System.out.println("На 1 класс, нужно " + whitePaint + " банки белой краски и " + brownPaint + " банки коричневой краски, всего банок краски " + totalPaint);
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");
        System.out.println(" ");

        System.out.println("Задача 6:");
        byte banana = 5;
        byte bananaWeight = 80;
        short milk = 200;
        byte milkWeight = 105;
        byte iceCream = 2;
        byte iceCreamWeight = 100;
        byte egg = 4;
        byte eggWeight = 70;
        int totalBananaWeight = banana * bananaWeight;
        int totalMilkWeight = (milk / 100) * milkWeight;
        int totalIceCreamWeight = iceCream * iceCreamWeight;
        int totalEggWeight = egg * eggWeight;
        int breakfast = totalBananaWeight + totalMilkWeight + totalIceCreamWeight + totalEggWeight;
        float totalBreakfast = breakfast / 1000f;
        System.out.println("Общий вес завтрака спортсмена в граммах " + breakfast);
        System.out.println("Общий вес завтрака спортсмена в килограммах " + totalBreakfast);
        System.out.println(" ");

        System.out.println("Задача 7:");
        byte weight = 7;
        short lowWeight = 250;
        short highWeight = 500;
        int totalWeight = weight * 1000;
        int dayLowWeight = totalWeight / lowWeight;
        int dayHighWeight = totalWeight / highWeight;
        int mediumDay = (dayHighWeight + dayLowWeight) / 2;
        System.out.println(dayLowWeight + " дней уйдет на похудение, если спортсмен будет терять каждый день по " + lowWeight + " грамм или " + dayHighWeight + " дней — если каждый день будет худеть на " + highWeight + " грамм.");
        System.out.println(mediumDay + " дней в среднем уйдет на похудение");
        System.out.println(" ");

        System.out.println("Задача 8:");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        byte year = 12;
        int salaryIncreaseMasha = salaryMasha * 10 / 100;
        int increasedSalaryMasha = salaryMasha + salaryIncreaseMasha;
        int increasedYearSalaryMasha = salaryIncreaseMasha * year;
        int yearSalaryMasha = salaryMasha * year;
        int newYearSalaryMasha = increasedSalaryMasha * year;

        int salaryIncreaseDenis = salaryDenis * 10 / 100;
        int increasedSalaryDenis = salaryDenis + salaryIncreaseDenis;
        int increasedYearSalaryDenis = salaryIncreaseDenis * year;
        int yearSalaryDenis = salaryDenis * year;
        int newYearSalaryDenis = increasedSalaryDenis * year;

        int salaryIncreaseKristina = salaryKristina * 10 / 100;
        int increasedSalaryKristina = salaryKristina + salaryIncreaseKristina;
        int increasedYearSalaryKristina = salaryIncreaseKristina * year;
        int yearSalaryKristina = salaryKristina * year;
        int newYearSalaryKristina = increasedSalaryKristina * year;

        System.out.println("Маша теперь получает " + increasedSalaryMasha + " рублей. Годовой доход вырос на " + increasedYearSalaryMasha + " рублей");
        System.out.println("годовая зарплата Маши состовляла " + yearSalaryMasha + " рублей. После получения прибавки годовой доход состовляет " + newYearSalaryMasha + " рублей. Разницу между годовым доходом составила " + increasedYearSalaryMasha + " рублей");
        System.out.println("Денис теперь получает " + increasedSalaryDenis + " рублей. Годовой доход вырос на " + increasedYearSalaryDenis + " рублей");
        System.out.println("Годовая зарплата Дениса состовляла " + yearSalaryDenis + " рублей. После получения прибавки годовой доход состовляет " + newYearSalaryDenis + " рублей. Разницу между годовым доходом составила " + increasedYearSalaryDenis + " рублей");
        System.out.println("Кристина теперь получает " + increasedSalaryKristina + " рублей. Годовой доход вырос на " + increasedYearSalaryKristina + " рублей");
        System.out.println("Годовая зарплата Кристины состовляла " + yearSalaryKristina + " рублей. После получения прибавки годовой доход состовляет " + newYearSalaryKristina + " рублей. Разницу между годовым доходом составила " + increasedYearSalaryKristina + " рублей");

    }
}