class Circle {
    int radius;

    void calculateArea() {
        double pi = 3.14;      // Local variable
        double area = pi * radius * radius;

        System.out.println("Radius = " + radius);
        System.out.println("Area = " + area);
    }

    public static void main(String[] args) {
        Circle c = new Circle();

        c.radius = 7;          // Instance variable value

        c.calculateArea();
    }
}
