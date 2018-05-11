
public class Main {

    public static void main(String[] args) {

        String sampleText = "This is sample XML text, which doesn't have any XML tag.";

        MyCustomFileParserInterface parser = new XMLFileParser(sampleText);

        parser.findWord("XML");
        parser.replaceWord("Example word");
        parser.addWord("Example word");
        parser.deleteWord("Example word");
    }
}
