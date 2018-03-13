import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ViewFancy extends View
{
    private JTextField currentWordField;
    private JTextField newWordField;
    
    private JButton getWordButton;
    private JButton putWordButton;
    
    private Model model;
    
    ViewFancy(Model model)
    {
        this.model = model;
               
        currentWordField = new JTextField(20);
        getWordButton = new JButton("Get new word");
        newWordField = new JTextField(20);
        putWordButton = new JButton("Add new word");
        
        JPanel content = new JPanel();
        GridLayout grid = new GridLayout(2, 2);
        content.setLayout(grid);
        content.add(currentWordField);
        content.add(getWordButton);
        content.add(newWordField);
        content.add(putWordButton);
        
        this.setContentPane(content);
        this.pack();
        this.setTitle("Random Word MVC Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                  
    }
  
    @Override
    public void getWordButtonListener(ActionListener al) 
    {    
        getWordButton.addActionListener(al);
    }
    @Override
    public void putWordButtonListener(ActionListener al) 
    {    
        putWordButton.addActionListener(al);
    }
    
    @Override
    public void setCurrentWord(String newWord)
    {
        currentWordField.setText(newWord);
    }
    @Override
    public void setNewWord()
    {
        newWordField.setText(null);
    }
    
    @Override
    public String getCurrentWord()
    {
        return currentWordField.getText();
    }
    @Override
    public String getNewWord()
    {
        return newWordField.getText();
    }
}