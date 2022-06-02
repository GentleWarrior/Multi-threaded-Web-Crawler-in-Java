 package WebCrawler;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<webCrawler> bots = new ArrayList<>();
		bots.add(new webCrawler("https://abcnews.go.com", 1));
		bots.add(new webCrawler("https://www.npr.org", 2));
		bots.add(new webCrawler("https://www.nytimes.com", 3));
		
		for(webCrawler w : bots) {
			try {
				w.getThread().join();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
