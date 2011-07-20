package translators;

import translators.util.BaseUriTranslator;

/**
 * This translator translates MySpace specific page URLs into DBTune specific
 * resource URIs.
 * 
 * @author kurtjx
 * @author zazi
 * 
 */
public class DBTuneMySpaceTranslator extends BaseUriTranslator
{
	public static final String ORIGINAL_BASE_URI = "http://myspace.com/";
	public static final String LINKED_DATA_BASE_URI = "http://dbtune.org/myspace/";

	public DBTuneMySpaceTranslator()
	{
		super(ORIGINAL_BASE_URI, LINKED_DATA_BASE_URI);
	}
}
