import java.util.Stack;

public class Umgekehrt{

    // Dalton LW 10 S. 65-67 S.67 Aufgabe 1

    private Queue<Integer> zahlenfolge = new Queue<Integer>(); 
    private Stack<Integer> ausgabe = new Stack<Integer>(); 

    public Umgekehrt(){
    }

    public void ausgabeZahlenfolge(){
        while(!zahlenfolge.isEmpty()){
            ausgabe.push(zahlenfolge.front());
            zahlenfolge.dequeue();
        } 
        while(!ausgabe.isEmpty()){
            System.out.println(ausgabe.top() + " ");
            ausgabe.pop();
        }
    }

    public void eingabe(int eingabe){
        zahlenfolge.enqueue(eingabe);
    }

}