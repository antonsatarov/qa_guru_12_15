package config;

import org.aeonbits.owner.Config;

import java.net.URL;

@Config.Sources({
        "classpath:config/${env}.properties"
})
public interface WebConfig extends Config {

    @Key("browser")
    @DefaultValue("CHROME")
    String getBrowser();

    @Key("browser.version")
    @DefaultValue("100.0")
    String getBrowserVersion();

    @Key("base.url")
    @DefaultValue("https://github.com")
    String getBaseUrl();

    @Key("remote.url")
    URL getRemoteUrl();

}
