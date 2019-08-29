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
public class FC extends JFrame
{
	public FC()
	{
		super("Customer");
		
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel p=new JPanel(new GridBagLayout());
		p.setLayout(null);
		JPanel p3=new JPanel(new GridBagLayout());
		//p3.setLayout(null);
		JPanel p4=new JPanel(new GridBagLayout());
		JPanel p5=new JPanel(new GridBagLayout());
		
		
		JLabel label10=new JLabel(" ");
		Image img10 =new ImageIcon(this.getClass().getResource("/LOGO.png")).getImage();
		label10.setIcon(new ImageIcon(img10));
		
		
		JButton b=new JButton("500 tk");
		Font f1=new Font("Arial",Font.BOLD,25);
		b.setFont(f1);
		b.setBounds(10, 45, 200, 70);
		b.setBackground(Color.blue);
		b.setForeground(Color.WHITE);
		
		JButton c=new JButton("1000 tk");
		c.setFont(f1);
		c.setBounds(275, 45, 200, 70);
		c.setBackground(Color.blue);
		c.setForeground(Color.WHITE);
		
		JButton d=new JButton("5000 tk");
		d.setFont(f1);
		d.setBounds(10, 125, 200, 70);
		d.setBackground(Color.blue);
		d.setForeground(Color.WHITE);
		
		JButton e=new JButton("10000 tk");
		e.setFont(f1);
		e.setBounds(275, 125, 200, 70);
		e.setBackground(Color.blue);
		e.setForeground(Color.WHITE);
		
		JButton h=new JButton("15000 tk");
		h.setFont(f1);
		h.setBounds(10, 205, 200, 70);
		h.setBackground(Color.blue);
		h.setForeground(Color.WHITE);
		
		JButton g=new JButton("20000 tk");
		g.setFont(f1);
		g.setBounds(275, 205, 200, 70);
		g.setBackground(Color.blue);
		g.setForeground(Color.WHITE);
		
		JButton i=new JButton("Back");
		Image img13 =new ImageIcon(this.getClass().getResource("/bk.png")).getImage();
		i.setIcon(new ImageIcon(img13));
		Font f3=new Font("Arial",Font.BOLD,20);
		i.setFont(f3);
		//b.setBounds(10, 45, 200, 70);
		i.setBackground(Color.WHITE);
		i.setForeground(Color.BLACK);

		
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
		p5.add(i);
		
		p.add(b,gbc);//500
		
		p.add(c,gbc);//1000
		
		p.add(d,gbc);//5000
		
		p.add(e,gbc);//10000
		
		p.add(g,gbc);//15000
		
		p.add(h,gbc);//20000
		
		
		add(p,BorderLayout.CENTER);
		add(p4,BorderLayout.NORTH);
		add(p5,BorderLayout.SOUTH);
		
		b.addActionListener(new ActionListener() //500
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Please collect your money");

			}
		});
		c.addActionListener(new ActionListener() //1000
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Please collect your money");

			}
		});
		d.addActionListener(new ActionListener() //5000
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Please collect your money");

			}
		});
		e.addActionListener(new ActionListener() //10000
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Please collect your money");

			}
		});
		g.addActionListener(new ActionListener() //15000
				{
					
					@Override
					public void actionPerformed(ActionEvent e)
					{
						JOptionPane.showMessageDialog(null,"Please collect your money");

					}
				});
		h.addActionListener(new ActionListener() //20000
				{
					
					@Override
					public void actionPerformed(ActionEvent e)
					{
						JOptionPane.showMessageDialog(null,"Please collect your money");

					}
				});
		
	}

}

