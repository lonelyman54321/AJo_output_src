/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Element;
import org.jsoup.select.Collector;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.QueryParser;

public class Selector {
    private Selector() {
    }

    public static Elements filterOut(Collection object, Collection collection) {
        boolean bl2;
        Elements elements = new Elements();
        object = object.iterator();
        block0: while (bl2 = object.hasNext()) {
            boolean bl3;
            Element element = (Element)object.next();
            Iterator iterator = collection.iterator();
            while (bl3 = iterator.hasNext()) {
                Element element2 = (Element)iterator.next();
                bl3 = element.equals(element2);
                if (!bl3) continue;
                continue block0;
            }
            ((AbstractCollection)elements).add(element);
        }
        return elements;
    }

    public static Elements select(String object, Iterable object2) {
        boolean bl2;
        Validate.notEmpty((String)object);
        Validate.notNull(object2);
        object = QueryParser.parse((String)object);
        Elements elements = new Elements();
        IdentityHashMap<Element, Boolean> identityHashMap = new IdentityHashMap<Element, Boolean>();
        object2 = object2.iterator();
        while (bl2 = object2.hasNext()) {
            boolean bl3;
            Object object3 = (Element)object2.next();
            object3 = ((AbstractCollection)Selector.select((Evaluator)object, (Element)object3)).iterator();
            while (bl3 = object3.hasNext()) {
                Element element = (Element)object3.next();
                Boolean bl4 = Boolean.TRUE;
                if ((bl4 = identityHashMap.put(element, bl4)) != null) continue;
                ((AbstractCollection)elements).add(element);
            }
        }
        return elements;
    }

    public static Elements select(String string2, Element element) {
        Validate.notEmpty(string2);
        return Selector.select(QueryParser.parse(string2), element);
    }

    public static Elements select(Evaluator evaluator, Element element) {
        Validate.notNull(evaluator);
        Validate.notNull(element);
        return Collector.collect(evaluator, element);
    }

    public static Element selectFirst(String string2, Element element) {
        Validate.notEmpty(string2);
        return Collector.findFirst(QueryParser.parse(string2), element);
    }
}

