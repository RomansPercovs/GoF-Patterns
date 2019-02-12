package main;

import factory.ProductFactory;
import factory.Products;
import factory.Product;
import decorator.Omlette;
import decorator.OmletteWithMeatDecorator;
import decorator.OmletteWithTomatoesDecorator;
import decorator.SimpleOmlette;
import iterator.Iterator;
import iterator.ProductRepository;
import template.AscendingProductSorter;
import template.DescendingProductSorter;
import template.ProductSorter;

import java.util.Map;

public class RefrigeratorMain {

    public static void main(String[] args) {

        // Factory method
        final ProductFactory productFactory = new ProductFactory();


        productFactory.getFlyweight(Products.MILK, 1, 2019, 2, 19);
        productFactory.getFlyweight(Products.MILK, 1, 2019, 2, 19);
        productFactory.getFlyweight(Products.EGGS, 10, 2019, 3, 1);
        productFactory.getFlyweight(Products.HAM, 25, 2019, 3, 24);
        productFactory.getFlyweight(Products.TOMATOES, 2, 2019, 3, 12);
        Map<Products, Product> products = productFactory.getProducts();

        showProducts(products);

        // Template method
        final ProductSorter ascendingSortByDate = new AscendingProductSorter();
        products = ascendingSortByDate.sortProducts(products);
        showProducts(products);

        final ProductSorter descendingSortByDate = new DescendingProductSorter();
        products = descendingSortByDate.sortProducts(products);
        showProducts(products);

        System.out.println("Get recipes of omlette: ");
        // Decorator
        Omlette omlette = new SimpleOmlette();
        System.out.println(omlette.make());

        omlette = new OmletteWithMeatDecorator(omlette);
        System.out.println(omlette.make());

        omlette = new OmletteWithTomatoesDecorator(omlette);
        System.out.println(omlette.make());

    }

    private static void showProducts(Map<Products, Product> products) {
        //Iterator
        ProductRepository productRepository = new ProductRepository(products);
        Iterator iterator = productRepository.getIterator();

        while (iterator.hasNext()) {
            Product product = (Product) iterator.next();
            product.showAmount();
            product.showExpireDate();
            System.out.println();
        }
    }
}
