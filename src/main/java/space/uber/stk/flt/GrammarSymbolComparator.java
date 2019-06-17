package space.uber.stk.flt;
import java.util.Comparator;

public class GrammarSymbolComparator implements Comparator<GrammarSymbol> {
    public int compare(GrammarSymbol one, GrammarSymbol two) {
        String oneContent = one.toString();
        String twoContent = two.toString();

        if (oneContent.equals(twoContent)) {
            return 0;
        } else {
            return -1;
        }
    }

}