package translators;

import translators.util.BaseUriCleanUpTranslator;

/**
 * 
 * @author zazi
 * 
 */
public class WikipediaTranslator extends BaseUriCleanUpTranslator
{
	public static final String ORIGINAL_BASE_URI = "http://wikipedia.org/wiki/";
	
	public WikipediaTranslator()
	{
		super(ORIGINAL_BASE_URI);
	}
}
