package Collection.Iterator.Map;

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

class Point {
    private final int x;
    private final int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (x != point.x) return false;
        if (y != point.y) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}