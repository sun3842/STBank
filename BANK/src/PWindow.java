import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class PWindow extends JFrame
{
	
	public PWindow()
	{
		super("Login Panel");
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel p=new JPanel(new GridBagLayout());
		p.setLayout(null);
		JPanel p10=new JPanel();
		JLabel label10=new JLabel(" ");
		Image img4 =new ImageIcon(this.getClass().getResource("/LOGO.png")).getImage();
		label10.setIcon(new ImageIcon(img4));
		p10.add(label10);
		
		
		
		JButton b=new JButton("Employee");
		Image img =new ImageIcon(this.getClass().getResource("/em.png")).getImage();
		b.setIcon(new ImageIcon(img));
		Font f1=new Font("Arial",Font.BOLD,35);
		b.setFont(f1);
		b.setBounds(115, 150, 275, 70);
		b.setBackground(Color.blue);
		b.setForeground(Color.WHITE);
		JButton b2=new JButton("Customer");
		Image img2 =new ImageIcon(this.getClass().getResource("/us.png")).getImage();
		b2.setIcon(new ImageIcon(img2));
		Font f2=new Font("Arial",Font.BOLD,35);
		b2.setFont(f2);
		b2.setBounds(115, 245, 270, 70);
		b2.setBackground(Color.blue);
		b2.setForeground(Color.WHITE);
		
		GridBagConstraints gbc =new GridBagConstraints();
		gbc.insets=new Insets(15,15,15,15);
		
		
		
		p.add(b,gbc);
		p.add(b2,gbc);
		add(p10,BorderLayout.NORTH);
		add(p,BorderLayout.CENTER);
		
		b.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				EWindow F2=new EWindow();
				//F2.setSize(500,500);
				setVisible(false);
				dispose();
				F2.setVisible(true);
				
			}
		});
		b2.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				CWindow C=new CWindow();
				//F2.setSize(500,500);
				setVisible(false);
				dispose();
				C.setVisible(true);	
			}
		});
		
	}

}
