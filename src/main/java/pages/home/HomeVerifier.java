package pages.home;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static pages.home.HomeElement.getHomeElement;

public class HomeVerifier {

    HomeElement homeElement = getHomeElement();

    public HomeVerifier() {
    }

    public void verifyUserImageDisplayed() {
        assertTrue(homeElement.USER_IMAGE.isDisplayed());
    }
}
