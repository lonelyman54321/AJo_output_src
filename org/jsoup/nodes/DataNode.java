/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.nodes;

import org.jsoup.nodes.Document$OutputSettings;
import org.jsoup.nodes.Document$OutputSettings$Syntax;
import org.jsoup.nodes.LeafNode;

public class DataNode
extends LeafNode {
    public DataNode(String string2) {
        this.value = string2;
    }

    public DataNode clone() {
        return (DataNode)super.clone();
    }

    public String getWholeData() {
        return this.coreValue();
    }

    public String nodeName() {
        return "#data";
    }

    public void outerHtmlHead(Appendable appendable, int n3, Document$OutputSettings object) {
        Object object2 = object.syntax();
        if (object2 == (object = Document$OutputSettings$Syntax.xml)) {
            appendable = appendable.append("<![CDATA[");
            object2 = this.getWholeData();
            appendable = appendable.append((CharSequence)object2);
            object2 = "]]>";
            appendable.append((CharSequence)object2);
        } else {
            object2 = this.getWholeData();
            appendable.append((CharSequence)object2);
        }
    }

    public void outerHtmlTail(Appendable appendable, int n3, Document$OutputSettings document$OutputSettings) {
    }

    public DataNode setWholeData(String string2) {
        this.coreValue(string2);
        return this;
    }

    public String toString() {
        return this.outerHtml();
    }
}

