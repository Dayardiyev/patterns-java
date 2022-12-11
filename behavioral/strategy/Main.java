package behavioral.strategy;

import behavioral.strategy.operations.OperationAdd;
import behavioral.strategy.operations.OperationDivide;
import behavioral.strategy.operations.OperationMultiply;
import behavioral.strategy.operations.OperationsSubstract;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(a, b));

        context = new Context(new OperationsSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(a, b));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(a, b));

        context = new Context(new OperationDivide());
        System.out.println("10 / 5 = " + context.executeStrategy(a, b));
    }
}