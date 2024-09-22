public class Main {
    public static void main(String[] args) {

        //task1
        System.out.println("task1");

        int bank = 15000;
        int total = 0;
        int month = 1;
        while (total <= 2459000) {
            total = total + bank;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            month++;
        }


        //task2
        System.out.println("task2");

        int number = 1;
        while (number <= 10) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println();
        for (number = 10; number >= 1; number--) {
            System.out.print(number + " ");
        }
        System.out.println();

        //task3
        System.out.println("task3");

        int countryY = 12_000_000;
        int birthrate = 17;
        int deathRate = 8;
        int year = 0;
        while (year <= 10) {
            System.out.println("Год " + year + ", численность населения составляет " + countryY);
            countryY = countryY + ((countryY / 1000) * birthrate) - ((countryY / 1000) * deathRate);
            year++;
        }

        //task4
        System.out.println("task4");

        int bank1 = 15000;
        int month1 = 0;
        while (bank1 <= 12000000) {

            System.out.println("Месяц " + month1 + ", сумма накоплений равна " + bank1 + " рублей");
            bank1= (int) (bank1 * 1.07);
            month1++;
        }

        //task5
        System.out.println("task5");

        int bank2 = 15000;
        int month2 = 1;
        while (bank2 <= 12000000) {
            bank2 = (int) (bank2 * 1.07);
            if (month2 % 6 == 0) {
                System.out.println("Месяц " + month2 + ", сумма накоплений равна " + bank2 + " рублей");
            }
            month2++;
        }

        //task6
        System.out.println("task6");

        int bank3 = 15000;
        int month3 = 1;
        while (month3 <= 9*12) {
            bank3 = (int) (bank3 * 1.07);
            if (month3 % 6 == 0) {
                System.out.println("Месяц " + month3 + ", сумма накоплений равна " + bank3 + " рублей");
            }
            month3++;
        }


        //task7
        System.out.println("task7");


        int friday = 7;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday+=7;
        }


        //task8
        System.out.println("task8");

        for (int yearComet = 2024-200; yearComet <= 100+2024; yearComet++) {
            if (yearComet % 79 == 0){

                System.out.println(yearComet);
            }

            }


        }


    }
