public class OOPClass {
    public static void main(String[] args){
        Person issam=new Person("issam",21);
        issam.Afficher();
        Person yassine=new Person("yassine",21);
        yassine.Afficher();
        System.out.println("le nombre des objet instancie est "+Person.count);

    }
}

class Person{
    static int count=0;
    String name;
    Integer age;
    public Person(String nom,Integer Age){
        name=nom;
        age=Age;
        count++;
    }
    void Afficher(){
        System.out.println("le nome est "+name+" et l'age "+age+" count = "+count);
    }
}
//class (attributs/Fonctions)
//static (varaible de class /acces par tous les objet)
//constructur