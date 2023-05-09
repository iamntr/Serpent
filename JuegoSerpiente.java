package dev.discord.ProjectSerpent;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class JuegoSerpiente extends JFrame
{
	JuegoSerpiente() 
	{
		this.add(new Pantalla());
		this.setTitle("PornHub");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);

	}
}
