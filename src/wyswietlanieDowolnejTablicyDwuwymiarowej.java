public class wyswietlanieDowolnejTablicyDwuwymiarowej {
    public static void main(String[] args) {

        int[][] tablica = {{1, 2, 3, 4, 5}, {1, 2, 4, 1, 2, 3, 4, 1, 2, 4}, {5, 6, 7}};

        for (int[] numerki : tablica) {
            for (int numer : numerki) {
                System.out.print(numer + " ");
            }
            System.out.println();
        }
    }
}
