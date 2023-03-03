package Inheritance_Polymorphisms.src;

public class Language {

    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;
  
    public Language(String name, int numSpeakers, String regionsSpoken, String wordOrder) {
      this.name = name;
      this.numSpeakers = numSpeakers;
      this.regionsSpoken = regionsSpoken;
      this.wordOrder = wordOrder;
    }
  
    public void getInfo(){
      System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in "+ 
      this.regionsSpoken + ".");
      System.out.println("The Language follows the word order: " + this.wordOrder);
    }
  
    public static void main(String[]args){
    //   Language spanish = new Language("Spainsh",555000000,"Spain, Latin America","subject-verb-objecet");
    //   spanish.getInfo();
    //   Mayan mam = new Mayan("mam",200000);
    //   mam.getInfo();
    
    SinoTibetan MandarinChinese = new SinoTibetan("MandarinChinese", 200000);
    SinoTibetan Burmese = new SinoTibetan("Buremese", 30);

    MandarinChinese.getInfo();
    Burmese.getInfo();
  
    }
  }