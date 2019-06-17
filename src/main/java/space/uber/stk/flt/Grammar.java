package space.uber.stk.flt;
import java.util.ArrayList;


public class Grammar {

    String name = "";
    ArrayList<NonTerminal> nonTerminals;
    ArrayList<Terminal> alphabet;
    ArrayList<Production> productions;
    NonTerminal startSymbol;

    Grammar(String name, ArrayList<NonTerminal> nonTerminals, ArrayList<Terminal> alphabet,
            ArrayList<Production> productions, NonTerminal startSymbol) {
        this.name = name;
        this.nonTerminals = nonTerminals;
        this.alphabet = alphabet;
        this.productions = productions;
        this.startSymbol = startSymbol;
    }

    ArrayList<Production> getProductionsOf(NonTerminal nonterminal) {

        GrammarSymbolComparator grammarSymbolComparator = new GrammarSymbolComparator();

        ArrayList<Production> resultArray = new ArrayList<>();
        for (int i = 0; i < productions.size(); i++) {
            ArrayList<GrammarSymbol> currentToken = productions.get(i).getLeftToken();
            for (int k = 0; k < currentToken.size(); k++) {
                GrammarSymbol currentSymbol = currentToken.get(k);
                if ((grammarSymbolComparator.compare(currentSymbol, nonterminal)) == 0) {
                    resultArray.add(productions.get(i));
                }
            }
        }
        return resultArray;
    }

    @Override
    public String toString() {

        String result = "Grammatik: " + name + " = ( N, Σ, P, S )\n\n";

        result += "N = {";
        for (NonTerminal currentNonTerminal : nonTerminals) {
            result += currentNonTerminal.toString() + ",";
        }
        result += "}\n\n";

        result += "Σ = {";
        for (Terminal currentTerminal : alphabet) {
            result += currentTerminal.toString() + ",";
        }
        result += "}\n\n";

        result += "P = {\n";
        for (Production currentProduction : productions) {
            result += currentProduction.toString() + ", \n";
        }
        result += "}\n\n";

        result += "S = " + this.startSymbol.toString();

        return result;
    }

    // GETTER UND SETTER

    public ArrayList<NonTerminal> getNonterminals() {
        return this.nonTerminals;
    }

    public void setNonterminals(ArrayList<NonTerminal> nonterminals) {
        this.nonTerminals = nonterminals;
    }

    public ArrayList<Terminal> getAlphabet() {
        return this.alphabet;
    }

    public void setAlphabet(ArrayList<Terminal> alphabet) {
        this.alphabet = alphabet;
    }

    public ArrayList<Production> getProductions() {
        return this.productions;
    }

    public void setProductions(ArrayList<Production> productions) {
        this.productions = productions;
    }

    public NonTerminal getStartsymbol() {
        return this.startSymbol;
    }

    public void setStartsymbol(NonTerminal startSymbol) {
        this.startSymbol = startSymbol;
    }

}