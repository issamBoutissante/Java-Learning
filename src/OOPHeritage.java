public class OOPHeritage {
    public static void main(String[] args){
        Dog dog=new Dog();
        dog.Walk();
        new Cat().Walk();
        Math math=new Math();
        math.Addition(5,3,5);
    }
}
class Math{
    int Addition(int a,int b){
        return a+b;
    }
    int Addition(int a,int b,int c){
        return a+b+c;
    }
}