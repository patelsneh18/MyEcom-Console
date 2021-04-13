package com.streamliners;

import com.streamliners.models.Product;
import com.streamliners.models.Variant;
import com.streamliners.models.VariantsBasedProduct;
import com.streamliners.models.WeightBasedProduct;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Creating a list of Variants for Our Variant Based Product
        List<Variant> variants= new ArrayList<>(
                Arrays.asList(new Variant("500g",90), new Variant("1kg",180))
        );

        // Creating an Object kiwi of class VariantBasedProduct
        VariantsBasedProduct kiwi = new VariantsBasedProduct("Kiwi","",variants);

        System.out.println(kiwi);

        // Creating an Object kiwi of class WeightBasedProduct
        WeightBasedProduct rice = new WeightBasedProduct("Rice","",1,60);

        System.out.println(rice);

    }
}
