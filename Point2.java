import java.lang.Math;
import java.util.Scanner;

class Point2 {
    int x;
    int y;

    public Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distFrom(Point2 otherPoint) {
        return Math.sqrt(Math.pow(this.x - otherPoint.x, 2) + Math.pow(this.y - otherPoint.y, 2));
    }
}

class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        Point2 point1 = new Point2(x1, y1);
        Point2 point2 = new Point2(x2, y2);

        double distance = point1.distFrom(point2);
        System.out.println(distance);

    }
}