package com.GUI.dome01;
import java.awt.*;
import java.net.*;

import javax.swing.*;

public class MyImageIcon extends JFrame {

	private static final long serialVersionUID = 1L;

	public MyImageIcon() {
		Container container = getContentPane();
		// ??????????
		JLabel jl = new JLabel("???????JFrame????", JLabel.CENTER);
		// ??????????URL
		URL url = MyImageIcon.class.getResource("imageButton.jpg");
		Icon icon = new ImageIcon(url); // ?????Icon????
		jl.setIcon(icon); // ??????????
		// ????????????????м?
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		jl.setOpaque(true); // ??????????????
		container.add(jl); // ???????????????
		setSize(250, 100); // ????????С
		setVisible(true); // ???????
		// ???????????
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[]) {
		new MyImageIcon(); // ?????MyImageIcon????
	}
}
