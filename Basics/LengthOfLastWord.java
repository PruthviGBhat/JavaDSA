class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int index = s.length()-1;
        while(s.charAt(index)==' '){
            index--;
        }
        int count=0;
        while(index>=0 && s.charAt(index)!=' '){
            index--;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "   flying to the  moon  ";
        System.out.println(lengthOfLastWord(s));
    }
}