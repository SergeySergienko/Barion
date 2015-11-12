package Generic;

import java.util.Arrays;

/**
 * Created by Сергей on 12.11.2015.
 */
class HolderTest {
    public static void main(String... args) {
        MyObjectHolder holder = new MyObjectHolder();
        holder.setData("Hello");

        String str = (String) holder.getData();
        System.out.println(str);
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