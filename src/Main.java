public class Main {
    public static void main(String[] args) {

        System.out.println("=== Task 1=== Savings account with monthly deposits using While loop");
        int account = 0;
        int deposit = 15000;
        int goal = 2459000;
        int monthCounter = 0;

        while (account <= goal) {
            account = account + deposit;
            monthCounter++;
        }
        System.out.println("Месяц " + monthCounter + ", сумма накоплений равна " + account + " рублей");

        System.out.println();
        System.out.println("=== Task 2=== Counting 1 to 10 and back using While and For loops");
        byte marginLow = 1;
        byte marginHigh = 10;
        byte iter = marginLow;

        while (iter <= marginHigh) {
            System.out.print(iter + " ");
            iter++;
        }

        System.out.println();

        for (iter = 10; iter >= marginLow; iter--) {
            System.out.print(iter + " ");
        }

        System.out.println();
        System.out.println("=== Task 3=== Compounding population dynamics over 10 years");
        int countryYPop = 12000000;
        int countryYBRPT = 17;
        int countryYDRPT = 8;
        int measureYears = 10;

        for (int i = 1; i <= measureYears; i++) {
            countryYPop = countryYPop + (countryYPop / 1000 * (countryYBRPT - countryYDRPT));
            System.out.println("Год " + i + ", численность населения составляет " + countryYPop + " человек");
        }

        System.out.println();
        System.out.println("=== Task 4=== Saving account with interest tracked towards a goal");
        int savingAccount = 15000;
        float interestRate = 0.07f;
        int savingGoal = 12000000;
        int savingTerm = 0;

        while (savingAccount <= savingGoal) {
            savingAccount = (int) (savingAccount * (1 + interestRate));
            savingTerm++;
            System.out.println("Месяц " + savingTerm + ", сберегательный счет равен " + savingAccount + " рублей");
        }
        System.out.println("Целевая сумма в " + savingGoal + " рублей будет достигнута на " + savingTerm + " месяц");

        System.out.println();
        System.out.println("=== Task 5=== Embedding IF condition into While loop to show only half-year period values");
        int savingAccount2 = 15000;
        float interestRate2 = 0.07f;
        int savingGoal2 = 12000000;
        int savingTerm2 = 0;

        while (savingAccount2 <= savingGoal2) {
            savingAccount2 = (int) (savingAccount2 * (1 + interestRate2));
            savingTerm2++;
            if (savingTerm2 % 6 == 0) {
                System.out.println("Месяц " + savingTerm2 + ", сберегательный счет равен " + savingAccount2 + " рублей");
            }
        }
        System.out.println("Целевая сумма в " + savingGoal2 + " рублей будет достигнута на " + savingTerm2 + " месяц");

        System.out.println();
        System.out.println("=== Task 6=== Integrated loop function for counting monthly income over several years (Conditional output)");
        int savingAccount3 = 15000;
        float interestRate3 = 0.07f;
        int savingTermYears3 = 9;
        int savingCurrentYear3 = 1;

        while (savingCurrentYear3 <= savingTermYears3) {    //Counting years

            for (int i = 1; i <= 12; i++) {                 //Counting months
                savingAccount3 = (int) (savingAccount3 * (1 + interestRate3));

                if (i % 6 == 0) {                           //Output account value every 6 months
                    System.out.println("Год " + savingCurrentYear3 + ", Месяц " + i + ", сберегательный счет равен " + savingAccount3 + " рублей");
                }
            }
            savingCurrentYear3++;                           //Iterating year counter
        }
        System.out.println("Период накоплений: " + (savingTermYears3 * 12) + " месяцев. Общая сумма сбережений равна " + savingAccount3 + " рублей. ");

        System.out.println();
        System.out.println("=== Task 7=== Output notification for each Friday from a set starting week day");
        int monthFriday = 5;
        int monthTotalDays = 31;

        do {
            System.out.println("Сегодня пятница, " + monthFriday + "-е число. Необходимо подготовить отчет");
            monthFriday += 7;
        } while (monthFriday <= monthTotalDays);

        System.out.println();
        System.out.println("=== Task 8=== Shenanigans");
        int yearCurrent = 2023;
        int yearPeriod = 79;

        int yearMarginRetro = yearCurrent - 200;
        int yearMarginPro = yearCurrent + 100;

        for( int i = yearPeriod; i <= yearMarginPro; i += yearPeriod){
            if(i >= yearMarginRetro) {
                System.out.println(i);
            }
        }
    }
}