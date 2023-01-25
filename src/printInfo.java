class printInfo {

    public void greetingsInfo(Client client) {

        if (client.getFirstName() == null && client.getLastName() != null) {
            System.out.println("Witaj panie " + client.getLastName());
        } else if (client.getFirstName() != null && client.getLastName() == null) {
            System.out.println("Witaj " + client.getFirstName());
        } else if (client.getFirstName() == null && client.getLastName() == null) {
            System.out.println("Witaj nieznajomy");
        } else {
            System.out.println("Witaj " + client.getFirstName() + " " + client.getLastName());
        }
    }

    public void priceToPay(double price) {
        System.out.println("Kwota przed rabatem: " + price);
    }


    public void priceAfterDiscount(double priceDiscount) {
        System.out.println("Do zapłaty (po rabacie): " + priceDiscount);

    }

}
//        System.out.println("Witaj " + client1.getFirstName() + " " + client1.getLastName());
//        System.out.println("Kwota przed rabatem: " + price1);
//        System.out.println("Do zapłaty (po rabacie): " + priceDiscount1);
//
//        System.out.println("Witaj " + client2.getFirstName() + " " + client2.getLastName());
//        System.out.println("Kwota przed rabatem: " + price2);
//        System.out.println("Do zapłaty (po rabacie): " + priceDiscount2);