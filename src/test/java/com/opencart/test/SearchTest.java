package com.opencart.test;

import com.opencart.base.BaseTest;
import com.opencart.model.HomePage;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest {

    @Test
    @Story("Search field")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify the search field visibility")
    public void testSearchFieldVisibility() {
        boolean isSearchFieldVisible = new HomePage(getDriver())
                .isSearchFieldVisible();

        Allure.step("Verify the Search field is visible");
        Assert.assertTrue(isSearchFieldVisible, "The Search field is not visible");
    }
}