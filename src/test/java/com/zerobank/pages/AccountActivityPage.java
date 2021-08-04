package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class AccountActivityPage {

        public AccountActivityPage(){
            PageFactory.initElements(Driver.getDriver(),this);
        }
}
