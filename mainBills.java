public class mainBills {
    public static void main(String[] args){
        Hamberger hamburger = new Hamberger("Basic", "Sausage", 3.56, "White");
         hamburger.addHambergerAddition1("Tomato", 0.27);
         hamburger.addHambergerAddition2("Lettuce", 0.75);
         hamburger.addHambergerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemizeHamberger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
         healthyBurger.addHambergerAddition1("Egg", 5.43);
         healthyBurger.addHealthyAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizeHamberger());

        DeluxeBurger db = new DeluxeBurger();
         db.addHambergerAddition3("Should not do this", 50.53);
         System.out.println("Total Deluxe Burger price is " + db.itemizeHamberger());



    }
}
