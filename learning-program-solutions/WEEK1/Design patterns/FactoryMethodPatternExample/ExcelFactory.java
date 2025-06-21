public class ExcelFactory extends DocumentMaker {
    public Doc createDoc() {
        System.out.println("Excel doc is being produced...");
        return new ExcelDoc();
    }
}
