
public class Main {

    public static void main(String[] args) {
        MyCustomFileParserInterface parser;

        String sampleText = "This is sample XML text, which doesn't have any XML tag.";

        if(args[0] == "XML"){
           parser = new XMLFileParser();
        } else if(args[0] == "JSON"){
            parser = new XMLFileParser();
        } else {
            parser = new XMLFileParser();
        }

        parser.setText(sampleText);
        parser.findWord("XML");
        parser.replaceWord("Example word");
        parser.addWord("Example word");
        parser.deleteWord("Example word");
    }
}
