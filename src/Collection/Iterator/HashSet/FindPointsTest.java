package Collection.Iterator.HashSet;

import java.util.*;

/**
 * Created by Сергей on 12.12.2015.
 */
public class FindPointsTest {
    public static void main(String[] args) {
        Set<Point> field = new HashSet<>();
        field.add(new Point(5, 5));
        field.add(new Point(7, 5));
        field.add(new Point(5, 7));
        field.add(new Point(7, 7));
        System.out.println(find(field, 6, 8, 5, 6));
    }

    public static List<Point> find(Set<Point> set, int x0, int x1, int y0, int y1) {
        ArrayList<Point> result = new ArrayList<>();
        for (int i = x0; i < x1; i++) {
            for (int j = y0; j < y1; j++) {
                Point point = new Point(i, j);
                if (set.contains(point)) {
                    result.add(point);
                }
            }
        }
        return result;
    }
}

