

public class number {
    /*public static void printNumberInWord(int number) {
        switch (number) {
            case 1:
                System.out.println("zero");
                break;
            case 2:
                System.out.println("one");
                break;
            case 3:
                System.out.println("two");
                break;
            case 4:
                System.out.println("three");
                break;
            case 5:
                System.out.println("four");
                break;
            case 6:
                System.out.println("five");
                break;
            case 7:
                System.out.println("six");
                break;
            case 8:
                System.out.println("seven");
                break;
            case 9:
                System.out.println("eight");
                break;
            case 10:
                System.out.println("nine");
                break;
            default:
                System.out.println("invalid");

        }

    }
    public static void main(String[] args){
        printNumberInWord(8);
    }

}

//public class oddnumber{
    public static void main(String[] args){
        System.out.println("sumOdd=" +sumOdd(1,10));

    }
    public static boolean isOdd(int number) {
       if(number<0)
        return false;
        if (number % 2 !=0)
        return true;
        else
        return false;

    }
    public static int sumOdd(int start,int end){
        int sum=0;
        for(int i=start;i<=end;i++)
            if(isOdd(i)==true)
                sum=sum+i;
            return sum;
    }
    public static  void main(String[] args){
        System.out.println("isPalindrome ="+ 121);
    }
    public static boolean isPalindrome(int number){

    }
    while(n>0)
        d=n%10;
    rev=(rev*10)+d;
    d=n/10;

    //public static void sumFirstAndLastDigit(int number){
        public static void main(String[] args){
            int firstDigit;
            int lastDigit;
            int number=159;
            lastDigit=number%10;
            while(number>10){
                number=number/10;

            }
                firstDigit=number;
            int sum=firstDigit+lastDigit;
            System.out.println("sum="+sum);

        }
    public static void main(String[] args) {
        System.out.println("evenNumber"+ sumOfEven(12345678));
    }
     public static boolean evenNumber(int number){
        if ((number % 2) == 0)
           return true;
           return false;
        }
        public static int sumOfEven(int number){
            int sum=0;
        while (number>0) {
            int d = number % 10;
            if (evenNumber(d)) {
                System.out.println(d);

                sum += d;
            }
            number = number / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 123;
        int d = n;
        int rev = 0;

        while (n > 0) {
            rev = (n % 10)+(rev * 10);
//            rev = ;
            n= n / 10;
        }
        if (d == rev) {
            System.out.println("its a palindrome");
        } else {
            System.out.println("its not a palindrome");
        }

    public static void main(String[] args){
        hasSharedDigit(22,82);

    }
    public static void hasSharedDigit(int num1,int num2) {
        int last = num1 % 10;
        int first = num1 / 10;
        int last1 = num2 % 10;
        int first1 = num2 / 10;

        check(last, first1);
        check(last, last1);
        check(first, first1);
        check(first, last1);
    }
    public static void check (int num1,int num2){
        if(num1==num2) System.out.println(num1);
    }*/
}