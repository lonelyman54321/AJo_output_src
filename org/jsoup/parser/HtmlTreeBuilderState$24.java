/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import java.util.ArrayList;
import org.jsoup.helper.Validate;
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
import org.jsoup.parser.Token$TokenType;

final class HtmlTreeBuilderState$24
extends HtmlTreeBuilderState {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean process(Token object, HtmlTreeBuilder htmlTreeBuilder) {
        Object object2 = HtmlTreeBuilderState$25.$SwitchMap$org$jsoup$parser$Token$TokenType;
        Token$TokenType token$TokenType = ((Token)object).type;
        int n3 = token$TokenType.ordinal();
        int n4 = object2[n3];
        if (n4 != (n3 = 1)) {
            int n7 = 2;
            if (n4 != n7) {
                n7 = 3;
                if (n4 != n7) {
                    n7 = 4;
                    if (n4 != n7) {
                        String string2;
                        n7 = 5;
                        if (n4 != n7) return n3 != 0;
                        object2 = ((Token$Character)(object = ((Token)object).asCharacter())).getData();
                        n4 = (int)(((String)object2).equals(string2 = HtmlTreeBuilderState.access$400()) ? 1 : 0);
                        if (n4 != 0) {
                            htmlTreeBuilder.error(this);
                            return n3 != 0;
                        } else {
                            n4 = (int)(HtmlTreeBuilderState.access$100((Token)object) ? 1 : 0);
                            if (n4 != 0) {
                                htmlTreeBuilder.insertCharacterNode((Token$Character)object);
                                return n3 != 0;
                            } else {
                                htmlTreeBuilder.insertCharacterNode((Token$Character)object);
                                object = null;
                                htmlTreeBuilder.framesetOk(false);
                            }
                        }
                        return n3 != 0;
                    } else {
                        String string3;
                        Element element;
                        String string4;
                        boolean bl2;
                        String string5;
                        object2 = ((Token)object).asEndTag();
                        Object object3 = ((Token$Tag)object2).normalName;
                        String string6 = "br";
                        n7 = (int)(((String)object3).equals(string6) ? 1 : 0);
                        if (n7 != 0 || (n7 = (int)(((String)(object3 = ((Token$Tag)object2).normalName)).equals(string5 = "p") ? 1 : 0)) != 0) return this.processAsHtml((Token)object, htmlTreeBuilder);
                        object3 = ((Token$Tag)object2).normalName;
                        String string7 = "script";
                        n7 = (int)(((String)object3).equals(string7) ? 1 : 0);
                        if (n7 != 0 && (n7 = (int)(htmlTreeBuilder.currentElementIs(string7, (String)(object3 = "http://www.w3.org/2000/svg")) ? 1 : 0)) != 0) {
                            htmlTreeBuilder.pop();
                            return n3 != 0;
                        }
                        object3 = htmlTreeBuilder.getStack();
                        int n8 = ((ArrayList)object3).isEmpty();
                        if (n8 != 0) {
                            String string8 = "Stack unexpectedly empty";
                            Validate.wtf(string8);
                        }
                        if (!(bl2 = (string4 = (element = (Element)((ArrayList)object3).get(n8 = ((ArrayList)object3).size() - n3)).normalName()).equals(string3 = ((Token$Tag)object2).normalName))) {
                            htmlTreeBuilder.error(this);
                        }
                        while (n8 != 0) {
                            string4 = element.normalName();
                            bl2 = string4.equals(string3 = ((Token$Tag)object2).normalName);
                            if (bl2) {
                                object = element.normalName();
                                htmlTreeBuilder.popStackToCloseAnyNamespace((String)object);
                                return n3 != 0;
                            }
                            element = (Element)((ArrayList)object3).get(n8 += -1);
                            string4 = element.tag().namespace();
                            bl2 = string4.equals(string3 = "http://www.w3.org/1999/xhtml");
                            if (!bl2) continue;
                            return this.processAsHtml((Token)object, htmlTreeBuilder);
                        }
                    }
                    return n3 != 0;
                } else {
                    object2 = ((Token)object).asStartTag();
                    String string9 = ((Token$Tag)object2).normalName;
                    String[] stringArray = HtmlTreeBuilderState$Constants.InForeignToHtml;
                    n7 = (int)(StringUtil.in(string9, stringArray) ? 1 : 0);
                    if (n7 != 0) {
                        return this.processAsHtml((Token)object, htmlTreeBuilder);
                    }
                    string9 = ((Token$Tag)object2).normalName;
                    String string10 = "font";
                    n7 = (int)(string9.equals(string10) ? 1 : 0);
                    if (n7 != 0 && ((n7 = (int)(((Token$Tag)object2).hasAttributeIgnoreCase(string9 = "color") ? 1 : 0)) != 0 || (n7 = (int)(((Token$Tag)object2).hasAttributeIgnoreCase(string9 = "face") ? 1 : 0)) != 0 || (n7 = (int)(((Token$Tag)object2).hasAttributeIgnoreCase(string9 = "size") ? 1 : 0)) != 0)) {
                        return this.processAsHtml((Token)object, htmlTreeBuilder);
                    }
                    object = htmlTreeBuilder.currentElement().tag().namespace();
                    htmlTreeBuilder.insertForeignElementFor((Token$StartTag)object2, (String)object);
                }
                return n3 != 0;
            } else {
                htmlTreeBuilder.error(this);
            }
            return n3 != 0;
        } else {
            object = ((Token)object).asComment();
            htmlTreeBuilder.insertCommentNode((Token$Comment)object);
        }
        return n3 != 0;
    }

    public boolean processAsHtml(Token token, HtmlTreeBuilder htmlTreeBuilder) {
        return htmlTreeBuilder.state().process(token, htmlTreeBuilder);
    }
}

