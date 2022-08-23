package devops.domain;

import org.apache.commons.net.whois.WhoisClient;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class WhoisTest {

    @Test
    public void test() throws Exception {
        WhoisClient whoisClient = new WhoisClient();
        whoisClient.connect(WhoisClient.DEFAULT_HOST);
        String query = whoisClient.query("cj.net");
        System.out.println("query = " + query);
    }

}
