/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.HtmlTreeBuilderState;
import org.jsoup.parser.Token;
import org.jsoup.parser.Token$Character;
import org.jsoup.parser.Token$Comment;
import org.jsoup.parser.Token$StartTag;
import org.jsoup.parser.Token$Tag;

final class HtmlTreeBuilderState$20
extends HtmlTreeBuilderState {
    public boolean process(Token object, HtmlTreeBuilder htmlTreeBuilder) {
        block25: {
            boolean bl2;
            block21: {
                Object object2;
                block24: {
                    String string2;
                    boolean bl3;
                    String string3;
                    block23: {
                        block22: {
                            block20: {
                                object2 = "html";
                                string3 = "frameset";
                                bl3 = HtmlTreeBuilderState.access$100(object);
                                bl2 = true;
                                if (!bl3) break block20;
                                object = object.asCharacter();
                                htmlTreeBuilder.insertCharacterNode((Token$Character)object);
                                break block21;
                            }
                            bl3 = object.isComment();
                            if (!bl3) break block22;
                            object = object.asComment();
                            htmlTreeBuilder.insertCommentNode((Token$Comment)object);
                            break block21;
                        }
                        bl3 = object.isDoctype();
                        if (bl3) {
                            htmlTreeBuilder.error(this);
                            return false;
                        }
                        bl3 = object.isStartTag();
                        if (!bl3) break block23;
                        object = object.asStartTag();
                        String string4 = ((Token$Tag)object).normalName();
                        string4.getClass();
                        int n3 = -1;
                        int n4 = string4.hashCode();
                        switch (n4) {
                            default: {
                                break;
                            }
                            case 1192721831: {
                                object2 = "noframes";
                                boolean bl4 = string4.equals(object2);
                                if (!bl4) break;
                                n3 = 3;
                                break;
                            }
                            case 97692013: {
                                object2 = "frame";
                                boolean bl5 = string4.equals(object2);
                                if (!bl5) break;
                                n3 = 2;
                                break;
                            }
                            case 3213227: {
                                boolean bl6 = string4.equals(object2);
                                if (!bl6) break;
                                n3 = 1;
                                break;
                            }
                            case -1644953643: {
                                boolean bl7 = string4.equals(string3);
                                if (!bl7) break;
                                n3 = 0;
                            }
                        }
                        switch (n3) {
                            default: {
                                htmlTreeBuilder.error(this);
                                return false;
                            }
                            case 3: {
                                object2 = HtmlTreeBuilderState.InHead;
                                return htmlTreeBuilder.process((Token)object, (HtmlTreeBuilderState)((Object)object2));
                            }
                            case 2: {
                                htmlTreeBuilder.insertEmptyElementFor((Token$StartTag)object);
                                break;
                            }
                            case 1: {
                                object2 = HtmlTreeBuilderState.InBody;
                                return htmlTreeBuilder.process((Token)object, (HtmlTreeBuilderState)((Object)object2));
                            }
                            case 0: {
                                htmlTreeBuilder.insertElementFor((Token$StartTag)object);
                                break;
                            }
                        }
                        break block21;
                    }
                    bl3 = object.isEndTag();
                    if (!bl3 || !(bl3 = (string2 = object.asEndTag().normalName()).equals(string3))) break block24;
                    boolean bl8 = htmlTreeBuilder.currentElementIs((String)object2);
                    if (bl8) {
                        htmlTreeBuilder.error(this);
                        return false;
                    }
                    htmlTreeBuilder.pop();
                    bl8 = htmlTreeBuilder.isFragmentParsing();
                    if (!bl8 && !(bl8 = htmlTreeBuilder.currentElementIs(string3))) {
                        object = HtmlTreeBuilderState.AfterFrameset;
                        htmlTreeBuilder.transition((HtmlTreeBuilderState)((Object)object));
                    }
                    break block21;
                }
                boolean bl9 = object.isEOF();
                if (!bl9) break block25;
                bl9 = htmlTreeBuilder.currentElementIs((String)object2);
                if (!bl9) {
                    htmlTreeBuilder.error(this);
                }
            }
            return bl2;
        }
        htmlTreeBuilder.error(this);
        return false;
    }
}

