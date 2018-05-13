public class XMLFileParser implements MyCustomFileParserInterface {
    private String text;

    public XMLFileParser(String text) {
        this.text = text;
    }

    @Override
    public void findWord(String word) {
        boolean isFound = false;
        String[] words = text.split(" |:|,|\\.");
        for(String w:words){
            if(w.equals(word)){
                isFound = true;
                break;
            }
        }
        if(isFound){
            System.out.println("XMLFileParser: Совпадение найдено!");
        }else{
            System.out.println("XMLFileParser: Не удалось найти слово '" + word + "'");
        }
    }

    @Override
    public void replaceWord(String word) {
        System.out.println("XMLFileParser: Слово заменено");
    }

    @Override
    public void deleteWord(String word) {
        System.out.println("XMLFileParser: Слово удалено");
    }

    @Override
    public void addWord(String word) {
        System.out.println("XMLFileParser: Добавлена строка: " + word);
    }
}