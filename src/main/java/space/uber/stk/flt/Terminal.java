package space.uber.stk.flt;
public class Terminal implements GrammarSymbol {

    String symbol;

    Terminal(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return this.symbol;
    }

}
