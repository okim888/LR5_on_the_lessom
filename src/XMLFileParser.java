public class XMLFileParser implements MyCustomFileParserInterface{

    String fileType = "XML";

    @Override
    public void findWord(String word) {
        System.out.println("Searching for a word in a " + fileType + " file.");
    }

    @Override
    public void replaceWord(String word) {
        System.out.println("Replacing a word in a " + fileType + " file.");
    }

    @Override
    public void deleteWord(String word) {
        System.out.println("Deleting a word in a " + fileType + " file.");
    }

    @Override
    public void addWord(String word) {
        System.out.println("Adding a word in a " + fileType + " file.");
    }
}
