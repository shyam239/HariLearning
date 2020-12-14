class Main {
  public static void main(String[] args) {
    // declaration of variables
    int valOne;
    int valTwo;
    int outPut;
    // setting values in variables in input variables
    valOne=8;
    valTwo=2;
    
    // add two values and print the output
    outPut = valOne+valTwo;
    System.out.println("Addition of two values, from main method = "+outPut);

    // sub two values and print the output
    outPut = valOne-valTwo;
    System.out.println("Subracation of two values, from main method = "+outPut);

    // multiply two values and print the output
    outPut = valOne*valTwo;
    System.out.println("Multiplication of two values, from main method = "+outPut);

    // divid two values and print the output
    outPut = valOne/valTwo;
    System.out.println("Division of two values, from main method = "+outPut);

    addTwoValAndPrint(6, 3);
    subTwoValAndPrint(6, 3);
    mulTwoValAndPrint(6, 3);
    divTwoValAndPrint(6, 3);

  }

  public static void addTwoValAndPrint(int valOne, int valTwo){
    int outPut=valOne+valTwo;
    System.out.println("Addition of two values, printing from addTwoValAndPrint method = "+outPut);
  }

  public static void subTwoValAndPrint(int valOne, int valTwo){
    int outPut=valOne-valTwo;
    System.out.println("Subracation of two values, printing from subTwoValAndPrint method = "+outPut);
  }

  public static void mulTwoValAndPrint(int valOne, int valTwo){
    int outPut=valOne*valTwo;
    System.out.println("Multiplication of two values, printing from mulTwoValAndPrint method = "+outPut);
  }

   public static void divTwoValAndPrint(int valOne, int valTwo){
    int outPut=valOne/valTwo;
    System.out.println("Division of two values, printing from divTwoValAndPrint method = "+outPut);
  }

}