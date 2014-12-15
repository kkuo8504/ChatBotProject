package chat.model;

import java.util.ArrayList;

public class ChatBot
{
	private String name;
	private int numberOfChats;
	private ArrayList<String> memeList;
	private ArrayList<String> userInputList;
	private String contentArea;
	private User myUser;

	/**
	 * Creates a ChatBot object with a specified name. Initializes the total
	 * chats to 0.
	 * 
	 * @param name
	 *            The name of the ChatBot.
	 */

	public ChatBot(String name)
	{
		this.name = name;
		numberOfChats = 0;

		userInputList = new ArrayList<String>();
		memeList = new ArrayList<String>();
		contentArea = "";
		fillTheMemeList();

	}

	/**
	 * It receives the name that the String is assigned.
	 * 
	 * @return Returns set name.
	 */
	public String getName()
	{
		return this.name;
	}

	/**
	 * It receives the NumberOfChats.
	 * 
	 * @return Returns the current numberOfChats.
	 */
	public int getNumberOfChats()
	{
		return numberOfChats;
	}

	/**
	 * The setName allows the user to change the name of ChatBot.
	 * 
	 * @param name
	 *            New name of the ChatBot.
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * Counts the number of chats.
	 */
	public void incrementChats()
	{
		numberOfChats++;
	}

	/**
	 * Fills the contents of the memeList with internet memes.
	 */
	private void fillTheMemeList()
	{
		memeList.add("y u mad bro?");
		memeList.add("doh!");
		memeList.add("Where's my Nobel Prize?");
		memeList.add("Pass? Just get the rebound.");
		memeList.add("Real Life? Never heard of that server.");
		memeList.add("Ever heard of me?");

	}

	/**
	 * Processes the supplied text from the user to provide a message from the
	 * ChatBot.
	 * 
	 * @param userText
	 *            The user supplied text.
	 * @param chatCount 
	 * @return What the ChatBot says because of the supplied input.
	 */
	public String processText(String userText, int chatCount)
	{
		String processedText = "";
		incrementChats();

		int randomChoice = (int) (Math.random() * 6);
		if (userText != null && userText.length() > 0)
		{
			if(numberOfChats <5)
			{
				processedText = introduceUser(userText);
			}
			else
			{
				processedText = randomChatTopic(userText);
			}
		}
		else
		{
			numberOfChats--;
			processedText = "Answer the question!!!";
		}
		incrementChats();
		return processedText;
	
			String input;
			if (randomChoice == 0)
			{
				myUser.setName(userText);
				processedText = "Hello " + myUser.getName() + " what is your age?";
			}
			else if(numberOfChats ==1)
			{
				int age = Integer.parseInt(userText);
				myUser.setAge(age);
				processedText ="Hello " + myUser.getName() + "you are really " + myUser.getAge() +" years old?";
				processedText ="\nWhat is your favorite movie?";
			}
			else if(numberOfChats ==2)
			{
				myUser.setFavoriteMovie(input);
				userText = myUser.getName() + ", you really liked " + myUser.getFavoriteMovie();
				userText += "??? Weird!\n Are you pierced?";
					
				
			}
			else if(numberOfChats == 3)
			{
				boolean isPierced = Boolean.parseBoolean(input);
				myUser.setPierced(isPierced);
				
				
			}
			else if(numberOfChats == 4)
			{	
				userInputList.add(0, userText);
				processedText = "Thanks for the input" + myUser.getName();
			}
			else if(numberOfChats == 5)
			{
				
			}
				
				private String randomChatTopic(String userInput)
				{
				
					String randomTopic ="";
					int randomChoice1 =(int)(Math.random() *7);
					if (randomChoice1 ==0)
				{			
				if (stringLengthChecker(userText))
				{
					processedText = "that is way too long to read";
				}
				else
				{
					processedText = "short messages are short.";
				}
			
			else if (randomChoice1 == 1)
			{
				if (contentChecker(userText))
				{
					processedText = "you know that the secret involves: " + userText;
				}
				else
				{
					processedText = "";
				}
			}
			else
			
				if (memeChecker(userText))
				{
					processedText = "hey, you found a meme: " + userText;
					processedText += " isn't that cool.";
				}
				else
				{
					processedText = "Boring, that wasn't a meme.";
				}
		
			
			
				
//				else String randomTopic;
					
				if(randomChoice1 == 3)
				{
					if (chatCount < 10)
					{
						processedText = "";
					}
					//User based talking
				}
				else if(randomChoice1 ==4)
				{
					//userInput list add
					userInputList.add(0, userText);
				}
				else if(randomChoice1 == 5)
					
				if(userInputChecker(userText))
				{
					randomTopic = "Yikes you knew what you said before!!!";
				}
				else
				{
					
				}
				
					
					if(chatBotNameChecker(userText))
					{
						randomTopic = noNameConversation(userText);
					}
			}
				

			
		

	





				
		return processedText;
		}
}

