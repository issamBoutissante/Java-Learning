public class Cat extends Animal {
    void Myaw(){
        System.out.println("i'm cat");
    }

    @Override
    void Walk() {
        super.Walk();
        System.out.printf("I'm Cat");
    }
}
