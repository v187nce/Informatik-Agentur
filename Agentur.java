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
    
    public void sortiereNachScoreUnterricht(){
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
    public static void insertionSort(int array[]) {  
        int arrayLength = array.length;  
        for (int i = 1; i < arrayLength; i++) {  
            int key = array[i];  
            int x = i-1;  
            while (x > -1 && array [x] > key) {  
                array [x+1] = array [x];  
                x--;  
            }  
            array[x+1] = key;  
        }
    }  

    public void sortierenNachScoreEineQueue() {
        Queue<Statist> hilfe = new Queue<Statist>();
        int tmpLength = this.statisten.getLength();
        for (int i = 0; i < tmpLength; i++) {
            int maxIndex = IndexOfBiggestScore();
            this.statisten.cycle(maxIndex);
            hilfe.enqueue(this.statisten.getFront());
            this.statisten.dequeue();
        }
        this.statisten = hilfe;
    }
}
