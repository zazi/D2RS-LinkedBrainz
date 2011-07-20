package translators;

import translators.util.BaseUriCleanUpTranslator;

/**
 * 
 * @author zazi
 * 
 */
public class YouTubeTranslator extends BaseUriCleanUpTranslator
{
	public static final String ORIGINAL_BASE_URI = "http://youtube.com/";

	public YouTubeTranslator()
	{
		super(ORIGINAL_BASE_URI);
	}
}
