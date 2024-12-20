public class Primes {
    public static void main(String[] args) {
        int counter = 0;
        int n = Integer.parseInt(args[0]);
        System.out.println("Prime numbers up to " + n + ":");
        boolean[] numbers = new boolean[n + 1];
        
       
        for (int i = 2; i <= n; i++) {
            numbers[i] = true;
        }
    
       
        int i = 2;
        while (i * i <= n) {
            if (numbers[i]) { 
                for (int j = i * i; j <= n; j += i) { 
                    numbers[j] = false; 
                }
            }
            i++;
        }
    
       
        for (int k = 2; k <= n; k++) {
            if (numbers[k]) {
                counter++;
                System.out.println(k);
            }
        }
    
        int y = (100 * counter) / n;
        System.out.println("There are " + counter + " primes between 2 and " + n + " (" + y + "% are primes)");
    }
}