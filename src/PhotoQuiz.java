import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		String puppy = "https://i1.wp.com/www.totallygoldens.com/wp-content/uploads/2014/05/How-to-train-a-puppy-their-name.jpg?fit=620%2C330&ssl=1";
		Component image1 = createImage(puppy);
		quizWindow.add(image1);
		quizWindow.pack();
		
	    String question1 = JOptionPane.showInputDialog("What color is the dog's nose?");
	    if(question1.equals("black"))
	    {
	    	JOptionPane.showMessageDialog(null, "CORRECT");
	    }
	    else
	    {
	    	JOptionPane.showMessageDialog(null, "INCORRECT");
	    }
	    quizWindow.removeAll();
	    String puppy2 = "http://clv.h-cdn.co/assets/15/49/980x648/gettyimages-127022730.jpg";
	    Component image2 = createImage(puppy2);
	    quizWindow.add(image2);
	    quizWindow.pack();
	    quizWindow.setVisible(true);
	    String question2 = JOptionPane.showInputDialog("What color hat is the dog wearing?");
	    if(question2.equals("red"))
	    		{
	    			JOptionPane.showMessageDialog(null, "CORRECT");
	    		}
	    else
	    		{
	    			JOptionPane.showMessageDialog(null, "INCORRECT");
	    		}
	   
	   }
	
	
	
	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	
}
