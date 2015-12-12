package Collection.Iterator.SortedSet;

import java.util.*;

import Collection.Iterator.HashSet.*;

/**
 * Created by Сергей on 12.12.2015.
 */
public class TreeSetTest {
    public static void main(String[] args) {
        NavigableSet<Point> xIndex = new TreeSet<>(new Comparator<Point>() {
            public int compare(Point p0, Point p1) {
                int result = p0.getX() - p1.getX();
                return result != 0 ? result : p0.getY() - p1.getY();
            }
        });
        NavigableSet<Point> yIndex = new TreeSet<>(new Comparator<Point>() {
            public int compare(Point p0, Point p1) {
                int result = p0.getY() - p1.getY();
                if (result == 0) return p0.getX() - p1.getX();
                return result;
            }
        });
        add(xIndex, yIndex, new Point(5, 5));
        add(xIndex, yIndex, new Point(5, 6));
        add(xIndex, yIndex, new Point(6, 5));
        add(xIndex, yIndex, new Point(6, 6));
        add(xIndex, yIndex, new Point(10, 10));
        add(xIndex, yIndex, new Point(1000, 3));
        add(xIndex, yIndex, new Point(2, 1000));

        NavigableSet<Point> xRange = xIndex.subSet(new Point(5, 0), true, new Point(10, 0), true);
        System.out.println("xRange = " + xRange);
        NavigableSet<Point> yRange = yIndex.subSet(new Point(-1, 0), true, new Point(-1, 10), true);
        System.out.println("yRange = " + yRange);
        xRange.retainAll(yRange);
        System.out.println("CrossRange = " + xRange);
    }

    public static void add(NavigableSet xIndex, NavigableSet yIndex, Point point) {
        xIndex.add(point);
        yIndex.add(point);
    }
}