package BenTest5.Test;

class Test1 {
    static int s;
    public static void main (String args[]){
        Test1 p = new Test1();
        p.start();
        System.out.println(s);
    }
    void start(){
        int x = 7;
        twice(x);
        System.out.print(x + " ");
    }
    void twice(int x){
        x = x*2;
        s = x;
    }
}
