public class primeNumber {
    
    static boolean isPrime(int number, int index) {
        if (number <= 2){
            return (number == 2) ? true : false;
        }
        if (number % index == 0){
            return false;
        }
        if (index * index > number){
            return true;
        }
        return isPrime(number, index + 1);
    }

    public static void main(String[] args) {

        int number = 12;
        if (isPrime(number, 2))
            System.out.println("it's a Prime");
        else
            System.out.println("it's not a Prime");
    }
}
