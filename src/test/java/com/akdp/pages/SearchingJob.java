package com.akdp.pages;

import com.akdp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchingJob {

    public SearchingJob(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy (xpath="(//a[text()='Newsroom'])")
    public WebElement neewsRoomBtn;


    @FindBy(xpath = "(//a[@title='Kundenstorys'])")
    public WebElement kundenStorysBtn;



}
