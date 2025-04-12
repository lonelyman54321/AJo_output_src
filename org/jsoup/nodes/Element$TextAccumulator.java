/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;
import org.jsoup.select.NodeVisitor;

class Element$TextAccumulator
implements NodeVisitor {
    private final StringBuilder accum;

    public Element$TextAccumulator(StringBuilder stringBuilder) {
        this.accum = stringBuilder;
    }

    public void head(Node object, int n3) {
        n3 = object instanceof TextNode;
        if (n3 != 0) {
            object = (TextNode)object;
            StringBuilder stringBuilder = this.accum;
            Element.access$000(stringBuilder, (TextNode)object);
        } else {
            n3 = object instanceof Element;
            if (n3 != 0) {
                boolean bl2;
                object = (Element)object;
                CharSequence charSequence = this.accum;
                n3 = charSequence.length();
                if (n3 > 0 && ((n3 = (int)(((Element)object).isBlock() ? 1 : 0)) != 0 || (bl2 = ((Node)object).isNode((String)(charSequence = "br")))) && !(bl2 = TextNode.lastCharIsWhitespace((StringBuilder)(object = this.accum)))) {
                    object = this.accum;
                    n3 = 32;
                    ((StringBuilder)object).append((char)n3);
                }
            }
        }
    }

    public void tail(Node object, int n3) {
        n3 = object instanceof Element;
        if (n3 != 0) {
            boolean bl2;
            Node node = object;
            node = (Element)object;
            object = ((Node)object).nextSibling();
            n3 = (int)(((Element)node).isBlock() ? 1 : 0);
            if (n3 != 0 && ((n3 = object instanceof TextNode) != 0 || (n3 = object instanceof Element) != 0 && !(bl2 = ((Tag)(object = Element.access$100((Element)object))).formatAsBlock())) && !(bl2 = TextNode.lastCharIsWhitespace((StringBuilder)(object = this.accum)))) {
                object = this.accum;
                n3 = 32;
                ((StringBuilder)object).append((char)n3);
            }
        }
    }
}

