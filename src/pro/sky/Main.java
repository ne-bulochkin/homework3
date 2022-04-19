package pro.sky;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // 1) init variables
        byte byteValue = 1;
        short shortValue = 12;
        int intValue = 2007;
        long longValue = 234L;

        float floatValue = 23.3f;
        double doubleValue = 983;

        // 2) boxes
        double weightBoxer1 = 78.2;
        double weightBoxer2 = 82.7;
        System.out.println("Общий вес двух бойцов: " + (weightBoxer1+weightBoxer2));
        System.out.println("Разница в весе между бойцами: " + (weightBoxer2-weightBoxer1));


        // 3) bar mix
        int bananaWeight = 80;
        double milkWeight = 100f/105;
        int iceCreamWeight = 100;
        int eggWeight = 70;

        double massInGram = (bananaWeight*5 + milkWeight*200 + iceCreamWeight*2 + eggWeight*4);
        double massInKg = massInGram/1000;


        System.out.println("Вес в граммках спорт-завтрака равен: " + massInGram + " г");
        System.out.println("Вес в киллограмах спорт-завтрака равен: " + massInKg + " кг");

        // 4) loss weight
        int weightGoal = 7*1000;
        int loseWeightPerDay1 = 250;
        int loseWeightPerDay2 = 500;

        System.out.println("Кол-во дней, чтобы похудеть на 7 киилограм при потере 250г в день: " + (weightGoal/loseWeightPerDay1));
        System.out.println("Кол-во дней, чтобы похудеть на 7 киилограм при потере 500г в день: " + (weightGoal/loseWeightPerDay2));

        int averageLoseWeightPerDay = (loseWeightPerDay2+loseWeightPerDay1)/2;
        System.out.println("Среднее кол-во дней, чтобы похудеть на 7 киилограм: " + (weightGoal/averageLoseWeightPerDay));

        // 5) salary
        float percentIncreasing = 10;
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int krisSalary = 76230;

        float coefficient = (100f+10f)/100f;
        float mashaNewSalary =  mashaSalary*coefficient;
        float denisNewSalary =  denisSalary*coefficient;
        float krisNewSalary =  krisSalary*coefficient;

        System.out.println("Маша теперь получает "+ mashaNewSalary + " рублей. Годовой доход вырос на "+ (mashaNewSalary-mashaSalary)*12 +" рублей");
        System.out.println("Денис теперь получает "+ denisNewSalary + " рублей. Годовой доход вырос на "+ (denisNewSalary-denisSalary)*12 +" рублей");
        System.out.println("Кристина теперь получает "+ krisNewSalary + " рублей. Годовой доход вырос на "+ (krisNewSalary-krisSalary)*12 +" рублей");
    }
}
