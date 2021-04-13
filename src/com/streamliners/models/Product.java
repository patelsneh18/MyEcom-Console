package com.streamliners.models;

public class Product {
    public String name;       // Contains name of the product
    public String imageUrl;   // Location of Image of the Product

    /* Constructor for Product
    *
    * @param name   name of the product
    * @param imageUrl URL of image of the product
    * */
    public Product(String name, String imageUrl) {
        this.name = name;
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
