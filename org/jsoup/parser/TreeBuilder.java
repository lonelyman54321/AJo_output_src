/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import java.io.Reader;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Range;
import org.jsoup.nodes.Range$Position;
import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.ParseError;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.parser.Token;
import org.jsoup.parser.Token$EndTag;
import org.jsoup.parser.Token$StartTag;
import org.jsoup.parser.Token$Tag;
import org.jsoup.parser.Token$TokenType;
import org.jsoup.parser.Tokeniser;

abstract class TreeBuilder {
    String baseUri;
    Token currentToken;
    Document doc;
    private final Token$EndTag end;
    protected Parser parser;
    CharacterReader reader;
    Map seenTags;
    ParseSettings settings;
    ArrayList stack;
    private Token$StartTag start;
    Tokeniser tokeniser;
    private boolean trackSourceRange;

    public TreeBuilder() {
        Token$EndTag token$EndTag;
        this.end = token$EndTag = new Token$EndTag();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void trackNodePosition(Node cloneable, boolean bl2) {
        Object object;
        int n3;
        Object object2;
        int n4;
        int n7;
        int n8;
        Object object3;
        block5: {
            block7: {
                boolean bl3;
                block6: {
                    bl3 = this.trackSourceRange;
                    if (!bl3) {
                        return;
                    }
                    object3 = this.currentToken;
                    n8 = ((Token)object3).startPos();
                    n7 = ((Token)object3).endPos();
                    n4 = cloneable instanceof Element;
                    if (n4 == 0) break block5;
                    object2 = cloneable;
                    object2 = (Element)cloneable;
                    n3 = ((Token)object3).isEOF();
                    if (n3 == 0) break block6;
                    object3 = ((Element)object2).endSourceRange();
                    bl3 = ((Range)object3).isTracked();
                    if (bl3) {
                        return;
                    }
                    object3 = this.reader;
                    n8 = ((CharacterReader)object3).pos();
                    break block7;
                }
                if (!(bl2 ? (n3 = (int)(((Token)object3).isStartTag() ? 1 : 0)) == 0 || !(bl3 = ((String)(object2 = ((Element)object2).normalName())).equals(object3 = ((Token)object3).asStartTag().normalName)) : (n3 = (int)(((Tag)(object = ((Element)object2).tag())).isEmpty() ? 1 : 0)) == 0 && (n3 = (int)(((Tag)(object = ((Element)object2).tag())).isSelfClosing() ? 1 : 0)) == 0 && ((n3 = (int)(((Token)object3).isEndTag() ? 1 : 0)) == 0 || !(bl3 = ((String)(object2 = ((Element)object2).normalName())).equals(object3 = ((Token)object3).asEndTag().normalName))))) break block5;
            }
            n7 = n8;
        }
        n4 = this.reader.lineNumber(n8);
        n3 = this.reader.columnNumber(n8);
        object3 = new Range$Position(n8, n4, n3);
        object2 = this.reader;
        n4 = ((CharacterReader)object2).lineNumber(n7);
        object = this.reader;
        n3 = ((CharacterReader)object).columnNumber(n7);
        Range$Position range$Position = new Range$Position(n7, n4, n3);
        Range range = new Range((Range$Position)object3, range$Position);
        cloneable = ((Node)cloneable).attributes();
        String string2 = bl2 ? "jsoup.start" : "jsoup.end";
        ((Attributes)cloneable).userData(string2, range);
    }

    public Element currentElement() {
        Cloneable cloneable = this.stack;
        int n3 = cloneable.size();
        if (n3 > 0) {
            ArrayList arrayList = this.stack;
            cloneable = (Element)arrayList.get(n3 += -1);
        } else {
            cloneable = this.doc;
        }
        return cloneable;
    }

    public boolean currentElementIs(String string2) {
        String string3;
        boolean bl2;
        Object object = this.stack;
        int n3 = ((ArrayList)object).size();
        boolean bl3 = false;
        if (n3 == 0) {
            return false;
        }
        object = this.currentElement();
        if (object != null && (bl2 = (string3 = ((Element)object).normalName()).equals(string2)) && (bl2 = (string2 = ((Element)object).tag().namespace()).equals(object = "http://www.w3.org/1999/xhtml"))) {
            bl3 = true;
        }
        return bl3;
    }

    public boolean currentElementIs(String string2, String string3) {
        String string4;
        boolean bl2;
        Cloneable cloneable = this.stack;
        int n3 = ((ArrayList)cloneable).size();
        boolean bl3 = false;
        if (n3 == 0) {
            return false;
        }
        cloneable = this.currentElement();
        if (cloneable != null && (bl2 = (string4 = ((Element)cloneable).normalName()).equals(string2)) && (bl2 = (string2 = ((Element)cloneable).tag().namespace()).equals(string3))) {
            bl3 = true;
        }
        return bl3;
    }

    public String defaultNamespace() {
        return "http://www.w3.org/1999/xhtml";
    }

    public abstract ParseSettings defaultSettings();

    public void error(String string2) {
        this.error(string2, null);
    }

    public void error(String string2, Object ... objectArray) {
        ParseErrorList parseErrorList = this.parser.getErrors();
        boolean bl2 = parseErrorList.canAddError();
        if (bl2) {
            CharacterReader characterReader = this.reader;
            ParseError parseError = new ParseError(characterReader, string2, objectArray);
            ((AbstractCollection)parseErrorList).add(parseError);
        }
    }

    public void initialiseParse(Reader object, String string2, Parser object2) {
        boolean bl2;
        Validate.notNullParam(object, "input");
        Validate.notNullParam(string2, "baseUri");
        Validate.notNull(object2);
        String string3 = ((Parser)object2).defaultNamespace();
        Object object3 = new Document(string3, string2);
        this.doc = object3;
        ((Document)object3).parser((Parser)object2);
        this.parser = object2;
        this.settings = object3 = ((Parser)object2).settings();
        this.reader = object3 = new CharacterReader((Reader)object);
        this.trackSourceRange = bl2 = ((Parser)object2).isTrackPosition();
        object = this.reader;
        boolean bl3 = ((Parser)object2).isTrackErrors();
        if (!bl3 && !(bl3 = this.trackSourceRange)) {
            bl3 = false;
            object3 = null;
        } else {
            bl3 = true;
        }
        ((CharacterReader)object).trackNewlines(bl3);
        this.currentToken = null;
        object3 = this.reader;
        object2 = ((Parser)object2).getErrors();
        boolean bl4 = this.trackSourceRange;
        this.tokeniser = object = new Tokeniser((CharacterReader)object3, (ParseErrorList)object2, bl4);
        object = new ArrayList(32);
        this.stack = object;
        this.seenTags = object = new HashMap();
        boolean bl5 = this.trackSourceRange;
        object3 = this.reader;
        this.start = object = new Token$StartTag(bl5, (CharacterReader)object3);
        this.baseUri = string2;
    }

    public boolean isContentForTagData(String string2) {
        return false;
    }

    public abstract TreeBuilder newInstance();

    public void onNodeClosed(Node node) {
        this.trackNodePosition(node, false);
    }

    public void onNodeInserted(Node node) {
        this.trackNodePosition(node, true);
    }

    public Document parse(Reader reader, String string2, Parser parser) {
        this.initialiseParse(reader, string2, parser);
        this.runParser();
        this.reader.close();
        this.reader = null;
        this.tokeniser = null;
        this.stack = null;
        this.seenTags = null;
        return this.doc;
    }

    public abstract List parseFragment(String var1, Element var2, String var3, Parser var4);

    public final Element pop() {
        int n3 = this.stack.size();
        ArrayList arrayList = this.stack;
        Element element = (Element)arrayList.remove(n3 += -1);
        this.onNodeClosed(element);
        return element;
    }

    public abstract boolean process(Token var1);

    public boolean processEndTag(String object) {
        Token token = this.currentToken;
        Token$EndTag token$EndTag = this.end;
        if (token == token$EndTag) {
            token = new Token$EndTag();
            object = ((Token$Tag)token).name((String)object);
            return this.process((Token)object);
        }
        object = token$EndTag.reset().name((String)object);
        return this.process((Token)object);
    }

    public boolean processStartTag(String object) {
        Token token = this.currentToken;
        Token$StartTag token$StartTag = this.start;
        if (token == token$StartTag) {
            boolean bl2 = this.trackSourceRange;
            CharacterReader characterReader = this.reader;
            token$StartTag = new Token$StartTag(bl2, characterReader);
            object = token$StartTag.name((String)object);
            return this.process((Token)object);
        }
        object = token$StartTag.reset().name((String)object);
        return this.process((Token)object);
    }

    public boolean processStartTag(String object, Attributes attributes) {
        Token token = this.currentToken;
        Token$StartTag token$StartTag = this.start;
        if (token == token$StartTag) {
            boolean bl2 = this.trackSourceRange;
            CharacterReader characterReader = this.reader;
            token$StartTag = new Token$StartTag(bl2, characterReader);
            object = token$StartTag.nameAttr((String)object, attributes);
            return this.process((Token)object);
        }
        token$StartTag.reset();
        token$StartTag.nameAttr((String)object, attributes);
        return this.process(token$StartTag);
    }

    public final void push(Element element) {
        this.stack.add(element);
        this.onNodeInserted(element);
    }

    public void runParser() {
        Object object = this.tokeniser;
        Token$TokenType token$TokenType = Token$TokenType.EOF;
        while (true) {
            Token token;
            this.currentToken = token = ((Tokeniser)object).read();
            this.process(token);
            Token$TokenType token$TokenType2 = token.type;
            if (token$TokenType2 == token$TokenType) {
                boolean bl2;
                while (!(bl2 = ((ArrayList)(object = this.stack)).isEmpty())) {
                    this.pop();
                }
                return;
            }
            token.reset();
        }
    }

    public Tag tagFor(String string2, String object, ParseSettings parseSettings) {
        String string3;
        boolean bl2;
        Tag tag = (Tag)this.seenTags.get(string2);
        if (tag != null && (bl2 = (string3 = tag.namespace()).equals(object))) {
            return tag;
        }
        object = Tag.valueOf(string2, (String)object, parseSettings);
        this.seenTags.put(string2, object);
        return object;
    }

    public Tag tagFor(String string2, ParseSettings parseSettings) {
        String string3 = this.defaultNamespace();
        return this.tagFor(string2, string3, parseSettings);
    }
}

