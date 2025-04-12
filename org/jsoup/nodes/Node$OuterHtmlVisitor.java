/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.nodes;

import java.io.IOException;
import org.jsoup.SerializationException;
import org.jsoup.nodes.Document$OutputSettings;
import org.jsoup.nodes.Node;
import org.jsoup.select.NodeVisitor;

class Node$OuterHtmlVisitor
implements NodeVisitor {
    private final Appendable accum;
    private final Document$OutputSettings out;

    public Node$OuterHtmlVisitor(Appendable appendable, Document$OutputSettings document$OutputSettings) {
        this.accum = appendable;
        this.out = document$OutputSettings;
        document$OutputSettings.prepareEncoder();
    }

    public void head(Node node, int n3) {
        Appendable appendable;
        try {
            appendable = this.accum;
        }
        catch (IOException iOException) {
            SerializationException serializationException = new SerializationException(iOException);
            throw serializationException;
        }
        Document$OutputSettings document$OutputSettings = this.out;
        node.outerHtmlHead(appendable, n3, document$OutputSettings);
    }

    public void tail(Node node, int n3) {
        Object object;
        Object object2 = node.nodeName();
        boolean bl2 = ((String)object2).equals(object = "#text");
        if (!bl2) {
            try {
                object2 = this.accum;
            }
            catch (IOException iOException) {
                SerializationException serializationException = new SerializationException(iOException);
                throw serializationException;
            }
            object = this.out;
            node.outerHtmlTail((Appendable)object2, n3, (Document$OutputSettings)object);
        }
    }
}

