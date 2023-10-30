public class Statist{
    //Attribute
    private String name;
    private char geschlecht;
    private int score;

    //Konstruktor
    public Statist(String pName, char pGeschlecht, int pScore){
        name = pName;
        geschlecht = pGeschlecht;
        score = pScore;
    }
    
    //get- und set-Methoden
    public String getName(){
        return name;
    }
    
    public void setName(String pName){
        name = pName;
    }
    
    public char getGeschlecht(){
        return geschlecht;
    }
    
    public void setGeschlecht(char pGeschlecht){
        geschlecht = pGeschlecht;
    }
    
    public void setScore(int pScore){
        score = pScore;
    }
    
    public int getScore(){
        return score;
    }
    
    
}