	private boolean userInputChecker(String input)
	{
		boolean matchesInput = false;

		if (userInputList.size() > 0)
		{
			for (int loopCount = 0; loopCount < userInputList.size(); loopCount++)
			{
				if (input.equalsIgnoreCase(userInputList.get(loopCount)))
				{
					matchesInput = true;
					userInputList.remove(loopCount);
					loopCount--;
				}
			}
		}

		return matchesInput;
	}

	/**
	 * Check if the supplied String has the current amount of user inputs in the
	 * conversation
	 * 
	 * @param input
	 *            The user supplied String
	 * @return Whether the ChatBot's content area has reached its maximum input
	 */
	private boolean stringLengthChecker(String input)
	{
		boolean isTooLong = false;
		if (input.length() >= 50)
			;
		{
			isTooLong = true;
		}
		return isTooLong;
	}

	/**
	 * Checks to see if the supplied user text matches any of the texts in the
	 * ChatBot's text list.
	 * 
	 * @param input
	 *            The user supplied text.
	 * @return Whether the String matched any of the built in texts.
	 */
	private boolean contentChecker(String input)
	{
		boolean hasMyContent = false;
		if (input.contains(contentArea))
		{
			hasMyContent = true;
		}
		return hasMyContent;
	}

	/**
	 * Checks to see if the supplied user text matches any of the memes in the
	 * ChatBot's meme list.
	 * 
	 * @param currentText
	 *            The user supplied text.
	 * @return Whether the String matched any of the built in memes.
	 */
	private boolean memeChecker(String currentText)
	{
		boolean isAMeme = false;

		for (String currentMeme : memeList)
		{
			if (currentMeme.equalsIgnoreCase(currentText))
			{
				isAMeme = true;
			}
		}

		for (int loopCount = 0; loopCount < memeList.size(); loopCount++)
		{
			if (memeList.get(loopCount).equalsIgnoreCase(currentText))
			{
				isAMeme = true;
			}
		}

		return isAMeme;
	}

	/**
	 * Checks the input to validate the command to quit.
	 * 
	 * @param input
	 *            The command input whether to quit the program or not.
	 * @return Closes all programs, returns to program screen.
	 */
	public boolean quitChecker(String input)

	{
		boolean okToQuit = false;

		if (input != null && input.equalsIgnoreCase("no"))
		{
			okToQuit = true;
		}
		return okToQuit;

	}

	/**
	 * Checks to see if the name of the ChatBot is used inside within the String
	 * supplied by the user.
	 * 
	 * @param currentInput
	 *            The user supplied String.
	 * @return Whether the name is inside or not.
	 */
	public boolean chatBotNameChecker(String currentInput)
	{
		boolean hasNameInString = false;

		if (currentInput.indexOf(this.getName()) > -1)
		{
			hasNameInString = true;
		}

		return hasNameInString;
	}

	private String chatBotNameConversation(String currentInput)
	{
		String nameConversation = "This is what you typed after my name: ";

		nameConversation += currentInput.substring(currentInput.indexOf(this.getName()) + this.getName().length() - 1);

		return nameConversation;
	}

	private String noNameConversation(String currentInput)
	{
		String notNamed = "";

		int smallRandom = (int) (Math.random() * currentInput.length() / 2);
		int largeRandom = (int) (smallRandom + (Math.random() * currentInput.length() / 2) + 1);

		notNamed = "You didn't say name so here is a special phrase: " + currentInput.substring(smallRandom, largeRandom);

		return notNamed;
	}

}
