package com.streamliners;

import com.streamliners.models.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CartFunctions cartFunctions = new CartFunctions();
        Shop shop = new Shop();
        Cart cart = new Cart();

        String optionsMenu = "Select your choice from the given ones..." +
                "\n\n0: Exit" +
                "\n1: Add product to shop" +
                "\n2: Edit product in shop" +
                "\n3: Delete product from shop" +
                "\n4: See all products in shop" +
                "\n\n5: Add product to cart" +
                "\n6: Edit product in cart" +
                "\n7: Remove product from cart" +
                "\n8: Get Cart details" +
                "\n9: Place Order" +
                "\nEnter your choice: ";

        while (true){
            System.out.print(optionsMenu);
            int n = sc.nextInt();

            switch (n){
                case 0:
                    System.out.println("Thank You!");
                    return;

                case 1:
                    shop.addProduct();
                    break;

                case 2:
                    shop.editProduct(cart,shop);
                    break;

                case 3:
                    shop.removeProduct();
                    break;

                case 4:
                    if (shop.productsList.isEmpty()){
                        System.out.println(Colors.YELLOW + "\nNothing in Shop!\n" + Colors.RESET);
                        break;
                    }
                    System.out.println(shop);
                    break;

                case 5:
                    cartFunctions.addToCart(cart,shop);
                    break;

                case 6:
                    cartFunctions.editCart(cart,shop);
                    break;

                case 7:
                    cartFunctions.removeFromCart(cart,shop);
                    break;

                case 8:
                    if (cart.cartItems.isEmpty()){
                        System.out.println(Colors.YELLOW + "\nYour cart is empty!\n" + Colors.RESET);
                        break;
                    }
                    System.out.println(cart);
                    break;

            }
        }


    }
}