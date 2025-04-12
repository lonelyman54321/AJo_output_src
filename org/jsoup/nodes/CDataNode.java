/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.nodes;

import org.jsoup.nodes.Document$OutputSettings;
import org.jsoup.nodes.TextNode;

public class CDataNode
extends TextNode {
    public CDataNode(String string2) {
        super(string2);
    }

    public CDataNode clone() {
        return (CDataNode)super.clone();
    }

    public String nodeName() {
        return "#cdata";
    }

    public void outerHtmlHead(Appendable appendable, int n3, Document$OutputSettings document$OutputSettings) {
        appendable = appendable.append("<![CDATA[");
        String string2 = this.getWholeText();
        appendable.append(string2);
    }

    public void outerHtmlTail(Appendable appendable, int n3, Document$OutputSettings document$OutputSettings) {
        appendable.append("]]>");
    }

    public String text() {
        return this.getWholeText();
    }
}

