/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.HtmlTreeBuilderState;
import org.jsoup.parser.Token;
import org.jsoup.parser.Token$Character;

final class HtmlTreeBuilderState$8
extends HtmlTreeBuilderState {
    public boolean process(Token object, HtmlTreeBuilder htmlTreeBuilder) {
        boolean bl2 = object.isCharacter();
        if (bl2) {
            object = object.asCharacter();
            htmlTreeBuilder.insertCharacterNode((Token$Character)object);
        } else {
            bl2 = object.isEOF();
            if (bl2) {
                htmlTreeBuilder.error(this);
                htmlTreeBuilder.pop();
                HtmlTreeBuilderState htmlTreeBuilderState = htmlTreeBuilder.originalState();
                htmlTreeBuilder.transition(htmlTreeBuilderState);
                return htmlTreeBuilder.process((Token)object);
            }
            boolean bl3 = object.isEndTag();
            if (bl3) {
                htmlTreeBuilder.pop();
                object = htmlTreeBuilder.originalState();
                htmlTreeBuilder.transition((HtmlTreeBuilderState)((Object)object));
            }
        }
        return true;
    }
}

