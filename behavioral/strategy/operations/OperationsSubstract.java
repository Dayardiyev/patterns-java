package behavioral.strategy.operations;

public class OperationsSubstract implements Strategy{
    @Override
    public int doOperation(int a, int b) {
        return a - b;
    }
}
