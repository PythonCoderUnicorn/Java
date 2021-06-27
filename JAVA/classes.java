public class Monster
{
	public final String TOMBSTONE = " here lies a dead monster ";
	
	//------- fields
	private int health = 500;
	private int attack = 20;
	private int movement = 2;
	private int xPosition = 0;
	private int yPosition = 0;
	private boolean alive = true;
	//-------------
	
	public String name = "Big Monster";
	
	public int getAttack() // Methods
	{
		return attack; // allows person to see attack value but not access to value
	}
	
	public int getMovement()
	{
		return movement;
	}

	public int getHealth()
	{
		return health;
	}
	
	public void setHealth(int decreaseHealth)
	{
		health = health - decreaseHealth;
		if(health < 0)
		{ alive = false; }
	}

	public void setHealth(double decrease) 
	// overloading methods, must have diff attributes
	{ 
		int intDecreaseHealth = (int) decreaseHealth;
		health = health - intDecreaseHealth;
		if(health <0)
		{ alive = false;	}
	}

	// constructor method
	public Monster(int newHealth, int newAttack, int newMovement)
	{
		health = newHealth; // can use: this.health = newHealth
		attack = newAttack; // 				  this.attack = newAttack
		movement = newMovement; // 		  this.movement = newMovement
	}
	
	// default constructor
	public Monster()
	{
		
	}
	
	/*
	public Monster(int newHealth)
	{	health = newhealth; }
	
	public Monster(int newHealth, int newAttack)
	{ this(newHealth);
		attack = newAttack;
	}
	*/


}
