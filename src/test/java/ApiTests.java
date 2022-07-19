import config.ApiConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ApiTests {

    @Test
    public void tokenTest() {
        ApiConfig config = ConfigFactory.create(ApiConfig.class, System.getProperties());

        assertThat(config.getToken()).isEqualTo("random_token");
    }

    @Test
    public void baseUrlTest() {
        ApiConfig config = ConfigFactory.create(ApiConfig.class, System.getProperties());

        assertThat(config.getBaseUrl()).isEqualTo("https://api.github.com");
    }
}
