package com.microsoft.mysearch.qa.util.xpathbuilder;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.Table;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.microsoft.mysearch.qa.util.xpathbuilder.enums.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.LinkedList;
import java.util.Map;

@Singleton
public class XPath implements IXPath {

    private static final Log log = LogFactory.getLog(XPath.class.getName());

    /**
     * LinkedListMultimap<LinkedListMultimap<LinkedListMultimap<PREFIX, ELEMENTS>, LinkedList<ACTIONS>>, LinkedListMultimap<ATTRIBUTES, LinkedList<String>>>
     *
     * LinkedListMultimap<LinkedListMultimap<XPathElement,                         LinkedList<ACTIONS>>, LinkedListMultimap<ATTRIBUTES, XPathValues>>
     *
     * LinkedListMultimap<LinkedListMultimap<XPathActionsElements>,                                      LinkedListMultimap<XPathAttributesValues>
     */
    protected LinkedListMultimap<XPathElement, LinkedList<ACTIONS>>                                                                   xPathElementActionsMap; //= //LinkedListMultimap.create();
    protected LinkedListMultimap<ATTRIBUTES, XPathValues>                                                                             xPathAttributesListMap; //= //LinkedListMultimap.create();

    protected LinkedListMultimap<LinkedListMultimap<XPathElement, LinkedList<ACTIONS>>, LinkedListMultimap<ATTRIBUTES, XPathValues>>  xpathListMap;
    protected Table<ACTIONS, LinkedList<ATTRIBUTES>, LinkedList<XPathValues>>                                                         newXPathTable;

//    @Inject
//    private XPath xPath;
//
//    public XPath (Table<ACTIONS, LinkedList<ATTRIBUTES>, LinkedList<XPathValues>> newXPathTable) {
//        IXPath.newXPathTable.putAll(new XPathActionsAttributesValues(newXPathTable).getxPathTable());
//    }
//
//    public XPath (ACTIONS action, LinkedList<ATTRIBUTES> attributes, LinkedList<XPathValues> values) {
//        IXPath.newXPathTable.putAll(new XPathActionsAttributesValues(action, attributes, values).getxPathTable());
//    }
//
//    public XPath (ACTIONS action, ATTRIBUTES attribute, XPathValues values) {
//        IXPath.newXPathTable.putAll(new XPathActionsAttributesValues(action, attribute, values).getxPathTable());
//    }
//
//    public XPath (ACTIONS action, ATTRIBUTES attribute, String value) {
//        IXPath.newXPathTable.putAll(new XPathActionsAttributesValues(action, attribute, value).getxPathTable());
//    }

    public XPath(ELEMENTS element, ACTIONS action, ATTRIBUTES attribute, XPathValues attributeValues) {
        this.xpathListMap = LinkedListMultimap.create();
        this.xPathElementActionsMap = LinkedListMultimap.create();
        this.xPathAttributesListMap = LinkedListMultimap.create();

        this.xPathElementActionsMap = new XPathActionsElements(new XPathElement(doubleSlash, element), action).getElementActionsMap();
        this.xPathAttributesListMap = new XPathAttributes(attribute, attributeValues).get();
        this.xpathListMap.put(xPathElementActionsMap, xPathAttributesListMap);
    }

    public XPath(ELEMENTS element, ACTIONS action, ATTRIBUTES attribute, LinkedList<String> attributeValues) {
        this.xpathListMap = LinkedListMultimap.create();
        this.xPathElementActionsMap = LinkedListMultimap.create();
        this.xPathAttributesListMap = LinkedListMultimap.create();

        this.xPathElementActionsMap = (new XPathActionsElements(new XPathElement(doubleSlash, element), action).getElementActionsMap());
        this.xPathAttributesListMap = (new XPathAttributes(attribute, new XPathValues(attributeValues)).get());
        this.xpathListMap.put(xPathElementActionsMap, xPathAttributesListMap);
    }

    public XPath(PREFIX prefix, ELEMENTS element, ACTIONS action, ATTRIBUTES attribute, String value) {
        this.xpathListMap = LinkedListMultimap.create();
        this.xPathElementActionsMap = LinkedListMultimap.create();
        this.xPathAttributesListMap = LinkedListMultimap.create();

        this.xPathElementActionsMap = (new XPathActionsElements(new XPathElement(prefix, element), action).getElementActionsMap());
        this.xPathAttributesListMap = (new XPathAttributes(attribute, value).get());
        this.xpathListMap.put(xPathElementActionsMap, xPathAttributesListMap);
    }

