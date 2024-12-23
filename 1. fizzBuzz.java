public class Fizzbuzz {
   public String fizzBuzz(int number){
       if(number % 3 == 0 && number % 5 ==0){
           return "FizzBuzz --> " + number;
       }else if(number % 3 == 0){
           return "Fizz --> " + number;
       }else if(number % 5 == 0){
           return "Buzz --> "  + number;
       }else{
           return "No válido: " + String.valueOf(number);
       }
   }

   public void printNumer(int start, int end){
       for(int i = start; i< end;i++ ){
           System.out.println(fizzBuzz(i));
       }
   }
}

public class EjemploRecorrido {
    public static void main(String[] args) {
        Fizzbuzz fb = new Fizzbuzz();

        fb.printNumer(1,100);
    }
}
