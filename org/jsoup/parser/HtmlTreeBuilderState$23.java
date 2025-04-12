/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.HtmlTreeBuilderState;
import org.jsoup.parser.Token;
import org.jsoup.parser.Token$Comment;

final class HtmlTreeBuilderState$23
extends HtmlTreeBuilderState {
    public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
        Object object;
        block6: {
            String string2;
            boolean bl2;
            block7: {
                block5: {
                    block4: {
                        bl2 = token.isComment();
                        if (!bl2) break block4;
                        token = token.asComment();
                        htmlTreeBuilder.insertCommentNode((Token$Comment)token);
                        break block5;
                    }
                    bl2 = token.isDoctype();
                    if (bl2 || (bl2 = HtmlTreeBuilderState.access$100(token)) || (bl2 = token.isStartTag()) && (bl2 = ((String)(object = token.asStartTag().normalName())).equals(string2 = "html"))) break block6;
                    bl2 = token.isEOF();
                    if (!bl2) break block7;
                }
                return true;
            }
            bl2 = token.isStartTag();
            if (bl2 && (bl2 = ((String)(object = token.asStartTag().normalName())).equals(string2 = "noframes"))) {
                object = HtmlTreeBuilderState.InHead;
                return htmlTreeBuilder.process(token, (HtmlTreeBuilderState)((Object)object));
            }
            htmlTreeBuilder.error(this);
            return false;
        }
        object = HtmlTreeBuilderState.InBody;
        return htmlTreeBuilder.process(token, (HtmlTreeBuilderState)((Object)object));
    }
}

