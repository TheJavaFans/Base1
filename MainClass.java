class Obj{
    private String value;
    public toString(){
        return this.value;
    }
    public Obj(Object value){
        this.value = (String) value;
    }
}
public class MainClass{
    public static void main(String[] args){
        Obj obj1 = new Obj(10);
        Obj obj2 = new Obj(10.5f);
        Obj obj3 = new Obj(75.5);
        Obj obj4 = new Obj('a');
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj4);
}
