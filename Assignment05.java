// CSE 110     : 74845 / ONLINE
// Assignment  : 05
// Author      : MORRIS, CHRIS 1223564576
// Description : TEN METHODS

public class Assignment05 {

    public static void main(String[] args) {
        // Codes below will test your methods:
        displayGreeting();
        displayText("test");
        printTotal(1,2,3);
        int total = getTotal(1,2,3);
        System.out.println(total);
        double average= getAverage(1,2,3);
        System.out.println(average);
        average= averageLength("test","test21", "testtest");
        System.out.println(average);
        int shortest = lengthOfShortest("test","test21");
        System.out.println(shortest);
        String stars=stringOfStars("test");
        System.out.println(stars);
        stars=maxStringOfStars("test","test21");
        System.out.println(stars);
        stars=midStringOfStars("test","test21", "testtest");
        System.out.println(stars);

    }
    
    // 1) Write (define) a static method named displayGreeting, 
    //  that takes no arguments and returns no value. 
    //  When this function is called, it should print the text "Hello, and welcome!".
    public static void displayGreeting(){
        System.out.println("Hello, and welcome!");
    }
    
    //2) Write (define) a static method named displayText, 
    //  that takes a single String argument and returns no value. 
    //  When this function is called, it should print the value of the argument that was passed to it.
    public static void displayText(String text){
        System.out.println(text);
    }
    
    //3) Write (define) a static method named printTotal, 
    //  that takes three int arguments. 
    //  When this function is called, it should print the sum of the three arguments passed to it. 
    //  This function should return no value.
    public static void printTotal(int num1 , int num2 , int num3){
        int sum = num1 + num2 + num3;
        System.out.println(sum);
    }
    
    //4) Write (define) a static method named getTotal, 
    //  that takes three int arguments. 
    //  When this function is called, it should return the sum 
    //  of the three arguments passed to it as an int.
    public static int getTotal(int num1 , int num2 , int num3){
        int sum = num1 + num2 + num3;
        return sum;
    }
    
    //5) Write (define) a static method named getAverage, 
    //  that takes three int arguments. 
    //  When this function is called, it should return the average 
    //  of the three arguments passed to it as a double.
    public static double getAverage(int num1 , int num2 , int num3){
        double average = (num1 + num2 + num3) / 3.0;
        return average;
    }
    
    //6) Write (define) a static method named averageLength, 
    //  that takes three String arguments. 
    //  When this function is called, it should return the average length (number of characters) 
    //  of the String arguments passed to it as a double.
    public static double averageLength(String string1 , String string2 , String string3){
        String addedStrings = string1 + string2 + string3;
        int charCount = addedStrings.length();
        double avgCharCount = charCount / 3.0;
        return avgCharCount;    
    }
    
    //7) Write (define) a static method named lengthOfShortest, 
    //  that takes two String arguments. When this function is called, 
    //  it should return the length (number of characters) 
    //  of the shortest String argument passed to it as an int.
    public static int lengthOfShortest(String string1 , String string2){
        int string1Length = string1.length();
        int string2Length = string2.length();
        int shorter = Math.min(string1Length, string2Length);
        return shorter;
    }
    
    
    //8) Write (define) a static method named stringOfStars, 
    //  that takes one String argument.
    //  When this function is called, it should return a String of asterisks (*) 
    //  that is the same length as the string argument passed to it.
    public static String stringOfStars(String string1){
        int stringLength = string1.length();
        char star = '*';
        String starString = "";
        for(int i = 0; i < stringLength; i++){
            starString += star;
        }
        return starString;
    }
    
    //9) Write (define) a static method named maxStringOfStars, 
    //  that takes two String arguments. 
    //  When this function is called, it should return a String of asterisks (*) 
    //  that is the same length as the longest string argument passed to it.
    public static String maxStringOfStars(String string1 , String string2){
        int string1Length = string1.length();
        int string2Length = string2.length();
        int maxStringLength = Math.max(string1Length, string2Length);
        String maxStringTemp = "";
        char star = '*';
        for(int i = 0; i < maxStringLength; i++){
            maxStringTemp += star;
        }
        return maxStringTemp;
    }
    
    //10) Write (define) a static method named midStringOfStars, 
    //   that takes three String arguments. 
    //   When this function is called, it should return a String of asterisks (*) 
    //   that is the same length as the string argument with the length 
    //   that would be in the middle if the lengths of the arguments were arranged in ascending order.
    public static String midStringOfStars(String string1 , String string2 , String string3){
        int string1Length = string1.length();
        int string2Length = string2.length();
        int string3Length = string3.length();
        String midStringTemp = "";
        char star = '*';

        int midString = 0;
        if(string1Length < string2Length){
            if(string2Length < string3Length){
                midString = string2Length;
            } 
            else{
                midString = string3Length;
            }
        }
        else{
            if(string1Length < string3Length){
                midString = string1Length;
            }
            else{
                midString = string3Length;
            }
        }
        for(int i = 0; i < midString; i++){
        midStringTemp += star;
        }
        return midStringTemp;
    }
        
}


