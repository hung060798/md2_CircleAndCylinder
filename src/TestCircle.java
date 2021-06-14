public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(2, "green");
        System.out.println(c1.toString());

        Cylinder c2 = new Cylinder();
        c2.setChieuCao(1.5);
        System.out.println(c2.toString());
    }
}
