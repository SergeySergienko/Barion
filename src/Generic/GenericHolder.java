package Generic;

import java.util.Arrays;

/**
 * Created by Сергей on 12.11.2015.
 */
public class GenericHolder <T> {
    private T data;

    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
}

class GenericHolderTest <T> {
    public static void main(String[] args) {
        GenericHolder<String> strHolder = new GenericHolder<>();
        strHolder.setData("Hello");

        String str = strHolder.getData();
        System.out.println(str);

        GenericHolder<int[]> intHolder = new GenericHolder<>();
        intHolder.setData(new int[] {1,2,3,4});

        int[] arr = intHolder.getData();
        System.out.println(Arrays.toString(arr));
    }
}