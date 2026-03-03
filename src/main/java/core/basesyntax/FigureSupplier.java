package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int randomNumber = random.nextInt(20);
        int figureNumber = random.nextInt(FIGURE_COUNT);

        switch (figureNumber) {
            case 0:
                return new Circle(randomNumber, ColorSupplier.getRandomColor());
            case 1:
                return new IsoscelesTrapezoid(randomNumber, randomNumber,
                        randomNumber, ColorSupplier.getRandomColor());
            case 2:
                return new RightTriangle(randomNumber, randomNumber,
                        ColorSupplier.getRandomColor());
            case 3:
                return new Rectangle(randomNumber, randomNumber,
                        ColorSupplier.getRandomColor());
            default:
                return new Square(randomNumber, ColorSupplier.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "White");
    }
}
