import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortAlgorithmTest {

    private BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();

    @BeforeClass
    public static void before() {
        System.out.println("Начало тестирования");
    }

    @Test
    //если массив пустой то ничего не делать
    public void shouldDoNothingWithEmptyArray() {
        int[] values = {};

        bubbleSortAlgorithm.methodSort(values);
    }

    @Test
    //если в массиве один элемент то ничего с ним не делать
    public void shouldDoNothingWithOneElementArray() {
        int[] values = {65};

        bubbleSortAlgorithm.methodSort(values);

        assertArrayEquals(new int[] {65}, values);
    }

    @Test
    //если в массиве больше одного элемента то сортировать массив
    public void shouldSortValues() {
        int[] values = { 69, -35, 55, 0, 61, 13, 339, 5, 700, -6};
        int[] expectedOrder = { -35, -6, 0, 5, 13, 55, 61, 69, 339, 700};

        bubbleSortAlgorithm.methodSort(values);

        assertArrayEquals(expectedOrder, values);
    }

    @AfterClass
    public  static void after() {
        System.out.println("Окончание тестирования");
    }

}