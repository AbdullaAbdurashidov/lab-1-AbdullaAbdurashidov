package com.company;
import java.util.Scanner;

class Invoice{
    String partNumber;
    String partDescription;
    int quantity;
    double price;
    Invoice()
    {
        partNumber="1";
        partDescription="empty";
        quantity=1;
        price=0.5;
    }
    void setPartNumber(String a) {
        partNumber=a;
    }
    void setPartDescription(String a) {
        partDescription=a;
    }
    void setQuantity(int a){
        quantity=a;
    }
    void setPrice(double a){
        price=a;
    }

    String getPartNumber() {
        return partNumber;
    }
    String getPartDescription(){
        return partDescription;
    }
    int getQuantity(){
        return quantity;
    }
    double getPrice(){
        return price;
    }
    double getInvoiceAmount(){
        if(quantity*price<0)
            return 0;
        return quantity*price;
    }
}

public class Main {

    static double Approximating(){

        return 0;
    }

    static double SmallestNumber( double num[]) {
        double smallest=1000000;
        for(int i=0;i<num.length/2;i++) {
            if (num[i]<smallest)
                smallest=num[i];
            if(num[num.length-i-1]<smallest)
                smallest=num[num.length-i-1];
        }
        return smallest;
    }

    static double LargestNumber( double num[]) {
        double largest=0;
        for(int i=0;i<num.length/2;i++) {
            if (num[i]>largest)
                largest=num[i];
            if(num[num.length-i-1]>largest)
                largest=num[num.length-i-1];
        }
        return largest;
    }

    static double TwoLargestNumber( double num[]) {
        double largest=0, largest2=0;
        for(int i=0;i<num.length/2;i++) {
            if (num[i]>largest2)
                if (num[i]>largest)
                    largest=num[i];
                else largest2=num[i];

            if(num[num.length-i-1]>largest2)
                if(num[num.length-i-1]>largest)
                    largest=num[num.length-i-1];
                else largest2=num[num.length-i-1];
        }
        System.out.println(largest+"  "+largest2);
        return 0;
    }

    static String Palindromes(int num){
        if(num/10000>9)
            return "Error";
        int digits[]=new int[5];
        digits[0]=num/10000;
        digits[1]=num%10000/1000;
        digits[2]=num%10000%1000/100;
        digits[3]=num%10000%1000%100/10;
        digits[4]=num%10000%1000%100%10/1;
        if(digits[0]==digits[4])
            if(digits[1]==digits[3])
                return "True";
            return "False";
    }

    static void Triangle()
    {
        for (int i=0;i<10;i++){
            for (int j=0;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
    }
    static void Triangle1(){
        for (int i=10;i>0;i--){
            for (int j=0;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
    }
    static void Triangle2()
    {
        for (int i=0;i<10;i++){
            for (int k=0;k<=10-i;k++)
                System.out.print(" ");
            for (int j=0;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void Triangle3()
    {
        for (int i=10;i>0;i--){
            for (int k=0;k<=10-i;k++)
                System.out.print(" ");
            for (int j=0;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static double BMI(double weight, double height)
    {
        if(height>100)
        {
            height/=100;
        }
        return weight/(height*height);
    }

    static double SalesCommissionCalculator(double items) {
        System.out.println(items);
        return 200+items*0.09;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int choice=1;
        while(choice!=0){
            System.out.println("1. BMI \n2. Invoice Class \n3. Sales Commission Calculator \n4. Find the Largest Number \n5. Palindromes \n6. Triangle Printing Program \n7. Approximating PI \n8. Pythagorean Triples");
            choice=in.nextInt();
            switch(choice)
            {
                case 1: {
                    System.out.println("Enter your weight and height :");
                    System.out.println("Your result: "+BMI(in.nextDouble(),in.nextDouble()));
                    System.out.println("BMI VALUES \nUnderweight: less than 18.5 \nNormal: between 18.5 and 24.9 \nOverweight: between 25 and 29.9 \nObese: 30 or greater ");
                    break;
                }
                case 2:
                    Invoice ob=new Invoice();
                    System.out.println("Set part number : ");
                    ob.setPartNumber(in.nextLine());
                    System.out.println("Set part description : ");
                    ob.setPartDescription(in.nextLine());
                    System.out.println("Set part quantity : ");
                    ob.setQuantity(in.nextInt());
                    System.out.println("Set part price : ");
                    ob.setPrice(in.nextDouble());

                    System.out.println("Part Number: ");
                    System.out.println(ob.getPartNumber());
                    System.out.println("Part Description: ");
                    System.out.println(ob.getPartDescription());
                    System.out.println("Quantity: ");
                    System.out.println(ob.getQuantity());
                    System.out.println("Price : ");
                    System.out.println(ob.getPrice());
                    System.out.println("Invoice Amount: ");
                    System.out.println(ob.getInvoiceAmount());
                    break;
                case 3:
                    System.out.println("How many items you sold ?");
                    System.out.println("Your salary is: "+SalesCommissionCalculator(in.nextDouble()));
                    break;
                case 4:
                    double num[]=new double[10];
                    for (int i=0;i<num.length;i++)
                    {
                        num[i]=in.nextDouble();
                    }
                    System.out.println("The largest num: "+LargestNumber(num));
                    System.out.println("The smallest num: "+SmallestNumber(num));
                    System.out.println("Two largest numbs: ");
                    TwoLargestNumber(num);
                    break;
                case 5:
                    System.out.println(Palindromes(in.nextInt()));
                    break;
                case 6:
                    Triangle();
                    Triangle1();
                    Triangle2();
                    Triangle3();
                    break;
                case 7:
                    double pi=1;
                    double a=3;
                    for(int i=1;i<200000;i++){
                        if(i%2!=0)
                            pi=pi-1/a;
                        else
                            pi=pi+1/a;
                        a=a+2;
                    }
                    System.out.println("PI is: "+4*pi);
                    break;
                case 8:
                    for(int i=1;i<500;i++) {
                        for(int j=1;j<500;j++){
                            for(int k=1;k<500;k++){
                                if((i*i)+(j*j)==(k*k))
                                    System.out.println(i+"^2  +  "+j+"^2  =  "+k+"^2");
                            }
                        }
                    }
                    break;
                default:
                    break;
            }
        }
    }
}