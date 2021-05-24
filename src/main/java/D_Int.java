public class D_Int {
    public static void main(String[] args) {
//        int varInt = 1_234_567_890;
//        int var2 = 125;
//        int a = 0;
//        int result1 = varInt - var2;
//        System.out.println(result1);
//        result1 = varInt + 155;
//        System.out.println(result1);
//        result1 = var2 * 2;
//        System.out.println(result1);

//        int result1 = var2 % 2;
//        System.out.println(result1);

//        int result1 = 5 / 2;
//        System.out.println(result1);
//
//        double correctRes = (double )5 / 2;
//        System.out.println(correctRes);

//        int var = 'a';
//        System.out.println(var);

        /*
          ==
          >
          <
          !=

          true | false = true
          false | true = true
          true | true = true
          false | false = false

          false | false | true = false

          true & false = false
          false & true = false
          !false = true
          false = !true


          && a==5 && b < 60
          ||
          &
          |
        */

        int a = 5;
        int b = 35;
        boolean check = a!=b;
        boolean c = true;

        if(a==5&&a<b){
            System.out.println("That's true");
        }else if(a!=5){
            System.out.println("That's true a = 5");
        }
        else if(b==35){
            System.out.println("That's true b = 35");
        }
        else{
            System.out.println("That's false");
        }

//        System.out.println(check);


    }
}
