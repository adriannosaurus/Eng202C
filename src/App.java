import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        Model model;
        View view;
        
        System.out.print("Would you like to use ArrayList (A) or LinkedList (L) model? ");
        String response = in.next();
        if (response.equalsIgnoreCase("a"))
        {
            model = new ModelArrayList();
        }
        else
        {
            model = new ModelLinkedList();
        }
        
        System.out.print("Would you like to use simple (S) or fancy (F) view? ");
        response = in.next();
        if (response.equalsIgnoreCase("s"))
        {
            view = new ViewSimple(model);
        }
        else
        {
            view = new ViewFancy(model);
        }
        
        Controller controller = new Controller(model, view);
        view.setVisible(true);
    }
}