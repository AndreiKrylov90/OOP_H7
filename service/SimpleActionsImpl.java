package service;

import java.util.logging.Logger;

public class SimpleActionsImpl implements SimpleActions {
    Logger logger = Logger.getLogger("logger");

    @Override
    public void summation(double number1, double number2, double number3, double number4) {
        System.out.println("(" + number1 + " + " + number2 + " * i " + ")" + " + " + "(" + number3 + " + " + number4
                + " * i " + ")" +
                " = " + (number1 + number3) + " + " + (number2 + number4)
                + " * i ");
        logger.info("Просуммировали два комплексных числа");
    }

    @Override
    public void subtraction(double number1, double number2, double number3, double number4) {
        System.out.println("(" + number1 + " + " + number2 + " * i " + ")" + " - " + "(" + number3 + " + " + number4
                + " * i " + ")" +
                " = " + (number1 - number3) + " + " + (number2 - number4)
                + " * i ");
        logger.info("Нашли разность двух комплексных чисел");
    }

    @Override
    public void multiplication(double number1, double number2, double number3, double number4) {
        System.out.println("(" + number1 + " + " + number2 + " * i " + ")" + " * " + "(" + number3 + " + " + number4
                + " * i " + ")" +
                " = " + (number1 * number3 - number2 * number4) + " + "
                + (number1 * number4 + number2 * number3)
                + " * i ");
        logger.info("Перемножили два комплексных числа");
    }

    @Override
    public void division(double number1, double number2, double number3, double number4) {
        System.out.println("(" + number1 + " + " + number2 + " * i " + ")" + " / " + "(" + number3 + " + " + number4
                + " * i " + ")" +
                " = "
                + (number1 * number3 + number2 * number4)
                        / (number3 * number3 + number4 * number4)
                + " + "
                + (number2 * number3 - number1 * number4)
                        / (number3 * number3 + number4 * number4)
                + " * i ");
        logger.info("Поделили два комплексных числа");
    }
}
