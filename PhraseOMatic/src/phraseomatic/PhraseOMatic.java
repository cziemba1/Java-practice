
package phraseomatic;

public class PhraseOMatic {

    public static void main(String[] args) {
        String[] wordListOne = {"24/7", "Multi-tier", "win-win", "smart", "dynamic"};
        String[] wordListTwo = {"empowered", "sticky", "branded", "focused", "shared", "cooperative"};
        String[] wordListThree = {"process", "solution", "arquitecture", "portal", "space", "vision", "mission"};
        
        int listOneLength = wordListOne.length;
        int listTwoLength = wordListTwo.length;
        int listThreeLength = wordListThree.length;
        
        int randOne = (int) (Math.random() * listOneLength);
        int randTwo = (int) (Math.random() * listTwoLength);
        int randThree = (int) (Math.random() * listThreeLength);
        
        String phrase = wordListOne[randOne] + " " + wordListTwo[randTwo] + " " + wordListThree[randThree];
        
        System.out.println("What we need is a "+phrase);
        
        
    }
    
}
