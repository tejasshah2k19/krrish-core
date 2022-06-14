package innerClass;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class GUI extends JFrame{

	Button btn;
	TextField tf;
	
	GUI(){
		btn = new Button("Print");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Print click");
			}
		});
		
		tf = new TextField();
		tf.setColumns(25);
		setLayout(new FlowLayout());
		add(tf);
		add(btn);
	}

	public static void main(String[] args) {
		System.out.println("Loading.....");
		GUI g = new GUI();
		g.setVisible(true);
		g.setSize(500, 500);
		
	}

//	@Override
//	public void actionPerformed(ActionEvent e) {
//
//		System.out.println("click....");
//	}
}
