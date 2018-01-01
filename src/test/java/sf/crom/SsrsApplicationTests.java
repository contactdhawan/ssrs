package sf.crom;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import junit.framework.Assert;
import sf.crom.web.i18n.I18NService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SsrsApplicationTests {

	@Autowired
	I18NService i18NService;

	@Test
	public void testMessageByLocaleService() {

		String actualMessage = i18NService.getMessage("index.h1.callout");
		String expectedMessage = "Shiv Shakti Rolling Shutters & Engg. Works";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

}
