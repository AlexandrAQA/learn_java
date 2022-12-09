package cbBeginOOP.startOOP.document;

public class Register {
    private Document[] documents = new Document[10];


    public void addDocs(Document doc) {

        for (int i = 0; i < documents.length; i++) {
            if (documents[i] == null) {
                documents[i] = doc;
                break;
            }
        }
    }

    public void printDocs() {
        for (int i = 0; i < documents.length; i++) {
            if (documents[i] != null) {
                documents[i].printDocumentInfo();
                System.out.println();

            }
        }
    }
    public Document[] getDocuments() {
        return documents;
    }


}
