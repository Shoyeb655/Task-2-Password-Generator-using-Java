import java.util.Random;
import java.util.Scanner;

class PasswordGenerator{
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        
        System.out.println("Enter 1-Generate A strong Password");
        System.out.println("Enter 2-Password Strength check");
        System.out.println("Enter 3-To Get Usefull Information");
        System.out.println("Enter 4-Exit");
        int num=sc1.nextInt();
        
        switch (num) {
 case 1:
         generatep();
         option();
         break;
 case 2:
        Strength();
        option();
        break;
 case 3:
        info();
        option();
 case 4:
        
            break;
        
            default:
            System.out.println("Invalid Choice Please Try Again");
                break;
        }
        
    }
    public static void option(){
        Scanner sc1 = new Scanner(System.in);
        
        System.out.println("Enter 1-Generate A strong Password");
        System.out.println("Enter 2-Password Strength check");
        System.out.println("Enter 3-To Get Usefull Information");
        System.out.println("Enter 4-Exit");
        
        int num=sc1.nextInt();
        switch (num) {
            case 1:
                    generatep();
                    option();
                    break;
            case 2:
                   Strength();
                   option();
                   break;
            case 3:
                   info();
                   option();
            case 4:
                   System.out.println("Thank You For Using!!!");
                       break;
                   
                       default:
                       System.out.println("Invalid Choice Please Try Again");
                           break;
                   }
    }
    public static void info(){
        System.out.println("Use a minimum password length of 8 or more characters if permitted");
        System.out.println("Include lowercase and uppercase alphabetic characters, numbers and symbols if permitted");
        System.out.println("Generate passwords randomly where feasible");
        System.out.println("Avoid using the same password twice (e.g., across multiple user accounts and/or software systems)");
        System.out.println("Avoid character repetition, keyboard patterns, dictionary words, letter or number sequences," +
                "\nusernames, relative or pet names, romantic links (current or past) " +
                "and biographical information (e.g., ID numbers, ancestors' names or dates).");
        System.out.println("Avoid using information that the user's colleagues and/or " +
                "acquaintances might know to be associated with the user");
        System.out.println("Do not use passwords which consist wholly of any simple combination of the aforementioned weak components");
    }
    public static void Strength(){
        Scanner se=new Scanner(System.in);
        System.out.println("Enter Your Password");
        String pi1=se.nextLine();
        int score = 0;
        for (int i = 0; i < pi1.length(); i++) {
            char ch = pi1.charAt(i);

            // Check if character is uppercase letter
            if (Character.isUpperCase(ch)) {
                score++;
            }
            // Check if character is lowercase letter
            else if (Character.isLowerCase(ch)) {
                score++;
            }
            // Check if character is a digit (number)
            else if (Character.isDigit(ch)) {
                score++;
            }
            // Check if character is a special symbol
            else if (!Character.isLetterOrDigit(ch)) {
                score++;
            }
           }
            if (score == 6) {
               System.out.println("This is a very good password :D check the Useful Information section to make sure it satisfies the guidelines");
           } else if (score >= 4) {
               System.out.println("This is a good password :) but you can still do better");
           } else if (score >= 3) {
               System.out.println("This is a medium password :/ try making it better");
           } else {
              System.out.println("This is a weak password :( definitely find a new one");
           }
    }
    public static void  generatep(){
        Scanner sc = new Scanner(System.in);
        String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower="abcdefghijklmnopqrstuvwxyz";
        String num1="0123456789";
        String special=",./?><;:|-=_+!@#$%^&*/*-+";
        System.out.println("Answer The Following Question in Yes Or No only");
        System.out.println("Do you want Lowercase letters \"abcd...\" to be used?");
        String s1=sc.nextLine();
        String Y="yes";
        String N="No";
        System.out.println("Do you want Uppercase letters \"ABCD...\" to be used?");
        String s2=sc.nextLine();
        System.out.println("Do you want Numbers \"1234...\" to be used?");
        String s3=sc.nextLine();
        System.out.println("Do you want Symbols \"!@#$...\" to be used? ");
        String s4=sc.nextLine();
        if (s1.equalsIgnoreCase(Y) && s2.equalsIgnoreCase(Y) && s3.equalsIgnoreCase(Y) && s4.equalsIgnoreCase(Y)) {
            String combine=upper+lower+num1+special;
            int len;
             System.out.println("Enter The length Of Password");
            len=sc.nextInt();
            char[] Password=new char[len];
            Random r=new Random();
            for(int i=0;i<len;i++){
             Password[0]=upper.charAt(r.nextInt(upper.length()));
             Password[1]=lower.charAt(r.nextInt(lower.length()));
             Password[2]=num1.charAt(r.nextInt(num1.length()));
             Password[3]=special.charAt(r.nextInt(special.length()));
             Password[i]=combine.charAt(r.nextInt(combine.length()));
         }
             System.out.println("The Generated Password is \n"+new String(Password));
            
        }
        else if (s1.equalsIgnoreCase(Y) && s2.equalsIgnoreCase(Y) && s3.equalsIgnoreCase(Y) && s4.equalsIgnoreCase(N) ) {
            String combine=upper+lower+num1;
            int len;
             System.out.println("Enter The length Of Password");
            len=sc.nextInt();
            char[] Password=new char[len];
            Random r=new Random();
            for(int i=0;i<len;i++){
             Password[0]=upper.charAt(r.nextInt(upper.length()));
             Password[1]=lower.charAt(r.nextInt(lower.length()));
             Password[2]=num1.charAt(r.nextInt(num1.length()));
             Password[i]=combine.charAt(r.nextInt(combine.length()));
         }
             System.out.println("The Generated Password is\n"+new String(Password));
            
        }else if (s1.equalsIgnoreCase(Y) && s2.equalsIgnoreCase(Y) && s3.equalsIgnoreCase(N) && s4.equalsIgnoreCase(Y) ) {
            String combine=upper+lower+special;
            int len;
             System.out.println("Enter The length Of Password");
            len=sc.nextInt();
            char[] Password=new char[len];
            Random r=new Random();
            for(int i=0;i<len;i++){
             Password[0]=upper.charAt(r.nextInt(upper.length()));
             Password[1]=lower.charAt(r.nextInt(lower.length()));
             Password[2]=special.charAt(r.nextInt(special.length()));
             Password[i]=combine.charAt(r.nextInt(combine.length()));
         }
             System.out.println("The Generated Password is\n"+new String(Password));
            
        }else if (s1.equalsIgnoreCase(Y) && s2.equalsIgnoreCase(N) && s3.equalsIgnoreCase(Y) && s4.equalsIgnoreCase(Y) ) {
            String combine=upper+num1+special;
            int len;
             System.out.println("Enter The length Of Password");
            len=sc.nextInt();
            char[] Password=new char[len];
            Random r=new Random();
            for(int i=0;i<len;i++){
             Password[0]=upper.charAt(r.nextInt(upper.length()));
             Password[1]=special.charAt(r.nextInt(special.length()));
             Password[2]=num1.charAt(r.nextInt(num1.length()));
             Password[i]=combine.charAt(r.nextInt(combine.length()));
         }
             System.out.println("The Generated Password is\n"+new String(Password));
            
        }else if (s1.equalsIgnoreCase(N) && s2.equalsIgnoreCase(Y) && s3.equalsIgnoreCase(Y) && s4.equalsIgnoreCase(Y) ) {
            String combine=special+lower+num1;
            int len;
             System.out.println("Enter The length Of Password");
            len=sc.nextInt();
            char[] Password=new char[len];
            Random r=new Random();
            for(int i=0;i<len;i++){
             Password[0]=special.charAt(r.nextInt(special.length()));
             Password[1]=lower.charAt(r.nextInt(lower.length()));
             Password[2]=num1.charAt(r.nextInt(num1.length()));
             Password[i]=combine.charAt(r.nextInt(combine.length()));
         }
             System.out.println("The Generated Password is\n"+new String(Password));
            
        }else if (s1.equalsIgnoreCase(Y) && s2.equalsIgnoreCase(Y) && s3.equalsIgnoreCase(N) && s4.equalsIgnoreCase(N) ) {
            String combine=upper+lower;
            int len;
             System.out.println("Enter The length Of Password");
            len=sc.nextInt();
            char[] Password=new char[len];
            Random r=new Random();
            for(int i=0;i<len;i++){
             Password[0]=upper.charAt(r.nextInt(upper.length()));
             Password[1]=lower.charAt(r.nextInt(lower.length()));
             Password[i]=combine.charAt(r.nextInt(combine.length()));
         }
             System.out.println("The Generated Password is\n"+new String(Password));
            
        }else if (s1.equalsIgnoreCase(N) && s2.equalsIgnoreCase(N) && s3.equalsIgnoreCase(Y) && s4.equalsIgnoreCase(Y) ) {
            String combine=num1+special;
            int len;
             System.out.println("Enter The length Of Password");
            len=sc.nextInt();
            char[] Password=new char[len];
            Random r=new Random();
            for(int i=0;i<len;i++){
             Password[0]=special.charAt(r.nextInt(special.length()));
             Password[1]=num1.charAt(r.nextInt(num1.length()));
             Password[i]=combine.charAt(r.nextInt(combine.length()));
         }
             System.out.println("The Generated Password is\n"+new String(Password));
            
        }else if (s1.equalsIgnoreCase(N) && s2.equalsIgnoreCase(Y) && s3.equalsIgnoreCase(Y) && s4.equalsIgnoreCase(N) ) {
            String combine=lower+num1;
            int len;
             System.out.println("Enter The length Of Password");
            len=sc.nextInt();
            char[] Password=new char[len];
            Random r=new Random();
            for(int i=0;i<len;i++){

             Password[0]=lower.charAt(r.nextInt(lower.length()));
             Password[1]=num1.charAt(r.nextInt(num1.length()));
             Password[i]=combine.charAt(r.nextInt(combine.length()));
         }
             System.out.println("The Generated Password is\n"+new String(Password));
            
        }else if (s1.equalsIgnoreCase(Y) && s2.equalsIgnoreCase(N) && s3.equalsIgnoreCase(N) && s4.equalsIgnoreCase(Y) ) {
            String combine=upper+special;
            int len;
             System.out.println("Enter The length Of Password");
            len=sc.nextInt();
            char[] Password=new char[len];
            Random r=new Random();
            for(int i=0;i<len;i++){
             Password[0]=upper.charAt(r.nextInt(upper.length()));
             Password[1]=special.charAt(r.nextInt(special.length()));
             Password[i]=combine.charAt(r.nextInt(combine.length()));
         }
             System.out.println("The Generated Password is\n"+new String(Password));
            
        }else if (s1.equalsIgnoreCase(N) && s2.equalsIgnoreCase(N) && s3.equalsIgnoreCase(N) && s4.equalsIgnoreCase(Y) ) {
            String combine=special;
            int len;
             System.out.println("Enter The length Of Password");
            len=sc.nextInt();
            char[] Password=new char[len];
            Random r=new Random();
            for(int i=0;i<len;i++){
             Password[i]=combine.charAt(r.nextInt(combine.length()));
         }
             System.out.println("The Generated Password is\n"+new String(Password));
            
        }else if (s1.equalsIgnoreCase(N) && s2.equalsIgnoreCase(N) && s3.equalsIgnoreCase(Y) && s4.equalsIgnoreCase(N) ) {
            String combine=num1;
            int len;
             System.out.println("Enter The length Of Password");
            len=sc.nextInt();
            char[] Password=new char[len];
            Random r=new Random();
            for(int i=0;i<len;i++){
             Password[i]=combine.charAt(r.nextInt(combine.length()));
         }
             System.out.println("The Generated Password is\n"+new String(Password));
            
        }else if (s1.equalsIgnoreCase(N) && s2.equalsIgnoreCase(Y) && s3.equalsIgnoreCase(N) && s4.equalsIgnoreCase(N) ) {
            String combine=lower;
            int len;
             System.out.println("Enter The length Of Password");
            len=sc.nextInt();
            char[] Password=new char[len];
            Random r=new Random();
            for(int i=0;i<len;i++){
                Password[i]=combine.charAt(r.nextInt(combine.length()));
         }
             System.out.println("The Generated Password is\n"+new String(Password));
        
        }else if (s1.equalsIgnoreCase(Y) && s2.equalsIgnoreCase(N) && s3.equalsIgnoreCase(N) && s4.equalsIgnoreCase(N) ) {
            String combine=upper;
            int len;
             System.out.println("Enter The length Of Password");
            len=sc.nextInt();
            char[] Password=new char[len];
            Random r=new Random();
            for(int i=0;i<len;i++){
            Password[i]=combine.charAt(r.nextInt(combine.length()));
         }
             System.out.println("The Generated Password is\n"+new String(Password));
            
        }else if (s1.equalsIgnoreCase(N) && s2.equalsIgnoreCase(N) && s3.equalsIgnoreCase(N) && s4.equalsIgnoreCase(N) ) {
            System.out.println("Invalid Answer!!!!Try Again");
            
         }else if (s1.equalsIgnoreCase(Y) && s2.equalsIgnoreCase(N) && s3.equalsIgnoreCase(Y) && s4.equalsIgnoreCase(N) ) {
            String combine=upper+num1;
            int len;
             System.out.println("Enter The length Of Password");
            len=sc.nextInt();
            char[] Password=new char[len];
            Random r=new Random();
            for(int i=0;i<len;i++){
            Password[0]=upper.charAt(r.nextInt(upper.length()));
            Password[1]=num1.charAt(r.nextInt(num1.length()));
            Password[i]=combine.charAt(r.nextInt(combine.length()));
         }
             System.out.println("The Generated Password is\n"+new String(Password));
            
        }
    }
}