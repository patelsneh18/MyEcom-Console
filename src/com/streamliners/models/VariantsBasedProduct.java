package com.streamliners.models;

import java.util.List;

/**
 * Inherits Product Class and Provides additional Variables Required for Weight Based Product
 *
 * variants - It is a list of variants class containing Predefined Variants of a Product
 **/

public class VariantsBasedProduct extends Product{
    List<Variant> variants;  // List of variants class containing Predefined Variants of a Product


    /* Constructor for Variant Based Product
     *
     * @param name   name of the product
     * @param imageUrl  URL of image of the product
     * @param variants   List of variants class containing Predefined Variants of a Product
     * */

    public VariantsBasedProduct(String name,String imageUrl,List<Variant> variants) {
        super(name,imageUrl);
        this.variants = variants;
    }

    @Override
    public String toString() {
        return "VariantsBasedProduct{" +
                "name='" + name + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", variants=" + variants +
                '}';
    }
}
