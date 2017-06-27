package com.microsoft.mysearch.qa.util.xpathbuilder;

import com.google.inject.Singleton;

import java.util.Collections;
import java.util.LinkedList;

@Singleton
public class XPathValues implements IXPath {

    private LinkedList<String> xpathValuesList = new LinkedList<>();


    public XPathValues() {
        this.xpathValuesList = new LinkedList<>();
    }

    public XPathValues(XPathValues xPathValues) {
        this.xpathValuesList = xPathValues.xpathValuesList;
    }

    public XPathValues(LinkedList<String> xpathValuesList) {
        this.xpathValuesList = xpathValuesList;
    }

    public XPathValues(String value) {
        this.xpathValuesList = new LinkedList<String>() {{
            add(value);
        }};
    }

    public XPathValues(String value1, String value2) {
        this.xpathValuesList = new LinkedList<String>() {{
            add(value1);
            add(value2);
        }};
    }

    public XPathValues(String value1, String value2, String value3) {
        this.xpathValuesList = new LinkedList<String>() {{
            add(value1);
            add(value2);
            add(value3);
        }};
    }

    public XPathValues(String value1, String value2, String value3, String value4) {
        this.xpathValuesList = new LinkedList<String>() {{
            add(value1);
            add(value2);
            add(value3);
            add(value4);
        }};
    }

    public XPathValues(String[] values) {
        this.xpathValuesList = new LinkedList<>();
        Collections.addAll(this.xpathValuesList, values);
    }

    public int size(){
        return this.xpathValuesList.size();
    }



    public XPathValues add(LinkedList<String> xpathValuesList) {
        this.xpathValuesList.addAll(xpathValuesList);
        return this;
    }


    public XPathValues set(LinkedList<String> xpathValuesList) {
        this.xpathValuesList.addAll(xpathValuesList);
        return this;
    }
    
    public XPathValues set(String xpathValue) {
        this.xpathValuesList.add(xpathValue);
        return this;
    }


    public LinkedList<String> get() {
        return this.xpathValuesList;
    }


}