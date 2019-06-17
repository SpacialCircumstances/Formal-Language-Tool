package space.uber.stk.flt;
import java.util.ArrayList;

/**
 * Production File: Stores the Production class
 * 
 * \brief Productions are used to derive sentence structures
 * 
 * Productions consist of a leftToken -> rightToken
 * Tokens can consist of multiple Symbols.
 * In case of Type(3) and Type(2) Grammar they occur in the form: 
 * NonTerminal -> Terminal* NonTerminal?
 * 
 */

public class Production {

    ArrayList<GrammarSymbol> leftToken;
    ArrayList<GrammarSymbol> rightToken;

    Production(ArrayList<GrammarSymbol> leftToken, ArrayList<GrammarSymbol> rightToken) {
        this.leftToken = leftToken;
        this.rightToken = rightToken;
    }

    @Override
    public String toString() {
        String leftSide = "";
        String rightSide = "";
        for (int i = 0; i < leftToken.size(); i++) {
            leftSide += leftToken.get(i).toString();
        }
        for (int k = 0; k < rightToken.size(); k++) {
            rightSide += rightToken.get(k).toString();
        }
        String result = leftSide + " ---> " + rightSide;
        return result;
    }

    public ArrayList<GrammarSymbol> getLeftToken() {
        return this.leftToken;
    }

    public void setLeftToken(ArrayList<GrammarSymbol> leftToken) {
        this.leftToken = leftToken;
    }

    public ArrayList<GrammarSymbol> getRightToken() {
        return this.rightToken;
    }

    public void setRightToken(ArrayList<GrammarSymbol> rightToken) {
        this.rightToken = rightToken;
    }

}
