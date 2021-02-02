/*public class Account {
    private  String number;
    private  double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;
    public Account (){
        System.out.println("default constructor called");
    }

         public Account(String number,double balance,String customerName,String customerEmail,String customerPhoneNumber){
             System.out.println("constructor called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
        }
        


    public void deposit(double depositeAmount){
        this.balance+=depositeAmount;
        System.out.println("Deposite of" + depositeAmount + "made.New balance is " + this .balance);
    }

    public void withdrawal(double withdrawalAmount){
        if(this.balance-withdrawalAmount<=0) {
            System.out.println("Only " + this.balance + "available withdrawal not processed");

        }else{
            this.balance-=withdrawalAmount;
            System.out.println("withdrawal of" + withdrawalAmount + "processed remaining balance" + balance);

        }

    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }


}




    class VipCustomer {
        private String name;
        private double creditLimit;
        private String emailAddress;

        public VipCustomer(){
            this("Defaultname",5000.00,"tim@nhg.vom");
           // this.name = name;
            //this.creditLimit = creditLimit;
            //this.emailAddress = emailAddress;

        }

        public VipCustomer(String name, double creditLimit) {
            this.name = name;
            this.creditLimit = creditLimit;
        }

        public VipCustomer(String name, double creditLimit, String emailAddress) {
            this.name = name;
            this.creditLimit = creditLimit;
            this.emailAddress = emailAddress;
        }

        public String getName() {
            return name;
        }

        public double getCreditLimit() {
            return creditLimit;
        }

        public String getEmailAddress() {
            return emailAddress;
        }
    }*/
 class Animal{
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;
    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }
    public void eat(){

    }
    public void move(){

    }
    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }


}
