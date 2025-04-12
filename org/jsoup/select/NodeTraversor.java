/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import java.util.AbstractCollection;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.jsoup.select.NodeFilter;
import org.jsoup.select.NodeFilter$FilterResult;
import org.jsoup.select.NodeVisitor;

public class NodeTraversor {
    static final /* synthetic */ boolean $assertionsDisabled;

    public static NodeFilter$FilterResult filter(NodeFilter nodeFilter, Node node) {
        Object object = node;
        int n3 = 0;
        while (object != null) {
            Object object2;
            int n4;
            Object object3;
            NodeFilter$FilterResult nodeFilter$FilterResult = nodeFilter.head((Node)object, n3);
            if (nodeFilter$FilterResult == (object3 = NodeFilter$FilterResult.STOP)) {
                return nodeFilter$FilterResult;
            }
            object3 = NodeFilter$FilterResult.CONTINUE;
            if (nodeFilter$FilterResult == object3 && (n4 = object.childNodeSize()) > 0) {
                object = object.childNode(0);
                ++n3;
                continue;
            }
            while ((object3 = object.nextSibling()) == null && n3 > 0) {
                object3 = NodeFilter$FilterResult.CONTINUE;
                if ((nodeFilter$FilterResult == object3 || nodeFilter$FilterResult == (object2 = NodeFilter$FilterResult.SKIP_CHILDREN)) && (nodeFilter$FilterResult = nodeFilter.tail((Node)object, n3)) == (object2 = NodeFilter$FilterResult.STOP)) {
                    return nodeFilter$FilterResult;
                }
                object2 = object.parentNode();
                n3 += -1;
                NodeFilter$FilterResult nodeFilter$FilterResult2 = NodeFilter$FilterResult.REMOVE;
                if (nodeFilter$FilterResult == nodeFilter$FilterResult2) {
                    object.remove();
                }
                nodeFilter$FilterResult = object3;
                object = object2;
            }
            object3 = NodeFilter$FilterResult.CONTINUE;
            if ((nodeFilter$FilterResult == object3 || nodeFilter$FilterResult == (object3 = NodeFilter$FilterResult.SKIP_CHILDREN)) && (nodeFilter$FilterResult = nodeFilter.tail((Node)object, n3)) == (object3 = NodeFilter$FilterResult.STOP)) {
                return nodeFilter$FilterResult;
            }
            if (object == node) {
                return nodeFilter$FilterResult;
            }
            object3 = object.nextSibling();
            object2 = NodeFilter$FilterResult.REMOVE;
            if (nodeFilter$FilterResult == object2) {
                object.remove();
            }
            object = object3;
        }
        return NodeFilter$FilterResult.CONTINUE;
    }

    public static void filter(NodeFilter nodeFilter, Elements object) {
        boolean bl2;
        Validate.notNull(nodeFilter);
        Validate.notNull(object);
        object = ((AbstractCollection)object).iterator();
        while (bl2 = object.hasNext()) {
            NodeFilter$FilterResult nodeFilter$FilterResult;
            Object object2 = (Element)object.next();
            if ((object2 = NodeTraversor.filter(nodeFilter, object2)) != (nodeFilter$FilterResult = NodeFilter$FilterResult.STOP)) continue;
        }
    }

    public static void traverse(NodeVisitor nodeVisitor, Node node) {
        Validate.notNull(nodeVisitor);
        Validate.notNull(node);
        Node node2 = node;
        int n3 = 0;
        while (node2 != null) {
            int n4;
            int n7;
            Node node3 = node2.parentNode();
            int n8 = node3 != null ? node3.childNodeSize() : 0;
            Node node4 = node2.nextSibling();
            nodeVisitor.head(node2, n3);
            if (node3 != null && (n7 = node2.hasParent()) == 0) {
                n7 = node3.childNodeSize();
                if (n8 == n7) {
                    int n10 = node2.siblingIndex();
                    node2 = node3.childNode(n10);
                } else {
                    if (node4 == null) {
                        n3 += -1;
                        node2 = node3;
                        continue;
                    }
                    node2 = node4;
                    continue;
                }
            }
            if ((n4 = node2.childNodeSize()) > 0) {
                node2 = node2.childNode(0);
                ++n3;
                continue;
            }
            while ((node3 = node2.nextSibling()) == null && n3 > 0) {
                nodeVisitor.tail(node2, n3);
                node2 = node2.parentNode();
                n3 += -1;
            }
            nodeVisitor.tail(node2, n3);
            if (node2 == node) break;
            node2 = node2.nextSibling();
        }
    }

    public static void traverse(NodeVisitor nodeVisitor, Elements object) {
        boolean bl2;
        Validate.notNull(nodeVisitor);
        Validate.notNull(object);
        object = ((AbstractCollection)object).iterator();
        while (bl2 = object.hasNext()) {
            Element element = (Element)object.next();
            NodeTraversor.traverse(nodeVisitor, element);
        }
    }
}

