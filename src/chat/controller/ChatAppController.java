package chat.controller;

import java.awt.Component;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;
/**
 * Application Controller for the ChatBOt String manipulation project. Responsible for controlling the View and Model packages.
 * @author Keith Kuo
 * @version 1.4 11/4/2014 Changed for the GUI reference
 */








import chat.model.ChatBot;
import chat.view.ChatBotFrame;
import chat.view.ChatBotPanel;
import chat.view.ChatBotView;

public class ChatAppController
{
	/**
	 * The GUI view for the application.
	 */
	private ChatBotView appView;
	/**
	 * The ChatBot Model instance.
	 */
	private ChatBot notSoCleverBot;
	/**
	 * The startup message for our ChatBot application.
	 */
	private String startMessage;
	/**
	 * GUI frame for the application.
	 */
	private ChatBotFrame baseFrame;

	/**
	 * Creates a ChatAppController and initializes the associated View and Model
	 * objects.
	 */
	public ChatAppController()
	{
		appView = new ChatBotView(this);
		baseFrame = new ChatBotFrame(this);
		notSoCleverBot = new ChatBot("Mr. not so clever");
		startMessage = "Welcome to the " + notSoCleverBot.getName() + " ChatBot, type in you name.";
	}

	/**
	 * Allows other objects access to the notSoCleverBot.
	 * 
	 * @return The ChatBot for this app.
	 */
	public ChatBot getNotSoCleverBot()
	{
		return notSoCleverBot;
	}

	/**
	 * Starts the ChatBot application.
	 */
	public void start()
	{
/**
 * Transmits information from the View package to the ChatBot.
 */
		String message = appView.displayChatBotConversations(startMessage);

		// ChatBotPanel myAppPanel = (ChatBotPanel) baseFrame.getContentPane();
		// myAppPanel.displayTextToUser(startMessage);

		// ((ChatBotPanel)
		// baseFrame.getContentPane()).displayTextToUser(startMessage);

		String message1 = notSoCleverBot.processText(startMessage);
		message1 = appView.displayChatBotConversations(message1);

	}

	public String sendTextToChatBot(String userInput)
	{
		String respondText = "";

		respondText = notSoCleverBot.processText(userInput);
		
		return respondText;
	}
	
	public void saveText(String conversation, boolean appendToEnd)
	{
		String fileName = "/Users/kkuo8504/Documents/saved text.txt";
		
		PrintWriter outputWriter;
		
		if(appendToEnd)
		{
			try
			{
				outputWriter = new PrintWriter(new BufferedWriter(new FileWriter(fileName, appendToEnd)));
				outputWriter.append(conversation);
				outputWriter.close();
			}
			catch(FileNotFoundException noFileIsThere)
			{
				JOptionPane.showMessageDialog(baseFrame, "There is no file there");
			}
			catch(IOException inputOutputError)
			{
				JOptionPane.showMessageDialog(baseFrame, "There is no file there");
				JOptionPane.showMessageDialog(baseFrame, inputOutputError.getMessage());
			}
		}
		else
		{
			try
			{
				outputWriter = new PrintWriter(fileName);
				outputWriter.println(conversation);
				outputWriter.close();
			}
			catch(FileNotFoundException noFileIsThere)
			{
				JOptionPane.showMessageDialog(baseFrame, "There is no file there");
			}
		}
	}
	/**
	 * Reads text from a file on the hard drive. Returns the contents of the file as a String
	 * @return The contents of the file.
	 */
	public String readTextFromFile()
	{
		String fileText ="";
		String filePath = "/Users/kkuo8504/Documents/";
		String fileName = filePath + "saved text.txt";
		File inputFile = new File(fileName);
		
		try
		{
			Scanner fileScanner = new Scanner(inputFile);
			
			while(fileScanner.hasNext())
			{
				fileText += fileScanner.nextLine() + "\n";
			}
			
			fileScanner.close();
		}
		catch(FileNotFoundException fileException)
		{
			JOptionPane.showMessageDialog(baseFrame,"The file is not here");
		}
			return fileText;
		
	}

	/**
	 * Quits the ChatBot application with a message to the user that the
	 * application is closing.
	 */
	private void quit()
	{
		appView.displayInformation("Goodbye cruel user :(");
		System.exit(0);
	}
/**
 * 
 * @return
 */
//	public Component getBaseFrame()
//	{
		
//		return null;
//	}

}
