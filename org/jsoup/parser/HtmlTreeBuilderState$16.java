/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Element;
import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.HtmlTreeBuilderState;
import org.jsoup.parser.HtmlTreeBuilderState$25;
import org.jsoup.parser.HtmlTreeBuilderState$Constants;
import org.jsoup.parser.Token;
import org.jsoup.parser.Token$Character;
import org.jsoup.parser.Token$Comment;
import org.jsoup.parser.Token$StartTag;
import org.jsoup.parser.Token$Tag;

final class HtmlTreeBuilderState$16
extends HtmlTreeBuilderState {
    private boolean anythingElse(Token token, HtmlTreeBuilder htmlTreeBuilder) {
        htmlTreeBuilder.error(this);
        return false;
    }

    public boolean process(Token object, HtmlTreeBuilder htmlTreeBuilder) {
        Object object2 = "select";
        boolean bl2 = true;
        String string2 = "template";
        Object object3 = HtmlTreeBuilderState$25.$SwitchMap$org$jsoup$parser$Token$TokenType;
        int n3 = ((Token)object).type.ordinal();
        int n4 = object3[n3];
        String string3 = "html";
        String string4 = "optgroup";
        String string5 = "option";
        block0 : switch (n4) {
            default: {
                return this.anythingElse((Token)object, htmlTreeBuilder);
            }
            case 6: {
                boolean bl3 = htmlTreeBuilder.currentElementIs(string3);
                if (bl3) break;
                htmlTreeBuilder.error(this);
                break;
            }
            case 5: {
                object = ((Token)object).asCharacter();
                object2 = ((Token$Character)object).getData();
                string2 = HtmlTreeBuilderState.access$400();
                boolean bl4 = object2.equals(string2);
                if (bl4) {
                    htmlTreeBuilder.error(this);
                    return false;
                }
                htmlTreeBuilder.insertCharacterNode((Token$Character)object);
                break;
            }
            case 4: {
                object3 = ((Token)object).asEndTag().normalName();
                object3.getClass();
                n3 = -1;
                int n7 = ((String)object3).hashCode();
                switch (n7) {
                    default: {
                        break;
                    }
                    case -80773204: {
                        boolean bl5 = ((String)object3).equals(string4);
                        if (!bl5) break;
                        n3 = 3;
                        break;
                    }
                    case -906021636: {
                        boolean bl6 = ((String)object3).equals(object2);
                        if (!bl6) break;
                        n3 = 2;
                        break;
                    }
                    case -1010136971: {
                        boolean bl7 = ((String)object3).equals(string5);
                        if (!bl7) break;
                        n3 = 1;
                        break;
                    }
                    case -1321546630: {
                        boolean bl8 = ((String)object3).equals(string2);
                        if (!bl8) break;
                        n3 = 0;
                        string3 = null;
                    }
                }
                switch (n3) {
                    default: {
                        return this.anythingElse((Token)object, htmlTreeBuilder);
                    }
                    case 3: {
                        boolean bl9 = htmlTreeBuilder.currentElementIs(string5);
                        if (bl9) {
                            object = htmlTreeBuilder.currentElement();
                            if ((object = htmlTreeBuilder.aboveOnStack((Element)object)) != null) {
                                object = htmlTreeBuilder.currentElement();
                                bl9 = ((String)(object = htmlTreeBuilder.aboveOnStack((Element)object).normalName())).equals(string4);
                                if (bl9) {
                                    htmlTreeBuilder.processEndTag(string5);
                                }
                            }
                        }
                        if (bl9 = htmlTreeBuilder.currentElementIs(string4)) {
                            htmlTreeBuilder.pop();
                            break block0;
                        }
                        htmlTreeBuilder.error(this);
                        break block0;
                    }
                    case 2: {
                        boolean bl10 = htmlTreeBuilder.inSelectScope((String)object3);
                        if (!bl10) {
                            htmlTreeBuilder.error(this);
                            return false;
                        }
                        htmlTreeBuilder.popStackToClose((String)object3);
                        htmlTreeBuilder.resetInsertionMode();
                        break block0;
                    }
                    case 1: {
                        boolean bl11 = htmlTreeBuilder.currentElementIs(string5);
                        if (bl11) {
                            htmlTreeBuilder.pop();
                            break block0;
                        }
                        htmlTreeBuilder.error(this);
                        break block0;
                    }
                    case 0: 
                }
                object2 = HtmlTreeBuilderState.InHead;
                return htmlTreeBuilder.process((Token)object, (HtmlTreeBuilderState)((Object)object2));
            }
            case 3: {
                object3 = ((Token)object).asStartTag();
                String string6 = ((Token$Tag)object3).normalName();
                n3 = (int)(string6.equals(string3) ? 1 : 0);
                if (n3 != 0) {
                    object = HtmlTreeBuilderState.InBody;
                    return htmlTreeBuilder.process((Token)object3, (HtmlTreeBuilderState)((Object)object));
                }
                n3 = (int)(string6.equals(string5) ? 1 : 0);
                if (n3 != 0) {
                    boolean bl12 = htmlTreeBuilder.currentElementIs(string5);
                    if (bl12) {
                        htmlTreeBuilder.processEndTag(string5);
                    }
                    htmlTreeBuilder.insertElementFor((Token$StartTag)object3);
                    break;
                }
                n3 = (int)(string6.equals(string4) ? 1 : 0);
                if (n3 != 0) {
                    boolean bl13 = htmlTreeBuilder.currentElementIs(string5);
                    if (bl13) {
                        htmlTreeBuilder.processEndTag(string5);
                    }
                    if (bl13 = htmlTreeBuilder.currentElementIs(string4)) {
                        htmlTreeBuilder.processEndTag(string4);
                    }
                    htmlTreeBuilder.insertElementFor((Token$StartTag)object3);
                    break;
                }
                bl2 = string6.equals(object2);
                if (bl2) {
                    htmlTreeBuilder.error(this);
                    return htmlTreeBuilder.processEndTag((String)object2);
                }
                String[] stringArray = HtmlTreeBuilderState$Constants.InSelectEnd;
                bl2 = StringUtil.inSorted(string6, stringArray);
                if (bl2) {
                    htmlTreeBuilder.error(this);
                    boolean bl14 = htmlTreeBuilder.inSelectScope((String)object2);
                    if (!bl14) {
                        return false;
                    }
                    htmlTreeBuilder.processEndTag((String)object2);
                    return htmlTreeBuilder.process((Token)object3);
                }
                object2 = "script";
                boolean bl15 = string6.equals(object2);
                if (!bl15 && !(bl15 = string6.equals(string2))) {
                    return this.anythingElse((Token)object, htmlTreeBuilder);
                }
                object2 = HtmlTreeBuilderState.InHead;
                return htmlTreeBuilder.process((Token)object, (HtmlTreeBuilderState)((Object)object2));
            }
            case 2: {
                htmlTreeBuilder.error(this);
                return false;
            }
            case 1: {
                object = ((Token)object).asComment();
                htmlTreeBuilder.insertCommentNode((Token$Comment)object);
            }
        }
        return bl2;
    }
}

