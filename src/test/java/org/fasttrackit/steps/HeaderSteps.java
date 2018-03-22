package org.fasttrackit.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.fasttrackit.TestBase;
import org.fasttrackit.webviews.Header;
import org.openqa.selenium.support.PageFactory;

public class HeaderSteps extends TestBase {

    private Header header = initElements(Header.class);

    //proprietatile de clasa din steps nu sunt comune pentru mai multi stepts

    @And("^I search a product by \"([^\"]*)\"$")
    public void iSearchAProductBy(String keyword) {
        //.+ face match la orice
    header.search(keyword);

    }

}
