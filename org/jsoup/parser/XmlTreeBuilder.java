/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document$OutputSettings;
import org.jsoup.nodes.Document$OutputSettings$Syntax;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Entities$EscapeMode;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.parser.Token;
import org.jsoup.parser.Token$Character;
import org.jsoup.parser.Token$Comment;
import org.jsoup.parser.Token$Doctype;
import org.jsoup.parser.Token$EndTag;
import org.jsoup.parser.Token$StartTag;
import org.jsoup.parser.Token$Tag;
import org.jsoup.parser.TreeBuilder;
import org.jsoup.parser.XmlTreeBuilder$1;

public class XmlTreeBuilder
extends TreeBuilder {
    private static final int maxQueueDepth = 256;

    public String defaultNamespace() {
        return "http://www.w3.org/XML/1998/namespace";
    }

    public ParseSettings defaultSettings() {
        return ParseSettings.preserveCase;
    }

    public void initialiseParse(Reader object, String object2, Parser parser) {
        super.initialiseParse((Reader)object, (String)object2, parser);
        object = this.stack;
        object2 = this.doc;
        ((ArrayList)object).add(object2);
        object = this.doc.outputSettings();
        object2 = Document$OutputSettings$Syntax.xml;
        object = ((Document$OutputSettings)object).syntax((Document$OutputSettings$Syntax)((Object)object2));
        object2 = Entities$EscapeMode.xhtml;
        ((Document$OutputSettings)object).escapeMode((Entities$EscapeMode)((Object)object2)).prettyPrint(false);
    }

    public void insertCharacterFor(Token$Character cloneable) {
        String string2 = ((Token$Character)cloneable).getData();
        boolean bl2 = ((Token)((Object)cloneable)).isCData();
        cloneable = bl2 ? new CDataNode(string2) : new TextNode(string2);
        this.insertLeafNode((LeafNode)cloneable);
    }

    public void insertCommentFor(Token$Comment object) {
        String string2 = ((Token$Comment)object).getData();
        Object object2 = new Comment(string2);
        boolean bl2 = ((Token$Comment)object).bogus;
        if (bl2 && (bl2 = ((Comment)object2).isXmlDeclaration()) && (object = ((Comment)object2).asXmlDeclaration()) != null) {
            object2 = object;
        }
        this.insertLeafNode((LeafNode)object2);
    }

    public void insertDoctypeFor(Token$Doctype object) {
        Object object2 = this.settings;
        String string2 = ((Token$Doctype)object).getName();
        object2 = ((ParseSettings)object2).normalizeTag(string2);
        string2 = ((Token$Doctype)object).getPublicIdentifier();
        String string3 = ((Token$Doctype)object).getSystemIdentifier();
        DocumentType documentType = new DocumentType((String)object2, string2, string3);
        object = ((Token$Doctype)object).getPubSysKey();
        documentType.setPubSysKey((String)object);
        this.insertLeafNode(documentType);
    }

    public void insertElementFor(Token$StartTag token$StartTag) {
        Object object;
        Object object2 = token$StartTag.name();
        Object object3 = this.settings;
        object2 = this.tagFor((String)object2, (ParseSettings)object3);
        object3 = token$StartTag.attributes;
        if (object3 != null) {
            object = this.settings;
            ((Attributes)object3).deduplicate((ParseSettings)object);
        }
        object = this.settings;
        Attributes attributes = token$StartTag.attributes;
        object = ((ParseSettings)object).normalizeAttributes(attributes);
        attributes = null;
        object3 = new Element((Tag)object2, null, (Attributes)object);
        object = this.currentElement();
        ((Element)object).appendChild((Node)object3);
        this.push((Element)object3);
        boolean bl2 = token$StartTag.isSelfClosing();
        if (bl2) {
            ((Tag)object2).setSelfClosing();
            this.pop();
        }
    }

    public void insertLeafNode(LeafNode leafNode) {
        this.currentElement().appendChild(leafNode);
        this.onNodeInserted(leafNode);
    }

    public void insertNode(Node node) {
        this.currentElement().appendChild(node);
        this.onNodeInserted(node);
    }

    public void insertNode(Node node, Token token) {
        this.currentElement().appendChild(node);
        this.onNodeInserted(node);
    }

    public XmlTreeBuilder newInstance() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        return xmlTreeBuilder;
    }

    public Document parse(Reader reader, String string2) {
        Parser parser = new Parser(this);
        return this.parse(reader, string2, parser);
    }

    public Document parse(String object, String string2) {
        StringReader stringReader = new StringReader((String)object);
        object = new Parser(this);
        return this.parse(stringReader, string2, (Parser)object);
    }

    public List parseFragment(String string2, String string3, Parser parser) {
        StringReader stringReader = new StringReader(string2);
        this.initialiseParse(stringReader, string3, parser);
        this.runParser();
        return this.doc.childNodes();
    }

    public List parseFragment(String string2, Element element, String string3, Parser parser) {
        return this.parseFragment(string2, string3, parser);
    }

    public void popStackToClose(Token$EndTag object) {
        Element element;
        Object object2;
        block6: {
            int n3;
            object2 = this.settings;
            object = ((Token$Tag)object).tagName;
            object = ((ParseSettings)object2).normalizeTag((String)object);
            object2 = this.stack;
            int n4 = ((ArrayList)object2).size();
            int n7 = n4 + -1;
            if (n7 >= (n3 = 256)) {
                n4 += -257;
            } else {
                n4 = 0;
                object2 = null;
            }
            ArrayList arrayList = this.stack;
            for (n7 = arrayList.size() + -1; n7 >= n4; n7 += -1) {
                element = (Element)this.stack.get(n7);
                String string2 = element.nodeName();
                boolean bl2 = string2.equals(object);
                if (!bl2) {
                    continue;
                }
                break block6;
            }
            n3 = 0;
            element = null;
        }
        if (element == null) {
            return;
        }
        object = this.stack;
        for (int i3 = ((ArrayList)object).size() + -1; i3 >= 0 && (object2 = this.pop()) != element; i3 += -1) {
        }
    }

    public boolean process(Token object) {
        this.currentToken = object;
        Object object2 = XmlTreeBuilder$1.$SwitchMap$org$jsoup$parser$Token$TokenType;
        Object object3 = object.type;
        int n3 = object3.ordinal();
        int n4 = object2[n3];
        switch (n4) {
            default: {
                object2 = new StringBuilder;
                object3 = "Unexpected token type: ";
                ((StringBuilder)object2)((String)object3);
                object = object.type;
                ((StringBuilder)object2).append(object);
                object = ((StringBuilder)object2).toString();
                Validate.fail((String)object);
                break;
            }
            case 5: {
                object = object.asDoctype();
                this.insertDoctypeFor((Token$Doctype)object);
                break;
            }
            case 4: {
                object = object.asCharacter();
                this.insertCharacterFor((Token$Character)object);
                break;
            }
            case 3: {
                object = object.asComment();
                this.insertCommentFor((Token$Comment)object);
                break;
            }
            case 2: {
                object = object.asEndTag();
                this.popStackToClose((Token$EndTag)object);
                break;
            }
            case 1: {
                object = object.asStartTag();
                this.insertElementFor((Token$StartTag)object);
            }
            case 6: 
        }
        return true;
    }
}

