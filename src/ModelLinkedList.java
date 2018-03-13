import java.util.Random;
import java.util.LinkedList;

public class ModelLinkedList extends Model
{
    private LinkedList wordList;
    private Node first;
    private Node current;
    private int length;
    
    class Node
    {
        private String data;
        private Node next;
        
        public String getNodeData()
        {
            return current.data;
        }

        public Node getNext()
        {
            return next;
        }
    }
    
    ModelLinkedList()
    {
        wordList = new LinkedList();
        wordList.add("To");
        wordList.add("Boldly");
        wordList.add("Go");
        wordList.add("Where");
        wordList.add("No");
        wordList.add("Man");
        wordList.add("Has");
        wordList.add("Gone");
        wordList.add("Before");
    }
    
    public void putWord(String input)
    {
        wordList.add(input);
    }
    
    public String getWord()
    {        
        Random rand = new Random();
        int x = rand.nextInt(wordList.size());
        return wordList.get(x).toString();
    }

}