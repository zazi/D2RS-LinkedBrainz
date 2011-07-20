package translators;

import de.fuberlin.wiwiss.d2rq.values.Translator;
import java.lang.String;

import translators.util.Utils;

/**
 * @author kurtjx
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
		return rdfValue.replaceFirst("http://dbpedia.org/resource/",
				"http://wikipedia.org/wiki/");
	}

	public String toRDFValue(String dbValue)
	{
		if (Utils.cleanUpBaseURI(dbValue, "http://wikipedia.org/wiki/") != null)
		{
			return Utils.cleanUpBaseURI(dbValue, "http://wikipedia.org/wiki/")
					.replaceFirst("http://wikipedia.org/wiki/",
							"http://dbpedia.org/resource/");
		}
		// URI does not belong to this information service
		else
		{
			return null;
		}
	}
}