    public XPath(PREFIX prefix, ELEMENTS element, ACTIONS action, ATTRIBUTES attribute, XPathValues attributeValues) {
        this.xpathListMap = LinkedListMultimap.create();
        this.xPathElementActionsMap = LinkedListMultimap.create();
        this.xPathAttributesListMap = LinkedListMultimap.create();

        this.xPathElementActionsMap = (new XPathActionsElements(new XPathElement(prefix, element), action).getElementActionsMap());
        this.xPathAttributesListMap = (new XPathAttributes(attribute, attributeValues).get());
        this.xpathListMap.put(xPathElementActionsMap, xPathAttributesListMap);
    }

    public XPath(XPathActionsElements xPathActionsElements, XPathAttributes xPathAttributes){
        this.xpathListMap = LinkedListMultimap.create();
        this.xPathElementActionsMap = LinkedListMultimap.create();
        this.xPathAttributesListMap = LinkedListMultimap.create();

        this.xPathElementActionsMap = (xPathActionsElements.getElementActionsMap());
        this.xPathAttributesListMap = (xPathAttributes.get());
        this.xpathListMap.put(xPathElementActionsMap, xPathAttributesListMap);
    }

    public XPath(LinkedListMultimap<XPathElement, LinkedList<ACTIONS>> elementActionsMap, LinkedListMultimap<ATTRIBUTES, XPathValues> xpathAttributesListMap) {
        this.xpathListMap = LinkedListMultimap.create();
        this.xPathElementActionsMap = LinkedListMultimap.create();
        this.xPathAttributesListMap = LinkedListMultimap.create();

        this.xPathElementActionsMap = (elementActionsMap);
        this.xPathAttributesListMap = (xpathAttributesListMap);
        this.xpathListMap.put(elementActionsMap, xpathAttributesListMap);
    }

    public XPath(LinkedListMultimap<LinkedListMultimap<XPathElement, LinkedList<ACTIONS>>, LinkedListMultimap<ATTRIBUTES, XPathValues>> xpathTable) {
        this.xpathListMap = LinkedListMultimap.create();
        this.xPathElementActionsMap = LinkedListMultimap.create();
        this.xPathAttributesListMap = LinkedListMultimap.create();

        this.xpathListMap.putAll(xpathTable);
//        this.xPathElementActionsMap = xpathListMapENTRY.getKey();
//        this.xPathAttributesListMap = xpathListMapENTRY.getValue;

    }

    public XPath(ELEMENTS element, ACTIONS action, ATTRIBUTES attribute, String attributeValues) {
        this.xpathListMap = LinkedListMultimap.create();
        this.xPathElementActionsMap = LinkedListMultimap.create();
        this.xPathAttributesListMap = LinkedListMultimap.create();

        this.xPathElementActionsMap = (new XPathActionsElements(new XPathElement(doubleSlash, element), action).getElementActionsMap());
        this.xPathAttributesListMap = (new XPathAttributes(attribute, attributeValues).get());
        this.xpathListMap.put(xPathElementActionsMap, xPathAttributesListMap);
    }

    public String getXPath() {
        String xpath = "";
        if (xpathListMap.entries() != null) {
            for (Map.Entry<LinkedListMultimap<XPathElement, LinkedList<ACTIONS>>, LinkedListMultimap<ATTRIBUTES, XPathValues>> mapEntry : xpathListMap.entries()) {
                for (Map.Entry<XPathElement, LinkedList<ACTIONS>> elementActionsMapEntry : mapEntry.getKey().entries()) {
                    for (Map.Entry<PREFIX, ELEMENTS> elementEntry : elementActionsMapEntry.getKey().entries()) {
                        /* Adding into Xpath '// + element' or '/ + element' */
                        xpath = xpath + XPathBuilder.getElementXpath(elementEntry.getKey(), elementEntry.getValue());
                        /* Adding into Xpath '// + element' or '/ + element' */
                        LinkedList<ACTIONS> actions = elementActionsMapEntry.getValue();
                        for (ACTIONS action : actions) {
                            for (Map.Entry<ATTRIBUTES, XPathValues> attributesValuesMapEntry : mapEntry.getValue().entries()) {
                                ATTRIBUTES attributes = attributesValuesMapEntry.getKey();
                                XPathValues list = attributesValuesMapEntry.getValue();
                                /** Adding into Xpath based on action [contains|equals etc...] an [@attribute='value']  */
                                xpath = xpath + XPathBuilder.getXPath(action, attributes, list);
                                /** Adding into Xpath based on action [contains|equals etc...] an [@attribute='value']  */
                            }
                        }
                    }
                }
            }
            log.debug("getXPath --> \n " + xpath + "\n");
            return xpath;
        }
        return "//div[@id='ERROR IN XPath Generation']";
    }

