package translators;

import de.fuberlin.wiwiss.d2rq.values.Translator;
import java.lang.String;

import translators.util.Utils;

/**
 * 
 * @author zazi
 * 
 */
public class WikipediaTranslator implements Translator
{

	public WikipediaTranslator()
	{

	}

	public String toDBValue(String rdfValue)
	{
 		// should already be formatted 
		return rdfValue;
	}

	public String toRDFValue(String dbValue)
	{
		if (Utils.cleanUpBaseURI(dbValue, "http://wikipedia.org/wiki/") != null)
		{
			// clean up the base URI
			return Utils.cleanUpBaseURI(dbValue, "http://wikipedia.org/wiki/");
		}
		// URI does not belong to this information service
		else
		{
			return null;
		}
	}
}
