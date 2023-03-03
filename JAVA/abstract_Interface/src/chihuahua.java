package abstract_Interface.src;

public class chihuahua extends dog implements animal{
    // you'll see the error telling that .pee() is not implemented
    // cause of the abstract method are required to be implemented in the body of the class

    // uncomment this method to solve it
    public void pee(){
        System.out.println("Chee Chee");
    }

    // you'll see ounce again that isAnimal() that we implemented from animal class is not implemented
    // NOTE that every method in interface are considered as an abstract method

    // uncomment this method to solve it
    public void isAniaml(){
        System.out.println("I am not your FRIEND!");
    }

    public static void main(String[]args){
        chihuahua a = new chihuahua();
        a.pee();
        a.poop();

        // it cannot instantiate the "dog" class because it's an abstract class => cannot be used
        // try comment and uncomment in the line below to see the difference
        // dog b = new dog();
    }
}
