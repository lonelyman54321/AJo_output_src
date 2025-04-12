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

final class HtmlTreeBuilderState$6
extends HtmlTreeBuilderState {
    private boolean anythingElse(Token token, HtmlTreeBuilder htmlTreeBuilder) {
        htmlTreeBuilder.processStartTag("body");
        htmlTreeBuilder.framesetOk(true);
        return htmlTreeBuilder.process(token);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public boolean process(Token object, HtmlTreeBuilder htmlTreeBuilder) {
        String[] stringArray;
        void var2_6;
        boolean bl2 = HtmlTreeBuilderState.access$100((Token)object);
        if (bl2) {
            Token$Character token$Character = ((Token)object).asCharacter();
            var2_6.insertCharacterNode(token$Character);
            return true;
        }
        bl2 = ((Token)object).isComment();
        if (bl2) {
            Token$Comment token$Comment = ((Token)object).asComment();
            var2_6.insertCommentNode(token$Comment);
            return true;
        }
        bl2 = ((Token)object).isDoctype();
        if (bl2) {
            var2_6.error(this);
            return true;
        }
        bl2 = ((Token)object).isStartTag();
        HtmlTreeBuilderState htmlTreeBuilderState = null;
        if (bl2) {
            String string2;
            Token$StartTag token$StartTag = ((Token)object).asStartTag();
            String string3 = token$StartTag.normalName();
            boolean bl3 = string3.equals(string2 = "html");
            if (bl3) {
                HtmlTreeBuilderState htmlTreeBuilderState2 = HtmlTreeBuilderState.InBody;
                return var2_6.process((Token)object, htmlTreeBuilderState2);
            }
            string2 = "body";
            bl3 = string3.equals(string2);
            if (bl3) {
                var2_6.insertElementFor(token$StartTag);
                var2_6.framesetOk(false);
                HtmlTreeBuilderState htmlTreeBuilderState3 = HtmlTreeBuilderState.InBody;
                var2_6.transition(htmlTreeBuilderState3);
                return true;
            }
            string2 = "frameset";
            bl3 = string3.equals(string2);
            if (bl3) {
                var2_6.insertElementFor(token$StartTag);
                HtmlTreeBuilderState htmlTreeBuilderState4 = HtmlTreeBuilderState.InFrameset;
                var2_6.transition(htmlTreeBuilderState4);
                return true;
            }
            String[] stringArray2 = HtmlTreeBuilderState$Constants.InBodyStartToHead;
            bl2 = StringUtil.inSorted(string3, stringArray2);
            if (bl2) {
                var2_6.error(this);
                Element element = var2_6.getHeadElement();
                var2_6.push(element);
                htmlTreeBuilderState = HtmlTreeBuilderState.InHead;
                var2_6.process((Token)object, htmlTreeBuilderState);
                var2_6.removeFromStack(element);
                return true;
            }
            String string4 = "head";
            bl2 = string3.equals(string4);
            if (bl2) {
                var2_6.error(this);
                return false;
            }
            this.anythingElse((Token)object, (HtmlTreeBuilder)var2_6);
            return true;
        }
        bl2 = ((Token)object).isEndTag();
        if (!bl2) {
            this.anythingElse((Token)object, (HtmlTreeBuilder)var2_6);
            return true;
        }
        String string5 = ((Token)object).asEndTag().normalName();
        boolean bl4 = StringUtil.inSorted(string5, stringArray = HtmlTreeBuilderState$Constants.AfterHeadBody);
        if (bl4) {
            this.anythingElse((Token)object, (HtmlTreeBuilder)var2_6);
            return true;
        }
        String string6 = "template";
        bl2 = string5.equals(string6);
        if (bl2) {
            HtmlTreeBuilderState htmlTreeBuilderState5 = HtmlTreeBuilderState.InHead;
            var2_6.process((Token)object, htmlTreeBuilderState5);
            return true;
        }
        var2_6.error(this);
        return false;
    }
}

