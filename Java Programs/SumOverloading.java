public class SumOverloading {
    int add(int a, int b){
        int sum=a+b;
        System.out.println(sum);
        return 0;
    }
    int add(int a, int b, int c){
        int sum=a+b;
        System.out.println(sum);
        return 0;
    }
    public static void main(String[] args) {
        SumOverloading sum = new SumOverloading();
        sum.add(10, 5);
        sum.add(15, 20,25);
    }
}

