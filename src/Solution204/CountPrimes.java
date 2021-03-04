package Solution204;

public class CountPrimes {
    public int countPrimes(int n) {
        int count = 0;
        if (n <= 1) {
            return 0;
        }
        boolean[] primeArray = new boolean[n];
        primeArray[0] = true;
        primeArray[1] = true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            for (int j = 2; i * j < n; j++) {
                primeArray[i*j]=true;
            }
        }
        for(boolean isPrime : primeArray){
            if(isPrime==false){
                count++;
            }
        }

        // for (int i = 1; i < n; i++) {
        // if (isPrime(i)) {
        // count++;
        // }
        // }
        return count;
    }

    public boolean isPrime(int n) {

        boolean result = true;
        if (n <= 1) {
            result = false;
        }
        if (n == 2 || n == 3) {
            return true;
        } else {
            if (n % 2 == 0 || n % 3 == 0) {
                result = false;
            } else {
                for (int i = 5; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        result = false;
                    }

                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        CountPrimes test = new CountPrimes();
        System.out.println(test.countPrimes(9999));
    }

}
