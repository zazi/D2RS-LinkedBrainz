package translators;

import translators.util.Utils;
import de.fuberlin.wiwiss.d2rq.values.Translator;

/**
 * This translator translates MySpace specific page URLs into DBTune specific
 * resource URIs.
 * 
 * TODO: implementing a proper URL clean-up task (everything should have a
 * http://myspace.com/-based URL at the end before transferring this URL)
 * 
 * @author kurtjx
 * @author zazi
 * 
 */
public class MySpaceTranslator implements Translator
{

	public MySpaceTranslator()
	{

	}

	public String toDBValue(String rdfValue)
	{
		return rdfValue.replaceFirst("http://dbtune.org/myspace/",
				"http://myspace.com/");
	}

	public String toRDFValue(String dbValue)
	{
		if (Utils.cleanUpBaseURI(dbValue, "http://myspace.com/") != null)
		{
			return Utils.cleanUpBaseURI(dbValue, "http://myspace.com/")
					.replaceFirst("http://myspace.com/",
							"http://dbtune.org/myspace/");
		} 
		// URI does not belong to this information service
		else
		{
			return null;
		}
	}
}
