public class StrMethods {
    public static void main(String[] args) {
        String str1 = "Marwadi University";
        String str2 = "Ruhaan Pathan";
        String str3 = "Information and Communication Technology";
        String str4 = "java";
        
        char charAtIndex = str1.charAt(5);
        System.out.println("charAt(5): " + charAtIndex+"\n"); 
        
        String substring = str3.substring(11, 22);
        System.out.println("substring(11, 22): " + substring+"\n"); 
        
        String concatenatedStr = str2.concat(" is learning Java.");
        System.out.println("concat: " + concatenatedStr+"\n"); 
        
        String replacedStr = str4.replace("a", "@");
        System.out.println("replace: " + replacedStr+"\n"); 
        
        String[] words = str3.split(" ");
        System.out.println("split: ");
        for (String word : words) {
            System.out.println(word);
        }
        
        int comparisonResult = str1.compareTo(str2);
        System.out.println("\ncompareTo: " + comparisonResult+"\n"); 
        
        boolean contains = str3.contains("Communication");
        System.out.println("contains 'Communication': " + contains+"\n"); 
        
        boolean isEmpty = str1.trim().isEmpty();
        System.out.println("isEmpty after trim: " + isEmpty+"\n"); 
        
        int length = str1.length();
        System.out.println("length: " + length+"\n"); 
        
        String trimmed = "  Hello Marwadi  ".trim();
        System.out.println("trim: '" + trimmed + "'"+"\n"); 
        
        char charAtIndexAgain = str2.charAt(7); 
        System.out.println("charAt(7): " + charAtIndexAgain+"\n"); 
        
        int comparisonIgnoreCase = str1.compareToIgnoreCase(str2);
        System.out.println("compareToIgnoreCase: " + comparisonIgnoreCase+"\n"); 
        
        boolean endsWith = str3.endsWith("Technology");
        System.out.println("endsWith 'Technology': " + endsWith+"\n"); 
        
        byte[] byteArray = str1.getBytes();
        System.out.println("getBytes: ");
        for (byte b : byteArray) {
            System.out.print(b + " ");
        }
        System.out.println(); 
        
        int hashCode = str2.hashCode();
        System.out.println("\nhashCode: " + hashCode+"\n"); 
        
        int indexOfWord = str3.indexOf("and");
        System.out.println("indexOf 'and': " + indexOfWord+"\n"); 
        
        String strConverted = String.valueOf(12345); 
        System.out.println("valueOf (int): " + strConverted+"\n"); 
        
        char[] charArray = str3.toCharArray();
        System.out.println("toCharArray: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println(); 

        String lowerCase = str4.toLowerCase();
        System.out.println("\ntoLowerCase: " + lowerCase+"\n"); 
    }
}
