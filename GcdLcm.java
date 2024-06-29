public class GcdLcm {
    public static void main(String[] args) {
        int a=20;
        int b=15;

        int gcd = gcd(a, b);
        int lcm = (a*b)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
    static int gcd(int a,int b){
            
        while(a!=0 && b!=0){
            if(a>b){
                a=a%b;
            }else{
                b=b%a;
            }
        }
            if(a!=0){
                return a;
            }else{
                return b;
            }
    }
}
