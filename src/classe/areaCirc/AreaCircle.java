package classe.areaCirc;

public class AreaCircle {

    double ratio;
    // final para definir uma constante
    static final double PI = 3.14;

    AreaCircle(double ratioInitially) {

        ratio = ratioInitially;
    }

    double area() {
        return PI * Math.pow(ratio, 2);
    }
}
