import java.util.Arrays;

public class ReversePalindromeAnagram {
    public static void main(String[] args) {
        String str1="listen";
        String rev="";
        for(int i=str1.length()-1;i>=0;i--){
            rev=rev+str1.charAt(i);
        }
        System.out.println(rev);
        if(str1.equals(rev)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

        String str2="silent";
        boolean flag=true;
        char c1[]=str1.toCharArray();
        char c2[]=str2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        for(int i=0;i<c1.length-1;i++){
            if(c1[i]!=c2[i]){
                flag=false;
            }
        }
        if(flag==false){
            System.out.println("Not Anagram");
        }else{
            System.out.println("Anagram");
        }
    }
}
