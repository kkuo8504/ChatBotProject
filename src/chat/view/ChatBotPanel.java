package chat.view;

import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import chat.controller.ChatAppController;
/**
 * 
 * @author kkuo8504
 * @version 1.2 Added method calls to listener for CHat Bot. Method for sending information to the panel from to the Controller. 
 */

public class ChatBotPanel extends JPanel

{
	/**
	 * Shows what is in the ChatBot Panel.
	 */
	private ChatAppController baseController;
	private JButton sampleButton;
	private JButton theButton;
	private JTextField sampleField;
	private JTextArea chatArea;
	private JScrollPane chatPane;
	private SpringLayout baseLayout;
	

	/**
	 * What the panel has as of contents.
	 * 
	 * @param baseController
	 *            is the ChatAppController.
	 */
	public ChatBotPanel(ChatAppController baseController)
	{
		this.baseController = baseController;
		sampleButton = new JButton("Click");
//		theButton = new JButton("Who's your daddy?");
		sampleField = new JTextField(25);
		chatArea = new JTextArea(5,25);
		chatArea.setForeground(Color.BLACK);
		chatArea.setBackground(Color.WHITE);
		chatPane = new JScrollPane(chatArea);
		

		baseLayout = new SpringLayout();
		
		
		
		setupScrollPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	/**
	 * This makes the text flow down normally instead of piling up and making a mess
	 */
	private void setupScrollPane()
	{
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
		chatArea.setEditable(false);
	}

	/**
	 * Sets the constraints of the panel.
	 */
	private void setupPanel()
	{
		this.setBackground(Color.BLACK);
		this.setLayout(baseLayout);

		this.add(sampleButton);
		this.add(sampleField);
		this.add(chatPane);
		
	}

	/**
	 * Shows where the button and Chat box is located on the panel.
	 */
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, chatPane, 100, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, chatPane, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, chatPane, 390, SpringLayout.WEST, this);
		
		baseLayout.putConstraint(SpringLayout.NORTH, sampleButton, -1, SpringLayout.NORTH, sampleField);
		baseLayout.putConstraint(SpringLayout.WEST, sampleButton, 34, SpringLayout.EAST, sampleField);
		baseLayout.putConstraint(SpringLayout.WEST, sampleField, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, sampleField, -30, SpringLayout.SOUTH, this);
		
//		baseLayout.putConstraint(SpringLayout.SOUTH, theButton, -26, SpringLayout.NORTH, chatPane);
//		baseLayout.putConstraint(SpringLayout.NORTH, theField, 1, SpringLayout.NORTH, theButton);
//		baseLayout.putConstraint(SpringLayout.WEST, theField, 22, SpringLayout.EAST, theButton);
//		baseLayout.putConstraint(SpringLayout.WEST, theButton, 0, SpringLayout.WEST, sampleField);
	}

	/**
	 * 
	 */
	private void setupListeners()
	{
		sampleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String userTypedText = sampleField.getText();
				String chatbotResponse = baseController.sendTextToChatBot(userTypedText);
				displayTextToUser(userTypedText);
				displayTextToUser(chatbotResponse);
				sampleField.setText("");
				
				
//				JOptionPane.showMessageDialog(baseController.getBaseFrame(), "Hello! :)");
			}
		});
//		theButton.addActionListener(new ActionListener()
//		{
//			public void actionPerformed(ActionEvent click)
//			{
//				theField.setText(theField.getText () + " ME!");
//			}
//		});

	}
	
	public void displayTextToUser(String input)
	{
		chatArea.append("\n" + input);
		
	}
	
	loadButton.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent click)
		{
			
		}
		
	});
}
