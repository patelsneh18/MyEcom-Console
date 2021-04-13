package com.streamliners.models;

/**
 * Inherits Product Class and Provides additional Variables Required for Weight Based Product
 *
 * minQty - Min Quantity of Purchase
 * pricePerKg - Price Per KG of the Product
 **/

public class WeightBasedProduct extends Product{

    public float minQty;      // Min Quantity of Purchase
    public float pricePerKg;  // Price Per KG of the Product

    /* Constructor for Weight Based Product
     *
     * @param name   name of the product
     * @param imageUrl  URL of image of the product
     * @param minQty   Min Quantity of Purchase
     * @param pricePerKg  Price Per KG of the Product
     * */

    public WeightBasedProduct(String name,String imageUrl,float minQty,float pricePerKg){
        super(name,imageUrl);

        this.minQty = minQty;
        this.pricePerKg = pricePerKg;
    }

    @Override
    public String toString() {
        return "WeightBasedProduct{" +
                "name='" + name + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", minQty=" + minQty +
                ", pricePerKg=" + pricePerKg +
                '}';
    }
}
