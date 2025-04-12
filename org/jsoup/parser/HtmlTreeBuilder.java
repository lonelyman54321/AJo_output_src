/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import java.io.Reader;
import java.io.StringReader;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document$QuirksMode;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.HtmlTreeBuilderState;
import org.jsoup.parser.HtmlTreeBuilderState$Constants;
import org.jsoup.parser.ParseError;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.parser.Token;
import org.jsoup.parser.Token$Character;
import org.jsoup.parser.Token$Comment;
import org.jsoup.parser.Token$EndTag;
import org.jsoup.parser.Token$StartTag;
import org.jsoup.parser.Token$Tag;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;
import org.jsoup.parser.TreeBuilder;

public class HtmlTreeBuilder
extends TreeBuilder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int MaxScopeSearchDepth = 100;
    static final String[] TagMathMlTextIntegration;
    static final String[] TagSearchButton;
    static final String[] TagSearchEndTags;
    static final String[] TagSearchList;
    static final String[] TagSearchSelectScope;
    static final String[] TagSearchSpecial;
    static final String[] TagSearchTableScope;
    static final String[] TagSvgHtmlIntegration;
    static final String[] TagThoroughSearchEndTags;
    static final String[] TagsSearchInScope;
    private static final int maxQueueDepth = 256;
    private static final int maxUsedFormattingElements = 12;
    private boolean baseUriSetFromDoc;
    private Element contextElement;
    private Token$EndTag emptyEnd;
    private FormElement formElement;
    private ArrayList formattingElements;
    private boolean fosterInserts;
    private boolean fragmentParsing;
    private boolean framesetOk;
    private Element headElement;
    private HtmlTreeBuilderState originalState;
    private List pendingTableCharacters;
    private final String[] specificScopeTarget;
    private HtmlTreeBuilderState state;
    private ArrayList tmplInsertMode;

    static {
        TagsSearchInScope = new String[]{"applet", "caption", "html", "marquee", "object", "table", "td", "th"};
        TagSearchList = new String[]{"ol", "ul"};
        TagSearchButton = new String[]{"button"};
        TagSearchTableScope = new String[]{"html", "table"};
        TagSearchSelectScope = new String[]{"optgroup", "option"};
        TagSearchEndTags = new String[]{"dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc"};
        TagThoroughSearchEndTags = new String[]{"caption", "colgroup", "dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};
        TagSearchSpecial = new String[]{"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "command", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "isindex", "li", "link", "listing", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script", "section", "select", "style", "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "title", "tr", "ul", "wbr", "xmp"};
        TagMathMlTextIntegration = new String[]{"mi", "mn", "mo", "ms", "mtext"};
        TagSvgHtmlIntegration = new String[]{"desc", "foreignObject", "title"};
    }

    public HtmlTreeBuilder() {
        String[] stringArray = new String[]{null};
        this.specificScopeTarget = stringArray;
    }

    private void clearStackToContext(String ... stringArray) {
        boolean bl2;
        Object object;
        String string2;
        String string3;
        boolean bl3;
        ArrayList arrayList = this.stack;
        for (int i3 = arrayList.size() + -1; !(i3 < 0 || (bl3 = (string3 = "http://www.w3.org/1999/xhtml").equals(string2 = ((Element)(object = (Element)this.stack.get(i3))).tag().namespace())) && ((bl3 = StringUtil.in(string2 = ((Element)object).normalName(), stringArray)) || (bl2 = ((String)(object = ((Element)object).normalName())).equals(string2 = "html")))); i3 += -1) {
            this.pop();
        }
    }

    private void doInsertElement(Element element, Token object) {
        Object[] objectArray;
        Object object2;
        boolean bl2;
        object = element.tag();
        int n3 = (int)(((Tag)object).isFormListed() ? 1 : 0);
        if (n3 != 0 && (object = this.formElement) != null) {
            ((FormElement)object).addElement(element);
        }
        if ((bl2 = element.hasAttr((String)(object = "xmlns"))) && !(bl2 = (object2 = element.attr((String)object)).equals(objectArray = element.tag().namespace()))) {
            object = element.attr((String)object);
            object2 = element.tagName();
            int n4 = 2;
            objectArray = new Object[n4];
            objectArray[0] = object;
            n3 = 1;
            objectArray[n3] = object2;
            object = "Invalid xmlns attribute [%s] on tag [%s]";
            this.error((String)object, objectArray);
        }
        if ((n3 = this.isFosterInserts()) != 0 && (n3 = StringUtil.inSorted((String)(object = this.currentElement().normalName()), object2 = HtmlTreeBuilderState$Constants.InTableFoster)) != 0) {
            this.insertInFosterParent(element);
        } else {
            object = this.currentElement();
            ((Element)object).appendChild(element);
        }
        this.push(element);
    }

    private boolean inSpecificScope(String string2, String[] stringArray, String[] stringArray2) {
        String[] stringArray3 = this.specificScopeTarget;
        stringArray3[0] = string2;
        return this.inSpecificScope(stringArray3, stringArray, stringArray2);
    }

    private boolean inSpecificScope(String[] stringArray, String[] stringArray2, String[] stringArray3) {
        int n3;
        ArrayList arrayList = this.stack;
        int n4 = arrayList.size();
        int n7 = n4 + -1;
        if (n7 > (n3 = 100)) {
            n4 += -101;
        } else {
            n4 = 0;
            arrayList = null;
        }
        while (n7 >= n4) {
            String string2;
            Object object = (Element)this.stack.get(n7);
            String string3 = ((Element)object).tag().namespace();
            boolean bl2 = string3.equals(string2 = "http://www.w3.org/1999/xhtml");
            if (bl2) {
                bl2 = StringUtil.inSorted((String)(object = ((Element)object).normalName()), stringArray);
                if (bl2) {
                    return true;
                }
                bl2 = StringUtil.inSorted((String)object, stringArray2);
                if (bl2) {
                    return false;
                }
                if (stringArray3 != null && (n3 = (int)(StringUtil.inSorted((String)object, stringArray3) ? 1 : 0)) != 0) {
                    return false;
                }
            }
            n7 += -1;
        }
        return false;
    }

    public static boolean isHtmlIntegration(Element object) {
        boolean bl2;
        boolean bl3;
        String string2;
        Object object2 = ((Element)object).tag().namespace();
        String string3 = "http://www.w3.org/1998/Math/MathML";
        boolean bl4 = string3.equals(object2);
        boolean bl5 = true;
        if (bl4 && (bl4 = (object2 = ((Element)object).normalName()).equals(string2 = "annotation-xml")) && ((bl3 = (object2 = Normalizer.normalize(((Node)object).attr("encoding"))).equals(string2 = "text/html")) || (bl4 = object2.equals(string2 = "application/xhtml+xml")))) {
            return bl5;
        }
        string2 = "http://www.w3.org/2000/svg";
        object2 = ((Element)object).tag().namespace();
        bl4 = string2.equals(object2);
        if (bl4 && (bl2 = StringUtil.in((String)(object = ((Element)object).tagName()), object2 = TagSvgHtmlIntegration))) {
            return bl5;
        }
        return false;
    }

    public static boolean isMathmlTextIntegration(Element object) {
        boolean bl2;
        String string2 = "http://www.w3.org/1998/Math/MathML";
        String[] stringArray = ((Element)object).tag().namespace();
        boolean bl3 = string2.equals(stringArray);
        if (bl3 && (bl2 = StringUtil.inSorted((String)(object = ((Element)object).normalName()), stringArray = TagMathMlTextIntegration))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    private static boolean isSameFormattingElement(Element cloneable, Element cloneable2) {
        boolean bl2;
        String string2;
        String string3 = ((Element)cloneable).normalName();
        boolean bl3 = string3.equals(string2 = cloneable2.normalName());
        if (bl3 && (bl2 = ((Attributes)(cloneable = ((Element)cloneable).attributes())).equals(cloneable2 = cloneable2.attributes()))) {
            bl2 = true;
        } else {
            bl2 = false;
            cloneable = null;
        }
        return bl2;
    }

    public static boolean isSpecial(Element object) {
        object = ((Element)object).normalName();
        String[] stringArray = TagSearchSpecial;
        return StringUtil.inSorted((String)object, stringArray);
    }

    private static boolean onStack(ArrayList arrayList, Element element) {
        int n3;
        int n4 = arrayList.size();
        int n7 = n4 + -1;
        n4 = n7 >= (n3 = 256) ? (n4 += -257) : 0;
        while (n7 >= n4) {
            Element element2 = (Element)arrayList.get(n7);
            if (element2 == element) {
                return true;
            }
            n7 += -1;
        }
        return false;
    }

    private static void replaceInQueue(ArrayList arrayList, Element element, Element element2) {
        int n3;
        int n4 = arrayList.lastIndexOf(element);
        n3 = n4 != (n3 = -1) ? 1 : 0;
        Validate.isTrue(n3 != 0);
        arrayList.set(n4, element2);
    }

    public Element aboveOnStack(Element cloneable) {
        ArrayList arrayList = this.stack;
        for (int i3 = arrayList.size() + -1; i3 >= 0; i3 += -1) {
            Element element = (Element)this.stack.get(i3);
            if (element != cloneable) continue;
            cloneable = this.stack;
            return (Element)((ArrayList)cloneable).get(i3 += -1);
        }
        return null;
    }

    public void addPendingTableCharacters(Token$Character object) {
        object = ((Token$Character)object).clone();
        this.pendingTableCharacters.add(object);
    }

    public void checkActiveFormattingElements(Element cloneable) {
        Element element;
        ArrayList arrayList = this.formattingElements;
        int n3 = arrayList.size();
        int n4 = n3 + -1;
        int n7 = 0;
        if ((n3 += -13) < 0) {
            n3 = 0;
            arrayList = null;
        }
        while (n4 >= n3 && (element = (Element)this.formattingElements.get(n4)) != null) {
            int n8 = HtmlTreeBuilder.isSameFormattingElement((Element)cloneable, element);
            if (n8 != 0) {
                ++n7;
            }
            if (n7 == (n8 = 3)) {
                cloneable = this.formattingElements;
                ((ArrayList)cloneable).remove(n4);
                break;
            }
            n4 += -1;
        }
    }

    public void clearFormattingElementsToLastMarker() {
        Cloneable cloneable;
        boolean bl2;
        while (!(bl2 = (cloneable = this.formattingElements).isEmpty()) && (cloneable = this.removeLastFormattingElement()) != null) {
        }
    }

    public void clearStackToTableBodyContext() {
        String[] stringArray = new String[]{"tbody", "tfoot", "thead", "template"};
        this.clearStackToContext(stringArray);
    }

    public void clearStackToTableContext() {
        String[] stringArray = new String[]{"table", "template"};
        this.clearStackToContext(stringArray);
    }

    public void clearStackToTableRowContext() {
        String[] stringArray = new String[]{"tr", "template"};
        this.clearStackToContext(stringArray);
    }

    public void closeElement(String string2) {
        this.generateImpliedEndTags(string2);
        Object object = this.currentElement().normalName();
        boolean bl2 = string2.equals(object);
        if (!bl2) {
            object = this.state();
            this.error((HtmlTreeBuilderState)((Object)object));
        }
        this.popStackToClose(string2);
    }

    public Element createElementFor(Token$StartTag object, String object2, boolean bl2) {
        int n3;
        Object object3;
        Attributes attributes = ((Token$Tag)object).attributes;
        if (!bl2) {
            object3 = this.settings;
            attributes = ((ParseSettings)object3).normalizeAttributes(attributes);
        }
        if (attributes != null && (n3 = attributes.isEmpty()) == 0 && (n3 = attributes.deduplicate((ParseSettings)(object3 = this.settings))) > 0) {
            object3 = ((Token$Tag)object).normalName;
            int n4 = 1;
            Object[] objectArray = new Object[n4];
            objectArray[0] = object3;
            object3 = "Dropped duplicate attribute(s) in tag [%s]";
            this.error((String)object3, objectArray);
        }
        object = ((Token$Tag)object).tagName;
        ParseSettings parseSettings = bl2 ? ParseSettings.preserveCase : this.settings;
        object = this.tagFor((String)object, (String)object2, parseSettings);
        object2 = ((Tag)object).normalName();
        boolean bl3 = ((String)object2).equals("form");
        bl2 = false;
        parseSettings = null;
        object2 = bl3 ? new FormElement((Tag)object, null, attributes) : new Element((Tag)object, null, attributes);
        return object2;
    }

    public HtmlTreeBuilderState currentTemplateMode() {
        Object object = this.tmplInsertMode;
        int n3 = object.size();
        if (n3 > 0) {
            object = this.tmplInsertMode;
            int n4 = 1;
            object = (HtmlTreeBuilderState)((Object)pp_0.a(n4, object));
        } else {
            n3 = 0;
            object = null;
        }
        return object;
    }

    public ParseSettings defaultSettings() {
        return ParseSettings.htmlDefault;
    }

    public void error(HtmlTreeBuilderState object) {
        ParseErrorList parseErrorList = this.parser.getErrors();
        boolean bl2 = parseErrorList.canAddError();
        if (bl2) {
            parseErrorList = this.parser.getErrors();
            CharacterReader characterReader = this.reader;
            String string2 = this.currentToken.tokenType();
            Token token = this.currentToken;
            int n3 = 3;
            Object[] objectArray = new Object[n3];
            objectArray[0] = string2;
            objectArray[1] = token;
            int n4 = 2;
            objectArray[n4] = object;
            object = "Unexpected %s token [%s] when in state [%s]";
            ParseError parseError = new ParseError(characterReader, (String)object, objectArray);
            ((AbstractCollection)parseErrorList).add(parseError);
        }
    }

    public void framesetOk(boolean bl2) {
        this.framesetOk = bl2;
    }

    public boolean framesetOk() {
        return this.framesetOk;
    }

    public void generateImpliedEndTags() {
        this.generateImpliedEndTags(false);
    }

    public void generateImpliedEndTags(String string2) {
        String[] stringArray;
        String string3;
        boolean bl2;
        while ((bl2 = StringUtil.inSorted(string3 = this.currentElement().normalName(), stringArray = TagSearchEndTags)) && (string2 == null || !(bl2 = this.currentElementIs(string2)))) {
            this.pop();
        }
    }

    public void generateImpliedEndTags(boolean bl2) {
        String string2;
        String string3;
        boolean bl3;
        String[] stringArray = bl2 ? TagThoroughSearchEndTags : TagSearchEndTags;
        while ((bl3 = (string3 = "http://www.w3.org/1999/xhtml").equals(string2 = this.currentElement().tag().namespace())) && (bl3 = StringUtil.inSorted(string2 = this.currentElement().normalName(), stringArray))) {
            this.pop();
        }
    }

    public Element getActiveFormattingElement(String string2) {
        Element element;
        ArrayList arrayList = this.formattingElements;
        for (int i3 = arrayList.size() + -1; i3 >= 0 && (element = (Element)this.formattingElements.get(i3)) != null; i3 += -1) {
            String string3 = element.normalName();
            boolean bl2 = string3.equals(string2);
            if (!bl2) continue;
            return element;
        }
        return null;
    }

    public String getBaseUri() {
        return this.baseUri;
    }

    public Document getDocument() {
        return this.doc;
    }

    public FormElement getFormElement() {
        return this.formElement;
    }

    public Element getFromStack(String string2) {
        int n3;
        ArrayList arrayList = this.stack;
        int n4 = arrayList.size();
        int n7 = n4 + -1;
        if (n7 >= (n3 = 256)) {
            n4 += -257;
        } else {
            n4 = 0;
            arrayList = null;
        }
        while (n7 >= n4) {
            String string3;
            Element element = (Element)this.stack.get(n7);
            String string4 = element.normalName();
            boolean bl2 = string4.equals(string2);
            if (bl2 && (bl2 = (string3 = "http://www.w3.org/1999/xhtml").equals(string4 = element.tag().namespace()))) {
                return element;
            }
            n7 += -1;
        }
        return null;
    }

    public Element getHeadElement() {
        return this.headElement;
    }

    public List getPendingTableCharacters() {
        return this.pendingTableCharacters;
    }

    public ArrayList getStack() {
        return this.stack;
    }

    public boolean inButtonScope(String string2) {
        String[] stringArray = TagSearchButton;
        return this.inScope(string2, stringArray);
    }

    public boolean inListItemScope(String string2) {
        String[] stringArray = TagSearchList;
        return this.inScope(string2, stringArray);
    }

    public boolean inScope(String string2) {
        return this.inScope(string2, null);
    }

    public boolean inScope(String string2, String[] stringArray) {
        String[] stringArray2 = TagsSearchInScope;
        return this.inSpecificScope(string2, stringArray2, stringArray);
    }

    public boolean inScope(String[] stringArray) {
        String[] stringArray2 = TagsSearchInScope;
        return this.inSpecificScope(stringArray, stringArray2, null);
    }

    public boolean inSelectScope(String string2) {
        ArrayList arrayList = this.stack;
        int n3 = arrayList.size();
        int n4 = 1;
        n3 -= n4;
        while (n3 >= 0) {
            String string3 = ((Element)this.stack.get(n3)).normalName();
            boolean bl2 = string3.equals(string2);
            if (bl2) {
                return n4 != 0;
            }
            String[] stringArray = TagSearchSelectScope;
            boolean bl3 = StringUtil.inSorted(string3, stringArray);
            if (!bl3) {
                return false;
            }
            n3 += -1;
        }
        Validate.fail("Should not be reachable");
        return false;
    }

    public boolean inTableScope(String string2) {
        String[] stringArray = TagSearchTableScope;
        return this.inSpecificScope(string2, stringArray, null);
    }

    public void initialiseParse(Reader object, String string2, Parser parser) {
        super.initialiseParse((Reader)object, string2, parser);
        object = HtmlTreeBuilderState.Initial;
        this.state = object;
        this.originalState = null;
        this.baseUriSetFromDoc = false;
        this.headElement = null;
        this.formElement = null;
        this.contextElement = null;
        object = new ArrayList();
        this.formattingElements = object;
        object = new ArrayList();
        this.tmplInsertMode = object;
        object = new ArrayList();
        this.pendingTableCharacters = object;
        object = new Token$EndTag();
        this.emptyEnd = object;
        this.framesetOk = true;
        this.fosterInserts = false;
        this.fragmentParsing = false;
    }

    public void insertCharacterNode(Token$Character token$Character) {
        Element element = this.currentElement();
        this.insertCharacterToElement(token$Character, element);
    }

    public void insertCharacterToElement(Token$Character cloneable, Element element) {
        String string2 = element.normalName();
        String string3 = ((Token$Character)cloneable).getData();
        boolean bl2 = ((Token)((Object)cloneable)).isCData();
        cloneable = bl2 ? new CDataNode(string3) : ((bl2 = this.isContentForTagData(string2)) ? new DataNode(string3) : new TextNode(string3));
        element.appendChild((Node)cloneable);
        this.onNodeInserted((Node)cloneable);
    }

    public void insertCommentNode(Token$Comment object) {
        object = ((Token$Comment)object).getData();
        Comment comment = new Comment((String)object);
        this.currentElement().appendChild(comment);
        this.onNodeInserted(comment);
    }

    public Element insertElementFor(Token$StartTag object) {
        Object object2 = null;
        Element element = this.createElementFor((Token$StartTag)object, "http://www.w3.org/1999/xhtml", false);
        this.doInsertElement(element, (Token)object);
        boolean bl2 = ((Token$Tag)object).isSelfClosing();
        if (bl2) {
            Object object3;
            object = element.tag();
            boolean bl3 = ((Tag)object).isKnownTag();
            if (bl3) {
                bl3 = ((Tag)object).isEmpty();
                if (!bl3) {
                    object3 = this.tokeniser;
                    object = ((Tag)object).normalName();
                    int n3 = 1;
                    Object[] objectArray = new Object[n3];
                    objectArray[0] = object;
                    object = "Tag [%s] cannot be self closing; not a void tag";
                    ((Tokeniser)object3).error((String)object, objectArray);
                }
            } else {
                ((Tag)object).setSelfClosing();
            }
            object = this.tokeniser;
            object2 = TokeniserState.Data;
            ((Tokeniser)object).transition((TokeniserState)((Object)object2));
            object = this.tokeniser;
            object2 = this.emptyEnd.reset();
            object3 = element.tagName();
            object2 = ((Token$Tag)object2).name((String)object3);
            ((Tokeniser)object).emit((Token)object2);
        }
        return element;
    }

    public Element insertEmptyElementFor(Token$StartTag token$StartTag) {
        Element element = this.createElementFor(token$StartTag, "http://www.w3.org/1999/xhtml", false);
        this.doInsertElement(element, token$StartTag);
        this.pop();
        return element;
    }

    public Element insertForeignElementFor(Token$StartTag object, String object2) {
        boolean bl2 = true;
        object2 = this.createElementFor((Token$StartTag)object, (String)object2, bl2);
        this.doInsertElement((Element)object2, (Token)object);
        boolean bl3 = ((Token$Tag)object).isSelfClosing();
        if (bl3) {
            object = ((Element)object2).tag();
            ((Tag)object).setSelfClosing();
            this.pop();
        }
        return object2;
    }

    public FormElement insertFormElement(Token$StartTag token$StartTag, boolean bl2, boolean bl3) {
        FormElement formElement = (FormElement)this.createElementFor(token$StartTag, "http://www.w3.org/1999/xhtml", false);
        if (bl3) {
            String string2 = "template";
            bl3 = this.onStack(string2);
            if (!bl3) {
                this.setFormElement(formElement);
            }
        } else {
            this.setFormElement(formElement);
        }
        this.doInsertElement(formElement, token$StartTag);
        if (!bl2) {
            this.pop();
        }
        return formElement;
    }

    public void insertInFosterParent(Node node) {
        Element element;
        Element element2 = this.getFromStack("table");
        boolean bl2 = false;
        Element element3 = null;
        if (element2 != null) {
            element = element2.parent();
            if (element != null) {
                element = element3 = element2.parent();
                bl2 = true;
            } else {
                element = this.aboveOnStack(element2);
            }
        } else {
            element = (Element)this.stack.get(0);
        }
        if (bl2) {
            Validate.notNull(element2);
            element2.before(node);
        } else {
            element.appendChild(node);
        }
    }

    public void insertMarkerToFormattingElements() {
        this.formattingElements.add(null);
    }

    public void insertOnStackAfter(Element element, Element element2) {
        ArrayList arrayList = this.stack;
        int n3 = arrayList.lastIndexOf(element);
        int n4 = -1;
        int n7 = 1;
        if (n3 != n4) {
            n4 = 1;
        } else {
            n4 = 0;
            arrayList = null;
        }
        Validate.isTrue(n4 != 0);
        arrayList = this.stack;
        arrayList.add(n3 += n7, element2);
    }

    public boolean isContentForTagData(String string2) {
        boolean bl2;
        String string3 = "script";
        boolean bl3 = string2.equals(string3);
        if (!bl3 && !(bl2 = string2.equals(string3 = "style"))) {
            bl2 = false;
            string2 = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public boolean isFosterInserts() {
        return this.fosterInserts;
    }

    public boolean isFragmentParsing() {
        return this.fragmentParsing;
    }

    public boolean isInActiveFormattingElements(Element element) {
        return HtmlTreeBuilder.onStack(this.formattingElements, element);
    }

    public Element lastFormattingElement() {
        Cloneable cloneable = this.formattingElements;
        int n3 = cloneable.size();
        if (n3 > 0) {
            cloneable = this.formattingElements;
            int n4 = 1;
            cloneable = (Element)pp_0.a(n4, cloneable);
        } else {
            n3 = 0;
            cloneable = null;
        }
        return cloneable;
    }

    public void markInsertionMode() {
        HtmlTreeBuilderState htmlTreeBuilderState;
        this.originalState = htmlTreeBuilderState = this.state;
    }

    public void maybeSetBaseUri(Element object) {
        int n3 = this.baseUriSetFromDoc;
        if (n3 != 0) {
            return;
        }
        Object object2 = "href";
        n3 = ((String)(object = ((Node)object).absUrl((String)object2))).length();
        if (n3 != 0) {
            this.baseUri = object;
            n3 = 1;
            this.baseUriSetFromDoc = n3;
            object2 = this.doc;
            ((Node)object2).setBaseUri((String)object);
        }
    }

    public HtmlTreeBuilder newInstance() {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        return htmlTreeBuilder;
    }

    public boolean onStack(String object) {
        boolean bl2;
        if ((object = this.getFromStack((String)object)) != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public boolean onStack(Element element) {
        return HtmlTreeBuilder.onStack(this.stack, element);
    }

    public boolean onStackNot(String[] stringArray) {
        int n3;
        ArrayList arrayList = this.stack;
        int n4 = arrayList.size();
        int n7 = n4 + -1;
        if (n7 > (n3 = 100)) {
            n4 += -101;
        } else {
            n4 = 0;
            arrayList = null;
        }
        while (n7 >= n4) {
            String string2 = ((Element)this.stack.get(n7)).normalName();
            n3 = (int)(StringUtil.inSorted(string2, stringArray) ? 1 : 0);
            if (n3 == 0) {
                return true;
            }
            n7 += -1;
        }
        return false;
    }

    public HtmlTreeBuilderState originalState() {
        return this.originalState;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public List parseFragment(String object, Element object2, String object3, Parser object4) {
        void var1_24;
        List list;
        int n3;
        block25: {
            int n4;
            Object object5;
            Object object6;
            block26: {
                block27: {
                    block24: {
                        HtmlTreeBuilderState htmlTreeBuilderState;
                        n3 = -1;
                        this.state = htmlTreeBuilderState = HtmlTreeBuilderState.Initial;
                        StringReader stringReader = new StringReader((String)object);
                        this.initialiseParse(stringReader, (String)object6, (Parser)object5);
                        this.contextElement = list;
                        this.fragmentParsing = n4 = 1;
                        if (list != null) break block24;
                        n4 = 0;
                        Object var1_23 = null;
                        break block25;
                    }
                    object5 = ((Node)((Object)list)).ownerDocument();
                    if (object5 != null) {
                        object5 = this.doc;
                        Document$QuirksMode document$QuirksMode = ((Node)((Object)list)).ownerDocument().quirksMode();
                        ((Document)object5).quirksMode(document$QuirksMode);
                    }
                    object5 = ((Element)((Object)list)).normalName();
                    object5.getClass();
                    int n7 = ((String)object5).hashCode();
                    switch (n7) {
                        case 2115613112: {
                            String string2 = "noembed";
                            n4 = (int)(((String)object5).equals(string2) ? 1 : 0);
                            if (n4 == 0) break;
                            n4 = 9;
                            break block26;
                        }
                        case 1973234167: {
                            String string3 = "plaintext";
                            n4 = (int)(((String)object5).equals(string3) ? 1 : 0);
                            if (n4 == 0) break;
                            n4 = 8;
                            break block26;
                        }
                        case 1192721831: {
                            String string4 = "noframes";
                            n4 = (int)(((String)object5).equals(string4) ? 1 : 0);
                            if (n4 == 0) break;
                            n4 = 7;
                            break block26;
                        }
                        case 110371416: {
                            String string5 = "title";
                            n4 = (int)(((String)object5).equals(string5) ? 1 : 0);
                            if (n4 == 0) break;
                            n4 = 6;
                            break block26;
                        }
                        case 109780401: {
                            String string6 = "style";
                            n4 = (int)(((String)object5).equals(string6) ? 1 : 0);
                            if (n4 == 0) break;
                            n4 = 5;
                            break block26;
                        }
                        case 118811: {
                            String string7 = "xmp";
                            n4 = (int)(((String)object5).equals(string7) ? 1 : 0);
                            if (n4 == 0) break;
                            n4 = 4;
                            break block26;
                        }
                        case -907685685: {
                            String string8 = "script";
                            n4 = (int)(((String)object5).equals(string8) ? 1 : 0);
                            if (n4 == 0) break;
                            n4 = 3;
                            break block26;
                        }
                        case -1003243718: {
                            String string9 = "textarea";
                            n4 = (int)(((String)object5).equals(string9) ? 1 : 0);
                            if (n4 == 0) break;
                            n4 = 2;
                            break block26;
                        }
                        case -1191214428: {
                            String string10 = "iframe";
                            n7 = (int)(((String)object5).equals(string10) ? 1 : 0);
                            if (n7 == 0) {
                                break;
                            }
                            break block26;
                        }
                        case -1321546630: {
                            String string11 = "template";
                            n4 = (int)(((String)object5).equals(string11) ? 1 : 0);
                            if (n4 != 0) break block27;
                        }
                    }
                    n4 = -1;
                    break block26;
                }
                n4 = 0;
                Object var1_12 = null;
            }
            switch (n4) {
                default: {
                    Tokeniser tokeniser = this.tokeniser;
                    TokeniserState tokeniserState = TokeniserState.Data;
                    tokeniser.transition(tokeniserState);
                    break;
                }
                case 8: {
                    Tokeniser tokeniser = this.tokeniser;
                    TokeniserState tokeniserState = TokeniserState.PLAINTEXT;
                    tokeniser.transition(tokeniserState);
                    break;
                }
                case 3: {
                    Tokeniser tokeniser = this.tokeniser;
                    TokeniserState tokeniserState = TokeniserState.ScriptData;
                    tokeniser.transition(tokeniserState);
                    break;
                }
                case 2: 
                case 6: {
                    Tokeniser tokeniser = this.tokeniser;
                    TokeniserState tokeniserState = TokeniserState.Rcdata;
                    tokeniser.transition(tokeniserState);
                    break;
                }
                case 1: 
                case 4: 
                case 5: 
                case 7: 
                case 9: {
                    Tokeniser tokeniser = this.tokeniser;
                    TokeniserState tokeniserState = TokeniserState.Rawtext;
                    tokeniser.transition(tokeniserState);
                    break;
                }
                case 0: {
                    Tokeniser tokeniser = this.tokeniser;
                    TokeniserState tokeniserState = TokeniserState.Data;
                    tokeniser.transition(tokeniserState);
                    HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.InTemplate;
                    this.pushTemplateMode(htmlTreeBuilderState);
                }
            }
            ParseSettings parseSettings = this.settings;
            object5 = this.tagFor((String)object5, parseSettings);
            Element element = new Element((Tag)object5, (String)object6);
            this.doc.appendChild(element);
            this.push(element);
            this.resetInsertionMode();
            for (object6 = list; object6 != null; object6 = ((Element)object6).parent()) {
                boolean bl2 = object6 instanceof FormElement;
                if (!bl2) continue;
                this.formElement = object6 = (FormElement)object6;
                break;
            }
        }
        this.runParser();
        if (list == null) {
            return this.doc.childNodes();
        }
        list = var1_24.siblingNodes();
        boolean bl3 = list.isEmpty();
        if (!bl3) {
            var1_24.insertChildren(n3, list);
        }
        return var1_24.childNodes();
    }

    public Element popStackToClose(String string2) {
        ArrayList arrayList = this.stack;
        for (int i3 = arrayList.size() + -1; i3 >= 0; i3 += -1) {
            String string3;
            Element element = this.pop();
            String string4 = element.normalName();
            boolean bl2 = string4.equals(string2);
            if (!bl2 || !(bl2 = (string3 = "http://www.w3.org/1999/xhtml").equals(string4 = element.tag().namespace()))) continue;
            return element;
        }
        return null;
    }

    public void popStackToClose(String ... stringArray) {
        boolean bl2;
        Object object;
        String string2;
        boolean bl3;
        ArrayList arrayList = this.stack;
        for (int i3 = arrayList.size() + -1; !(i3 < 0 || (bl3 = StringUtil.inSorted(string2 = ((Element)(object = this.pop())).normalName(), stringArray)) && (bl2 = (string2 = "http://www.w3.org/1999/xhtml").equals(object = ((Element)object).tag().namespace()))); i3 += -1) {
        }
    }

    public Element popStackToCloseAnyNamespace(String string2) {
        ArrayList arrayList = this.stack;
        for (int i3 = arrayList.size() + -1; i3 >= 0; i3 += -1) {
            Element element = this.pop();
            String string3 = element.normalName();
            boolean bl2 = string3.equals(string2);
            if (!bl2) continue;
            return element;
        }
        return null;
    }

    public HtmlTreeBuilderState popTemplateMode() {
        ArrayList arrayList = this.tmplInsertMode;
        int n3 = arrayList.size();
        if (n3 > 0) {
            arrayList = this.tmplInsertMode;
            int n4 = arrayList.size() + -1;
            return (HtmlTreeBuilderState)((Object)arrayList.remove(n4));
        }
        return null;
    }

    public int positionOfElement(Element element) {
        ArrayList arrayList;
        int n3;
        for (int i3 = 0; i3 < (n3 = (arrayList = this.formattingElements).size()); ++i3) {
            arrayList = this.formattingElements.get(i3);
            if (element != arrayList) continue;
            return i3;
        }
        return -1;
    }

    public boolean process(Token token) {
        boolean bl2 = this.useCurrentOrForeignInsert(token);
        HtmlTreeBuilderState htmlTreeBuilderState = bl2 ? this.state : HtmlTreeBuilderState.ForeignContent;
        return htmlTreeBuilderState.process(token, this);
    }

    public boolean process(Token token, HtmlTreeBuilderState htmlTreeBuilderState) {
        return htmlTreeBuilderState.process(token, this);
    }

    public void pushActiveFormattingElements(Element element) {
        this.checkActiveFormattingElements(element);
        this.formattingElements.add(element);
    }

    public void pushTemplateMode(HtmlTreeBuilderState htmlTreeBuilderState) {
        this.tmplInsertMode.add(htmlTreeBuilderState);
    }

    public void pushWithBookmark(Element element, int n3) {
        this.checkActiveFormattingElements(element);
        ArrayList arrayList = this.formattingElements;
        try {
            arrayList.add(n3, element);
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            ArrayList arrayList2 = this.formattingElements;
            arrayList2.add(element);
        }
    }

    /*
     * Unable to fully structure code
     */
    public void reconstructFormattingElements() {
        var1_1 = this.stack;
        var2_2 = var1_1.size();
        if (var2_2 > (var3_3 = 256)) {
            return;
        }
        var1_1 = this.lastFormattingElement();
        if (var1_1 != null && (var3_3 = (int)this.onStack((Element)var1_1)) == 0) {
            var4_4 = this.formattingElements;
            var3_3 = var4_4.size();
            var5_5 = var3_3 + -12;
            if (var5_5 < 0) {
                var5_5 = 0;
                var6_6 = null;
            }
            var7_7 = 1;
            var8_8 = var3_3 -= var7_7;
            while (var8_8 != var5_5) {
                var1_1 = this.formattingElements;
                if ((var1_1 = (Element)var1_1.get(var8_8 += -1)) != null && !(var9_9 = this.onStack((Element)var1_1))) continue;
                while (true) {
                    var7_7 = 0;
                    var10_10 = null;
                    break;
                }
                break;
            }
            if (var7_7 == 0) {
                var1_1 = this.formattingElements;
                var1_1 = (Element)var1_1.get(++var8_8);
            }
            Validate.notNull(var1_1);
            var10_10 = var1_1.normalName();
            var11_11 = this.settings;
            var10_10 = this.tagFor((String)var10_10, (ParseSettings)var11_11);
            var11_11 = var1_1.attributes().clone();
            var6_6 = new Element((Tag)var10_10, null, (Attributes)var11_11);
            this.doInsertElement(var6_6, null);
            var10_10 = this.formattingElements;
            var10_10.set(var8_8, var6_6);
            if (var8_8 != var3_3) ** continue;
        }
    }

    public void removeFromActiveFormattingElements(Element cloneable) {
        ArrayList arrayList = this.formattingElements;
        for (int i3 = arrayList.size() + -1; i3 >= 0; i3 += -1) {
            Element element = (Element)this.formattingElements.get(i3);
            if (element != cloneable) continue;
            cloneable = this.formattingElements;
            ((ArrayList)cloneable).remove(i3);
            break;
        }
    }

    public boolean removeFromStack(Element element) {
        ArrayList arrayList = this.stack;
        int n3 = arrayList.size();
        int n4 = 1;
        n3 -= n4;
        while (n3 >= 0) {
            Element element2 = (Element)this.stack.get(n3);
            if (element2 == element) {
                this.stack.remove(n3);
                this.onNodeClosed(element);
                return n4 != 0;
            }
            n3 += -1;
        }
        return false;
    }

    public Element removeLastFormattingElement() {
        ArrayList arrayList = this.formattingElements;
        int n3 = arrayList.size();
        if (n3 > 0) {
            ArrayList arrayList2 = this.formattingElements;
            return (Element)arrayList2.remove(n3 += -1);
        }
        return null;
    }

    public void replaceActiveFormattingElement(Element element, Element element2) {
        HtmlTreeBuilder.replaceInQueue(this.formattingElements, element, element2);
    }

    public void replaceOnStack(Element element, Element element2) {
        HtmlTreeBuilder.replaceInQueue(this.stack, element, element2);
    }

    public void resetBody() {
        Object object = "body";
        boolean bl2 = this.onStack((String)object);
        if (!bl2) {
            object = this.stack;
            Element element = this.doc.body();
            ((ArrayList)object).add(element);
        }
        object = HtmlTreeBuilderState.InBody;
        this.transition((HtmlTreeBuilderState)((Object)object));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean resetInsertionMode() {
        var1_1 = -1;
        var2_2 = this.stack;
        var3_3 = var2_2.size();
        var4_4 = true;
        var5_5 = var3_3 + -1;
        var6_6 = 256;
        if (var5_5 >= var6_6) {
            var3_3 += -257;
        } else {
            var3_3 = 0;
            var2_2 = null;
        }
        var7_7 = this.state;
        var8_8 /* !! */  = this.stack;
        var9_9 = var8_8 /* !! */ .size();
        if (var9_9 == 0) {
            var8_8 /* !! */  = HtmlTreeBuilderState.InBody;
            this.transition((HtmlTreeBuilderState)var8_8 /* !! */ );
        }
        var9_9 = 0;
        var8_8 /* !! */  = null;
        block31: while (var5_5 >= var3_3) {
            var10_10 = (Element)this.stack.get(var5_5);
            if (var5_5 == var3_3) {
                var9_9 = (int)this.fragmentParsing;
                if (var9_9 != 0) {
                    var10_10 = this.contextElement;
                }
                var9_9 = 1;
            }
            var11_11 = var10_10 != null ? var10_10.normalName() : "";
            var12_12 = "http://www.w3.org/1999/xhtml";
            var13_13 = var12_12.equals(var10_10 = var10_10.tag().namespace());
            if (var13_13 == 0) ** GOTO lbl171
            var11_11.getClass();
            var13_13 = var11_11.hashCode();
            switch (var13_13) lbl-1000:
            // 16 sources

            {
                default: {
                    var13_13 = -1;
                    break;
                }
                case 552573414: {
                    var10_10 = "caption";
                    var13_13 = (int)var11_11.equals(var10_10);
                    if (var13_13 == 0) ** GOTO lbl-1000
                    var13_13 = 14;
                    break;
                }
                case 110326868: {
                    var10_10 = "thead";
                    var13_13 = (int)var11_11.equals(var10_10);
                    if (var13_13 == 0) ** GOTO lbl-1000
                    var13_13 = 13;
                    break;
                }
                case 110277346: {
                    var10_10 = "tfoot";
                    var13_13 = (int)var11_11.equals(var10_10);
                    if (var13_13 == 0) ** GOTO lbl-1000
                    var13_13 = 12;
                    break;
                }
                case 110157846: {
                    var10_10 = "tbody";
                    var13_13 = (int)var11_11.equals(var10_10);
                    if (var13_13 == 0) ** GOTO lbl-1000
                    var13_13 = 11;
                    break;
                }
                case 110115790: {
                    var10_10 = "table";
                    var13_13 = (int)var11_11.equals(var10_10);
                    if (var13_13 == 0) ** GOTO lbl-1000
                    var13_13 = 10;
                    break;
                }
                case 3213227: {
                    var10_10 = "html";
                    var13_13 = (int)var11_11.equals(var10_10);
                    if (var13_13 == 0) ** GOTO lbl-1000
                    var13_13 = 9;
                    break;
                }
                case 3198432: {
                    var10_10 = "head";
                    var13_13 = (int)var11_11.equals(var10_10);
                    if (var13_13 == 0) ** GOTO lbl-1000
                    var13_13 = 8;
                    break;
                }
                case 3029410: {
                    var10_10 = "body";
                    var13_13 = (int)var11_11.equals(var10_10);
                    if (var13_13 == 0) ** GOTO lbl-1000
                    var13_13 = 7;
                    break;
                }
                case 3710: {
                    var10_10 = "tr";
                    var13_13 = (int)var11_11.equals(var10_10);
                    if (var13_13 == 0) ** GOTO lbl-1000
                    var13_13 = 6;
                    break;
                }
                case 3700: {
                    var10_10 = "th";
                    var13_13 = (int)var11_11.equals(var10_10);
                    if (var13_13 == 0) ** GOTO lbl-1000
                    var13_13 = 5;
                    break;
                }
                case 3696: {
                    var10_10 = "td";
                    var13_13 = (int)var11_11.equals(var10_10);
                    if (var13_13 == 0) ** GOTO lbl-1000
                    var13_13 = 4;
                    break;
                }
                case -636197633: {
                    var10_10 = "colgroup";
                    var13_13 = (int)var11_11.equals(var10_10);
                    if (var13_13 == 0) ** GOTO lbl-1000
                    var13_13 = 3;
                    break;
                }
                case -906021636: {
                    var10_10 = "select";
                    var13_13 = (int)var11_11.equals(var10_10);
                    if (var13_13 == 0) ** GOTO lbl-1000
                    var13_13 = 2;
                    break;
                }
                case -1321546630: {
                    var10_10 = "template";
                    var13_13 = (int)var11_11.equals(var10_10);
                    if (var13_13 == 0) ** GOTO lbl-1000
                    var13_13 = 1;
                    break;
                }
                case -1644953643: {
                    var10_10 = "frameset";
                    var13_13 = (int)var11_11.equals(var10_10);
                    if (var13_13 == 0) ** GOTO lbl-1000
                    var13_13 = 0;
                    var10_10 = null;
                }
            }
            switch (var13_13) {
                default: {
                    ** GOTO lbl167
                }
                case 14: {
                    var14_14 /* !! */  = HtmlTreeBuilderState.InCaption;
                    this.transition(var14_14 /* !! */ );
                    break block31;
                }
                case 11: 
                case 12: 
                case 13: {
                    var14_14 /* !! */  = HtmlTreeBuilderState.InTableBody;
                    this.transition(var14_14 /* !! */ );
                    break block31;
                }
                case 10: {
                    var14_14 /* !! */  = HtmlTreeBuilderState.InTable;
                    this.transition(var14_14 /* !! */ );
                    break block31;
                }
                case 9: {
                    var14_14 /* !! */  = this.headElement;
                    var14_14 /* !! */  = var14_14 /* !! */  == null ? HtmlTreeBuilderState.BeforeHead : HtmlTreeBuilderState.AfterHead;
                    this.transition(var14_14 /* !! */ );
                    break block31;
                }
                case 8: {
                    if (var9_9 == 0) {
                        var14_14 /* !! */  = HtmlTreeBuilderState.InHead;
                        this.transition(var14_14 /* !! */ );
                        break block31;
                    }
                    ** GOTO lbl167
                }
                case 7: {
                    var14_14 /* !! */  = HtmlTreeBuilderState.InBody;
                    this.transition(var14_14 /* !! */ );
                    break block31;
                }
                case 6: {
                    var14_14 /* !! */  = HtmlTreeBuilderState.InRow;
                    this.transition(var14_14 /* !! */ );
                    break block31;
                }
                case 4: 
                case 5: {
                    if (var9_9 == 0) {
                        var14_14 /* !! */  = HtmlTreeBuilderState.InCell;
                        this.transition(var14_14 /* !! */ );
                        break block31;
                    }
lbl167:
                    // 4 sources

                    if (var9_9 != 0) {
                        var14_14 /* !! */  = HtmlTreeBuilderState.InBody;
                        this.transition(var14_14 /* !! */ );
                        break block31;
                    }
lbl171:
                    // 3 sources

                    var5_5 += var1_1;
                    continue block31;
                }
                case 3: {
                    var14_14 /* !! */  = HtmlTreeBuilderState.InColumnGroup;
                    this.transition(var14_14 /* !! */ );
                    break block31;
                }
                case 2: {
                    var14_14 /* !! */  = HtmlTreeBuilderState.InSelect;
                    this.transition(var14_14 /* !! */ );
                    break block31;
                }
                case 1: {
                    var14_14 /* !! */  = this.currentTemplateMode();
                    var2_2 = "Bug: no template insertion mode on stack!";
                    Validate.notNull((Object)var14_14 /* !! */ , (String)var2_2);
                    this.transition(var14_14 /* !! */ );
                    break block31;
                }
                case 0: 
            }
            var14_14 /* !! */  = HtmlTreeBuilderState.InFrameset;
            this.transition(var14_14 /* !! */ );
            break;
        }
        if ((var14_14 /* !! */  = this.state) == var7_7) {
            var4_4 = false;
        }
        return var4_4;
    }

    public void resetPendingTableCharacters() {
        this.pendingTableCharacters.clear();
    }

    public void setFormElement(FormElement formElement) {
        this.formElement = formElement;
    }

    public void setFosterInserts(boolean bl2) {
        this.fosterInserts = bl2;
    }

    public void setHeadElement(Element element) {
        this.headElement = element;
    }

    public HtmlTreeBuilderState state() {
        return this.state;
    }

    public int templateModeSize() {
        return this.tmplInsertMode.size();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("TreeBuilder{currentToken=");
        Object object = this.currentToken;
        stringBuilder.append(object);
        stringBuilder.append(", state=");
        object = this.state;
        stringBuilder.append(object);
        stringBuilder.append(", currentElement=");
        object = this.currentElement();
        stringBuilder.append(object);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public void transition(HtmlTreeBuilderState htmlTreeBuilderState) {
        this.state = htmlTreeBuilderState;
    }

    public boolean useCurrentOrForeignInsert(Token token) {
        boolean bl2;
        Cloneable cloneable = this.stack;
        boolean bl3 = ((ArrayList)cloneable).isEmpty();
        boolean bl4 = true;
        if (bl3) {
            return bl4;
        }
        String string2 = "http://www.w3.org/1999/xhtml";
        cloneable = this.currentElement();
        String string3 = ((Element)cloneable).tag().namespace();
        boolean bl5 = string2.equals(string3);
        if (bl5) {
            return bl4;
        }
        bl5 = HtmlTreeBuilder.isMathmlTextIntegration((Element)cloneable);
        if (bl5) {
            String string4;
            bl5 = token.isStartTag();
            if (bl5 && !(bl5 = (string4 = "mglyph").equals(string2 = token.asStartTag().normalName)) && !(bl5 = (string4 = "malignmark").equals(string2 = token.asStartTag().normalName))) {
                return bl4;
            }
            bl5 = token.isCharacter();
            if (bl5) {
                return bl4;
            }
        }
        if ((bl2 = (string2 = "http://www.w3.org/1998/Math/MathML").equals(string3)) && (bl2 = (string3 = ((Element)cloneable).normalName()).equals(string2 = "annotation-xml")) && (bl2 = token.isStartTag()) && (bl2 = (string2 = "svg").equals(string3 = token.asStartTag().normalName))) {
            return bl4;
        }
        bl3 = HtmlTreeBuilder.isHtmlIntegration((Element)cloneable);
        if (bl3 && ((bl3 = token.isStartTag()) || (bl3 = token.isCharacter()))) {
            return bl4;
        }
        return token.isEOF();
    }
}

