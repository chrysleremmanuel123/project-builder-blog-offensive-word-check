package utility;

import model.Blog;

public class CheckBlogPost extends OffensiveWordsChecker implements OffensiveWordsInterface {
	String[] offensiveWords = {"assbag",
			"assbandit",
			"assbang",
			"assbanged",
			"assbanger",
			"assbangs",
			"assbite",
			"assclown",
			"asscock",
			"asscracker",
			"asses",
			"assface",
			"assfaces",
			"assfuck",
			"assfucker",
			"ass-fucker",
			"assfukka",
			"assgoblin",
			"assh0le",
			"asshat",
			"ass-hat",
			"asshead",
			"assho1e",
			"asshole",
			"assholes",
			"asshopper",
			"ass-jabber",
			"assjacker",
			"asslick",

			"asswipes"};

	int length = offensiveWords.length;


	public boolean checkBlogTitle(Blog blog) {
		String title = blog.getBlogTitle();
		for(int i=0;i<offensiveWords.length;i++) {

			if(offensiveWords[i].equals(title)) {
				System.out.println("Offensive word found");
				return true;
			}


		}

		return false;
	}



	public boolean checkBlogDescription(Blog blog) {
		for(int i=0;i<offensiveWords.length;i++) {
			if(offensiveWords[i].equals(blog.getBlogDescription())) {
				return false;
			}


		}
		return true;
	}

	@Override
	public boolean checkBlog(Blog blog) {
	if(checkBlogTitle(blog)&& checkBlogDescription(blog)) 
		return false;
	else
		return true;
	}

}