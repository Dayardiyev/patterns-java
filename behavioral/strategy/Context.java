package behavioral.strategy;

import behavioral.strategy.operations.Strategy;

public class Context {
    Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b){
        return strategy.doOperation(a, b);
    }
}
