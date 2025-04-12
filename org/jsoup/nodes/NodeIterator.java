/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.nodes;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Node;

public class NodeIterator
implements Iterator {
    private Node current;
    private Node currentParent;
    private Node next;
    private Node previous;
    private Node root;
    private final Class type;

    public NodeIterator(Node node, Class clazz) {
        Validate.notNull(node);
        Validate.notNull(clazz);
        this.type = clazz;
        this.restart(node);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private Node findNextNode() {
        Object object;
        int n3;
        Node node = this.current;
        do {
            if ((n3 = node.childNodeSize()) > 0) {
                n3 = 0;
                object = null;
                node = node.childNode(0);
            } else {
                object = this.root;
                n3 = (int)(((Node)object).equals(node) ? 1 : 0);
                if (n3 != 0) {
                    return null;
                }
                object = node.nextSibling();
                if (object != null) {
                    node = node.nextSibling();
                } else {
                    do {
                        if ((node = node.parent()) == null) return null;
                        object = this.root;
                        n3 = (int)(((Node)object).equals(node) ? 1 : 0);
                        if (n3 != 0) return null;
                    } while ((object = node.nextSibling()) == null);
                    node = node.nextSibling();
                }
            }
            if (node != null) continue;
            return null;
        } while ((n3 = (int)(((Class)(object = this.type)).isInstance(node) ? 1 : 0)) == 0);
        return node;
    }

    public static NodeIterator from(Node node) {
        NodeIterator nodeIterator = new NodeIterator(node, Node.class);
        return nodeIterator;
    }

    private void maybeFindNext() {
        boolean bl2;
        Node node = this.next;
        if (node != null) {
            return;
        }
        node = this.currentParent;
        if (node != null && !(bl2 = (node = this.current).hasParent())) {
            this.current = node = this.previous;
        }
        this.next = node = this.findNextNode();
    }

    public boolean hasNext() {
        boolean bl2;
        this.maybeFindNext();
        Node node = this.next;
        if (node != null) {
            bl2 = true;
        } else {
            bl2 = false;
            node = null;
        }
        return bl2;
    }

    public Node next() {
        this.maybeFindNext();
        Object object = this.next;
        if (object != null) {
            Node node;
            this.previous = node = this.current;
            this.current = object;
            this.currentParent = node = ((Node)object).parent();
            this.next = null;
            return object;
        }
        object = new NoSuchElementException();
        throw object;
    }

    public void remove() {
        this.current.remove();
    }

    public void restart(Node node) {
        Class clazz = this.type;
        boolean bl2 = clazz.isInstance(node);
        if (bl2) {
            this.next = node;
        }
        this.current = node;
        this.previous = node;
        this.root = node;
        this.currentParent = node = node.parent();
    }
}

