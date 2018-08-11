public class Test{
    int a;
    public Test(int a){
        this.a = a;
    }
    public static void main(String[] args){
        Test t = new Test(100);
        System.out.println(t.a);    
    }
}
