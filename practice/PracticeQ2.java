public class PracticeQ2 {
    public static void main(String[] args) {
        Point a = new Point(4, 5);
        Point b = new Point(4, 5);
        Point ans = getMidPoint(a,b);
        System.out.println(ans.x+" "+ans.y);
    }
    private static Point getMidPoint(Point a,Point b){
        int firstMidPoint = (a.x + b.x)/2;
        int secondMidPoint = (a.y+b.y)/2;
       return new Point(firstMidPoint, secondMidPoint);
    }
}
class Point{
    int x;
    int y;
    Point(int x,int y){
        this.x = x;
        this.y = y;
    }
}