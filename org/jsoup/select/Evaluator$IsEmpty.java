/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.select.Evaluator;

public final class Evaluator$IsEmpty
extends Evaluator {
    public boolean matches(Element object, Element node) {
        boolean bl2;
        object = node.childNodes().iterator();
        while (bl2 = object.hasNext()) {
            node = (Node)object.next();
            boolean bl3 = node instanceof TextNode;
            if (bl3) {
                return ((TextNode)node).isBlank();
            }
            bl3 = node instanceof Comment;
            if (bl3 || (bl3 = node instanceof XmlDeclaration) || (bl2 = node instanceof DocumentType)) continue;
            return false;
        }
        return true;
    }

    public String toString() {
        return ":empty";
    }
}

