package chat.view;

import javax.swing.JFrame;

import chat.controller.ChatAppController;
/**
 * The ChatBot frame that holds the frame constraints.
 * @author kkuo8504 Is the man.
 * @version 1.2
 */
public class ChatBotFrame extends JFrame
{
	/**
	 * Creates a panel for the frame to put constraints on.
	 */
	private ChatBotPanel basePanel;
	/**
	 * The frame you see when you start the code.
	 * @param baseController Is the ChatAppController.
	 */
	public ChatBotFrame(ChatAppController baseController)
	{
		basePanel = new ChatBotPanel(baseController);
		setupFrame();
	}
	/**
	 * This puts the frames constraints.
	 */
	private void setupFrame()
	{
		
		this.setContentPane(basePanel);
		this.setSize(400, 400);
		this.setResizable(false);
		this.setVisible(true);
	}

}
