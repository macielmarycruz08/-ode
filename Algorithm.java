class Algorithm
{
	int value = (int) (Math.random()*10);
	int guess = 5; # where 5 is the value that the user enters
	int count = 0;
	while (guess != value)
	{
   count++;

   # user enters another value for guess

   if (guess < value)
     System.out.println("no it is higher than that");

   # another 'if' guess is larger than value
   }
}

# show the user how many guesses it took to guess the value        
