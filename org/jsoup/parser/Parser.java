/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TreeBuilder;
import org.jsoup.parser.XmlTreeBuilder;

public class Parser {
    public static final String NamespaceHtml = "http://www.w3.org/1999/xhtml";
    public static final String NamespaceMathml = "http://www.w3.org/1998/Math/MathML";
    public static final String NamespaceSvg = "http://www.w3.org/2000/svg";
    public static final String NamespaceXml = "http://www.w3.org/XML/1998/namespace";
    private ParseErrorList errors;
    private ParseSettings settings;
    private boolean trackPosition = false;
    private TreeBuilder treeBuilder;

    private Parser(Parser parser) {
        boolean bl2;
        Object object = parser.treeBuilder.newInstance();
        this.treeBuilder = object;
        Object object2 = parser.errors;
        this.errors = object = new ParseErrorList((ParseErrorList)object2);
        object2 = parser.settings;
        this.settings = object = new ParseSettings((ParseSettings)object2);
        this.trackPosition = bl2 = parser.trackPosition;
    }

    public Parser(TreeBuilder object) {
        this.treeBuilder = object;
        this.settings = object = ((TreeBuilder)object).defaultSettings();
        this.errors = object = ParseErrorList.noTracking();
    }

    public static Parser htmlParser() {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        Parser parser = new Parser(htmlTreeBuilder);
        return parser;
    }

    public static Document parse(String object, String string2) {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        StringReader stringReader = new StringReader((String)object);
        object = new Parser(htmlTreeBuilder);
        return htmlTreeBuilder.parse(stringReader, string2, (Parser)object);
    }

    public static Document parseBodyFragment(String nodeArray, String string2) {
        Node node;
        int n3;
        Document document = Document.createShell(string2);
        Element element = document.body();
        nodeArray = Parser.parseFragment((String)nodeArray, element, string2);
        int n4 = 0;
        string2 = null;
        Node[] nodeArray2 = new Node[]{};
        nodeArray = nodeArray.toArray(nodeArray2);
        for (n3 = nodeArray.length + -1; n3 > 0; n3 += -1) {
            node = nodeArray[n3];
            node.remove();
        }
        n3 = nodeArray.length;
        while (n4 < n3) {
            node = nodeArray[n4];
            element.appendChild(node);
            ++n4;
        }
        return document;
    }

    public static List parseFragment(String string2, Element element, String string3) {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        Parser parser = new Parser(htmlTreeBuilder);
        return htmlTreeBuilder.parseFragment(string2, element, string3, parser);
    }

    public static List parseFragment(String string2, Element element, String string3, ParseErrorList parseErrorList) {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        Parser parser = new Parser(htmlTreeBuilder);
        parser.errors = parseErrorList;
        return htmlTreeBuilder.parseFragment(string2, element, string3, parser);
    }

    public static List parseXmlFragment(String string2, String string3) {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Parser parser = new Parser(xmlTreeBuilder);
        return xmlTreeBuilder.parseFragment(string2, string3, parser);
    }

    public static String unescapeEntities(String object, boolean bl2) {
        CharacterReader characterReader = new CharacterReader((String)object);
        object = ParseErrorList.noTracking();
        Tokeniser tokeniser = new Tokeniser(characterReader, (ParseErrorList)object, false);
        return tokeniser.unescapeEntities(bl2);
    }

    public static Parser xmlParser() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Parser parser = new Parser(xmlTreeBuilder);
        return parser;
    }

    public String defaultNamespace() {
        return this.getTreeBuilder().defaultNamespace();
    }

    public ParseErrorList getErrors() {
        return this.errors;
    }

    public TreeBuilder getTreeBuilder() {
        return this.treeBuilder;
    }

    public boolean isContentForTagData(String string2) {
        return this.getTreeBuilder().isContentForTagData(string2);
    }

    public boolean isTrackErrors() {
        ParseErrorList parseErrorList = this.errors;
        int n3 = parseErrorList.getMaxSize();
        if (n3 > 0) {
            n3 = 1;
        } else {
            n3 = 0;
            parseErrorList = null;
        }
        return n3 != 0;
    }

    public boolean isTrackPosition() {
        return this.trackPosition;
    }

    public Parser newInstance() {
        Parser parser = new Parser(this);
        return parser;
    }

    public List parseFragmentInput(String string2, Element element, String string3) {
        return this.treeBuilder.parseFragment(string2, element, string3, this);
    }

    public Document parseInput(Reader reader, String string2) {
        return this.treeBuilder.parse(reader, string2, this);
    }

    public Document parseInput(String string2, String string3) {
        TreeBuilder treeBuilder = this.treeBuilder;
        StringReader stringReader = new StringReader(string2);
        return treeBuilder.parse(stringReader, string3, this);
    }

    public Parser setTrackErrors(int n3) {
        ParseErrorList parseErrorList = n3 > 0 ? ParseErrorList.tracking(n3) : ParseErrorList.noTracking();
        this.errors = parseErrorList;
        return this;
    }

    public Parser setTrackPosition(boolean bl2) {
        this.trackPosition = bl2;
        return this;
    }

    public Parser setTreeBuilder(TreeBuilder treeBuilder) {
        this.treeBuilder = treeBuilder;
        treeBuilder.parser = this;
        return this;
    }

    public ParseSettings settings() {
        return this.settings;
    }

    public Parser settings(ParseSettings parseSettings) {
        this.settings = parseSettings;
        return this;
    }
}

