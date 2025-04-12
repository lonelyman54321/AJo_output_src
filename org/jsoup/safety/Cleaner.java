/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.safety;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document$OutputSettings;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.Parser;
import org.jsoup.safety.Cleaner$CleaningVisitor;
import org.jsoup.safety.Cleaner$ElementMeta;
import org.jsoup.safety.Safelist;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;

public class Cleaner {
    private final Safelist safelist;

    public Cleaner(Safelist safelist) {
        Validate.notNull(safelist);
        this.safelist = safelist;
    }

    public static /* synthetic */ Safelist access$000(Cleaner cleaner) {
        return cleaner.safelist;
    }

    public static /* synthetic */ Cleaner$ElementMeta access$100(Cleaner cleaner, Element element) {
        return cleaner.createSafeElement(element);
    }

    private int copySafeNodes(Element element, Element element2) {
        Cleaner$CleaningVisitor cleaner$CleaningVisitor = new Cleaner$CleaningVisitor(this, element, element2, null);
        NodeTraversor.traverse((NodeVisitor)cleaner$CleaningVisitor, element);
        return Cleaner$CleaningVisitor.access$300(cleaner$CleaningVisitor);
    }

    private Cleaner$ElementMeta createSafeElement(Element object) {
        boolean bl2;
        Element element = ((Element)object).shallowClone();
        String string2 = ((Element)object).tagName();
        Attributes attributes = element.attributes();
        element.clearAttributes();
        Iterator iterator = ((Element)object).attributes().iterator();
        int n3 = 0;
        while (bl2 = iterator.hasNext()) {
            Safelist safelist = this.safelist;
            Attribute attribute = (Attribute)iterator.next();
            boolean bl3 = safelist.isSafeAttribute(string2, (Element)object, attribute);
            if (bl3) {
                attributes.put(attribute);
                continue;
            }
            ++n3;
        }
        object = this.safelist.getEnforcedAttributes(string2);
        attributes.addAll((Attributes)object);
        element.attributes().addAll(attributes);
        object = new Cleaner$ElementMeta(element, n3);
        return object;
    }

    public Document clean(Document object) {
        Validate.notNull(object);
        Document document = Document.createShell(((Element)object).baseUri());
        Element element = ((Document)object).body();
        Element element2 = document.body();
        this.copySafeNodes(element, element2);
        object = ((Document)object).outputSettings().clone();
        document.outputSettings((Document$OutputSettings)object);
        return document;
    }

    public boolean isValid(Document object) {
        boolean bl2;
        Validate.notNull(object);
        Element element = Document.createShell(((Element)object).baseUri());
        Element element2 = ((Document)object).body();
        element = element.body();
        int n3 = this.copySafeNodes(element2, element);
        if (n3 == 0 && (bl2 = (object = ((Document)object).head().childNodes()).isEmpty())) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public boolean isValidBodyHtml(String object) {
        Object object2 = "";
        Document document = Document.createShell((String)object2);
        Document document2 = Document.createShell((String)object2);
        boolean bl2 = true;
        ParseErrorList parseErrorList = ParseErrorList.tracking((int)(bl2 ? 1 : 0));
        Element element = document2.body();
        object = Parser.parseFragment((String)object, element, (String)object2, parseErrorList);
        object2 = document2.body();
        element = null;
        ((Element)object2).insertChildren(0, (Collection)object);
        object = document2.body();
        object2 = document.body();
        int n3 = this.copySafeNodes((Element)object, (Element)object2);
        if (n3 != 0 || (n3 = (int)(((AbstractCollection)parseErrorList).isEmpty() ? 1 : 0)) == 0) {
            bl2 = false;
        }
        return bl2;
    }
}

