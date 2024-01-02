// 7	Write a java program to print the string in reverse order.	

public class Seven {
    public static void main(String[] args) {
        String myStr = "Anurag";
        String newStr = "";
        for (int i = myStr.length() - 1; i >= 0; i--) {
            newStr += myStr.charAt(i);
        }
        System.out.println("Reverse: " + newStr);
    }
}
