/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.internal.StringUtil;
import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.HtmlTreeBuilderState;
import org.jsoup.parser.HtmlTreeBuilderState$Constants;
import org.jsoup.parser.Token;
import org.jsoup.parser.Token$Character;
import org.jsoup.parser.Token$Comment;
import org.jsoup.parser.Token$StartTag;

final class HtmlTreeBuilderState$2
extends HtmlTreeBuilderState {
    private boolean anythingElse(Token token, HtmlTreeBuilder htmlTreeBuilder) {
        htmlTreeBuilder.processStartTag("html");
        HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.BeforeHead;
        htmlTreeBuilder.transition(htmlTreeBuilderState);
        return htmlTreeBuilder.process(token);
    }

    public boolean process(Token object, HtmlTreeBuilder htmlTreeBuilder) {
        String[] stringArray;
        String string2;
        boolean bl2;
        block9: {
            block7: {
                block8: {
                    block6: {
                        bl2 = object.isDoctype();
                        if (bl2) {
                            htmlTreeBuilder.error(this);
                            return false;
                        }
                        bl2 = object.isComment();
                        if (!bl2) break block6;
                        object = object.asComment();
                        htmlTreeBuilder.insertCommentNode((Token$Comment)object);
                        break block7;
                    }
                    bl2 = HtmlTreeBuilderState.access$100(object);
                    if (!bl2) break block8;
                    object = object.asCharacter();
                    htmlTreeBuilder.insertCharacterNode((Token$Character)object);
                    break block7;
                }
                bl2 = object.isStartTag();
                if (!bl2 || !(bl2 = (string2 = object.asStartTag().normalName()).equals(stringArray = "html"))) break block9;
                object = object.asStartTag();
                htmlTreeBuilder.insertElementFor((Token$StartTag)object);
                object = HtmlTreeBuilderState.BeforeHead;
                htmlTreeBuilder.transition((HtmlTreeBuilderState)((Object)object));
            }
            return true;
        }
        bl2 = object.isEndTag();
        if (bl2 && (bl2 = StringUtil.inSorted(string2 = object.asEndTag().normalName(), stringArray = HtmlTreeBuilderState$Constants.BeforeHtmlToHead))) {
            return this.anythingElse((Token)object, htmlTreeBuilder);
        }
        bl2 = object.isEndTag();
        if (bl2) {
            htmlTreeBuilder.error(this);
            return false;
        }
        return this.anythingElse((Token)object, htmlTreeBuilder);
    }
}

