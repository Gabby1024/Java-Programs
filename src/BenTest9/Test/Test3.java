package BenTest9.Test;

public class Test3 {
    public static void main(String[] args) {
        class Horse{
            public String name;
            public Horse(String s){
                name = s;
            }
        }
        Object obj = new Horse("Zippo");
        Horse h = (Horse)obj;
        System.out.println(h.name);
    }
}
