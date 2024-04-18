package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HandlersTests extends BaseTest{

    @Test
    public void tabSwitchTest() {
        handlersPage.navigateToHandlersPage();

        handlersPage.clickBtnNewTab();

        Set<String> allHandlers = handlersPage.getAllHandlers(2);
        List<String> list = new ArrayList<String>(allHandlers);
        handlersPage.switchToHandlerByString(list.get(1));
        // C7BD6EF05B623300986775CDDDFC7335
        System.out.println(allHandlers.toArray()[1]);
        System.out.println(list.get(1));

        String textSecondHandler = handlersPage.getTextNewTabHandlerH1();
        System.out.println(textSecondHandler);
        Assert.assertEquals(textSecondHandler, "This is a sample page");
    }
}
