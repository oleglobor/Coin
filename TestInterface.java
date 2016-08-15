import java.util.Random;
import java.awt.FlowLayout; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import javax.swing.Icon; 
import javax.swing.ImageIcon; 
import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 

public class TestInterface { 



public static int main() {
	return 0;
}
ButtonFrame frame = new ButtonFrame(); 	
frame.setSize(300, 100); 
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
frame.setVisible(true); 

static int rand1 = new Random().nextInt(2);
public static string flip() { 
if (rand1 == 0);{ 
return "Heads"; 
} 
if (rand1 == 1){ 
return "Tails"; 
} 

} 
class ButtonFrame extends JFrame { 

JLabel label=new JLabel(); 


ButtonFrame(){ 
Icon icon = new ImageIcon("icon.gif"); 
JButton button = new JButton(icon); 

button.addActionListener(new ActionListener( ) { 
public void actionPerformed(ActionEvent ae) { 

label.setText(flip()); 

} 
}); 

setLayout(new FlowLayout( )); 
add(button); 
add(label); 
add(label); 
} 
}
}
