/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document$OutputSettings;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.NodeUtils;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;

public class Comment
extends LeafNode {
    public Comment(String string2) {
        this.value = string2;
    }

    private static boolean isXmlDeclarationData(String string2) {
        boolean bl2;
        String string3;
        int n3;
        int n4 = string2.length();
        if (n4 <= (n3 = 1) || !(n4 = string2.startsWith(string3 = "!")) && !(bl2 = string2.startsWith(string3 = "?"))) {
            n3 = 0;
        }
        return n3 != 0;
    }

    public XmlDeclaration asXmlDeclaration() {
        Object object = this.getData();
        int n3 = ((String)object).length();
        int n4 = 1;
        Object object2 = ((String)object).substring(n4, n3 -= n4);
        n4 = (int)(Comment.isXmlDeclarationData((String)object2) ? 1 : 0);
        XmlDeclaration xmlDeclaration = null;
        if (n4 != 0) {
            return null;
        }
        object2 = cP.a("<", (String)object2, ">");
        Object object3 = Parser.htmlParser();
        Object object4 = ParseSettings.preserveCase;
        object3 = ((Parser)object3).settings((ParseSettings)object4);
        object4 = this.baseUri();
        n4 = ((Element)(object3 = ((Document)(object2 = ((Parser)object3).parseInput((String)object2, (String)object4))).body())).childrenSize();
        if (n4 > 0) {
            object3 = ((Document)object2).body().child(0);
            object2 = NodeUtils.parser((Node)object2).settings();
            object4 = ((Element)object3).tagName();
            object2 = ((ParseSettings)object2).normalizeTag((String)object4);
            object4 = "!";
            boolean bl2 = ((String)object).startsWith((String)object4);
            xmlDeclaration = new XmlDeclaration((String)object2, bl2);
            object = xmlDeclaration.attributes();
            object2 = ((Element)object3).attributes();
            ((Attributes)object).addAll((Attributes)object2);
        }
        return xmlDeclaration;
    }

    public Comment clone() {
        return (Comment)super.clone();
    }

    public String getData() {
        return this.coreValue();
    }

    public boolean isXmlDeclaration() {
        return Comment.isXmlDeclarationData(this.getData());
    }

    public String nodeName() {
        return "#comment";
    }

    public void outerHtmlHead(Appendable appendable, int n3, Document$OutputSettings document$OutputSettings) {
        Cloneable cloneable;
        boolean bl2;
        boolean bl3 = document$OutputSettings.prettyPrint();
        if (bl3 && ((bl3 = this.isEffectivelyFirst()) && (bl2 = (cloneable = this.parentNode) instanceof Element) && (bl3 = ((Tag)(cloneable = ((Element)cloneable).tag())).formatAsBlock()) || (bl3 = document$OutputSettings.outline()))) {
            this.indent(appendable, n3, document$OutputSettings);
        }
        appendable = appendable.append("<!--");
        String string2 = this.getData();
        appendable.append(string2).append("-->");
    }

    public void outerHtmlTail(Appendable appendable, int n3, Document$OutputSettings document$OutputSettings) {
    }

    public Comment setData(String string2) {
        this.coreValue(string2);
        return this;
    }

    public String toString() {
        return this.outerHtml();
    }
}

