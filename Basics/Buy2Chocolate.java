class Buy2Chocolate {
    public static int buyChoco(int[] prices, int money) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<=first){
                second=first;
                first=prices[i];
            }else if(prices[i]<second){
                second=prices[i];
            }
        }
        if(money-(first+second)>=0){
            return money-(first+second);
        }else{
            return money;
        }
    }
    public static void main(String[] args) {
        int[] prices = {1,2,3};
        int money = 3;
        System.out.println(buyChoco(prices, money));
    }
}
