package chat.controller;

import java.awt.Component;

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
