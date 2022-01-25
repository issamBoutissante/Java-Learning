public class Dog extends Animal{
    void Bark(){
        System.out.println("i'm dog");
    }

    @Override
    void Walk() {
        super.Walk();
        System.out.println("i'm walking but i'm dog");
    }
}
