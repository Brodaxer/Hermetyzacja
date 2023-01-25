class DiscountApp {
    public static void main(String[] args) {
        Client client1 = new Client(null, "Kowalski", true);
        double price1 = 1100;

        Client client2 = new Client("Karol", null, false);
        double price2 = 1100;
        Client client3 = new Client(null, null, true);
        double price3 = 1200;
        Client client4 = new Client("Jan", "Dab", true);

        DiscountService discountService = new DiscountService();
        double priceDiscount1 = discountService.calculateDiscountPrice(client1, price1);
        double priceDiscount2 = discountService.calculateDiscountPrice(client2, price2);
        double priceDiscount3 = discountService.calculateDiscountPrice(client1, price1);

        printInfo test1 = new printInfo();
        test1.greetingsInfo(client1);
        test1.priceToPay(price1);
        test1.priceAfterDiscount(priceDiscount1);

        // Testowalem null e w cilencie
//        test1.greetingsInfo(client2);
//        test1.greetingsInfo(client3);
//        test1.greetingsInfo(client4);
    }
}