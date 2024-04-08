package pages;

public class MainPage extends BasePage{

    String elementsCardClick = "document.querySelector(\".card-body\").click();";

    public void openElementsPage() {
        jsExecutor(elementsCardClick);
    }
}
