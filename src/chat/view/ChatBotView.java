package chat.view;

import javax.swing.JOptionPane;

import chat.controller.ChatAppController;
/**
 * The GUI for the ChatBot project.
 * @author kkuo8504
 *
 */
public class ChatBotView
{

	private ChatAppController baseController;

	public ChatBotView(ChatAppController baseController)
	{
		this.baseController = baseController;
	}

	/**
	 * Displays the supplied String parameter to the user via popup and returns
	 * the users response to the controller.
	 * 
	 * @param input The supplied text to be displayed.
	 * @return The users input.
	 */

	public String displayChatBotConversations(String input)
	{
		String output = "";

//		output = JOptionPane.showInputDialog(null, input);

		return output;
	}

	/**
	 * Displays the supplied input via a popup window.
	 * 
	 * @param input
	 *            The text to be displayed.
	 */
	public void displayInformation(String input)
	{
		JOptionPane.showMessageDialog(null, input);
	}
}
