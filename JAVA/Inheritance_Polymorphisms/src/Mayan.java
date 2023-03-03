package Inheritance_Polymorphisms.src;

public class Mayan extends Language{

    public Mayan(String languageName, int speakers) {
        super(languageName,speakers, "Central America", "verb-object-subject");
    }

    @Override
    public void getInfo(){
        System.out.println(this.name + " is spoken by "+ this.numSpeakers +
         " mainly in Central America");
        System.out.println("The language follows the word order:"
         + "verb-object-subject");
        System.out.println("Fun fact: "+ this.name + " is an ergative language.");
    }
}
