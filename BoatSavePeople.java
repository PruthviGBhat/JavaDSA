import java.util.*;
class BoatSavePeople {
    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boats=0;
        int i=0;
        int j=people.length-1;
        while(i<=j){
            if(people[i]+people[j]<=limit){
                i++;
                j--;
                boats++;
            }else{
                j--;
                boats++;
            }
        }
        return boats;
    }
        public static void main(String[] args) {
            int[] people = {1, 2, 2, 3};
            int limit = 3;
            int result = numRescueBoats(people, limit);
            System.out.println("Number of boats needed: " + result);
        }
}