    public XPath setListMapElementActionsAttributesValues(LinkedListMultimap<LinkedListMultimap<XPathElement, LinkedList<ACTIONS>>, LinkedListMultimap<ATTRIBUTES, XPathValues>> xpathListMap) {
        return new XPath(xpathListMap);
    }

    public static XPathAttributes newAttributesValuesClass(ATTRIBUTES attributes, XPathValues values) {
        return new XPathAttributes(attributes, values);
    }

    public static LinkedListMultimap<ATTRIBUTES, XPathValues> newAttributesValuesMap(ATTRIBUTES attributes, XPathValues values) {
        return new XPathAttributes(attributes, values).get();
    }

//    public static XPath addEntryElementActionsAttributesValues(XPath xPath, XPathActionsElements xPathActionsElements, XPathAttributes xPathAttributes){
//        return new XPath(xPath).addEntryElementActionsAttributesValues(xPathActionsElements, xPathAttributes);
//    }

    public XPath addEntryElementActionsAttributesValues(XPathActionsElements xPathActionsElements, XPathAttributes xPathAttributes) {
        xPathElementActionsMap = xPathActionsElements.getElementActionsMap();
        xPathAttributesListMap = xPathAttributes.get();
        return this;
    }

    public static XPathAttributes addEntryAttributesValuesMap(XPathAttributes xPathAttributes, ATTRIBUTES attribute, String value){
        return new XPathAttributes(xPathAttributes.get()).addEntryToMultimap(attribute, value);
    }

    public static XPathAttributes addEntryAttributesValuesMap(XPathAttributes xPathAttributes, ATTRIBUTES attribute, XPathValues value){
        return new XPathAttributes(xPathAttributes.get()).addEntryToMultimap(attribute, value);
    }

    public static XPathActionsElements addEntryActionsElementsMap(XPathActionsElements xPathActionsElements, XPathElement xPathElement, ACTIONS action){
        return new XPathActionsElements(xPathActionsElements).addEntry(xPathElement, action);
    }

    public static XPathActionsElements addEntryActionsElementsMap(XPathActionsElements xPathActionsElements, XPathElement xPathElement, LinkedList<ACTIONS> actions){
        return new XPathActionsElements(xPathActionsElements).addEntry(xPathElement, actions);
    }

    public static XPathActionsElements newActionsElementClass(PREFIX prefix, ELEMENTS element, ACTIONS action){
        return new XPathActionsElements(prefix, element, new LinkedList<ACTIONS>(){{add(action);}});
    }

    public static LinkedListMultimap<XPathElement, LinkedList<ACTIONS>> newActionsElementMap(PREFIX prefix, ELEMENTS element, ACTIONS action){
        return new XPathActionsElements(prefix, element, new LinkedList<ACTIONS>(){{add(action);}}).getElementActionsMap();
    }

    public XPath addEntry(PREFIX slashes, ELEMENTS element, ACTIONS action, ATTRIBUTES attribute, String value) {
        addEntry(slashes, element, action, attribute, new XPathValues(value));
        return this;
    }

    public XPath addEntry(ELEMENTS element, ACTIONS action, ATTRIBUTES attribute, String value) {
        addEntry(element, action, attribute, new XPathValues(value));
        return this;
    }

    public XPath addEntry(ELEMENTS element, ACTIONS action, ATTRIBUTES attributes, XPathValues values) {
        addEntry(doubleSlash, element, action, attributes, values);
        return this;
    }

    public XPath addEntry(PREFIX prefix, ELEMENTS element, ACTIONS action, ATTRIBUTES attributes, LinkedList<String> values) {
        XPathElement xPathElement = new XPathElement(prefix, element);
        addEntry(xPathElement, action, attributes, values);
        return this;
    }

