package Generic;

import java.util.Arrays;

/**
 * Created by Сергей on 12.11.2015.
 */
class HolderTest {
    public static void main(String... args) {
        MyObjectHolder holder = new MyObjectHolder();
        holder.setData(new int[]{2, 3, 5});

        int[] str = (int[]) holder.getData();
        System.out.println(Arrays.toString(str));
    }
}

class MyObjectHolder {
    private Object data;
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
}