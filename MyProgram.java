public class MyProgram extends ConsoleProgram
{
    public String[] Index = {"Rock", "Paper", "Scissors"};//The index of options the opponent has
    public String oppoGuess;// Variable to assign the random index element
    public int maxCount;// Max Rounds player can play
    public int count;// Current count of rounds
    public int winCount;//Variables to represent the amount of wins had.\
    public int roundCount; //How many rounds happened?
    
    
    public void run()
    {
            Randomizer rnd = new Randomizer();//Init Randomizer
            maxCount = readInt("How many rounds would you like to play? "); // Ask for how many rounds they would like to play
            while(count <= maxCount)// Game Loop // While rounds played is less than the maxCount/winCount, play the game
            {
            int n = rnd.nextInt(Index.length);// Get random element from array
            oppoGuess = Index[n];// Set the variable to the random element
            rps_shoot();//Say Rock Paper Scissors
            String guess = readLine("Chose your gesture: ");// Have the player input their guess/gesture
            oppoGuess(guess);//Pass the guess and check if player won or not
            }
            
            System.out.println("Thanks for Playing! Win Count: " + winCount + " Loss Count: " + (maxCount - winCount));
        
       
    }
    //Function that says the catchphrase  
    public void rps_shoot()
    {
        System.out.println("Rock!");
        System.out.println("Papers!");
        System.out.println("Scissors!");
        System.out.println("Shoot!");
        
    }
    //Check if Player has won
    public void oppoGuess(String guess)
    {
        System.out.println("The opponent guess is: " + oppoGuess);
        
        //If the opponent  has the same guess as player, tie.
        if(guess.equals(oppoGuess) == true)
        {
            System.out.println("Tie");
            return;//Return the function of tied.
        }
        //Switch case for checking
        switch(guess)
        {
            case "Rock":
                
                if(oppoGuess == "Paper")
                {
                    System.out.println("Opponent Wins!");
                } else 
                {
                    System.out.println("Opponent Loses!");
                    winCount++;
                }
                
                break;
            case "Paper":
                if(oppoGuess == "Scissors")
                {
                    System.out.println("Opponent Wins!");
                } else
                {
                    System.out.println("Opponent Loses!");
                    winCount++;
                   
                }
                break;
            case "Scissors":
                if(oppoGuess == "Rock")
                {
                    System.out.println("Opponent Wins!");
                } else
                {
                    System.out.println("Opponent Loses!");
                    winCount++;
                }
                break;
        }
        count++;
    }

}