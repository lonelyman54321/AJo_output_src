/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.nodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document$OutputSettings;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node$OuterHtmlVisitor;
import org.jsoup.nodes.NodeUtils;
import org.jsoup.nodes.Range;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Parser;
import org.jsoup.select.NodeFilter;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;

public abstract class Node
implements Cloneable {
    static final List EmptyNodes = Collections.emptyList();
    static final String EmptyString = "";
    Node parentNode;
    int siblingIndex;

    private void addSiblingHtml(int n3, String nodeArray) {
        Validate.notNull(nodeArray);
        Validate.notNull(this.parentNode);
        Node node = this.parent();
        boolean bl2 = node instanceof Element;
        if (bl2) {
            node = (Element)this.parent();
        } else {
            bl2 = false;
            node = null;
        }
        Node[] nodeArray2 = NodeUtils.parser(this);
        String string2 = this.baseUri();
        nodeArray = nodeArray2.parseFragmentInput((String)nodeArray, (Element)node, string2);
        node = this.parentNode;
        nodeArray2 = new Node[]{};
        nodeArray = nodeArray.toArray(nodeArray2);
        node.addChildren(n3, nodeArray);
    }

    private Element getDeepChild(Element element) {
        Element element2 = element.firstElementChild();
        while (true) {
            Element element3 = element2;
            element2 = element;
            element = element3;
            if (element3 == null) break;
            element2 = element3.firstElementChild();
        }
        return element2;
    }

    public static boolean isNode(Node object, String string2) {
        boolean bl2;
        if (object != null && (bl2 = ((String)(object = ((Node)object).normalName())).equals(string2))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    private void reindexChildren(int n3) {
        int n4 = this.childNodeSize();
        if (n4 == 0) {
            return;
        }
        List list = this.ensureChildNodes();
        while (n3 < n4) {
            Node node = (Node)list.get(n3);
            node.setSiblingIndex(n3);
            ++n3;
        }
    }

    public String absUrl(String string2) {
        Object object;
        Validate.notEmpty(string2);
        boolean bl2 = this.hasAttributes();
        if (bl2 && (bl2 = ((Attributes)(object = this.attributes())).hasKeyIgnoreCase(string2))) {
            object = this.baseUri();
            string2 = this.attributes().getIgnoreCase(string2);
            return StringUtil.resolve((String)object, string2);
        }
        return EmptyString;
    }

    public void addChildren(int n3, Node ... object) {
        Object object2;
        int n4;
        Object object3;
        block11: {
            block13: {
                block12: {
                    int n7;
                    int n8;
                    Validate.notNull(object);
                    int n10 = ((Node[])object).length;
                    if (n10 == 0) {
                        return;
                    }
                    object3 = this.ensureChildNodes();
                    n4 = 0;
                    Object object4 = object[0].parent();
                    if (object4 == null || (n8 = ((Node)object4).childNodeSize()) != (n7 = ((Node[])object).length)) break block11;
                    object2 = ((Node)object4).ensureChildNodes();
                    n7 = ((Node[])object).length;
                    while (true) {
                        int n14 = n7 + -1;
                        if (n7 <= 0) break;
                        Node node = object[n14];
                        Object e2 = object2.get(n14);
                        if (node == e2) {
                            n7 = n14;
                            continue;
                        }
                        break block11;
                        break;
                    }
                    n8 = this.childNodeSize();
                    if (n8 == 0) {
                        n8 = 1;
                    } else {
                        n8 = 0;
                        object2 = null;
                    }
                    ((Node)object4).empty();
                    object4 = Arrays.asList(object);
                    object3.addAll(n3, object4);
                    n10 = ((Node[])object).length;
                    while (true) {
                        int n15 = n10 + -1;
                        if (n10 <= 0) break;
                        object3 = object[n15];
                        ((Node)object3).parentNode = this;
                        n10 = n15;
                    }
                    if (n8 == 0) break block12;
                    object = object[0];
                    int n16 = object.siblingIndex;
                    if (n16 == 0) break block13;
                }
                this.reindexChildren(n3);
            }
            return;
        }
        Validate.noNullElements(object);
        int n17 = ((Node[])object).length;
        while (n4 < n17) {
            object2 = object[n4];
            this.reparentChild((Node)object2);
            ++n4;
        }
        object = Arrays.asList(object);
        object3.addAll(n3, object);
        this.reindexChildren(n3);
    }

    public void addChildren(Node ... nodeArray) {
        List list = this.ensureChildNodes();
        for (Node node : nodeArray) {
            this.reparentChild(node);
            list.add(node);
            int n3 = list.size() + -1;
            node.setSiblingIndex(n3);
        }
    }

    public Node after(String string2) {
        int n3 = this.siblingIndex + 1;
        this.addSiblingHtml(n3, string2);
        return this;
    }

    public Node after(Node node) {
        int n3 = 1;
        Validate.notNull(node);
        Validate.notNull(this.parentNode);
        Node node2 = node.parentNode;
        Node node3 = this.parentNode;
        if (node2 == node3) {
            node.remove();
        }
        node2 = this.parentNode;
        int n4 = this.siblingIndex + n3;
        Node[] nodeArray = new Node[n3];
        nodeArray[0] = node;
        node2.addChildren(n4, nodeArray);
        return this;
    }

    public String attr(String string2) {
        Validate.notNull(string2);
        boolean bl2 = this.hasAttributes();
        String string3 = EmptyString;
        if (!bl2) {
            return string3;
        }
        String string4 = this.attributes().getIgnoreCase(string2);
        int n3 = string4.length();
        if (n3 > 0) {
            return string4;
        }
        string4 = "abs:";
        bl2 = string2.startsWith(string4);
        if (bl2) {
            string2 = string2.substring(4);
            return this.absUrl(string2);
        }
        return string3;
    }

    public Node attr(String string2, String string3) {
        string2 = NodeUtils.parser(this).settings().normalizeAttribute(string2);
        this.attributes().putIgnoreCase(string2, string3);
        return this;
    }

    public abstract Attributes attributes();

    public int attributesSize() {
        int n3 = this.hasAttributes();
        if (n3 != 0) {
            Attributes attributes = this.attributes();
            n3 = attributes.size();
        } else {
            n3 = 0;
            Object var2_3 = null;
        }
        return n3;
    }

    public abstract String baseUri();

    public Node before(String string2) {
        int n3 = this.siblingIndex;
        this.addSiblingHtml(n3, string2);
        return this;
    }

    public Node before(Node node) {
        Validate.notNull(node);
        Validate.notNull(this.parentNode);
        Node node2 = node.parentNode;
        Node node3 = this.parentNode;
        if (node2 == node3) {
            node.remove();
        }
        node2 = this.parentNode;
        int n3 = this.siblingIndex;
        Node[] nodeArray = new Node[]{node};
        node2.addChildren(n3, nodeArray);
        return this;
    }

    public Node childNode(int n3) {
        return (Node)this.ensureChildNodes().get(n3);
    }

    public abstract int childNodeSize();

    public List childNodes() {
        int n3 = this.childNodeSize();
        if (n3 == 0) {
            return EmptyNodes;
        }
        List list = this.ensureChildNodes();
        int n4 = list.size();
        ArrayList arrayList = new ArrayList(n4);
        arrayList.addAll(list);
        return Collections.unmodifiableList(arrayList);
    }

    public Node[] childNodesAsArray() {
        List list = this.ensureChildNodes();
        Node[] nodeArray = new Node[]{};
        return list.toArray(nodeArray);
    }

    public List childNodesCopy() {
        Object object = this.ensureChildNodes();
        int n3 = object.size();
        ArrayList<Object> arrayList = new ArrayList<Object>(n3);
        object = object.iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            Object object2 = ((Node)object.next()).clone();
            arrayList.add(object2);
        }
        return arrayList;
    }

    public Node clearAttributes() {
        boolean bl2 = this.hasAttributes();
        if (bl2) {
            boolean bl3;
            Iterator iterator = this.attributes().iterator();
            while (bl3 = iterator.hasNext()) {
                iterator.next();
                iterator.remove();
            }
        }
        return this;
    }

    public Node clone() {
        boolean bl2;
        Node node = this.doClone(null);
        LinkedList<Node> linkedList = new LinkedList<Node>();
        linkedList.add(node);
        while (!(bl2 = linkedList.isEmpty())) {
            Node node2 = (Node)linkedList.remove();
            int n3 = node2.childNodeSize();
            for (int i3 = 0; i3 < n3; ++i3) {
                List list = node2.ensureChildNodes();
                Node node3 = ((Node)list.get(i3)).doClone(node2);
                list.set(i3, node3);
                linkedList.add(node3);
            }
        }
        return node;
    }

    public Node doClone(Node object) {
        boolean bl2;
        Object object2;
        try {
            object2 = super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            object2 = new RuntimeException(cloneNotSupportedException);
            throw object2;
        }
        object2 = (Node)object2;
        ((Node)object2).parentNode = object;
        int n3 = object == null ? 0 : this.siblingIndex;
        ((Node)object2).siblingIndex = n3;
        if (object == null && !(bl2 = this instanceof Document) && (object = this.ownerDocument()) != null) {
            object = ((Document)object).shallowClone();
            ((Node)object2).parentNode = object;
            object = ((Element)object).ensureChildNodes();
            object.add(object2);
        }
        return object2;
    }

    public abstract void doSetBaseUri(String var1);

    public abstract Node empty();

    public abstract List ensureChildNodes();

    public boolean equals(Object object) {
        boolean bl2;
        if (this == object) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public Node filter(NodeFilter nodeFilter) {
        Validate.notNull(nodeFilter);
        NodeTraversor.filter(nodeFilter, this);
        return this;
    }

    public Node firstChild() {
        int n3 = this.childNodeSize();
        if (n3 == 0) {
            return null;
        }
        return (Node)this.ensureChildNodes().get(0);
    }

    public Node forEachNode(Consumer consumer) {
        Validate.notNull(consumer);
        my0_2.a(this.nodeStream(), consumer);
        return this;
    }

    public boolean hasAttr(String string2) {
        Validate.notNull(string2);
        int n3 = this.hasAttributes();
        if (n3 == 0) {
            return false;
        }
        String string3 = "abs:";
        n3 = string2.startsWith(string3);
        if (n3 != 0) {
            n3 = 4;
            string3 = string2.substring(n3);
            Attributes attributes = this.attributes();
            boolean bl2 = attributes.hasKeyIgnoreCase(string3);
            if (bl2 && (n3 = (int)((string3 = this.absUrl(string3)).isEmpty() ? 1 : 0)) == 0) {
                return true;
            }
        }
        return this.attributes().hasKeyIgnoreCase(string2);
    }

    public abstract boolean hasAttributes();

    public boolean hasParent() {
        boolean bl2;
        Node node = this.parentNode;
        if (node != null) {
            bl2 = true;
        } else {
            bl2 = false;
            node = null;
        }
        return bl2;
    }

    public boolean hasSameValue(Object object) {
        Class<?> clazz;
        Object object2;
        if (this == object) {
            return true;
        }
        if (object != null && (object2 = this.getClass()) == (clazz = object.getClass())) {
            object2 = this.outerHtml();
            object = ((Node)object).outerHtml();
            return ((String)object2).equals(object);
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public Appendable html(Appendable appendable) {
        this.outerHtml(appendable);
        return appendable;
    }

    public void indent(Appendable appendable, int n3, Document$OutputSettings document$OutputSettings) {
        appendable = appendable.append('\n');
        int n4 = document$OutputSettings.indentAmount() * n3;
        n3 = document$OutputSettings.maxPaddingWidth();
        String string2 = StringUtil.padding(n4, n3);
        appendable.append(string2);
    }

    public final boolean isEffectivelyFirst() {
        boolean bl2 = this.siblingIndex;
        boolean bl3 = true;
        if (!bl2) {
            return bl3;
        }
        if (bl2 == bl3) {
            boolean bl4;
            Node node = this.previousSibling();
            boolean bl5 = node instanceof TextNode;
            if (!bl5 || !(bl4 = ((TextNode)(node = (TextNode)node)).isBlank())) {
                bl3 = false;
            }
            return bl3;
        }
        return false;
    }

    public final boolean isNode(String string2) {
        return this.normalName().equals(string2);
    }

    public Node lastChild() {
        int n3 = this.childNodeSize();
        if (n3 == 0) {
            return null;
        }
        List list = this.ensureChildNodes();
        return (Node)list.get(n3 += -1);
    }

    public Node nextSibling() {
        Object object = this.parentNode;
        if (object == null) {
            return null;
        }
        object = ((Node)object).ensureChildNodes();
        int n3 = this.siblingIndex + 1;
        int n4 = object.size();
        if (n4 > n3) {
            return (Node)object.get(n3);
        }
        return null;
    }

    public abstract String nodeName();

    public Stream nodeStream() {
        return NodeUtils.stream(this, Node.class);
    }

    public Stream nodeStream(Class clazz) {
        return NodeUtils.stream(this, clazz);
    }

    public void nodelistChanged() {
    }

    public String normalName() {
        return this.nodeName();
    }

    public String outerHtml() {
        StringBuilder stringBuilder = StringUtil.borrowBuilder();
        this.outerHtml(stringBuilder);
        return StringUtil.releaseBuilder(stringBuilder);
    }

    public void outerHtml(Appendable appendable) {
        Document$OutputSettings document$OutputSettings = NodeUtils.outputSettings(this);
        Node$OuterHtmlVisitor node$OuterHtmlVisitor = new Node$OuterHtmlVisitor(appendable, document$OutputSettings);
        NodeTraversor.traverse((NodeVisitor)node$OuterHtmlVisitor, this);
    }

    public abstract void outerHtmlHead(Appendable var1, int var2, Document$OutputSettings var3);

    public abstract void outerHtmlTail(Appendable var1, int var2, Document$OutputSettings var3);

    public Document ownerDocument() {
        Node node = this.root();
        boolean bl2 = node instanceof Document;
        node = bl2 ? (Document)node : null;
        return node;
    }

    public Node parent() {
        return this.parentNode;
    }

    public final Node parentNode() {
        return this.parentNode;
    }

    public Node previousSibling() {
        Object object = this.parentNode;
        int n3 = 0;
        if (object == null) {
            return null;
        }
        int n4 = this.siblingIndex;
        if (n4 > 0) {
            object = ((Node)object).ensureChildNodes();
            n3 = this.siblingIndex + -1;
            return (Node)object.get(n3);
        }
        return null;
    }

    public void remove() {
        Node node = this.parentNode;
        if (node != null) {
            node.removeChild(this);
        }
    }

    public Node removeAttr(String string2) {
        Validate.notNull(string2);
        boolean bl2 = this.hasAttributes();
        if (bl2) {
            Attributes attributes = this.attributes();
            attributes.removeIgnoreCase(string2);
        }
        return this;
    }

    public void removeChild(Node node) {
        int n3;
        Node node2 = node.parentNode;
        if (node2 == this) {
            n3 = 1;
        } else {
            n3 = 0;
            node2 = null;
        }
        Validate.isTrue(n3 != 0);
        n3 = node.siblingIndex;
        this.ensureChildNodes().remove(n3);
        this.reindexChildren(n3);
        node.parentNode = null;
    }

    public void reparentChild(Node node) {
        node.setParentNode(this);
    }

    public void replaceChild(Node node, Node node2) {
        int n3;
        Node node3 = node.parentNode;
        if (node3 == this) {
            n3 = 1;
        } else {
            n3 = 0;
            node3 = null;
        }
        Validate.isTrue(n3 != 0);
        Validate.notNull(node2);
        if (node == node2) {
            return;
        }
        node3 = node2.parentNode;
        if (node3 != null) {
            node3.removeChild(node2);
        }
        n3 = node.siblingIndex;
        this.ensureChildNodes().set(n3, node2);
        node2.parentNode = this;
        node2.setSiblingIndex(n3);
        node.parentNode = null;
    }

    public void replaceWith(Node node) {
        Validate.notNull(node);
        Validate.notNull(this.parentNode);
        this.parentNode.replaceChild(this, node);
    }

    public Node root() {
        Node node;
        Node node2 = this;
        while ((node = node2.parentNode) != null) {
            node2 = node;
        }
        return node2;
    }

    public void setBaseUri(String string2) {
        Validate.notNull(string2);
        this.doSetBaseUri(string2);
    }

    public void setParentNode(Node node) {
        Validate.notNull(node);
        Node node2 = this.parentNode;
        if (node2 != null) {
            node2.removeChild(this);
        }
        this.parentNode = node;
    }

    public void setSiblingIndex(int n3) {
        this.siblingIndex = n3;
    }

    public Node shallowClone() {
        return this.doClone(null);
    }

    public int siblingIndex() {
        return this.siblingIndex;
    }

    public List siblingNodes() {
        Object object = this.parentNode;
        if (object == null) {
            return Collections.emptyList();
        }
        object = ((Node)object).ensureChildNodes();
        int n3 = object.size() + -1;
        ArrayList<Node> arrayList = new ArrayList<Node>(n3);
        object = object.iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            Node node = (Node)object.next();
            if (node == this) continue;
            arrayList.add(node);
        }
        return arrayList;
    }

    public Range sourceRange() {
        return Range.of(this, true);
    }

    public String toString() {
        return this.outerHtml();
    }

    public Node traverse(NodeVisitor nodeVisitor) {
        Validate.notNull(nodeVisitor);
        NodeTraversor.traverse(nodeVisitor, this);
        return this;
    }

    public Node unwrap() {
        Validate.notNull(this.parentNode);
        Node node = this.firstChild();
        Node node2 = this.parentNode;
        int n3 = this.siblingIndex;
        Node[] nodeArray = this.childNodesAsArray();
        node2.addChildren(n3, nodeArray);
        this.remove();
        return node;
    }

    public Node wrap(String object) {
        int n3;
        int n4 = 1;
        int n7 = 0;
        Validate.notEmpty((String)object);
        Node node = this.parentNode;
        if (node != null && (n3 = node instanceof Element) != 0) {
            node = (Element)node;
        } else {
            boolean bl2 = this instanceof Element;
            if (bl2) {
                node = this;
                node = (Element)this;
            } else {
                bl2 = false;
                node = null;
            }
        }
        Object object2 = NodeUtils.parser(this);
        Object object3 = this.baseUri();
        object = ((Parser)object2).parseFragmentInput((String)object, (Element)node, (String)object3);
        node = (Node)object.get(0);
        n3 = node instanceof Element;
        if (n3 == 0) {
            return this;
        }
        node = (Element)node;
        object2 = this.getDeepChild((Element)node);
        object3 = this.parentNode;
        if (object3 != null) {
            ((Node)object3).replaceChild(this, node);
        }
        object3 = new Node[n4];
        object3[0] = this;
        ((Node)object2).addChildren((Node[])object3);
        n3 = object.size();
        if (n3 > 0) {
            while (n7 < (n3 = object.size())) {
                object2 = (Node)object.get(n7);
                if (node != object2) {
                    object3 = ((Node)object2).parentNode;
                    if (object3 != null) {
                        ((Node)object3).removeChild((Node)object2);
                    }
                    ((Element)node).after((Node)object2);
                }
                n7 += n4;
            }
        }
        return this;
    }
}

