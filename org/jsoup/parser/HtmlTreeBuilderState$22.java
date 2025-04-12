/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.nodes.Element;
import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.HtmlTreeBuilderState;
import org.jsoup.parser.Token;
import org.jsoup.parser.Token$Character;
import org.jsoup.parser.Token$Comment;

final class HtmlTreeBuilderState$22
extends HtmlTreeBuilderState {
    public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
        Object object;
        block4: {
            block6: {
                block3: {
                    boolean bl2;
                    block5: {
                        String string2;
                        block2: {
                            bl2 = token.isComment();
                            if (!bl2) break block2;
                            token = token.asComment();
                            htmlTreeBuilder.insertCommentNode((Token$Comment)token);
                            break block3;
                        }
                        bl2 = token.isDoctype();
                        if (bl2 || (bl2 = token.isStartTag()) && (bl2 = ((String)(object = token.asStartTag().normalName())).equals(string2 = "html"))) break block4;
                        bl2 = HtmlTreeBuilderState.access$100(token);
                        if (!bl2) break block5;
                        object = htmlTreeBuilder.getDocument();
                        token = token.asCharacter();
                        htmlTreeBuilder.insertCharacterToElement((Token$Character)token, (Element)object);
                        break block3;
                    }
                    bl2 = token.isEOF();
                    if (!bl2) break block6;
                }
                return true;
            }
            htmlTreeBuilder.error(this);
            htmlTreeBuilder.resetBody();
            return htmlTreeBuilder.process(token);
        }
        object = HtmlTreeBuilderState.InBody;
        return htmlTreeBuilder.process(token, (HtmlTreeBuilderState)((Object)object));
    }
}

