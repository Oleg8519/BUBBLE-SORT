public class Main {
    public static void main(String[]args){
        int[] mass = { 69, -35, 55, 0, 61, 13, 339, 5, 700, -6};
        BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
        bubbleSortAlgorithm.methodSort(mass);

        for( int i = 0; i < mass.length; i++){
            System.out.println(mass[i]);
        }
    }
    }

