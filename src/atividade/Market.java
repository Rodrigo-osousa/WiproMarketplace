package atividade;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;
/*
Group 1

Israel Lima Dias
Rodrigo Oliveira Sousa
Bruno Silva
Alejandro Yujra Espejo
Ilessa Lobo


 */
public class Market {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int[] id = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] product = {"Milk", "Cereal", "Rice", "Tuna", "Bean", "Olive", "Oil ", "Soap", "Salt", "Sugar"};
        int[] quantity = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        Double[] price = {4.32, 5.33, 6.23, 5.22, 3.56, 5.33, 8.99, 9.21, 3.95, 4.33};
        Double[] totalPrice = {0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00};
        int[] inCart = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        String shopping;
        int productCode;
        int quantityOfProducties;
        Double tax = 0.09;
        Double total = 0.00;
        int paymentMethod = 0;



        do {
            System.out.format("%s\t\t\t\t\t\t\t\t%s\n%s\n", "", "Wipro Store", "===========================================================================");
            System.out.format("%s\t\t\t %s\t\t\t\t\t%s\t\t%s\n", "PRODUCT CODE", "PRODUCT", "QUANTITY", "PRICE");
            for (int i = 0; i < id.length; i++) {
                System.out.format(Locale.ENGLISH, "%d\t\t\t\t\t\t %s\t\t\t\t\t\t%d\t\t\t\tUS$%.2f\t\t\t\n", id[i], product[i], quantity[i], price[i]);
            }

            System.out.println("Insert a product code:");
            productCode = read.nextInt();
            while (productCode < 1 || productCode > 10) {

                System.out.println("Please insert one number between 1 and 10");
                productCode = read.nextInt();
            }

            System.out.println("How many products do you want?");
            quantityOfProducties = read.nextInt();
            while (quantityOfProducties > quantity[productCode - 1]) {
                System.out.println("Insuficient producties!");
                quantityOfProducties = read.nextInt();
            }
//            if() {
//
//            }


            System.out.println(quantityOfProducties + " Qty of " + product[productCode - 1] + " successfully added to cart!");

            quantity[productCode - 1] = quantity[productCode - 1] - quantityOfProducties;
            inCart[productCode - 1] = 10 - quantity[productCode - 1];
            totalPrice[productCode - 1] = inCart[productCode - 1] * price[productCode - 1];
            total = totalPrice[productCode - 1] + total;

            System.out.println("Do you want to continue shopping? [Y/N]");
            shopping = read.next();
            while (!shopping.equalsIgnoreCase("y") && !shopping.equalsIgnoreCase("n")) {
                System.out.println("Option invalid, please insert Y to continue shopping or N to go to the cart!");
                shopping = read.next();
            }

        } while (Objects.equals(shopping, "y"));

        System.out.format("%s\t\t\t\t\t\t\t%s\n", "", "PRODUCTS IN CART");
        System.out.format("%s\t\t\t\t\t\t%s\t\t\t\t%s\t\t\t%s\n", "NAME", "QTY IN CART", "PRICE PER  UNIT", "TOTAL PRICE");
        for (int i = 0; i < id.length; i++) {
            if (quantity[i] < 10) {
                System.out.format(Locale.ENGLISH, "%s\t\t\t\t\t\t\t%s\t\t\t\t\t\tUS$%.2f\t\t\t\tUS$%.2f\n", product[i], inCart[i], price[i], totalPrice[i]);

            }

        }
        System.out.format(Locale.ENGLISH, "\n%s US$%.2f", "Total Price with Tax of 9%", (total + (total * tax)));

        System.out.println("\nOptions of Payment:");
        System.out.println("       [1] In cash or MASTERCARD card, you receive a 20% discount.");
        System.out.println("       [2] In credit card, you receive a 15% discount.");
        System.out.println("       [3] In two times on the credit card, regular price without discount.");
        System.out.println("       [4] In three times on the credit card, additional 10% interest.");

        System.out.println("\nWhat will be the payment method?");
        paymentMethod = read.nextInt();
        while (paymentMethod < 1 || paymentMethod > 4) {
            System.out.println("Method of payment invalid, please insert one number between 1 and 4");
            paymentMethod = read.nextInt();
        }
        System.out.println("Wipro Store\n" + "St Fool, nº0 - Marketplace - LTDA\n" + "CNPJ: 1234554321-00\n");
        System.out.format("%s\t\t\t\t\t\t\t\t\t%s\n%s", "", "BILL OFF SALE", "===========================================================================================\n");
        System.out.format(" %s\t\t\t\t\t %s\t\t\t\t%s\t\t\t%s\n", "NAME", "QTY OF PRODUCTS", "PRICE PER  UNIT", "TOTAL PRICE");
        for (int i = 0; i < id.length; i++) {
            if (quantity[i] < 10) {
                System.out.format(Locale.ENGLISH, " %s\t\t\t\t\t\t\t%s\t\t\t\t\t\tUS$%.2f\t\t\t\t\t\tUS$%.2f\n", product[i], inCart[i], price[i], totalPrice[i]);

            }
        }
        System.out.println(" ");

            switch (paymentMethod) {
                case 1:
                    System.out.format("%sUS$%.2f\n","Discount on purchase: " , (total * 0.2));
                    System.out.format(Locale.ENGLISH,"%sUS$%.2f\n","Total to be paid: " , (total = (total -(total*0.2))));
                    break;
                case 2:
                    System.out.format("%sUS$%.2f\n","Discount on purchase: " , (total * 0.15));
                    System.out.format(Locale.ENGLISH,"%sUS$%.2f\n","Total to be paid: " , (total = (total -(total*0.15))));
                    break;
                case 3:
                    System.out.println("Discount on purchase: US$0.00" );
                    System.out.format(Locale.ENGLISH,"%sUS$%.2f\n","Total to be paid: " , total);
                    break;
                case 4:
                    System.out.format("%sUS$%.2f\n","Additional interest: " , total * 0.1);
                    System.out.format(Locale.ENGLISH,"%sUS$%.2f\n","Total to be paid: " , (total + (total* 0.1)));
                    break;
            }
            System.out.format(Locale.ENGLISH,"%s US$%.2f\n", "Tax amount", (total * tax));

        }

    }


