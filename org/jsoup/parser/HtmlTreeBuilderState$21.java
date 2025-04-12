/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.HtmlTreeBuilderState;
import org.jsoup.parser.Token;
import org.jsoup.parser.Token$Character;
import org.jsoup.parser.Token$Comment;

final class HtmlTreeBuilderState$21
extends HtmlTreeBuilderState {
    public boolean process(Token object, HtmlTreeBuilder htmlTreeBuilder) {
        block10: {
            block7: {
                Object object2;
                String string2;
                boolean bl2;
                block9: {
                    block8: {
                        block6: {
                            bl2 = HtmlTreeBuilderState.access$100(object);
                            if (!bl2) break block6;
                            object = object.asCharacter();
                            htmlTreeBuilder.insertCharacterNode((Token$Character)object);
                            break block7;
                        }
                        bl2 = object.isComment();
                        if (!bl2) break block8;
                        object = object.asComment();
                        htmlTreeBuilder.insertCommentNode((Token$Comment)object);
                        break block7;
                    }
                    bl2 = object.isDoctype();
                    if (bl2) {
                        htmlTreeBuilder.error(this);
                        return false;
                    }
                    bl2 = object.isStartTag();
                    string2 = "html";
                    if (bl2 && (bl2 = (object2 = object.asStartTag().normalName()).equals(string2))) {
                        object2 = HtmlTreeBuilderState.InBody;
                        return htmlTreeBuilder.process((Token)object, (HtmlTreeBuilderState)((Object)object2));
                    }
                    bl2 = object.isEndTag();
                    if (!bl2 || !(bl2 = (object2 = object.asEndTag().normalName()).equals(string2))) break block9;
                    object = HtmlTreeBuilderState.AfterAfterFrameset;
                    htmlTreeBuilder.transition((HtmlTreeBuilderState)((Object)object));
                    break block7;
                }
                bl2 = object.isStartTag();
                if (bl2 && (bl2 = (object2 = object.asStartTag().normalName()).equals(string2 = "noframes"))) {
                    object2 = HtmlTreeBuilderState.InHead;
                    return htmlTreeBuilder.process((Token)object, (HtmlTreeBuilderState)((Object)object2));
                }
                boolean bl3 = object.isEOF();
                if (!bl3) break block10;
            }
            return true;
        }
        htmlTreeBuilder.error(this);
        return false;
    }
}

