/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.internal.StringUtil;
import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.HtmlTreeBuilderState;
import org.jsoup.parser.HtmlTreeBuilderState$Constants;
import org.jsoup.parser.Token;

final class HtmlTreeBuilderState$11
extends HtmlTreeBuilderState {
    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean process(Token object, HtmlTreeBuilder htmlTreeBuilder) {
        String string2;
        void var2_4;
        String string3;
        boolean bl2 = ((Token)object).isEndTag();
        String[] stringArray = "caption";
        if (!bl2 || !(bl2 = (string3 = ((Token)object).asEndTag().normalName()).equals(stringArray))) {
            String string4;
            String string5;
            String[] stringArray2;
            String string6;
            bl2 = ((Token)object).isStartTag();
            if (bl2 && (bl2 = StringUtil.inSorted(string6 = ((Token)object).asStartTag().normalName(), stringArray2 = HtmlTreeBuilderState$Constants.InCellCol)) || (bl2 = ((Token)object).isEndTag()) && (bl2 = (string5 = ((Token)object).asEndTag().normalName()).equals(string4 = "table"))) {
                var2_4.error(this);
                bl2 = var2_4.processEndTag((String)stringArray);
                if (!bl2) return true;
                return var2_4.process((Token)object);
            }
        } else {
            String string7 = ((Token)object).asEndTag().normalName();
            boolean bl3 = var2_4.inTableScope(string7);
            if (!bl3) {
                var2_4.error(this);
                return false;
            }
            var2_4.generateImpliedEndTags();
            bl3 = var2_4.currentElementIs((String)stringArray);
            if (!bl3) {
                var2_4.error(this);
            }
            var2_4.popStackToClose((String)stringArray);
            var2_4.clearFormattingElementsToLastMarker();
            HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.InTable;
            var2_4.transition(htmlTreeBuilderState);
            return true;
        }
        bl2 = ((Token)object).isEndTag();
        if (bl2 && (bl2 = StringUtil.inSorted(string2 = ((Token)object).asEndTag().normalName(), stringArray = HtmlTreeBuilderState$Constants.InCaptionIgnore))) {
            var2_4.error(this);
            return false;
        }
        HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.InBody;
        return var2_4.process((Token)object, htmlTreeBuilderState);
    }
}

