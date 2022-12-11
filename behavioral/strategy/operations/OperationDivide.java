package behavioral.strategy.operations;

public class OperationDivide implements Strategy{
    @Override
    public int doOperation(int a, int b) {
        return a / b;
    }
}
