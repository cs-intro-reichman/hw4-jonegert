public class Primes {
    public static void main(String[] args) {
       int n=Integer.parseInt(args[0]);
      boolean[] numbers=new boolean[n+1];
      for(int i=2;i<n+1;i++){
        numbers[i]=true;
      }
      int i=2;
      while(i<Math.sqrt(n)){
        for(int j=2;j<n/i;j++){
            numbers[i*j]=false;
      }
      i++;
    }
    for(int k=2;k<n;k++){
        if(numbers[k]==true){
            System.out.println(k);
        }
    }
    }
}