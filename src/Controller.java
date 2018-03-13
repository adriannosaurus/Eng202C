import java.awt.event.*;

public class Controller
{
    private Model model;
    private View view;

    Controller(Model aModel, View aView)
    {
        this.model = aModel;
        this.view = aView;

        class getButtonListener implements ActionListener
        {
            public void actionPerformed(ActionEvent e)
            {
                view.setCurrentWord(model.getWord());
            }
        }
        
        class putButtonListener implements ActionListener
        {
            public void actionPerformed(ActionEvent e)
            {
                model.putWord(view.getNewWord());
                view.setNewWord();
            }
        }
        
        view.getWordButtonListener(new getButtonListener());
        view.putWordButtonListener(new putButtonListener());          
    }
}