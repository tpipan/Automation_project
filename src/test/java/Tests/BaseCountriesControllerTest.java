package Tests;

import Utils.ConstantUtils;
import Utils.GenericUtils;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

    public class BaseCountriesControllerTest {

        String apiConfig = ConstantUtils.CONFIG_FILE;
        String apiVersion, baseUrl;

        @BeforeClass
        public void setUp() {
            apiVersion = GenericUtils.getApiVersion(apiConfig, "apiVersion");
            baseUrl = GenericUtils.getBaseUrl(apiConfig,
                    "protocol", "hostname");
            System.out.println("Use this baseurl:" + baseUrl);
            System.out.println("Use this apiVersion:" + apiVersion);
            RestAssured.baseURI = baseUrl + "/" + apiVersion;
        }
    }

