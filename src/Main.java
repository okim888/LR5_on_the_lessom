
public class Main {

    public static void main(String[] args) {

        MyCustomFileParserInterface myP = new JSONFileParser();

        if (args[0].equals("JSON")) {
            myP = new JSONFileParser();

        } else if (args[0].equals("XML")) {
            myP = new XMLFileParser();
        }

        myP.addWord("my word");
        myP.replaceWord("my word to replace");
        myP.findWord("find a word");
        myP.deleteWord("delete a word");
    }

}
