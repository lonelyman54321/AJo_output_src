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

final class HtmlTreeBuilderState$19
extends HtmlTreeBuilderState {
    public boolean process(Token object, HtmlTreeBuilder htmlTreeBuilder) {
        block13: {
            block10: {
                boolean bl2;
                block12: {
                    String string2;
                    boolean bl3;
                    Element element;
                    Object object2;
                    block11: {
                        block9: {
                            object2 = "html";
                            element = htmlTreeBuilder.getFromStack((String)object2);
                            bl3 = HtmlTreeBuilderState.access$100(object);
                            if (!bl3) break block9;
                            if (element != null) {
                                object = object.asCharacter();
                                htmlTreeBuilder.insertCharacterToElement((Token$Character)object, element);
                            } else {
                                object2 = HtmlTreeBuilderState.InBody;
                                htmlTreeBuilder.process((Token)object, (HtmlTreeBuilderState)((Object)object2));
                            }
                            break block10;
                        }
                        bl3 = object.isComment();
                        if (!bl3) break block11;
                        object = object.asComment();
                        htmlTreeBuilder.insertCommentNode((Token$Comment)object);
                        break block10;
                    }
                    bl3 = object.isDoctype();
                    if (bl3) {
                        htmlTreeBuilder.error(this);
                        return false;
                    }
                    bl3 = object.isStartTag();
                    if (bl3 && (bl3 = (string2 = object.asStartTag().normalName()).equals(object2))) {
                        object2 = HtmlTreeBuilderState.InBody;
                        return htmlTreeBuilder.process((Token)object, (HtmlTreeBuilderState)((Object)object2));
                    }
                    bl3 = object.isEndTag();
                    if (!bl3 || !(bl2 = (string2 = object.asEndTag().normalName()).equals(object2))) break block12;
                    boolean bl4 = htmlTreeBuilder.isFragmentParsing();
                    if (bl4) {
                        htmlTreeBuilder.error(this);
                        return false;
                    }
                    if (element != null) {
                        htmlTreeBuilder.onNodeClosed(element);
                    }
                    object = HtmlTreeBuilderState.AfterAfterBody;
                    htmlTreeBuilder.transition((HtmlTreeBuilderState)((Object)object));
                    break block10;
                }
                bl2 = object.isEOF();
                if (!bl2) break block13;
            }
            return true;
        }
        htmlTreeBuilder.error(this);
        htmlTreeBuilder.resetBody();
        return htmlTreeBuilder.process((Token)object);
    }
}

