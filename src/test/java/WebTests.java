import config.WebConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.assertj.core.api.Assertions.assertThat;

public class WebTests {

    @Test
    public void webLocalTest () {
        System.setProperty("env", "local");
        WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());

        assertThat(config.getBaseUrl()).isEqualTo("https://github.com");
        assertThat(config.getBrowser()).isEqualTo("CHROME");
        assertThat(config.getBrowserVersion()).isEqualTo("100");
    }

    @Test
    public void webRemoteTest () throws MalformedURLException {
        System.setProperty("env", "remote");
        WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());

        assertThat(config.getBaseUrl()).isEqualTo("https://github.com");
        assertThat(config.getBrowser()).isEqualTo("CHROME");
        assertThat(config.getBrowserVersion()).isEqualTo("99");
        assertThat(config.getRemoteUrl()).isEqualTo(new URL("https://user1:1234@selenoid.autotests.cloud/wd/hub/"));

    }

}
