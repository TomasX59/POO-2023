package aula04;

public class Rectangle {
    private double altura, comprimento;

    // double altura, comprimento;
    public Rectangle(double comprimento, double altura) {
        if (comprimento > 0 && altura > 0) {
            this.comprimento = comprimento;
            this.altura = altura;
        } else {
            System.out.println("Invalid data, couldn't create new rectangle.");
        }

    }

    public double area() {
        return altura * comprimento;
    }
}
