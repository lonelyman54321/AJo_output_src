/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.PseudoTextElement;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;

public final class Evaluator$MatchText
extends Evaluator {
    public int cost() {
        return -1;
    }

    public boolean matches(Element object, Element element) {
        boolean bl2;
        boolean bl3 = element instanceof PseudoTextElement;
        if (bl3) {
            return true;
        }
        object = element.textNodes().iterator();
        while (bl2 = object.hasNext()) {
            TextNode textNode = (TextNode)object.next();
            Object object2 = element.tagName();
            String string2 = element.tag().namespace();
            Object object3 = ParseSettings.preserveCase;
            object2 = Tag.valueOf((String)object2, string2, (ParseSettings)object3);
            string2 = element.baseUri();
            object3 = element.attributes();
            PseudoTextElement pseudoTextElement = new PseudoTextElement((Tag)object2, string2, (Attributes)object3);
            textNode.replaceWith(pseudoTextElement);
            pseudoTextElement.appendChild(textNode);
        }
        return false;
    }

    public String toString() {
        return ":matchText";
    }
}

