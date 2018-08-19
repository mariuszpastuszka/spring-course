package pl.mpas;

import org.junit.Assert;
import org.junit.Test;

public class ArrayTest {

    int arraySum(int[] array, int startIndex) {
        if (startIndex == array.length - 1) {
            return array[startIndex];
        }

        return array[startIndex] + arraySum(array, startIndex + 1);
    }

    int arraySum(int[] array) {
        int sum = 0;

        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    @Test
    public void testArraySum() {
        int[] first = { 1, 2, 3 };
        int firstSum = 6;

        Assert.assertEquals(6, arraySum(first, 0));
    }

    @Test
    public void testWithStandardWay() {
        int[] tab = new int[]{1, 2, 3, 4};
        Assert.assertEquals(arraySum(tab), arraySum(tab, 0));
    }

}
