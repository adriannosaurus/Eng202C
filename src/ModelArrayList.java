import java.util.ArrayList;
import java.util.Random;

public class ModelArrayList extends Model
{
    private ArrayList<String> wordList;
    
    ModelArrayList()
    {
        wordList = new ArrayList();
        wordList.add("A");
        wordList.add("Long");
        wordList.add("Time");
        wordList.add("Ago");
        wordList.add("In");
        wordList.add("Galaxy");
        wordList.add("Far");
        wordList.add("Away");
    }
    
    @Override
    public void putWord(String input)
    {
        wordList.add(input);
    }
    
    @Override
    public String getWord()
    {
        Random rand = new Random();
        int x = rand.nextInt(wordList.size());
        return wordList.get(x);
    }

}