package NopCucumber;
import org.openqa.selenium.By;

public class GuestComments extends Utils
        {
            LoadProp loadProp = new LoadProp();
            private By _detailsButtonAboutNop = By.xpath("//div[3]/div[3]/a[@class=\"read-more\"]");
            private By _enterTitle = By.xpath("//input[@class=\"enter-comment-title\"]");
            private By _enterComments = By.xpath("//textarea[@class=\"enter-comment-text\"]");
            private By _submitNewComments = By.xpath("//input[@class=\"button-1 news-item-add-comment-button\"]");
            private String title = loadProp.getProperty("Title");
            private String comments = loadProp.getProperty("Comments");

            public void addComments()
{
    clickonElement(_detailsButtonAboutNop);
    try { Thread.sleep(5000); } catch (InterruptedException e) {  e.printStackTrace(); }

    // enter Title of the comments
    enterText(_enterTitle,title);
    try { Thread.sleep(5000); } catch (InterruptedException e) {  e.printStackTrace(); }

    // enter comments
    enterText(_enterComments,comments);

    // click on submit news button
    clickonElement(_submitNewComments);
}
}