package test;

public class Example {

    //int mojNiz[] = {1,2,3,4,5};



    public static void main(String[] args) {
        String amount = "100RSD";

        String regexAmount = amount.replaceAll("\\D", "");

        System.out.println(regexAmount);

        int realAmount = Integer.parseInt(regexAmount);

        System.out.println(realAmount + 50);

    }

}
