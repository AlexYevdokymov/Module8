package shapes;

public class Main {
    public static void main(String[] args) {

        Shape triangle = new Triangle();
        Shape circle = new Circle();
        Shape quad = new Quad();
        Shape pentagon = new Pentagon();
        Shape hexagon = new Hexagon();

        FigureNamePrinter namePrinter1 = new FigureNamePrinter(triangle);
        FigureNamePrinter namePrinter2 = new FigureNamePrinter(circle);
        FigureNamePrinter namePrinter3 = new FigureNamePrinter(quad);
        FigureNamePrinter namePrinter4 = new FigureNamePrinter(pentagon);
        FigureNamePrinter namePrinter5 = new FigureNamePrinter(hexagon);
    }
}