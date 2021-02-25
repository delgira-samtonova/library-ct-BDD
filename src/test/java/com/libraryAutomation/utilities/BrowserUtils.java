package com.libraryAutomation.utilities;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {

    //create method name: wait
    //converting milliseconds to seconds
    //handle checked exception

    public static void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            System.out.println("something happened in sleep method");

        }
    }

    public static List<String> getElementText(List<WebElement> webElements) {
        List<String> webElementsStrings = new ArrayList<>();
        for (WebElement eachElement : webElements) {
            webElementsStrings.add(eachElement.getText());
        }

        return webElementsStrings;
    }
    public static List<String> translateToStrList(List<WebElement> list){
        List<String> strList = new ArrayList<>();
        for (WebElement element : list) {
            strList.add(element.getText());
        }
        return strList;
    }
}
