public class RectangleRunner {
    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle(150,200);
        Rectangle rect2 = new Rectangle(125);
        Rectangle rect3 = new Rectangle(100,50);

        rect1.setWidth(75);
        rect2.setLength(75);
        rect2.setWidth(75);
        rect3.setWidth(75);

        int totalArea = rect1.calculateArea() + rect2.calculateArea() + rect3.calculateArea();
        System.out.println("These three plots require " + totalArea + " square feet of seed.");

    }
}
