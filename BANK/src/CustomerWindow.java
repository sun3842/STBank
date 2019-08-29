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
public class CustomerWindow extends JFrame
{
	public CustomerWindow()
	{
		super("Customer");
		
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel p=new JPanel(new GridBagLayout());
		p.setLayout(null);
		
		JPanel p4=new JPanel(new GridBagLayout());
		
		JLabel label10=new JLabel(" ");
		Image img10 =new ImageIcon(this.getClass().getResource("/LOGO.png")).getImage();
		label10.setIcon(new ImageIcon(img10));
		
		
		JButton b=new JButton("CASH WITHDRAWL");
		Font f1=new Font("Arial",Font.BOLD,17);
		b.setFont(f1);
		b.setBounds(10, 45, 200, 70);
		b.setBackground(Color.blue);
		b.setForeground(Color.WHITE);
		
		JButton c=new JButton("BALANCE INQUIRY");
		c.setFont(f1);
		c.setBounds(275, 45, 200, 70);
		c.setBackground(Color.blue);
		c.setForeground(Color.WHITE);
		
		JButton d=new JButton("FIRST CASH");
		d.setFont(f1);
		d.setBounds(10, 250, 200, 70);
		d.setBackground(Color.blue);
		d.setForeground(Color.WHITE);
		
		JButton e=new JButton("PIN CHANGE");
		e.setFont(f1);
		e.setBounds(275, 250, 200, 70);
		e.setBackground(Color.blue);
		e.setForeground(Color.WHITE);

		
		JLabel label=new JLabel("Select an option");
		Font f=new Font("Arial",Font.BOLD,35);
		label.setFont(f);
		label.setForeground(Color.BLACK);
		
		
		
		
		GridBagConstraints gbc =new GridBagConstraints();
		gbc.insets=new Insets(15,15,15,15);
		
		
		gbc.gridx=0;
		gbc.gridy=0;
		p4.add(label10,gbc);
		gbc.gridx=0;
		gbc.gridy=1;
		p4.add(label,gbc);
		
		p.add(b,gbc);//CASH WITHDRAWL
		
		p.add(c,gbc);//BALANCE INQUIRY
		
		p.add(d,gbc);//FIRST CASH
		
		p.add(e,gbc);//PIN CHANGE
		
		add(p4,BorderLayout.NORTH);
		add(p,BorderLayout.CENTER);
		
		b.addActionListener(new ActionListener() //CASH WITHDRAWL
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null," ");

			}
		});
		c.addActionListener(new ActionListener() //BALANCE INQUIRY
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null," ");

			}
		});
		d.addActionListener(new ActionListener() //FIRST CASH
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				
				FC F=new FC();
				//F2.setSize(500,500);
				setVisible(false);
				dispose();
				F.setVisible(true);

			}
		});
		e.addActionListener(new ActionListener() //PIN CHANGE
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				PINCHANGE PC=new PINCHANGE();
				//F2.setSize(500,500);
				setVisible(false);
				dispose();
				PC.setVisible(true);

			}
		});
		
	}

}
