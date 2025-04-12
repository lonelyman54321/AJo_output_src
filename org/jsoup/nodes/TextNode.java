/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document$OutputSettings;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Entities;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;

public class TextNode
extends LeafNode {
    public TextNode(String string2) {
        this.value = string2;
    }

    public static TextNode createFromEncoded(String string2) {
        string2 = Entities.unescape(string2);
        TextNode textNode = new TextNode(string2);
        return textNode;
    }

    public static boolean lastCharIsWhitespace(StringBuilder stringBuilder) {
        int n3;
        block3: {
            block2: {
                int n4 = stringBuilder.length();
                if (n4 == 0) break block2;
                n4 = stringBuilder.length();
                n3 = 1;
                n4 -= n3;
                char c2 = stringBuilder.charAt(n4);
                if (c2 == (n4 = 32)) break block3;
            }
            n3 = 0;
        }
        return n3 != 0;
    }

    public static String normaliseWhitespace(String string2) {
        return StringUtil.normaliseWhitespace(string2);
    }

    public static String stripLeadingWhitespace(String string2) {
        return string2.replaceFirst("^\\s+", "");
    }

    public TextNode clone() {
        return (TextNode)super.clone();
    }

    public String getWholeText() {
        return this.coreValue();
    }

    public boolean isBlank() {
        return StringUtil.isBlank(this.coreValue());
    }

    public String nodeName() {
        return "#text";
    }

    public void outerHtmlHead(Appendable appendable, int n3, Document$OutputSettings document$OutputSettings) {
        boolean bl2;
        int n4;
        Object object;
        Object object2;
        boolean bl3;
        block16: {
            block12: {
                boolean bl4;
                int n7;
                Object object3;
                Node node;
                boolean bl5;
                Node node2;
                int n8;
                block15: {
                    block14: {
                        boolean bl6;
                        block13: {
                            n8 = document$OutputSettings.prettyPrint();
                            Node node3 = this.parentNode;
                            boolean bl7 = node3 instanceof Element;
                            if (bl7) {
                                node2 = node3;
                                node2 = (Element)node3;
                            } else {
                                bl7 = false;
                                node2 = null;
                            }
                            bl5 = true;
                            node = null;
                            bl3 = n8 != 0 && (n8 = Element.preserveWhitespace(node3)) == 0;
                            if (node2 != null && ((n8 = ((Tag)(object3 = ((Element)node2).tag())).isBlock()) != 0 || (n8 = ((Tag)(object3 = ((Element)node2).tag())).formatAsBlock()) != 0)) {
                                n8 = 1;
                            } else {
                                n8 = 0;
                                object3 = null;
                            }
                            if (!bl3) break block12;
                            if (n8 != 0 && (n7 = this.siblingIndex) == 0 || (n7 = (node3 = this.parentNode) instanceof Document) != 0) {
                                n7 = 1;
                            } else {
                                n7 = 0;
                                node3 = null;
                            }
                            if (n8 == 0 || (object3 = this.nextSibling()) != null) {
                                bl5 = false;
                            }
                            object3 = this.nextSibling();
                            node = this.previousSibling();
                            bl4 = this.isBlank();
                            bl6 = object3 instanceof Element;
                            object2 = "br";
                            if (!bl6) break block13;
                            object = object3;
                            object = (Element)object3;
                            bl6 = ((Element)object).shouldIndent(document$OutputSettings);
                            if (bl6) break block14;
                        }
                        if ((bl6 = object3 instanceof TextNode) && (n8 = ((TextNode)(object3 = (TextNode)object3)).isBlank()) != 0) break block14;
                        n8 = node instanceof Element;
                        if (n8 == 0) break block15;
                        object3 = node;
                        object3 = (Element)node;
                        n8 = (int)(((Element)object3).isBlock() ? 1 : 0);
                        if (n8 == 0 && (n8 = (int)(node.isNode((String)object2) ? 1 : 0)) == 0) break block15;
                    }
                    if (bl4) {
                        return;
                    }
                }
                if ((n8 = this.siblingIndex) == 0 && node2 != null && (n8 = (int)(((Tag)(object3 = ((Element)node2).tag())).formatAsBlock() ? 1 : 0)) != 0 && !bl4 || (n8 = (int)(document$OutputSettings.outline() ? 1 : 0)) != 0 && (n8 = (object3 = this.siblingNodes()).size()) > 0 && !bl4 || (n8 = this.siblingIndex) > 0 && (n8 = (int)(Node.isNode(node, (String)object2) ? 1 : 0)) != 0) {
                    this.indent(appendable, n3, document$OutputSettings);
                }
                n4 = n7;
                bl2 = bl5;
                break block16;
            }
            n4 = 0;
            bl2 = false;
        }
        object = this.coreValue();
        object2 = document$OutputSettings;
        Entities.escape(appendable, (String)object, document$OutputSettings, false, bl3, n4 != 0, bl2);
    }

    public void outerHtmlTail(Appendable appendable, int n3, Document$OutputSettings document$OutputSettings) {
    }

    public TextNode splitText(int n3) {
        String string2;
        int n4;
        Object object = this.coreValue();
        int n7 = 1;
        if (n3 >= 0) {
            n4 = 1;
        } else {
            n4 = 0;
            string2 = null;
        }
        String string3 = "Split offset must be not be negative";
        Validate.isTrue(n4 != 0, string3);
        n4 = ((String)object).length();
        if (n3 < n4) {
            n4 = 1;
        } else {
            n4 = 0;
            string2 = null;
        }
        string3 = "Split offset must not be greater than current text length";
        Validate.isTrue(n4 != 0, string3);
        string2 = ((String)object).substring(0, n3);
        Object object2 = ((String)object).substring(n3);
        this.text(string2);
        object = new TextNode((String)object2);
        object2 = this.parentNode;
        if (object2 != null) {
            n4 = this.siblingIndex() + n7;
            Node[] nodeArray = new Node[n7];
            nodeArray[0] = object;
            ((Node)object2).addChildren(n4, nodeArray);
        }
        return object;
    }

    public String text() {
        return StringUtil.normaliseWhitespace(this.getWholeText());
    }

    public TextNode text(String string2) {
        this.coreValue(string2);
        return this;
    }

    public String toString() {
        return this.outerHtml();
    }
}

