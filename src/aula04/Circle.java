package aula04;

public class Circle {
    private double raio;

    public Circle(double raio) {
        if (raio > 0) {
            this.raio = raio;
        }
    }

    public double area() {
        return Math.PI * (raio * raio);
    }

    public double perimetro() {
        return Math.PI * 2 * raio;
    }

    @Override
    public String toString() {
        return "Circulo [raio=" + raio + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(raio);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Circle other = (Circle) obj;
        if (Double.doubleToLongBits(raio) != Double.doubleToLongBits(other.raio))
            return false;
        return true;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if (raio > 0) {
            this.raio = raio;
        }
    }

}