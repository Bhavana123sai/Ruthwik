abstract class Sum{
    /* These two are abstract methods, the child class
     * must implement these methods
     */
    public abstract int add(int n1, int n2);
    public abstract int sub(int n1, int n2);
    public abstract int mul(int n1, int n2);

    //Regular method
    public void disp(){
        System.out.println("Method of class Sum");
    }
}
//Regular class extends abstract class
class MainFile extends Sum{

    /* If I don't provide the implementation of these two methods, the
     * program will throw compilation error.
     */
    public int add(int a, int b){
         return a+b;
    }



    public int sub(int a, int b){
        return a-b;
    }

    public int mul(int a, int b){
        return a*b;
    }

    public static void main(String args[]){
        Sum obj = new MainFile();
        System.out.println(obj.add(3, 7));
        System.out.println(obj.sub(4, 3));
        System.out.println(obj.mul(4, 4));
        obj.disp();
    }
}