package BeginOOP.StartOOP.document;

import java.util.Date;

public class ProductDocument extends Document {

    private String productType;
    private int productCount;

    public ProductDocument(){

    }

    public ProductDocument(String name, Date date) {
        super(name, date);
    }

    @Override
    public void printDocumentInfo() {
        System.out.printf("Document name %s, \n document date %s, \n product type %s, \n product count %d \n",
                this.name, this.date, this.productType, this.productCount);
    }

    public ProductDocument(String name, Date date, String productType,int productCount) {
        super(name, date);
        this.productType = productType;
        this.productCount = productCount;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }
}
