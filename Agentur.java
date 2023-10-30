public class Agentur{
     
    private Queue<Statist> statisten;
    
    public Agentur(){
        statisten = new Queue<Statist>();
    }
    
    public void neuerStatist(String name, char geschlecht, int score){
        Statist s = new Statist(name, geschlecht, score);
        statisten.enqueue(s);
    }
    
    public Statist statistVermitteln(){
        Statist x = statisten.front();
        statisten.dequeue();
        return x;
    }
    
    public Statist statistVermitteln(char geschl){
        Queue hilf = new Queue<Statist>();
        Statist gefunden = null;
        boolean statistGefunden = false;
        while(!statisten.isEmpty() || statistGefunden){
            if(statisten.front().getGeschlecht() == geschl){
                gefunden = statisten.front();
            }
            else{
                hilf.enqueue(statisten.front());
            }
            statisten.dequeue();
        }        
        while(!statisten.isEmpty()){
            hilf.enqueue(statisten.front());
            statisten.dequeue();
        }
        statisten = hilf;        
        return gefunden;
    }    
    
    public void sortiereNachScore(){
        Statist maxStat; 
        Queue hilfQ = new Queue<Statist>(); 
        Queue ergQ = new Queue<Statist>();
        while (!statisten.isEmpty()){
            maxStat = statisten.front(); 
            statisten.dequeue(); 
            while (!statisten.isEmpty()){
                if (statisten.front().getScore() > maxStat.getScore()){
                    hilfQ.enqueue(maxStat); 
                    maxStat = statisten.front(); 
                    statisten.dequeue();
                } else {
                    hilfQ.enqueue(statisten.front()); 
                    statisten.dequeue();   
                }
            }
            ergQ.enqueue(maxStat);
            statisten = hilfQ; 
            hilfQ = new Queue<Statist>();
        }
        statisten = ergQ; 
    }
    
    
    
}