    public XPath addEntry(PREFIX prefix, ELEMENTS element, ACTIONS action, ATTRIBUTES attributes, XPathValues values) {
        XPathElement xPathElement = new XPathElement(prefix, element);
        addEntry(xPathElement, action, attributes, values);
        return this;
    }

    public XPath addEntry(XPathElement element, ACTIONS action, ATTRIBUTES attributes, XPathValues values) {
        XPathAttributes xPathAttributes = new XPathAttributes(attributes, values);
        LinkedListMultimap<XPathElement, LinkedList<ACTIONS>> newElementActionMap = LinkedListMultimap.create();
        newElementActionMap.put(element, new LinkedList<ACTIONS>() {{
            add(action);
        }});
        LinkedListMultimap<LinkedListMultimap<XPathElement, LinkedList<ACTIONS>>, LinkedListMultimap<ATTRIBUTES, XPathValues>> xpathListMap = LinkedListMultimap.create();
        xpathListMap.put(newElementActionMap, xPathAttributes.get());
        this.xpathListMap.putAll(xpathListMap);
        return this;
    }

    public XPath addEntry(XPathElement element, ACTIONS action, ATTRIBUTES attributes, LinkedList<String> values) {
        XPathAttributes xPathAttributes = new XPathAttributes(attributes, new XPathValues(values));
        LinkedListMultimap<XPathElement, LinkedList<ACTIONS>> newElementActionMap = LinkedListMultimap.create();
        newElementActionMap.put(element, new LinkedList<ACTIONS>() {{
            add(action);
        }});
        LinkedListMultimap<LinkedListMultimap<XPathElement, LinkedList<ACTIONS>>, LinkedListMultimap<ATTRIBUTES, XPathValues>> xpathListMap = LinkedListMultimap.create();
        xpathListMap.put(newElementActionMap, xPathAttributes.get());
        this.xpathListMap.putAll(xpathListMap);
        return this;
    }

    /** Working with Guava -> Table <Action, Attrib, Values> */
    public Table<ACTIONS, LinkedList<ATTRIBUTES>, LinkedList<XPathValues>> getActionsAttributesValuesTable() {
        return this.newXPathTable;
    }

    public XPathActionsAttributesValues getActionsAttributesValues(ACTIONS action, ATTRIBUTES attribute, String value) {
        return new XPathActionsAttributesValues(action, attribute, value);
    }

    public XPathActionsAttributesValues getActionsAttributesValues(ACTIONS action, ATTRIBUTES attribute, XPathValues values) {
        return new XPathActionsAttributesValues(action, attribute, values);
    }

    public XPathActionsAttributesValues getActionsAttributesValues(ACTIONS action, LinkedList<ATTRIBUTES> attributes, LinkedList<XPathValues> values) {
        return new XPathActionsAttributesValues(action, attributes, values);
    }

    public Table<ACTIONS, LinkedList<ATTRIBUTES>, LinkedList<XPathValues>> getActionsAttributesValuesTable(ACTIONS action, ATTRIBUTES attribute, String value) {
        return new XPathActionsAttributesValues(action, attribute, value).getxPathTable();
    }

    public Table<ACTIONS, LinkedList<ATTRIBUTES>, LinkedList<XPathValues>> getActionsAttributesValuesTable(ACTIONS action, ATTRIBUTES attribute, XPathValues values) {
        return new XPathActionsAttributesValues(action, attribute, values).getxPathTable();
    }

    public Table<ACTIONS, LinkedList<ATTRIBUTES>, LinkedList<XPathValues>> getActionsAttributesValuesTable(ACTIONS action, LinkedList<ATTRIBUTES> attributes, LinkedList<XPathValues> values) {
        return new XPathActionsAttributesValues(action, attributes, values).getxPathTable();
    }

    public String getXPath(ACTIONS action, ATTRIBUTES attribute, String value) {
        return new XPathActionsAttributesValues(action, attribute, value).getXPath();
    }

    public String getXPath(ACTIONS action, ATTRIBUTES attribute, XPathValues values) {
        return new XPathActionsAttributesValues(action, attribute, values).getXPath();
    }

    public String getXPath(ACTIONS action, LinkedList<ATTRIBUTES> attributes, LinkedList<XPathValues> values) {
        return new XPathActionsAttributesValues(action, attributes, values).getXPath();
    }
    /** Working with Guava -> Table <Action, Attrib, Values> */
}