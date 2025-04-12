/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.safety;

import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.safety.Cleaner;
import org.jsoup.safety.Cleaner$1;
import org.jsoup.safety.Cleaner$ElementMeta;
import org.jsoup.safety.Safelist;
import org.jsoup.select.NodeVisitor;

final class Cleaner$CleaningVisitor
implements NodeVisitor {
    private Element destination;
    private int numDiscarded = 0;
    private final Element root;
    final /* synthetic */ Cleaner this$0;

    private Cleaner$CleaningVisitor(Cleaner cleaner, Element element, Element element2) {
        this.this$0 = cleaner;
        this.root = element;
        this.destination = element2;
    }

    public /* synthetic */ Cleaner$CleaningVisitor(Cleaner cleaner, Element element, Element element2, Cleaner$1 cleaner$1) {
        this(cleaner, element, element2);
    }

    public static /* synthetic */ int access$300(Cleaner$CleaningVisitor cleaner$CleaningVisitor) {
        return cleaner$CleaningVisitor.numDiscarded;
    }

    public void head(Node object, int n3) {
        n3 = object instanceof Element;
        if (n3 != 0) {
            String string2;
            Object node = object;
            node = (Element)object;
            Object object2 = Cleaner.access$000(this.this$0);
            boolean n4 = ((Safelist)object2).isSafeTag(string2 = ((Element)node).normalName());
            if (n4) {
                int n7;
                object = Cleaner.access$100(this.this$0, (Element)node);
                node = ((Cleaner$ElementMeta)object).el;
                object2 = this.destination;
                ((Element)object2).appendChild((Node)node);
                int n8 = this.numDiscarded;
                int n10 = ((Cleaner$ElementMeta)object).numAttribsDiscarded;
                this.numDiscarded = n7 = n8 + n10;
                this.destination = node;
            } else {
                node = this.root;
                if (object != node) {
                    int n10;
                    this.numDiscarded = n10 = this.numDiscarded + 1;
                }
            }
        } else {
            n3 = object instanceof TextNode;
            if (n3 != 0) {
                object = (TextNode)object;
                object = ((TextNode)object).getWholeText();
                TextNode textNode = new TextNode((String)object);
                object = this.destination;
                ((Element)object).appendChild(textNode);
            } else {
                String string3;
                Object object3;
                n3 = object instanceof DataNode;
                if (n3 != 0 && (n3 = (int)(((Safelist)(object3 = Cleaner.access$000(this.this$0))).isSafeTag(string3 = ((Node)object).parent().normalName()) ? 1 : 0)) != 0) {
                    object = (DataNode)object;
                    object = ((DataNode)object).getWholeData();
                    object3 = new DataNode((String)object);
                    object = this.destination;
                    ((Element)object).appendChild((Node)object3);
                } else {
                    int n14;
                    this.numDiscarded = n14 = this.numDiscarded + 1;
                }
            }
        }
    }

    public void tail(Node object, int n3) {
        Safelist safelist;
        boolean bl2;
        n3 = object instanceof Element;
        if (n3 != 0 && (bl2 = (safelist = Cleaner.access$000(this.this$0)).isSafeTag((String)(object = ((Node)object).normalName())))) {
            this.destination = object = this.destination.parent();
        }
    }
}

