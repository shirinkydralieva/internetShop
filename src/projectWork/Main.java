package projectWork;

public class Main {
    public static void main(String[] args) {
        /*
        На примере одного покупателя мы продемонстрируем как работает наш интернет магазин.
        Пока он включает в себя два раздела - электроника и одежда.
        Итак, наш покупатель собирается закупиться. Бюджет у него неограничен, так что он собирается купить вещи
        сразу из двух разделов.
        Тем хотим представить вам возможность нашего интернет магазина покупать что-то из нескольких разделов
        (не отдельно - это было бы довольно неудобно)
         */
        Product [] products = new Product[5];
        Basket basket = new Basket(products);
        ElectronicProduct coffeeMachine = new ElectronicProduct("Delonghi ECAM 370.70",72670.0, 9.5);
        ElectronicProduct notebook = new ElectronicProduct("Asus zenbook 14", 78900.0,1.15);
        ElectronicProduct printer = new ElectronicProduct("Canon PIXMA G-540", 35230.0, 5.1);
        ClothingProduct sweater = new ClothingProduct("L", "no brand", "black", 2300.0);
        ClothingProduct downJacket = new ClothingProduct("L", "nike", "black", 7500.0);
        products[0] = coffeeMachine;
        products[1] = notebook;
        products[2] = printer;
        products[3] = sweater;
        products[4] = downJacket; //мне пока не пришло в голову по-другому сделать
        System.out.println("Here are the products you chose: \n\tElectronic:");
        coffeeMachine.displayInfo();
        notebook.displayInfo();
        printer.displayInfo();
        System.out.println("\tClothes: \nSweater"); //в классе одежда нет атрибута name, поэтому пришлось так писать
        sweater.displayInfo();
        System.out.println("Down jacket");
        downJacket.displayInfo();


        /*
        добавьте сюда сумму всех товаров total cost. В классе корзина вы как раз можете создать массив интерфейса
        то есть Product [] products;
        В принципе я так и сделала, вот мой пример:
         */
        basket.calculateTotalSum();
    }
}
