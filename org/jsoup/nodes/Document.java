/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.nodes;

import java.nio.charset.Charset;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document$OutputSettings;
import org.jsoup.nodes.Document$OutputSettings$Syntax;
import org.jsoup.nodes.Document$QuirksMode;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Evaluator$Tag;

public class Document
extends Element {
    private static final Evaluator titleEval;
    private Connection connection;
    private final String location;
    private Document$OutputSettings outputSettings;
    private Parser parser;
    private Document$QuirksMode quirksMode;
    private boolean updateMetaCharset;

    static {
        Evaluator$Tag evaluator$Tag = new Evaluator$Tag("title");
        titleEval = evaluator$Tag;
    }

    public Document(String string2) {
        this("http://www.w3.org/1999/xhtml", string2);
    }

    public Document(String object, String string2) {
        ParseSettings parseSettings = ParseSettings.htmlDefault;
        object = Tag.valueOf("#root", (String)object, parseSettings);
        super((Tag)object, string2);
        this.outputSettings = object = new Document$OutputSettings();
        object = Document$QuirksMode.noQuirks;
        this.quirksMode = object;
        this.updateMetaCharset = false;
        this.location = string2;
        object = Parser.htmlParser();
        this.parser = object;
    }

    public static Document createShell(String object) {
        Validate.notNull(object);
        Document document = new Document((String)object);
        document.parser = object = document.parser();
        object = document.appendElement("html");
        ((Element)object).appendElement("head");
        ((Element)object).appendElement("body");
        return document;
    }

    private void ensureMetaCharsetElement() {
        boolean bl2 = this.updateMetaCharset;
        if (bl2) {
            Object object;
            Object object2 = this.outputSettings().syntax();
            if (object2 == (object = Document$OutputSettings$Syntax.html)) {
                object2 = this.selectFirst("meta[charset]");
                object = "charset";
                if (object2 != null) {
                    String string2 = this.charset().displayName();
                    ((Element)object2).attr((String)object, string2);
                } else {
                    object2 = this.head().appendElement("meta");
                    String string3 = this.charset().displayName();
                    ((Element)object2).attr((String)object, string3);
                }
                object2 = this.select("meta[name=charset]");
                ((Elements)object2).remove();
            } else {
                object = Document$OutputSettings$Syntax.xml;
                if (object2 == object) {
                    object2 = this.ensureChildNodes();
                    boolean bl3 = false;
                    object = null;
                    object2 = (Node)object2.get(0);
                    boolean bl4 = object2 instanceof XmlDeclaration;
                    String string4 = "1.0";
                    String string5 = "encoding";
                    String string6 = "xml";
                    String string7 = "version";
                    if (bl4) {
                        String string8 = ((XmlDeclaration)(object2 = (XmlDeclaration)object2)).name();
                        bl4 = string8.equals(string6);
                        if (bl4) {
                            object = this.charset().displayName();
                            ((LeafNode)object2).attr(string5, (String)object);
                            bl3 = ((LeafNode)object2).hasAttr(string7);
                            if (bl3) {
                                ((LeafNode)object2).attr(string7, string4);
                            }
                        } else {
                            object2 = new XmlDeclaration(string6, false);
                            ((LeafNode)object2).attr(string7, string4);
                            object = this.charset().displayName();
                            ((LeafNode)object2).attr(string5, (String)object);
                            this.prependChild((Node)object2);
                        }
                    } else {
                        object2 = new XmlDeclaration(string6, false);
                        ((LeafNode)object2).attr(string7, string4);
                        object = this.charset().displayName();
                        ((LeafNode)object2).attr(string5, (String)object);
                        this.prependChild((Node)object2);
                    }
                }
            }
        }
    }

    private Element htmlEl() {
        String string2;
        Element element = this.firstElementChild();
        while (true) {
            string2 = "html";
            if (element == null) break;
            String string3 = element.normalName();
            boolean bl2 = string3.equals(string2);
            if (bl2) {
                return element;
            }
            element = element.nextElementSibling();
        }
        return this.appendElement(string2);
    }

    public Element body() {
        String string2;
        Element element;
        block1: {
            element = this.htmlEl();
            Element element2 = element.firstElementChild();
            while (true) {
                string2 = "body";
                if (element2 == null) break block1;
                String string3 = element2.normalName();
                boolean bl2 = string2.equals(string3);
                if (bl2 || (bl2 = (string2 = "frameset").equals(string3 = element2.normalName()))) break;
                element2 = element2.nextElementSibling();
            }
            return element2;
        }
        return element.appendElement(string2);
    }

    public Charset charset() {
        return this.outputSettings.charset();
    }

    public void charset(Charset charset) {
        this.updateMetaCharsetElement(true);
        this.outputSettings.charset(charset);
        this.ensureMetaCharsetElement();
    }

    public Document clone() {
        Object object;
        Document document = (Document)super.clone();
        document.outputSettings = object = this.outputSettings.clone();
        return document;
    }

    public Connection connection() {
        Connection connection = this.connection;
        if (connection == null) {
            connection = Jsoup.newSession();
        }
        return connection;
    }

    public Document connection(Connection connection) {
        Validate.notNull(connection);
        this.connection = connection;
        return this;
    }

    public Element createElement(String object) {
        String string2 = this.parser.defaultNamespace();
        ParseSettings parseSettings = ParseSettings.preserveCase;
        object = Tag.valueOf((String)object, string2, parseSettings);
        string2 = this.baseUri();
        Element element = new Element((Tag)object, string2);
        return element;
    }

    public DocumentType documentType() {
        boolean bl2;
        Iterator iterator = this.childNodes.iterator();
        while (bl2 = iterator.hasNext()) {
            Node node = (Node)iterator.next();
            boolean bl3 = node instanceof DocumentType;
            if (bl3) {
                return (DocumentType)node;
            }
            bl2 = node instanceof LeafNode;
            if (bl2) continue;
        }
        return null;
    }

    public FormElement expectForm(String string2) {
        Object object;
        boolean bl2;
        Iterator iterator = ((AbstractCollection)this.select(string2)).iterator();
        while (bl2 = iterator.hasNext()) {
            object = (Element)iterator.next();
            boolean bl3 = object instanceof FormElement;
            if (!bl3) continue;
            return (FormElement)object;
        }
        object = new Object[]{string2};
        Validate.fail("No form elements matched the query '%s' in the document.", object);
        return null;
    }

    public List forms() {
        return this.select("form").forms();
    }

    public Element head() {
        String string2;
        Element element = this.htmlEl();
        Element element2 = element.firstElementChild();
        while (true) {
            string2 = "head";
            if (element2 == null) break;
            String string3 = element2.normalName();
            boolean bl2 = string3.equals(string2);
            if (bl2) {
                return element2;
            }
            element2 = element2.nextElementSibling();
        }
        return element.prependElement(string2);
    }

    public String location() {
        return this.location;
    }

    public String nodeName() {
        return "#document";
    }

    public String outerHtml() {
        return super.html();
    }

    public Document$OutputSettings outputSettings() {
        return this.outputSettings;
    }

    public Document outputSettings(Document$OutputSettings document$OutputSettings) {
        Validate.notNull(document$OutputSettings);
        this.outputSettings = document$OutputSettings;
        return this;
    }

    public Document parser(Parser parser) {
        this.parser = parser;
        return this;
    }

    public Parser parser() {
        return this.parser;
    }

    public Document$QuirksMode quirksMode() {
        return this.quirksMode;
    }

    public Document quirksMode(Document$QuirksMode document$QuirksMode) {
        this.quirksMode = document$QuirksMode;
        return this;
    }

    public Document shallowClone() {
        Object object = this.tag().namespace();
        String string2 = this.baseUri();
        Document document = new Document((String)object, string2);
        object = this.attributes;
        if (object != null) {
            document.attributes = object = ((Attributes)object).clone();
        }
        document.outputSettings = object = this.outputSettings.clone();
        return document;
    }

    public Element text(String string2) {
        this.body().text(string2);
        return this;
    }

    public String title() {
        Object object = this.head();
        Evaluator evaluator = titleEval;
        object = (object = ((Element)object).selectFirst(evaluator)) != null ? StringUtil.normaliseWhitespace(((Element)object).text()).trim() : "";
        return object;
    }

    public void title(String string2) {
        Validate.notNull(string2);
        Element element = this.head();
        Object object = titleEval;
        element = element.selectFirst((Evaluator)object);
        if (element == null) {
            element = this.head();
            object = "title";
            element = element.appendElement((String)object);
        }
        element.text(string2);
    }

    public void updateMetaCharsetElement(boolean bl2) {
        this.updateMetaCharset = bl2;
    }

    public boolean updateMetaCharsetElement() {
        return this.updateMetaCharset;
    }
}

