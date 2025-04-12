/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.helper;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document$OutputSettings$Syntax;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.select.NodeVisitor;
import org.w3c.dom.DOMException;
import org.w3c.dom.Element;

public class W3CDom$W3CBuilder
implements NodeVisitor {
    private static final String xmlnsKey = "xmlns";
    private static final String xmlnsPrefix = "xmlns:";
    private final org.jsoup.nodes.Element contextElement;
    private org.w3c.dom.Node dest;
    private final org.w3c.dom.Document doc;
    private boolean namespaceAware;
    private final Stack namespacesStack;
    private Document$OutputSettings$Syntax syntax;

    public W3CDom$W3CBuilder(org.w3c.dom.Document object) {
        boolean bl2;
        Object object2;
        boolean bl3;
        this.namespaceAware = bl3 = true;
        Object object3 = new Stack();
        this.namespacesStack = object3;
        this.syntax = object2 = Document$OutputSettings$Syntax.xml;
        this.doc = object;
        ((Stack)object3).push(object2);
        this.dest = object;
        object2 = "jsoupContextSource";
        this.contextElement = object = (org.jsoup.nodes.Element)object.getUserData((String)object2);
        object = ((Node)object).ownerDocument();
        boolean bl4 = this.namespaceAware;
        if (bl4 && object != null && (bl2 = (object = ((Document)object).parser().getTreeBuilder()) instanceof HtmlTreeBuilder)) {
            object = (HashMap)((Stack)object3).peek();
            object3 = "";
            object2 = "http://www.w3.org/1999/xhtml";
            ((HashMap)object).put(object3, object2);
        }
    }

    public static /* synthetic */ boolean access$002(W3CDom$W3CBuilder w3CDom$W3CBuilder, boolean bl2) {
        w3CDom$W3CBuilder.namespaceAware = bl2;
        return bl2;
    }

    public static /* synthetic */ Document$OutputSettings$Syntax access$102(W3CDom$W3CBuilder w3CDom$W3CBuilder, Document$OutputSettings$Syntax document$OutputSettings$Syntax) {
        w3CDom$W3CBuilder.syntax = document$OutputSettings$Syntax;
        return document$OutputSettings$Syntax;
    }

    private void append(org.w3c.dom.Node node, Node node2) {
        node.setUserData("jsoupSource", node2, null);
        this.dest.appendChild(node);
    }

    private void copyAttributes(Node object, Element element) {
        boolean bl2;
        object = ((Node)object).attributes().iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (Attribute)object.next();
            Object object3 = ((Attribute)object2).getKey();
            Document$OutputSettings$Syntax document$OutputSettings$Syntax = this.syntax;
            if ((object3 = Attribute.getValidKey((String)object3, document$OutputSettings$Syntax)) == null) continue;
            object2 = ((Attribute)object2).getValue();
            element.setAttribute((String)object3, (String)object2);
        }
    }

    private String updateNamespaces(org.jsoup.nodes.Element object) {
        Object object2;
        String string2;
        int n3;
        Object object3 = ((org.jsoup.nodes.Element)object).attributes().iterator();
        while (true) {
            String string3;
            n3 = object3.hasNext();
            string2 = "";
            if (n3 == 0) break;
            object2 = (Attribute)object3.next();
            Object object4 = ((Attribute)object2).getKey();
            boolean bl2 = ((String)object4).equals(string3 = xmlnsKey);
            if (!bl2) {
                string2 = xmlnsPrefix;
                int n4 = ((String)object4).startsWith(string2);
                if (n4 == 0) continue;
                n4 = 6;
                string2 = ((String)object4).substring(n4);
            }
            object4 = (HashMap)this.namespacesStack.peek();
            object2 = ((Attribute)object2).getValue();
            ((HashMap)object4).put(string2, object2);
        }
        object3 = ((org.jsoup.nodes.Element)object).tagName();
        int n7 = ((String)object3).indexOf(n3 = 58);
        if (n7 > 0) {
            object = ((org.jsoup.nodes.Element)object).tagName();
            n3 = 0;
            object2 = null;
            string2 = ((String)object).substring(0, n7);
        }
        return string2;
    }

    public void head(Node node, int n3) {
        Object object = this.namespacesStack;
        Object object2 = (Map)this.namespacesStack.peek();
        Object object3 = new HashMap(object2);
        ((Stack)object).push(object3);
        n3 = node instanceof org.jsoup.nodes.Element;
        if (n3 != 0) {
            Object object4;
            block20: {
                block19: {
                    node = (org.jsoup.nodes.Element)node;
                    object = this.updateNamespaces((org.jsoup.nodes.Element)node);
                    boolean bl2 = this.namespaceAware;
                    object2 = null;
                    if (bl2) {
                        object3 = (HashMap)this.namespacesStack.peek();
                        object = (String)((HashMap)object3).get(object);
                    } else {
                        n3 = 0;
                        object = null;
                    }
                    object3 = ((org.jsoup.nodes.Element)node).tagName();
                    if (object == null) {
                        object4 = ":";
                        boolean bl3 = ((String)object3).contains((CharSequence)object4);
                        if (!bl3) break block19;
                        object = "";
                    }
                }
                object4 = this.doc;
                object = object4.createElementNS((String)object, (String)object3);
                this.copyAttributes(node, (Element)object);
                this.append((org.w3c.dom.Node)object, node);
                object4 = this.contextElement;
                if (node != object4) break block20;
                object4 = this.doc;
                String string2 = "jsoupContextNode";
                object4.setUserData(string2, object, null);
            }
            try {
                this.dest = object;
            }
            catch (DOMException dOMException) {
                object = this.doc;
                object4 = "<";
                object2 = new StringBuilder((String)object4);
                ((StringBuilder)object2).append((String)object3);
                ((StringBuilder)object2).append(">");
                object3 = ((StringBuilder)object2).toString();
                object = object.createTextNode((String)object3);
                this.append((org.w3c.dom.Node)object, node);
            }
        } else {
            n3 = node instanceof TextNode;
            if (n3 != 0) {
                node = (TextNode)node;
                object = this.doc;
                object3 = ((TextNode)node).getWholeText();
                object = object.createTextNode((String)object3);
                this.append((org.w3c.dom.Node)object, node);
            } else {
                n3 = node instanceof Comment;
                if (n3 != 0) {
                    node = (Comment)node;
                    object = this.doc;
                    object3 = ((Comment)node).getData();
                    object = object.createComment((String)object3);
                    this.append((org.w3c.dom.Node)object, node);
                } else {
                    n3 = node instanceof DataNode;
                    if (n3 != 0) {
                        node = (DataNode)node;
                        object = this.doc;
                        object3 = ((DataNode)node).getWholeData();
                        object = object.createTextNode((String)object3);
                        this.append((org.w3c.dom.Node)object, node);
                    }
                }
            }
        }
    }

    public void tail(Node object, int n3) {
        boolean bl2 = object instanceof org.jsoup.nodes.Element;
        if (bl2 && (bl2 = (object = this.dest.getParentNode()) instanceof Element)) {
            this.dest = object = this.dest.getParentNode();
        }
        this.namespacesStack.pop();
    }
}

