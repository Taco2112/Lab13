import java.security.MessageDigest;

public class Util
{

	public static int randomInt( int min, int max )
	{

		int range = max - min;

		int randomNum = (int) ( ( Math.random( ) * range ) + min );

		return randomNum;

	}


}
