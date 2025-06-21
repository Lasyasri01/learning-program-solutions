public class FactoryTest {
    public static void main(String[] args) {
        DocumentMaker makerA = new WordFactory();
        Doc w = makerA.createDoc();
        w.open();

        DocumentMaker makerB = new PdfFactory();
        Doc p = makerB.createDoc();
        p.open();

        DocumentMaker makerC = new ExcelFactory();
        Doc e = makerC.createDoc();
        e.open();

        System.out.println("Factory Method pattern completed!");
    }
}
