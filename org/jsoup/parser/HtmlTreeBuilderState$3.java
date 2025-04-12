/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Element;
import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.HtmlTreeBuilderState;
import org.jsoup.parser.HtmlTreeBuilderState$Constants;
import org.jsoup.parser.Token;
import org.jsoup.parser.Token$Character;
import org.jsoup.parser.Token$Comment;
import org.jsoup.parser.Token$StartTag;

final class HtmlTreeBuilderState$3
extends HtmlTreeBuilderState {
    public boolean process(Token object, HtmlTreeBuilder htmlTreeBuilder) {
        String[] stringArray;
        String string2;
        String string3;
        boolean bl2;
        block10: {
            block8: {
                block9: {
                    block7: {
                        bl2 = HtmlTreeBuilderState.access$100((Token)object);
                        if (!bl2) break block7;
                        object = ((Token)object).asCharacter();
                        htmlTreeBuilder.insertCharacterNode((Token$Character)object);
                        break block8;
                    }
                    bl2 = ((Token)object).isComment();
                    if (!bl2) break block9;
                    object = ((Token)object).asComment();
                    htmlTreeBuilder.insertCommentNode((Token$Comment)object);
                    break block8;
                }
                bl2 = ((Token)object).isDoctype();
                if (bl2) {
                    htmlTreeBuilder.error(this);
                    return false;
                }
                bl2 = ((Token)object).isStartTag();
                if (bl2 && (bl2 = (string3 = ((Token)object).asStartTag().normalName()).equals(string2 = "html"))) {
                    return HtmlTreeBuilderState.InBody.process((Token)object, htmlTreeBuilder);
                }
                bl2 = ((Token)object).isStartTag();
                string2 = "head";
                if (!bl2 || !(bl2 = (string3 = ((Token)object).asStartTag().normalName()).equals(string2))) break block10;
                object = ((Token)object).asStartTag();
                object = htmlTreeBuilder.insertElementFor((Token$StartTag)object);
                htmlTreeBuilder.setHeadElement((Element)object);
                object = HtmlTreeBuilderState.InHead;
                htmlTreeBuilder.transition((HtmlTreeBuilderState)((Object)object));
            }
            return true;
        }
        bl2 = ((Token)object).isEndTag();
        if (bl2 && (bl2 = StringUtil.inSorted(string3 = ((Token)object).asEndTag().normalName(), stringArray = HtmlTreeBuilderState$Constants.BeforeHtmlToHead))) {
            htmlTreeBuilder.processStartTag(string2);
            return htmlTreeBuilder.process((Token)object);
        }
        bl2 = ((Token)object).isEndTag();
        if (bl2) {
            htmlTreeBuilder.error(this);
            return false;
        }
        htmlTreeBuilder.processStartTag(string2);
        return htmlTreeBuilder.process((Token)object);
    }
}

