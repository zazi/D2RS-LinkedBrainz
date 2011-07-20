package translators;

import translators.util.BaseUriCleanUpTranslator;

/**
 * 
 * @author zazi
 * 
 */
public class MySpaceTranslator extends BaseUriCleanUpTranslator
{
	public static final String ORIGINAL_BASE_URI = "http://myspace.com/";

	public MySpaceTranslator()
	{
		super(ORIGINAL_BASE_URI);
	}
}
