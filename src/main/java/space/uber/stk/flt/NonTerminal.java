package space.uber.stk.flt;

public class NonTerminal implements GrammarSymbol{

    String symbol;

    NonTerminal(String symbol){
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return this.symbol;
    }


}