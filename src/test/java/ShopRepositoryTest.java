import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShopRepositoryTest {

    @Test

    public void removeExistProduct (){
        ShopRepository product = new ShopRepository();

        Product product0 = new Product (12, "Лайм", 90);
        Product product1 = new Product (10, "Лимон", 60);
        Product product2 = new Product (2, "Яблоко", 50);
        Product product3 = new Product (95, "Хлеб", 50);
        Product product4 = new Product (11, "Сметана", 50);

        product.add (product0);
        product.add (product1);
        product.add (product2);
        product.add (product3);
        product.add (product4);

        product.remove(95);

        Product [] expected = {product0, product1, product2, product4};
        Product [] actual = product.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void removeNotExistProduct (){
        ShopRepository product = new ShopRepository();

        Product product0 = new Product (12, "Лайм", 90);
        Product product1 = new Product (10, "Лимон", 60);
        Product product2 = new Product (2, "Яблоко", 50);
        Product product3 = new Product (95, "Хлеб", 50);
        Product product4 = new Product (11, "Сметана", 50);

        product.add (product0);
        product.add (product1);
        product.add (product2);
        product.add (product3);
        product.add (product4);

        Assertions.assertThrows(NotFoundException.class, ()->product.remove(40));

    }

//    public void test () {
//        ShopRepository product = new ShopRepository();
//
//        Product product0 = new Product (12, "Лайм", 90);
//       Product product1 = new Product (10, "Лимон", 60);
//        Product product2 = new Product (2, "Яблоко", 50);
//       Product product3 = new Product (95, "Хлеб", 50);
//        Product product4 = new Product (11, "Сметана", 50);
//
//        product.add (product0);
//      product.add (product1);
////        product.add (product2);
////        product.add (product3);
////        product.add (product4);
//
//
//        Product [] expected = {product0};
//        Product [] actual = product.findById();
//
//        Assertions.assertArrayEquals(expected, actual);
//    }

}