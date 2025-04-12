/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.nodes;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.stream.Stream;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.internal.StringUtil;
import org.jsoup.internal.StringUtil$StringJoiner;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document$OutputSettings;
import org.jsoup.nodes.Document$OutputSettings$Syntax;
import org.jsoup.nodes.Element$NodeList;
import org.jsoup.nodes.Element$TextAccumulator;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.NodeUtils;
import org.jsoup.nodes.Range;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.parser.TokenQueue;
import org.jsoup.select.Collector;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Evaluator$AllElements;
import org.jsoup.select.Evaluator$Attribute;
import org.jsoup.select.Evaluator$AttributeStarting;
import org.jsoup.select.Evaluator$AttributeWithValue;
import org.jsoup.select.Evaluator$AttributeWithValueContaining;
import org.jsoup.select.Evaluator$AttributeWithValueEnding;
import org.jsoup.select.Evaluator$AttributeWithValueMatching;
import org.jsoup.select.Evaluator$AttributeWithValueNot;
import org.jsoup.select.Evaluator$AttributeWithValueStarting;
import org.jsoup.select.Evaluator$Class;
import org.jsoup.select.Evaluator$ContainsOwnText;
import org.jsoup.select.Evaluator$ContainsText;
import org.jsoup.select.Evaluator$Id;
import org.jsoup.select.Evaluator$IndexEquals;
import org.jsoup.select.Evaluator$IndexGreaterThan;
import org.jsoup.select.Evaluator$IndexLessThan;
import org.jsoup.select.Evaluator$Matches;
import org.jsoup.select.Evaluator$MatchesOwn;
import org.jsoup.select.Evaluator$Tag;
import org.jsoup.select.NodeFilter;
import org.jsoup.select.NodeFilter$FilterResult;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;
import org.jsoup.select.QueryParser;
import org.jsoup.select.Selector;

