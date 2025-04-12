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
import org.jsoup.parser.Token$TokenType;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;
import org.jsoup.parser.TreeBuilder;

final class HtmlTreeBuilderState$4
extends HtmlTreeBuilderState {
    private boolean anythingElse(Token token, TreeBuilder treeBuilder) {
        treeBuilder.processEndTag("head");
        return treeBuilder.process(token);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public boolean process(Token object, HtmlTreeBuilder htmlTreeBuilder) {
        String string2;
        void var2_10;
        int n3 = HtmlTreeBuilderState.access$100((Token)object);
        int n4 = 1;
        if (n3) {
            Token$Character token$Character = ((Token)object).asCharacter();
            var2_10.insertCharacterNode(token$Character);
            return n4 != 0;
        }
        int[] nArray = HtmlTreeBuilderState$25.$SwitchMap$org$jsoup$parser$Token$TokenType;
        Token$TokenType token$TokenType = ((Token)object).type;
        int n7 = token$TokenType.ordinal();
        n3 = nArray[n7];
        if (n3 == n4) {
            Token$Comment token$Comment = ((Token)object).asComment();
            var2_10.insertCommentNode(token$Comment);
            return n4 != 0;
        }
        n7 = 2;
        if (n3 == n7) {
            var2_10.error(this);
            return false;
        }
        n7 = 3;
        String string3 = "template";
        String string4 = "head";
        if (n3 != n7) {
            n7 = 4;
            if (n3 != n7) {
                return this.anythingElse((Token)object, (TreeBuilder)var2_10);
            }
            String string5 = ((Token)object).asEndTag().normalName();
            n7 = (int)(string5.equals(string4) ? 1 : 0);
            if (n7) {
                var2_10.pop();
                HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.AfterHead;
                var2_10.transition(htmlTreeBuilderState);
                return n4 != 0;
            }
            String[] stringArray = HtmlTreeBuilderState$Constants.InHeadEnd;
            n7 = (int)(StringUtil.inSorted(string5, stringArray) ? 1 : 0);
            if (n7) {
                return this.anythingElse((Token)object, (TreeBuilder)var2_10);
            }
            boolean bl2 = string5.equals(string3);
            if (!bl2) {
                var2_10.error(this);
                return false;
            }
            bl2 = var2_10.onStack(string5);
            if (!bl2) {
                var2_10.error(this);
                return n4 != 0;
            }
            var2_10.generateImpliedEndTags(n4 != 0);
            bl2 = var2_10.currentElementIs(string5);
            if (!bl2) {
                var2_10.error(this);
            }
            var2_10.popStackToClose(string5);
            var2_10.clearFormattingElementsToLastMarker();
            var2_10.popTemplateMode();
            var2_10.resetInsertionMode();
            return n4 != 0;
        }
        Token$StartTag token$StartTag = ((Token)object).asStartTag();
        String string6 = token$StartTag.normalName();
        boolean bl3 = string6.equals(string2 = "html");
        if (bl3) {
            return HtmlTreeBuilderState.InBody.process((Token)object, (HtmlTreeBuilder)var2_10);
        }
        String[] stringArray = HtmlTreeBuilderState$Constants.InHeadEmpty;
        bl3 = StringUtil.inSorted(string6, stringArray);
        if (bl3) {
            Element element = var2_10.insertEmptyElementFor(token$StartTag);
            String string7 = "base";
            n3 = (int)(string6.equals(string7) ? 1 : 0);
            if (n3 == 0) return n4 != 0;
            String string8 = "href";
            n3 = element.hasAttr(string8);
            if (n3 == 0) return n4 != 0;
            var2_10.maybeSetBaseUri(element);
            return n4 != 0;
        }
        String string9 = "meta";
        bl3 = string6.equals(string9);
        if (bl3) {
            var2_10.insertEmptyElementFor(token$StartTag);
            return n4 != 0;
        }
        String string10 = "title";
        bl3 = string6.equals(string10);
        if (bl3) {
            HtmlTreeBuilderState.access$200(token$StartTag, (HtmlTreeBuilder)var2_10);
            return n4 != 0;
        }
        String[] stringArray2 = HtmlTreeBuilderState$Constants.InHeadRaw;
        bl3 = StringUtil.inSorted(string6, stringArray2);
        if (bl3) {
            HtmlTreeBuilderState.access$300(token$StartTag, (HtmlTreeBuilder)var2_10);
            return n4 != 0;
        }
        String string11 = "noscript";
        bl3 = string6.equals(string11);
        if (bl3) {
            var2_10.insertElementFor(token$StartTag);
            HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.InHeadNoscript;
            var2_10.transition(htmlTreeBuilderState);
            return n4 != 0;
        }
        String string12 = "script";
        bl3 = string6.equals(string12);
        if (bl3) {
            Tokeniser tokeniser = var2_10.tokeniser;
            TokeniserState tokeniserState = TokeniserState.ScriptData;
            tokeniser.transition(tokeniserState);
            var2_10.markInsertionMode();
            HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.Text;
            var2_10.transition(htmlTreeBuilderState);
            var2_10.insertElementFor(token$StartTag);
            return n4 != 0;
        }
        boolean bl4 = string6.equals(string4);
        if (bl4) {
            var2_10.error(this);
            return false;
        }
        n7 = string6.equals(string3);
        if (n7 == 0) return this.anythingElse((Token)object, (TreeBuilder)var2_10);
        var2_10.insertElementFor(token$StartTag);
        var2_10.insertMarkerToFormattingElements();
        var2_10.framesetOk(false);
        HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.InTemplate;
        var2_10.transition(htmlTreeBuilderState);
        var2_10.pushTemplateMode(htmlTreeBuilderState);
        return n4 != 0;
    }
}

