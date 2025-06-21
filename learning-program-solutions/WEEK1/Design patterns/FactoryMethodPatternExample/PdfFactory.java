public class PdfFactory extends DocumentMaker {
    public Doc createDoc() {
        System.out.println("Making a PDF via factory...");
        return new PdfDoc();
    }
}
