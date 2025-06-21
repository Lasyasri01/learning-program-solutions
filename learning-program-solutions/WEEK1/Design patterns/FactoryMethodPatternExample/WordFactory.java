public class WordFactory extends DocumentMaker {
    public Doc createDoc() {
        System.out.println("Creating a Word doc through factory...");
        return new WordDoc();
    }
}