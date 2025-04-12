/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.HtmlTreeBuilderState;
import org.jsoup.parser.HtmlTreeBuilderState$25;
import org.jsoup.parser.Token;
import org.jsoup.parser.Token$Character;
import org.jsoup.parser.Token$Comment;
import org.jsoup.parser.Token$StartTag;
import org.jsoup.parser.Token$TokenType;

final class HtmlTreeBuilderState$12
extends HtmlTreeBuilderState {
    private boolean anythingElse(Token token, HtmlTreeBuilder htmlTreeBuilder) {
        Object object = "colgroup";
        boolean bl2 = htmlTreeBuilder.currentElementIs((String)object);
        if (!bl2) {
            htmlTreeBuilder.error(this);
            return false;
        }
        htmlTreeBuilder.pop();
        object = HtmlTreeBuilderState.InTable;
        htmlTreeBuilder.transition((HtmlTreeBuilderState)((Object)object));
        htmlTreeBuilder.process(token);
        return true;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public boolean process(Token object, HtmlTreeBuilder htmlTreeBuilder) {
        Token$StartTag token$StartTag;
        void var2_5;
        int n3;
        int n4;
        block19: {
            n4 = 0;
            Object var4_7 = null;
            String string2 = "template";
            String string3 = "html";
            int n7 = 2;
            int n8 = HtmlTreeBuilderState.access$100((Token)object);
            n3 = 1;
            if (n8) {
                Token$Character token$Character = ((Token)object).asCharacter();
                var2_5.insertCharacterNode(token$Character);
                return n3;
            }
            int[] nArray = HtmlTreeBuilderState$25.$SwitchMap$org$jsoup$parser$Token$TokenType;
            Token$TokenType token$TokenType = ((Token)object).type;
            int n10 = token$TokenType.ordinal();
            n8 = nArray[n10];
            if (n8 == n3) {
                Token$Comment token$Comment = ((Token)object).asComment();
                var2_5.insertCommentNode(token$Comment);
                return n3;
            }
            if (n8 == n7) {
                var2_5.error(this);
                return n3;
            }
            n10 = 3;
            if (n8 != n10) {
                n7 = 4;
                if (n8 != n7) {
                    n4 = 6;
                    if (n8 != n4) {
                        return this.anythingElse((Token)object, (HtmlTreeBuilder)var2_5);
                    }
                    n4 = (int)(var2_5.currentElementIs(string3) ? 1 : 0);
                    if (n4 == 0) return this.anythingElse((Token)object, (HtmlTreeBuilder)var2_5);
                    return n3;
                }
                string3 = ((Token)object).asEndTag().normalName();
                string3.getClass();
                boolean bl2 = string3.equals(string2);
                if (bl2) {
                    HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.InHead;
                    var2_5.process((Token)object, htmlTreeBuilderState);
                    return n3;
                }
                string2 = "colgroup";
                bl2 = string3.equals(string2);
                if (!bl2) {
                    return this.anythingElse((Token)object, (HtmlTreeBuilder)var2_5);
                }
                boolean bl3 = var2_5.currentElementIs(string3);
                if (!bl3) {
                    var2_5.error(this);
                    return false;
                }
                var2_5.pop();
                HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.InTable;
                var2_5.transition(htmlTreeBuilderState);
                return n3;
            }
            token$StartTag = ((Token)object).asStartTag();
            String string4 = token$StartTag.normalName();
            string4.getClass();
            int n14 = string4.hashCode();
            switch (n14) {
                case 3213227: {
                    n4 = (int)(string4.equals(string3) ? 1 : 0);
                    if (n4 == 0) break;
                    n4 = 2;
                    break block19;
                }
                case 98688: {
                    String string5 = "col";
                    n4 = (int)(string4.equals(string5) ? 1 : 0);
                    if (n4 == 0) break;
                    n4 = 1;
                    break block19;
                }
                case -1321546630: {
                    boolean bl4 = string4.equals(string2);
                    if (bl4) break block19;
                }
            }
            n4 = -1;
        }
        switch (n4) {
            default: {
                return this.anythingElse((Token)object, (HtmlTreeBuilder)var2_5);
            }
            case 2: {
                HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.InBody;
                return var2_5.process((Token)object, htmlTreeBuilderState);
            }
            case 1: {
                var2_5.insertEmptyElementFor(token$StartTag);
                return n3;
            }
            case 0: 
        }
        HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.InHead;
        var2_5.process((Token)object, htmlTreeBuilderState);
        return n3;
    }
}

