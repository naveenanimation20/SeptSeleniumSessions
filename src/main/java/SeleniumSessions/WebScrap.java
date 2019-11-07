package SeleniumSessions;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebScrap {

	public static void main(String[] args) throws IOException {

		
		Document doc = Jsoup.connect("https://app.hubspot.com/login").get();
		System.out.println(doc.title());
		Elements newsHeadlines = doc.select("#mp-itn b a");
		for (Element headline : newsHeadlines) {
			System.out.println(headline.attr("title")+ " "+ headline.absUrl("href"));
		}
		
		
		
	}

}