public class Element
extends Node {
    private static final String BaseUriKey;
    private static final Pattern ClassSplit;
    private static final List EmptyChildren;
    Attributes attributes;
    List childNodes;
    private WeakReference shadowChildrenRef;
    private Tag tag;

    static {
        EmptyChildren = Collections.emptyList();
        ClassSplit = Pattern.compile("\\s+");
        BaseUriKey = Attributes.internalKey("baseUri");
    }

    public Element(String object) {
        ParseSettings parseSettings = ParseSettings.preserveCase;
        object = Tag.valueOf((String)object, "http://www.w3.org/1999/xhtml", parseSettings);
        this((Tag)object, "", null);
    }

    public Element(String object, String string2) {
        ParseSettings parseSettings = ParseSettings.preserveCase;
        object = Tag.valueOf((String)object, string2, parseSettings);
        this((Tag)object, null);
    }

    public Element(Tag tag, String string2) {
        this(tag, string2, null);
    }

    public Element(Tag tag, String string2, Attributes attributes) {
        List list;
        Validate.notNull(tag);
        this.childNodes = list = Node.EmptyNodes;
        this.attributes = attributes;
        this.tag = tag;
        if (string2 != null) {
            this.setBaseUri(string2);
        }
    }

    public static /* synthetic */ void access$000(StringBuilder stringBuilder, TextNode textNode) {
        Element.appendNormalisedText(stringBuilder, textNode);
    }

    public static /* synthetic */ Tag access$100(Element element) {
        return element.tag;
    }

    private static void appendNormalisedText(StringBuilder stringBuilder, TextNode textNode) {
        boolean bl2;
        String string2 = textNode.getWholeText();
        Node node = textNode.parentNode;
        boolean bl3 = Element.preserveWhitespace(node);
        if (!bl3 && !(bl2 = textNode instanceof CDataNode)) {
            bl2 = TextNode.lastCharIsWhitespace(stringBuilder);
            StringUtil.appendNormalisedWhitespace(stringBuilder, string2, bl2);
        } else {
            stringBuilder.append(string2);
        }
    }

    private static void appendWholeText(Node object, StringBuilder stringBuilder) {
        boolean bl2 = object instanceof TextNode;
        if (bl2) {
            object = ((TextNode)object).getWholeText();
            stringBuilder.append((String)object);
        } else {
            String string2 = "br";
            boolean bl3 = ((Node)object).isNode(string2);
            if (bl3) {
                object = "\n";
                stringBuilder.append((String)object);
            }
        }
    }

    public static /* synthetic */ NodeFilter$FilterResult b(AtomicBoolean atomicBoolean, Node node, int n3) {
        return Element.lambda$hasText$1(atomicBoolean, node, n3);
    }

    private String cssSelectorComponent() {
        int n3;
        boolean bl2;
        int n4 = 1;
        String string2 = null;
        Object object = TokenQueue.escapeCssIdentifier(this.tagName()).replace("\\:", "|");
        StringBuilder stringBuilder = StringUtil.borrowBuilder();
        stringBuilder.append((String)object);
        object = new StringUtil$StringJoiner(".");
        Object object2 = this.classNames().iterator();
        while (bl2 = object2.hasNext()) {
            String string3 = TokenQueue.escapeCssIdentifier((String)object2.next());
            ((StringUtil$StringJoiner)object).add(string3);
        }
        int n7 = ((String)(object = ((StringUtil$StringJoiner)object).complete())).length();
        if (n7 > 0) {
            n7 = 46;
            stringBuilder.append((char)n7);
            stringBuilder.append((String)object);
        }
        if ((object = this.parent()) != null && (n3 = (object = this.parent()) instanceof Document) == 0) {
            stringBuilder.insert(0, " > ");
            object = this.parent();
            object2 = stringBuilder.toString();
            object = ((Element)object).select((String)object2);
            n3 = ((AbstractCollection)object).size();
            if (n3 > n4) {
                n3 = this.elementSiblingIndex() + n4;
                object = n3;
                Object object3 = new Object[n4];
                object3[0] = object;
                string2 = ":nth-child(%d)";
                object3 = String.format(string2, object3);
                stringBuilder.append((String)object3);
            }
            return StringUtil.releaseBuilder(stringBuilder);
        }
        return StringUtil.releaseBuilder(stringBuilder);
    }

    public static /* synthetic */ void d(StringBuilder stringBuilder, Node node) {
        Element.appendWholeText(node, stringBuilder);
    }

    public static /* synthetic */ void e(StringBuilder stringBuilder, Node node, int n3) {
        Element.lambda$data$2(stringBuilder, node, n3);
    }

    private static int indexInList(Element element, List list) {
        int n3 = list.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            Object e2 = list.get(i3);
            if (e2 != element) continue;
            return i3;
        }
        return 0;
    }

    private boolean isFormatAsBlock(Document$OutputSettings document$OutputSettings) {
        boolean bl2;
        Cloneable cloneable = this.tag;
        boolean bl3 = ((Tag)cloneable).isBlock();
        if (!(bl3 || (cloneable = this.parent()) != null && (bl3 = ((Tag)(cloneable = this.parent().tag())).formatAsBlock()) || (bl2 = document$OutputSettings.outline()))) {
            bl2 = false;
            document$OutputSettings = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    private boolean isInlineable(Document$OutputSettings object) {
        boolean bl2;
        Cloneable cloneable = this.tag;
        boolean bl3 = ((Tag)cloneable).isInline();
        boolean bl4 = false;
        if (!bl3) {
            return false;
        }
        cloneable = this.parent();
        if (!(cloneable != null && !(bl3 = ((Element)(cloneable = this.parent())).isBlock()) || (bl3 = this.isEffectivelyFirst()) || (bl2 = ((Document$OutputSettings)object).outline()) || (bl2 = this.isNode((String)(object = "br"))))) {
            bl4 = true;
        }
        return bl4;
    }

    private static /* synthetic */ void lambda$data$2(StringBuilder stringBuilder, Node object, int n3) {
        n3 = object instanceof DataNode;
        if (n3 != 0) {
            object = ((DataNode)object).getWholeData();
            stringBuilder.append((String)object);
        } else {
            n3 = object instanceof Comment;
            if (n3 != 0) {
                object = ((Comment)object).getData();
                stringBuilder.append((String)object);
            } else {
                n3 = object instanceof CDataNode;
                if (n3 != 0) {
                    object = ((CDataNode)object).getWholeText();
                    stringBuilder.append((String)object);
                }
            }
        }
    }

    private static /* synthetic */ NodeFilter$FilterResult lambda$hasText$1(AtomicBoolean atomicBoolean, Node node, int n3) {
        boolean bl2;
        n3 = node instanceof TextNode;
        if (n3 != 0 && !(bl2 = ((TextNode)(node = (TextNode)node)).isBlank())) {
            atomicBoolean.set(true);
            return NodeFilter$FilterResult.STOP;
        }
        return NodeFilter$FilterResult.CONTINUE;
    }

    private Elements nextElementSiblings(boolean bl2) {
        Elements elements = new Elements();
        Node node = this.parentNode;
        if (node == null) {
            return elements;
        }
        ((AbstractCollection)elements).add(this);
        Elements elements2 = bl2 ? elements.nextAll() : elements.prevAll();
        return elements2;
    }

    private void ownText(StringBuilder stringBuilder) {
        int n3;
        for (int i3 = 0; i3 < (n3 = this.childNodeSize()); ++i3) {
            Object object = (Node)this.childNodes.get(i3);
            boolean bl2 = object instanceof TextNode;
            if (bl2) {
                object = (TextNode)object;
                Element.appendNormalisedText(stringBuilder, (TextNode)object);
                continue;
            }
            String string2 = "br";
            n3 = (int)(((Node)object).isNode(string2) ? 1 : 0);
            if (n3 == 0 || (n3 = (int)(TextNode.lastCharIsWhitespace(stringBuilder) ? 1 : 0)) != 0) continue;
            object = " ";
            stringBuilder.append((String)object);
        }
    }

    public static boolean preserveWhitespace(Node node) {
        int n3 = node instanceof Element;
        if (n3 != 0) {
            int n4;
            int n7;
            node = (Element)node;
            n3 = 0;
            do {
                Tag tag = ((Element)node).tag;
                n4 = tag.preserveWhitespace();
                n7 = 1;
                if (n4 != 0) {
                    return n7 != 0;
                }
                node = ((Element)node).parent();
            } while ((n3 += n7) < (n4 = 6) && node != null);
        }
        return false;
    }

    private static String searchUpForAttribute(Element element, String string2) {
        while (element != null) {
            boolean bl2;
            Attributes attributes = element.attributes;
            if (attributes != null && (bl2 = attributes.hasKey(string2))) {
                return element.attributes.get(string2);
            }
            element = element.parent();
        }
        return "";
    }

    public Element addClass(String string2) {
        Validate.notNull(string2);
        Set set = this.classNames();
        set.add(string2);
        this.classNames(set);
        return this;
    }

    public Element after(String string2) {
        return (Element)super.after(string2);
    }

    public Element after(Node node) {
        return (Element)super.after(node);
    }

    public Element append(String nodeArray) {
        Validate.notNull(nodeArray);
        Node[] nodeArray2 = NodeUtils.parser(this);
        String string2 = this.baseUri();
        nodeArray = nodeArray2.parseFragmentInput((String)nodeArray, this, string2);
        nodeArray2 = new Node[]{};
        nodeArray = nodeArray.toArray(nodeArray2);
        this.addChildren(nodeArray);
        return this;
    }

    public Element appendChild(Node node) {
        Validate.notNull(node);
        this.reparentChild(node);
        this.ensureChildNodes();
        this.childNodes.add(node);
        int n3 = this.childNodes.size() + -1;
        node.setSiblingIndex(n3);
        return this;
    }

    public Element appendChildren(Collection collection) {
        this.insertChildren(-1, collection);
        return this;
    }

    public Element appendElement(String string2) {
        String string3 = this.tag.namespace();
        return this.appendElement(string2, string3);
    }

    public Element appendElement(String object, String string2) {
        ParseSettings parseSettings = NodeUtils.parser(this).settings();
        object = Tag.valueOf((String)object, string2, parseSettings);
        string2 = this.baseUri();
        Element element = new Element((Tag)object, string2);
        this.appendChild(element);
        return element;
    }

    public Element appendText(String string2) {
        Validate.notNull(string2);
        TextNode textNode = new TextNode(string2);
        this.appendChild(textNode);
        return this;
    }

    public Element appendTo(Element element) {
        Validate.notNull(element);
        element.appendChild(this);
        return this;
    }

    public Element attr(String string2, String string3) {
        super.attr(string2, string3);
        return this;
    }

    public Element attr(String string2, boolean bl2) {
        this.attributes().put(string2, bl2);
        return this;
    }

    public Attributes attributes() {
        Attributes attributes = this.attributes;
        if (attributes == null) {
            this.attributes = attributes = new Attributes();
        }
        return this.attributes;
    }

    public String baseUri() {
        String string2 = BaseUriKey;
        return Element.searchUpForAttribute(this, string2);
    }

    public Element before(String string2) {
        return (Element)super.before(string2);
    }

    public Element before(Node node) {
        return (Element)super.before(node);
    }

    public Element child(int n3) {
        return (Element)this.childElementsList().get(n3);
    }

    public List childElementsList() {
        int n3 = this.childNodeSize();
        if (n3 == 0) {
            return EmptyChildren;
        }
        Object object = this.shadowChildrenRef;
        if (object == null || (object = (List)((Reference)object).get()) == null) {
            object = this.childNodes;
            n3 = object.size();
            ArrayList<Node> arrayList = new ArrayList<Node>(n3);
            for (int i3 = 0; i3 < n3; ++i3) {
                Node node = (Node)this.childNodes.get(i3);
                boolean bl2 = node instanceof Element;
                if (!bl2) continue;
                node = (Element)node;
                arrayList.add(node);
            }
            object = new WeakReference(arrayList);
            this.shadowChildrenRef = object;
            object = arrayList;
        }
        return object;
    }

    public int childNodeSize() {
        return this.childNodes.size();
    }

    public Elements children() {
        List list = this.childElementsList();
        Elements elements = new Elements(list);
        return elements;
    }

    public int childrenSize() {
        return this.childElementsList().size();
    }

    public String className() {
        return this.attr("class").trim();
    }

    public Set classNames() {
        Object object = ClassSplit;
        LinkedHashSet linkedHashSet = this.className();
        object = object.split((CharSequence)((Object)linkedHashSet));
        object = Arrays.asList(object);
        linkedHashSet = new LinkedHashSet(object);
        linkedHashSet.remove("");
        return linkedHashSet;
    }

    public Element classNames(Set object) {
        Validate.notNull(object);
        boolean bl2 = object.isEmpty();
        String string2 = "class";
        if (bl2) {
            object = this.attributes();
            ((Attributes)object).remove(string2);
        } else {
            Attributes attributes = this.attributes();
            String string3 = " ";
            object = StringUtil.join(object, string3);
            attributes.put(string2, (String)object);
        }
        return this;
    }

    public Element clearAttributes() {
        Attributes attributes = this.attributes;
        if (attributes != null) {
            super.clearAttributes();
            attributes = this.attributes;
            int n3 = attributes.size();
            if (n3 == 0) {
                n3 = 0;
                attributes = null;
                this.attributes = null;
            }
        }
        return this;
    }

    public Element clone() {
        return (Element)super.clone();
    }

    public Element closest(String object) {
        object = QueryParser.parse((String)object);
        return this.closest((Evaluator)object);
    }

    public Element closest(Evaluator evaluator) {
        Validate.notNull(evaluator);
        Element element = this.root();
        Element element2 = this;
        do {
            boolean bl2;
            if (!(bl2 = evaluator.matches(element, element2))) continue;
            return element2;
        } while ((element2 = element2.parent()) != null);
        return null;
    }

    public String cssSelector() {
        int n3;
        Object object;
        CharSequence charSequence = this.id();
        int n4 = ((String)charSequence).length();
        if (n4 > 0) {
            int n7;
            charSequence = new StringBuilder("#");
            object = TokenQueue.escapeCssIdentifier(this.id());
            ((StringBuilder)charSequence).append((String)object);
            charSequence = ((StringBuilder)charSequence).toString();
            object = this.ownerDocument();
            if (object == null || (n3 = ((AbstractCollection)(object = ((Element)object).select((String)charSequence))).size()) == (n7 = 1) && (object = ((AbstractList)object).get(0)) == this) {
                return charSequence;
            }
        }
        charSequence = StringUtil.borrowBuilder();
        for (object = this; object != null && (n3 = object instanceof Document) == 0; object = ((Element)object).parent()) {
            String string2 = super.cssSelectorComponent();
            ((StringBuilder)charSequence).insert(0, string2);
        }
        return StringUtil.releaseBuilder((StringBuilder)charSequence);
    }

    public String data() {
        StringBuilder stringBuilder = StringUtil.borrowBuilder();
        gy1_1 gy1_12 = new gy1_1(stringBuilder, 2);
        this.traverse(gy1_12);
        return StringUtil.releaseBuilder(stringBuilder);
    }

    public List dataNodes() {
        boolean bl2;
        ArrayList<Node> arrayList = new ArrayList<Node>();
        Iterator iterator = this.childNodes.iterator();
        while (bl2 = iterator.hasNext()) {
            Node node = (Node)iterator.next();
            boolean bl3 = node instanceof DataNode;
            if (!bl3) continue;
            node = (DataNode)node;
            arrayList.add(node);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Map dataset() {
        return this.attributes().dataset();
    }

    public Element doClone(Node node) {
        node = (Element)super.doClone(node);
        Object object = this.attributes;
        object = object != null ? ((Attributes)object).clone() : null;
        ((Element)node).attributes = object;
        int n3 = this.childNodes.size();
        ((Element)node).childNodes = object = new Element$NodeList((Element)node, n3);
        List list = this.childNodes;
        object.addAll(list);
        return node;
    }

    public void doSetBaseUri(String string2) {
        Attributes attributes = this.attributes();
        String string3 = BaseUriKey;
        attributes.put(string3, string2);
    }

    public int elementSiblingIndex() {
        Object object = this.parent();
        if (object == null) {
            return 0;
        }
        object = this.parent().childElementsList();
        return Element.indexInList(this, (List)object);
    }

    public Element empty() {
        boolean bl2;
        Iterator iterator = this.childNodes.iterator();
        while (bl2 = iterator.hasNext()) {
            Node node = (Node)iterator.next();
            node.parentNode = null;
        }
        this.childNodes.clear();
        return this;
    }

    public Range endSourceRange() {
        return Range.of(this, false);
    }

    public List ensureChildNodes() {
        List list = this.childNodes;
        List list2 = Node.EmptyNodes;
        if (list == list2) {
            int n3 = 4;
            this.childNodes = list = new Element$NodeList(this, n3);
        }
        return this.childNodes;
    }

    public Element expectFirst(String string2) {
        Element element = Selector.selectFirst(string2, this);
        Object object = this.parent();
        object = object != null ? "No elements matched the query '%s' on element '%s'." : "No elements matched the query '%s' in the document.";
        String string3 = this.tagName();
        Object[] objectArray = new Object[]{string2, string3};
        return (Element)Validate.ensureNotNull(element, (String)object, objectArray);
    }

    public Element filter(NodeFilter nodeFilter) {
        return (Element)super.filter(nodeFilter);
    }

    public Element firstElementChild() {
        for (Node node = this.firstChild(); node != null; node = node.nextSibling()) {
            boolean bl2 = node instanceof Element;
            if (!bl2) continue;
            return (Element)node;
        }
        return null;
    }

    public Element firstElementSibling() {
        Element element = this.parent();
        if (element != null) {
            return this.parent().firstElementChild();
        }
        return this;
    }

    public Element forEach(Consumer consumer) {
        my0_2.a(this.stream(), consumer);
        return this;
    }

    public Element forEachNode(Consumer consumer) {
        return (Element)super.forEachNode(consumer);
    }

    public Elements getAllElements() {
        Evaluator$AllElements evaluator$AllElements = new Evaluator$AllElements();
        return Collector.collect(evaluator$AllElements, this);
    }

    public Element getElementById(String object) {
        Validate.notEmpty((String)object);
        Evaluator$Id evaluator$Id = new Evaluator$Id((String)object);
        object = Collector.collect(evaluator$Id, this);
        int n3 = ((AbstractCollection)object).size();
        if (n3 > 0) {
            return (Element)((AbstractList)object).get(0);
        }
        return null;
    }

    public Elements getElementsByAttribute(String string2) {
        Validate.notEmpty(string2);
        string2 = string2.trim();
        Evaluator$Attribute evaluator$Attribute = new Evaluator$Attribute(string2);
        return Collector.collect(evaluator$Attribute, this);
    }

    public Elements getElementsByAttributeStarting(String string2) {
        Validate.notEmpty(string2);
        string2 = string2.trim();
        Evaluator$AttributeStarting evaluator$AttributeStarting = new Evaluator$AttributeStarting(string2);
        return Collector.collect(evaluator$AttributeStarting, this);
    }

    public Elements getElementsByAttributeValue(String string2, String string3) {
        Evaluator$AttributeWithValue evaluator$AttributeWithValue = new Evaluator$AttributeWithValue(string2, string3);
        return Collector.collect(evaluator$AttributeWithValue, this);
    }

    public Elements getElementsByAttributeValueContaining(String string2, String string3) {
        Evaluator$AttributeWithValueContaining evaluator$AttributeWithValueContaining = new Evaluator$AttributeWithValueContaining(string2, string3);
        return Collector.collect(evaluator$AttributeWithValueContaining, this);
    }

    public Elements getElementsByAttributeValueEnding(String string2, String string3) {
        Evaluator$AttributeWithValueEnding evaluator$AttributeWithValueEnding = new Evaluator$AttributeWithValueEnding(string2, string3);
        return Collector.collect(evaluator$AttributeWithValueEnding, this);
    }

    public Elements getElementsByAttributeValueMatching(String string2, String object) {
        try {
            object = Pattern.compile((String)object);
        }
        catch (PatternSyntaxException patternSyntaxException) {
            object = kp1_0.c("Pattern syntax error: ", (String)object);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object, patternSyntaxException);
            throw illegalArgumentException;
        }
        return this.getElementsByAttributeValueMatching(string2, (Pattern)object);
    }

    public Elements getElementsByAttributeValueMatching(String string2, Pattern pattern) {
        Evaluator$AttributeWithValueMatching evaluator$AttributeWithValueMatching = new Evaluator$AttributeWithValueMatching(string2, pattern);
        return Collector.collect(evaluator$AttributeWithValueMatching, this);
    }

    public Elements getElementsByAttributeValueNot(String string2, String string3) {
        Evaluator$AttributeWithValueNot evaluator$AttributeWithValueNot = new Evaluator$AttributeWithValueNot(string2, string3);
        return Collector.collect(evaluator$AttributeWithValueNot, this);
    }

    public Elements getElementsByAttributeValueStarting(String string2, String string3) {
        Evaluator$AttributeWithValueStarting evaluator$AttributeWithValueStarting = new Evaluator$AttributeWithValueStarting(string2, string3);
        return Collector.collect(evaluator$AttributeWithValueStarting, this);
    }

    public Elements getElementsByClass(String string2) {
        Validate.notEmpty(string2);
        Evaluator$Class evaluator$Class = new Evaluator$Class(string2);
        return Collector.collect(evaluator$Class, this);
    }

    public Elements getElementsByIndexEquals(int n3) {
        Evaluator$IndexEquals evaluator$IndexEquals = new Evaluator$IndexEquals(n3);
        return Collector.collect(evaluator$IndexEquals, this);
    }

    public Elements getElementsByIndexGreaterThan(int n3) {
        Evaluator$IndexGreaterThan evaluator$IndexGreaterThan = new Evaluator$IndexGreaterThan(n3);
        return Collector.collect(evaluator$IndexGreaterThan, this);
    }

    public Elements getElementsByIndexLessThan(int n3) {
        Evaluator$IndexLessThan evaluator$IndexLessThan = new Evaluator$IndexLessThan(n3);
        return Collector.collect(evaluator$IndexLessThan, this);
    }

    public Elements getElementsByTag(String string2) {
        Validate.notEmpty(string2);
        string2 = Normalizer.normalize(string2);
        Evaluator$Tag evaluator$Tag = new Evaluator$Tag(string2);
        return Collector.collect(evaluator$Tag, this);
    }

    public Elements getElementsContainingOwnText(String string2) {
        Evaluator$ContainsOwnText evaluator$ContainsOwnText = new Evaluator$ContainsOwnText(string2);
        return Collector.collect(evaluator$ContainsOwnText, this);
    }

    public Elements getElementsContainingText(String string2) {
        Evaluator$ContainsText evaluator$ContainsText = new Evaluator$ContainsText(string2);
        return Collector.collect(evaluator$ContainsText, this);
    }

    public Elements getElementsMatchingOwnText(String object) {
        try {
            object = Pattern.compile((String)object);
        }
        catch (PatternSyntaxException patternSyntaxException) {
            object = kp1_0.c("Pattern syntax error: ", (String)object);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object, patternSyntaxException);
            throw illegalArgumentException;
        }
        return this.getElementsMatchingOwnText((Pattern)object);
    }

    public Elements getElementsMatchingOwnText(Pattern pattern) {
        Evaluator$MatchesOwn evaluator$MatchesOwn = new Evaluator$MatchesOwn(pattern);
        return Collector.collect(evaluator$MatchesOwn, this);
    }

    public Elements getElementsMatchingText(String object) {
        try {
            object = Pattern.compile((String)object);
        }
        catch (PatternSyntaxException patternSyntaxException) {
            object = kp1_0.c("Pattern syntax error: ", (String)object);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object, patternSyntaxException);
            throw illegalArgumentException;
        }
        return this.getElementsMatchingText((Pattern)object);
    }

    public Elements getElementsMatchingText(Pattern pattern) {
        Evaluator$Matches evaluator$Matches = new Evaluator$Matches(pattern);
        return Collector.collect(evaluator$Matches, this);
    }

    public boolean hasAttributes() {
        boolean bl2;
        Attributes attributes = this.attributes;
        if (attributes != null) {
            bl2 = true;
        } else {
            bl2 = false;
            attributes = null;
        }
        return bl2;
    }

    public boolean hasChildNodes() {
        boolean bl2;
        List list = this.childNodes;
        List list2 = Node.EmptyNodes;
        if (list != list2) {
            bl2 = true;
        } else {
            bl2 = false;
            list = null;
        }
        return bl2;
    }

    public boolean hasClass(String string2) {
        Object object = this.attributes;
        if (object == null) {
            return false;
        }
        String string3 = "class";
        object = ((Attributes)object).getIgnoreCase(string3);
        int n3 = ((String)object).length();
        int n4 = string2.length();
        if (n3 != 0 && n3 >= n4) {
            if (n3 == n4) {
                return string2.equalsIgnoreCase((String)object);
            }
            int n7 = 0;
            int n8 = 0;
            for (int i3 = 0; i3 < n3; ++i3) {
                boolean bl2 = Character.isWhitespace(((String)object).charAt(i3));
                boolean bl3 = true;
                if (bl2) {
                    if (n7 == 0) continue;
                    n7 = i3 - n8;
                    if (n7 == n4 && (n7 = (int)(((String)object).regionMatches(bl2 = true, n8, string2, 0, n4) ? 1 : 0)) != 0) {
                        return bl3;
                    }
                    n7 = 0;
                    continue;
                }
                if (n7 != 0) continue;
                n8 = i3;
                n7 = 1;
            }
            if (n7 != 0 && (n3 -= n8) == n4) {
                return ((String)object).regionMatches(true, n8, string2, 0, n4);
            }
        }
        return false;
    }

    public boolean hasText() {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        iy1_0 iy1_02 = new iy1_0(atomicBoolean, 2);
        this.filter(iy1_02);
        return atomicBoolean.get();
    }

    public Appendable html(Appendable appendable) {
        List list = this.childNodes;
        int n3 = list.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            Node node = (Node)this.childNodes.get(i3);
            node.outerHtml(appendable);
        }
        return appendable;
    }

    public String html() {
        CharSequence charSequence = StringUtil.borrowBuilder();
        this.html((Appendable)((Object)charSequence));
        charSequence = StringUtil.releaseBuilder((StringBuilder)charSequence);
        Document$OutputSettings document$OutputSettings = NodeUtils.outputSettings(this);
        boolean bl2 = document$OutputSettings.prettyPrint();
        if (bl2) {
            charSequence = ((String)charSequence).trim();
        }
        return charSequence;
    }

    public Element html(String string2) {
        this.empty();
        this.append(string2);
        return this;
    }

    public String id() {
        Object object = this.attributes;
        if (object != null) {
            String string2 = "id";
            object = ((Attributes)object).getIgnoreCase(string2);
        } else {
            object = "";
        }
        return object;
    }

    public Element id(String string2) {
        Validate.notNull(string2);
        this.attr("id", string2);
        return this;
    }

    public Element insertChildren(int n3, Collection nodeArray) {
        int n4;
        ArrayList arrayList = "Children collection to be inserted must not be null.";
        Validate.notNull(nodeArray, (String)((Object)arrayList));
        int n7 = this.childNodeSize();
        if (n3 < 0) {
            n4 = n7 + 1;
            n3 += n4;
        }
        n4 = 0;
        if (n3 >= 0 && n3 <= n7) {
            n7 = 1;
        } else {
            n7 = 0;
            arrayList = null;
        }
        Validate.isTrue(n7 != 0, "Insert position out of bounds.");
        arrayList = new ArrayList(nodeArray);
        nodeArray = new Node[]{};
        nodeArray = arrayList.toArray(nodeArray);
        this.addChildren(n3, nodeArray);
        return this;
    }

    public Element insertChildren(int n3, Node ... nodeArray) {
        String string2 = "Children collection to be inserted must not be null.";
        Validate.notNull(nodeArray, string2);
        int n4 = this.childNodeSize();
        if (n3 < 0) {
            int n7 = n4 + 1;
            n3 += n7;
        }
        if (n3 >= 0 && n3 <= n4) {
            n4 = 1;
        } else {
            n4 = 0;
            string2 = null;
        }
        Validate.isTrue(n4 != 0, "Insert position out of bounds.");
        this.addChildren(n3, nodeArray);
        return this;
    }

    public boolean is(String object) {
        object = QueryParser.parse((String)object);
        return this.is((Evaluator)object);
    }

    public boolean is(Evaluator evaluator) {
        Element element = this.root();
        return evaluator.matches(element, this);
    }

    public boolean isBlock() {
        return this.tag.isBlock();
    }

    public Element lastElementChild() {
        for (Node node = this.lastChild(); node != null; node = node.previousSibling()) {
            boolean bl2 = node instanceof Element;
            if (!bl2) continue;
            return (Element)node;
        }
        return null;
    }

    public Element lastElementSibling() {
        Element element = this.parent();
        if (element != null) {
            return this.parent().lastElementChild();
        }
        return this;
    }

    public Element nextElementSibling() {
        Node node = this;
        while ((node = node.nextSibling()) != null) {
            boolean bl2 = node instanceof Element;
            if (!bl2) continue;
            return node;
        }
        return null;
    }

    public Elements nextElementSiblings() {
        return this.nextElementSiblings(true);
    }

    public String nodeName() {
        return this.tag.getName();
    }

    public void nodelistChanged() {
        super.nodelistChanged();
        this.shadowChildrenRef = null;
    }

    public String normalName() {
        return this.tag.normalName();
    }

    public void outerHtmlHead(Appendable appendable, int n3, Document$OutputSettings object) {
        Object object2;
        int n4 = this.shouldIndent((Document$OutputSettings)object);
        if (n4 != 0) {
            n4 = appendable instanceof StringBuilder;
            if (n4 != 0) {
                object2 = appendable;
                object2 = (StringBuilder)appendable;
                n4 = ((StringBuilder)object2).length();
                if (n4 > 0) {
                    this.indent(appendable, n3, (Document$OutputSettings)object);
                }
            } else {
                this.indent(appendable, n3, (Document$OutputSettings)object);
            }
        }
        n3 = 60;
        Object object3 = appendable.append((char)n3);
        object2 = this.tagName();
        object3.append((CharSequence)object2);
        object3 = this.attributes;
        if (object3 != null) {
            ((Attributes)object3).html(appendable, (Document$OutputSettings)object);
        }
        object3 = this.childNodes;
        n3 = (int)(object3.isEmpty() ? 1 : 0);
        n4 = 62;
        if (n3 != 0 && (n3 = (int)(((Tag)(object3 = this.tag)).isSelfClosing() ? 1 : 0)) != 0) {
            object3 = object.syntax();
            if (object3 == (object = Document$OutputSettings$Syntax.html) && (n3 = (int)(((Tag)(object3 = this.tag)).isEmpty() ? 1 : 0)) != 0) {
                appendable.append((char)n4);
            } else {
                object3 = " />";
                appendable.append((CharSequence)object3);
            }
        } else {
            appendable.append((char)n4);
        }
    }

    public void outerHtmlTail(Appendable appendable, int n3, Document$OutputSettings document$OutputSettings) {
        block2: {
            block3: {
                block4: {
                    int n4;
                    boolean bl2;
                    boolean bl3;
                    boolean bl4;
                    Object object = this.childNodes;
                    boolean n7 = object.isEmpty();
                    if (n7 && (bl4 = ((Tag)(object = this.tag)).isSelfClosing())) break block2;
                    boolean bl5 = document$OutputSettings.prettyPrint();
                    if (!bl5 || (bl3 = (object = this.childNodes).isEmpty())) break block3;
                    object = this.tag;
                    boolean bl6 = ((Tag)object).formatAsBlock();
                    if (bl6 && !(bl2 = Element.preserveWhitespace((Node)(object = this.parentNode)))) break block4;
                    boolean bl7 = document$OutputSettings.outline();
                    if (!bl7) break block3;
                    object = this.childNodes;
                    int n8 = object.size();
                    if (n8 > (n4 = 1)) break block4;
                    object = this.childNodes;
                    int n10 = object.size();
                    if (n10 != n4) break block3;
                    object = this.childNodes;
                    n4 = 0;
                    boolean bl8 = (object = object.get(0)) instanceof Element;
                    if (!bl8) break block3;
                }
                this.indent(appendable, n3, document$OutputSettings);
            }
            appendable = appendable.append("</");
            String string2 = this.tagName();
            appendable = appendable.append(string2);
            n3 = 62;
            appendable.append((char)n3);
        }
    }

    public String ownText() {
        StringBuilder stringBuilder = StringUtil.borrowBuilder();
        this.ownText(stringBuilder);
        return StringUtil.releaseBuilder(stringBuilder).trim();
    }

    public final Element parent() {
        return (Element)this.parentNode;
    }

    public Elements parents() {
        String string2;
        boolean bl2;
        Elements elements = new Elements();
        for (Element element = this.parent(); element != null && !(bl2 = element.isNode(string2 = "#root")); element = element.parent()) {
            ((AbstractCollection)elements).add(element);
        }
        return elements;
    }

    public Element prepend(String nodeArray) {
        Validate.notNull(nodeArray);
        Parser parser = NodeUtils.parser(this);
        Node[] nodeArray2 = this.baseUri();
        nodeArray = parser.parseFragmentInput((String)nodeArray, this, (String)nodeArray2);
        nodeArray2 = new Node[]{};
        nodeArray = nodeArray.toArray(nodeArray2);
        this.addChildren(0, nodeArray);
        return this;
    }

    public Element prependChild(Node node) {
        Validate.notNull(node);
        Node[] nodeArray = new Node[]{node};
        this.addChildren(0, nodeArray);
        return this;
    }

    public Element prependChildren(Collection collection) {
        this.insertChildren(0, collection);
        return this;
    }

    public Element prependElement(String string2) {
        String string3 = this.tag.namespace();
        return this.prependElement(string2, string3);
    }

    public Element prependElement(String object, String string2) {
        ParseSettings parseSettings = NodeUtils.parser(this).settings();
        object = Tag.valueOf((String)object, string2, parseSettings);
        string2 = this.baseUri();
        Element element = new Element((Tag)object, string2);
        this.prependChild(element);
        return element;
    }

    public Element prependText(String string2) {
        Validate.notNull(string2);
        TextNode textNode = new TextNode(string2);
        this.prependChild(textNode);
        return this;
    }

    public Element previousElementSibling() {
        Node node = this;
        while ((node = node.previousSibling()) != null) {
            boolean bl2 = node instanceof Element;
            if (!bl2) continue;
            return node;
        }
        return null;
    }

    public Elements previousElementSiblings() {
        return this.nextElementSiblings(false);
    }

    public Element removeAttr(String string2) {
        return (Element)super.removeAttr(string2);
    }

    public Element removeClass(String string2) {
        Validate.notNull(string2);
        Set set = this.classNames();
        set.remove(string2);
        this.classNames(set);
        return this;
    }

    public Element root() {
        return (Element)super.root();
    }

    public Elements select(String string2) {
        return Selector.select(string2, this);
    }

    public Elements select(Evaluator evaluator) {
        return Selector.select(evaluator, this);
    }

    public Element selectFirst(String string2) {
        return Selector.selectFirst(string2, this);
    }

    public Element selectFirst(Evaluator evaluator) {
        return Collector.findFirst(evaluator, this);
    }

    public List selectXpath(String string2, Class clazz) {
        return NodeUtils.selectXpath(string2, this, clazz);
    }

    public Elements selectXpath(String object) {
        object = NodeUtils.selectXpath((String)object, this, Element.class);
        Elements elements = new Elements((List)object);
        return elements;
    }

    public Element shallowClone() {
        String string2 = this.baseUri();
        boolean bl2 = string2.isEmpty();
        Object object = null;
        if (bl2) {
            string2 = null;
        }
        Tag tag = this.tag;
        Attributes attributes = this.attributes;
        if (attributes != null) {
            object = attributes.clone();
        }
        Element element = new Element(tag, string2, (Attributes)object);
        return element;
    }

    public boolean shouldIndent(Document$OutputSettings cloneable) {
        boolean bl2;
        boolean bl3 = cloneable.prettyPrint();
        if (bl3 && (bl3 = this.isFormatAsBlock((Document$OutputSettings)cloneable)) && !(bl2 = this.isInlineable((Document$OutputSettings)cloneable)) && !(bl2 = Element.preserveWhitespace((Node)(cloneable = this.parentNode)))) {
            bl2 = true;
        } else {
            bl2 = false;
            cloneable = null;
        }
        return bl2;
    }

    public Elements siblingElements() {
        Object object = this.parentNode;
        if (object == null) {
            object = new Object(0);
            return object;
        }
        object = this.parent().childElementsList();
        int n3 = object.size() + -1;
        Elements elements = new Elements(n3);
        object = object.iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            Element element = (Element)object.next();
            if (element == this) continue;
            ((AbstractCollection)elements).add(element);
        }
        return elements;
    }

    public Stream stream() {
        return NodeUtils.stream(this, Element.class);
    }

    public Tag tag() {
        return this.tag;
    }

    public String tagName() {
        return this.tag.getName();
    }

    public Element tagName(String string2) {
        String string3 = this.tag.namespace();
        return this.tagName(string2, string3);
    }

    public Element tagName(String object, String string2) {
        Validate.notEmptyParam((String)object, "tagName");
        Validate.notEmptyParam(string2, "namespace");
        ParseSettings parseSettings = NodeUtils.parser(this).settings();
        this.tag = object = Tag.valueOf((String)object, string2, parseSettings);
        return this;
    }

    public String text() {
        StringBuilder stringBuilder = StringUtil.borrowBuilder();
        Element$TextAccumulator element$TextAccumulator = new Element$TextAccumulator(stringBuilder);
        NodeTraversor.traverse((NodeVisitor)element$TextAccumulator, this);
        return StringUtil.releaseBuilder(stringBuilder).trim();
    }

    public Element text(String string2) {
        String string3;
        boolean bl2;
        Validate.notNull(string2);
        this.empty();
        Object object = this.ownerDocument();
        if (object != null && (bl2 = ((Parser)(object = ((Document)object).parser())).isContentForTagData(string3 = this.normalName()))) {
            object = new DataNode(string2);
            this.appendChild((Node)object);
        } else {
            object = new TextNode(string2);
            this.appendChild((Node)object);
        }
        return this;
    }

    public List textNodes() {
        boolean bl2;
        ArrayList<Node> arrayList = new ArrayList<Node>();
        Iterator iterator = this.childNodes.iterator();
        while (bl2 = iterator.hasNext()) {
            Node node = (Node)iterator.next();
            boolean bl3 = node instanceof TextNode;
            if (!bl3) continue;
            node = (TextNode)node;
            arrayList.add(node);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Element toggleClass(String string2) {
        Validate.notNull(string2);
        Set set = this.classNames();
        boolean bl2 = set.contains(string2);
        if (bl2) {
            set.remove(string2);
        } else {
            set.add(string2);
        }
        this.classNames(set);
        return this;
    }

    public Element traverse(NodeVisitor nodeVisitor) {
        return (Element)super.traverse(nodeVisitor);
    }

    public String val() {
        String string2;
        String string3 = this.normalName();
        boolean bl2 = string3.equals(string2 = "textarea");
        if (bl2) {
            return this.text();
        }
        return this.attr("value");
    }

    public Element val(String string2) {
        String string3;
        String string4 = this.normalName();
        boolean bl2 = string4.equals(string3 = "textarea");
        if (bl2) {
            this.text(string2);
        } else {
            string4 = "value";
            this.attr(string4, string2);
        }
        return this;
    }

    public String wholeOwnText() {
        StringBuilder stringBuilder = StringUtil.borrowBuilder();
        int n3 = this.childNodeSize();
        for (int i3 = 0; i3 < n3; ++i3) {
            Node node = (Node)this.childNodes.get(i3);
            Element.appendWholeText(node, stringBuilder);
        }
        return StringUtil.releaseBuilder(stringBuilder);
    }

    public String wholeText() {
        StringBuilder stringBuilder = StringUtil.borrowBuilder();
        Stream stream = this.nodeStream();
        oy0_2 oy0_22 = new oy0_2(stringBuilder);
        ny0_2.a(stream, oy0_22);
        return StringUtil.releaseBuilder(stringBuilder);
    }

    public Element wrap(String string2) {
        return (Element)super.wrap(string2);
    }
}

