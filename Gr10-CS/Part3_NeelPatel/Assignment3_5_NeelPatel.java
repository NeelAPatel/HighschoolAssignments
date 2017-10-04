// The "Assignment3_5_NeelPatel" class.
import java.awt.*;
import hsa.Console;

public class Assignment3_5_NeelPatel
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();


	String Adjectives[] = {"cyan", "dark", "nice", "vivacious", "social", "perfect", "shiny", "hard", "beautiful", "horrible"};
	String Nouns[] = {"pie", "knife", "piano", "water", "vollyball", "shelf", "snow globe", "printer", "tea", "door"};
	String Verbs[] = {"ran", "dried", "spinned", "moisturised", "lighted", "cooked", "painted", "circled", "listened", "rocked"};
	String Adverbs[] = {"carefully", "quietly", "quickly", "happily", "dreadfully", "underground", "randomly", "eeriely", "already", "slowly"};

	// Example sentence

       // Sentence Syntax: 1. The [Adj][Noun][Verb][Adv].


	c.println ("How many random sentences would you like to generate?");
	int Gen = c.readInt ();
	c.clear();

	for (int x = 1 ; x <= Gen ; x++)
	{
	    int N = (int) (Math.random () * 10);
	    int Adj = (int) (Math.random () * 10);
	    int V = (int) (Math.random () * 10);
	    int Adv = (int) (Math.random () * 10);

	    c.println (x+". "+"The " + Adjectives [Adj] + " " + Nouns [N] + " " + Verbs [V] + " " + Adverbs [Adv] + ".");
	}





	// Place your program here.  'c' is the output console
    } // main method
} // Assignment3_5_NeelPatel class
