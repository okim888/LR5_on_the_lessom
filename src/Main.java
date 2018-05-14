
public class Main {

    public static void main(String[] args) {

        MyCustomFileParserInterface parser = new JSONFileParser();

        if (args[0].equals("JSON")) {
            parser = new JSONFileParser();

        } else if (args[0].equals("XML")) {
            parser = new XMLFileParser();
        }

        parser.setText("This is sample XML text.");
        parser.addWord("my word");
        parser.replaceWord("my word to replace");
        parser.findWord("find a word");
        parser.deleteWord("delete a word");
    }
}
