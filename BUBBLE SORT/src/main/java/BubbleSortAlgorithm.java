public class BubbleSortAlgorithm {

    //метод сортировки массива "ПУЗЫРЬКОМ"
    public void methodSort(int[] mass) {
            boolean isSorted = false;
            int buf;
            while (!isSorted) {
                isSorted = true;
                for (int i = 0; i < mass.length - 1; i++) {
                    if (mass[i] > mass[i + 1]) {
                        isSorted = false;
                        buf = mass[i];
                        mass[i] = mass[i + 1];
                        mass[i + 1] = buf;
                    }
                }
            }
        }
    }

