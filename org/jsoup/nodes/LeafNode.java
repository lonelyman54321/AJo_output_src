/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.nodes;

import java.util.List;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Node;

public abstract class LeafNode
extends Node {
    Object value;

    private void ensureAttributes() {
        boolean bl2 = this.hasAttributes();
        if (!bl2) {
            Object object = this.value;
            Attributes attributes = new Attributes();
            this.value = attributes;
            if (object != null) {
                String string2 = this.nodeName();
                object = (String)object;
                attributes.put(string2, (String)object);
            }
        }
    }

    public String absUrl(String string2) {
        this.ensureAttributes();
        return super.absUrl(string2);
    }

    public String attr(String string2) {
        boolean bl2 = this.hasAttributes();
        if (!bl2) {
            String string3 = this.nodeName();
            boolean bl3 = string3.equals(string2);
            string2 = bl3 ? (String)this.value : "";
            return string2;
        }
        return super.attr(string2);
    }

    public Node attr(String string2, String string3) {
        String string4;
        boolean bl2 = this.hasAttributes();
        if (!bl2 && (bl2 = string2.equals(string4 = this.nodeName()))) {
            this.value = string3;
        } else {
            this.ensureAttributes();
            super.attr(string2, string3);
        }
        return this;
    }

    public final Attributes attributes() {
        this.ensureAttributes();
        return (Attributes)this.value;
    }

    public String baseUri() {
        boolean bl2 = this.hasParent();
        String string2 = bl2 ? this.parent().baseUri() : "";
        return string2;
    }

    public int childNodeSize() {
        return 0;
    }

    public String coreValue() {
        String string2 = this.nodeName();
        return this.attr(string2);
    }

    public void coreValue(String string2) {
        String string3 = this.nodeName();
        this.attr(string3, string2);
    }

    public LeafNode doClone(Node node) {
        node = (LeafNode)super.doClone(node);
        boolean bl2 = this.hasAttributes();
        if (bl2) {
            Object object;
            ((LeafNode)node).value = object = ((Attributes)this.value).clone();
        }
        return node;
    }

    public void doSetBaseUri(String string2) {
    }

    public Node empty() {
        return this;
    }

    public List ensureChildNodes() {
        return Node.EmptyNodes;
    }

    public boolean hasAttr(String string2) {
        this.ensureAttributes();
        return super.hasAttr(string2);
    }

    public final boolean hasAttributes() {
        return this.value instanceof Attributes;
    }

    public Node removeAttr(String string2) {
        this.ensureAttributes();
        return super.removeAttr(string2);
    }
}

