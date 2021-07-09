public class wyswietlanieLiczbPodzielnychPrzez5 {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 6, 10, 79, 35, 100, 500, 235, 5345, 4454};


        for (int number : numbers) {
            if (number % 5 == 0)
                System.out.println("Liczba: "+ number + " jest podzielna przez pięć");


        }
    }
}
