class DocumentRegistry {
    PdfDocument pdfPrototype;
    TextDocument textDocumentPrototype;
    SpreadsheetDocument spreadsheetPrototype;

    public DocumentRegistry() {
        pdfPrototype = new PdfDocument();
        textDocumentPrototype = new TextDocument();
        spreadsheetPrototype = new SpreadsheetDocument();
    }

    public PdfDocument createPdf(String name, String author, int pages) {
        return new PdfDocument(name, author, pages);
    }

    public TextDocument createText(int path, String encoding, int words) {
        return new TextDocument(path, encoding, words);
    }

    public SpreadsheetDocument createSpreadsheet(String name, int rows, int cols) {
        return new SpreadsheetDocument(name, rows, cols);
    }
}
