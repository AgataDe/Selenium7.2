import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TitleTest extends BaseTest {

    @Test
    @DisplayName("Testing Website titles")
    @Tag("Regression")
    public void shouldValidateCorrectWebsiteTitles() {
        String actualTitle = driver.getTitle();
        logger.info("Actual title is: " + actualTitle);
        logger.info("Expected title is: " + System.getProperty("title"));
        assertThat(actualTitle).isEqualTo(System.getProperty("title"));
    }
}
