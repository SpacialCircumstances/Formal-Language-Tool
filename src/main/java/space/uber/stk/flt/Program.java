package space.uber.stk.flt;
import java.util.ArrayList;

public class Program{

    Program(){
        ArrayList<NonTerminal> nonTerminals = new ArrayList<>();
        NonTerminal nonterminal1 = new NonTerminal("S");
        NonTerminal nonterminal2 = new NonTerminal("A");
        NonTerminal nonterminal3 = new NonTerminal("B");
        nonTerminals.add(nonterminal1);
        nonTerminals.add(nonterminal2);
        nonTerminals.add(nonterminal3);
        Terminal terminal1 = new Terminal("a");
        Terminal terminal2 = new Terminal("b");
        ArrayList<Terminal> terminals = new ArrayList<>();
        terminals.add(terminal1);
        terminals.add(terminal2);

        ArrayList<GrammarSymbol> leftside1 = new ArrayList<>();
        leftside1.add(nonterminal1);

        ArrayList<GrammarSymbol> rightside1 = new ArrayList<>();
        rightside1.add(nonterminal2);

        ArrayList<GrammarSymbol> leftside2 = new ArrayList<>();
        leftside2.add(nonterminal2);
        ArrayList<GrammarSymbol> rightside2 = new ArrayList<>();
        rightside2.add(terminal1);


        Production production1 = new Production(leftside1, rightside1);
        Production production2 = new Production(leftside2, rightside2);

        ArrayList<Production> productions = new ArrayList<>();
        productions.add(production1);
        productions.add(production2);

        Grammar grammar1 = new Grammar("Test", nonTerminals, terminals, productions ,nonterminal1);

        System.out.println(grammar1);

    }

}