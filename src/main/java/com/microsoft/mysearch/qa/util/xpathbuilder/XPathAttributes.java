package com.microsoft.mysearch.qa.util.xpathbuilder;

import com.google.common.collect.LinkedListMultimap;
import com.google.inject.Singleton;
import com.microsoft.mysearch.qa.util.xpathbuilder.enums.*;

import java.util.LinkedList;

@Singleton
public class XPathAttributes implements IXPath {

    LinkedListMultimap<ATTRIBUTES, XPathValues> xPathAttributesListMap = LinkedListMultimap.create();

    public XPathAttributes(LinkedListMultimap<ATTRIBUTES, XPathValues> xpathAttributesListMap){
        this.xPathAttributesListMap = xpathAttributesListMap;
    }

    public XPathAttributes(ATTRIBUTES attribute, String attributeValue) {
        this.xPathAttributesListMap.put(attribute, new XPathValues(attributeValue));
    }

    public XPathAttributes(ATTRIBUTES attribute, LinkedList<String> attributeValue) {
        this.xPathAttributesListMap.put(attribute, new XPathValues(attributeValue));
    }

    public XPathAttributes(ATTRIBUTES attribute, XPathValues attributeValues) {
        this.xPathAttributesListMap.put(attribute, attributeValues);
    }

    public XPathAttributes addEntryToMultimap(ATTRIBUTES attribute, String attributeValue){
        this.xPathAttributesListMap.put(attribute, new XPathValues(attributeValue));
        return this;
    }

    public XPathAttributes addEntryToMultimap(ATTRIBUTES attribute, XPathValues attributeValues){
        this.xPathAttributesListMap.put(attribute, attributeValues);
        return this;
    }

    /** Differently done the literally same thing as method below  */
    public static XPathAttributes addEntryToMultimap(XPathAttributes xPathAttributes, ATTRIBUTES attribute, String attributeValue){
        return new XPathAttributes(xPathAttributes.get()).addEntryToMultimap(attribute, attributeValue);
    }

    /** Differently done the literally same thing as method above  */
    public static XPathAttributes addEntryToMultimap(XPathAttributes xPathAttributes, ATTRIBUTES attribute, XPathValues attributeValues){
        LinkedListMultimap<ATTRIBUTES, XPathValues> xpathAttributesListMapCustom = xPathAttributes.get();
        xpathAttributesListMapCustom.put(attribute, attributeValues);
        return new XPathAttributes(xpathAttributesListMapCustom);
    }

    public LinkedListMultimap<ATTRIBUTES, XPathValues> get() {
        return this.xPathAttributesListMap;
    }

    public XPathAttributes set(LinkedListMultimap<ATTRIBUTES, XPathValues> xpathAttributesListMap) {
        this.xPathAttributesListMap = xpathAttributesListMap;
        return this;
    }
}