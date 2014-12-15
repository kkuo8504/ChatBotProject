package chat.model;
/**
 * The name of the user
 * @author kkuo8504 version 1.0 11/24/2014.
 *
 */
public class User
{
	private String name;
	private String input;
	private String favoriteMovie;
	private int numberofChats;
	private int age;
	private boolean isTall;
	private boolean isBlonde;
	
	
	public User(String name)
	{
		this.name = "";
		this.age = 17;
		this.favoriteMovie = "";
		this.isBlonde = false;
		this.isTall = false;
		
	
		
	}
	
	public String getName()
	{
		return name;
	}
	public String getInput()
	{
		return input;
	}
	public String getFavoriteMovie()
	{
		return favoriteMovie;
	}
	public int getNumberofChats()
	{
		return numberofChats;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setInput(String input)
	{
		this.input = input;
	}
	public void setNumberofChats(int numberofChats)
	{
		this.numberofChats = numberofChats;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.name = name;
	}

	public void setFavoriteMovie(String processedText)
	{
		// TODO Auto-generated method stub
		
	}
	
}
