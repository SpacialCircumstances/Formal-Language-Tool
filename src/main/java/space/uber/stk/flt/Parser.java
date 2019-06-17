package space.uber.stk.flt;

public class Parser{

    /*



    public Grammar parse(String s) throws ParserException{


        s = s.replaceAll("\\s+",""); //remove Whitespace


        //First Tokenparser
        String[] token = {":=Grammatik(" , "," , "," , ",", ")" ,};

        int[] tokenIndex = new int[token.length];

        for(int i = 0; i < token.length; i++){
            tokenIndex[i] = s.indexOf(token[i]);
            if(tokenIndex[i] == -1){
                throw new ParserException("Required syntaxsymbol not found: " + token[i] );
            }
        }

        //Intialisiere parsed Values
        String grammarName = s.substring(0, tokenIndex[0]);
        
        String[] valueNames = new String[4];
        for(int i = 0; i < valueNames.length; i++){
            valueNames[i] = s.substring(tokenIndex[i] + token[i].length(), tokenIndex[i+1]);
        }

        s = s.substring(tokenIndex[tokenIndex.length-1] + token[token.length-1].length());
        
        token = new String[8];
        for(int i = 0; i < token.length; i++){
            token[i] = valueNames[i]+"{";
            token[++i] = valueNames[i] +"}"; 
        }

        tokenIndex = new int[token.length];

        for(int i = 0; i < token.length; i++){
            tokenIndex[i] = s.indexOf(token[i]);
            if(tokenIndex[i] == -1){
                throw new ParserException("Required syntaxsymbol not found: " + token[i] );
            }
        }



        
        return new Grammar(grammarName, NonTerminals, alphabet, productions, startSymbol);
    }

    */

}



/*

    List Tokens = MasterParser()

    Tokens = (N, T, P, S)

    Liste Nonterminals = grammarsymbolparser(N)
    Liste terminals = grammarsymbolparser(N)
 
    string.fin

MasterParser A := Grammatik(N,T,P,S)
N = {
    grammarsymbolparser(Nonterminal)
}
T = {
    grammarsymbolparser(Terminal)
    


    Grammatik1 := Grammatik(N,T,P,S)
    N = {S,A,B}
    T = {a,b}
    P = {S -> A,
    A -> B | EPSILON,
    B -> b
    }
    N = {}

    */