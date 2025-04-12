/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.internal.StringUtil;
import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.HtmlTreeBuilderState;
import org.jsoup.parser.HtmlTreeBuilderState$Constants;
import org.jsoup.parser.Token;

final class HtmlTreeBuilderState$15
extends HtmlTreeBuilderState {
    private boolean anythingElse(Token token, HtmlTreeBuilder htmlTreeBuilder) {
        HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.InBody;
        return htmlTreeBuilder.process(token, htmlTreeBuilderState);
    }

    private void closeCell(HtmlTreeBuilder htmlTreeBuilder) {
        String string2 = "td";
        boolean bl2 = htmlTreeBuilder.inTableScope(string2);
        if (bl2) {
            htmlTreeBuilder.processEndTag(string2);
        } else {
            string2 = "th";
            htmlTreeBuilder.processEndTag(string2);
        }
    }

    public boolean process(Token object, HtmlTreeBuilder htmlTreeBuilder) {
        String[] stringArray;
        String string2;
        boolean bl2 = object.isEndTag();
        if (bl2) {
            String[] stringArray2;
            String string3 = object.asEndTag().normalName();
            boolean bl3 = StringUtil.inSorted(string3, stringArray2 = HtmlTreeBuilderState$Constants.InCellNames);
            if (bl3) {
                boolean bl4 = htmlTreeBuilder.inTableScope(string3);
                if (!bl4) {
                    htmlTreeBuilder.error(this);
                    object = HtmlTreeBuilderState.InRow;
                    htmlTreeBuilder.transition((HtmlTreeBuilderState)((Object)object));
                    return false;
                }
                htmlTreeBuilder.generateImpliedEndTags();
                bl4 = htmlTreeBuilder.currentElementIs(string3);
                if (!bl4) {
                    htmlTreeBuilder.error(this);
                }
                htmlTreeBuilder.popStackToClose(string3);
                htmlTreeBuilder.clearFormattingElementsToLastMarker();
                object = HtmlTreeBuilderState.InRow;
                htmlTreeBuilder.transition((HtmlTreeBuilderState)((Object)object));
                return true;
            }
            stringArray2 = HtmlTreeBuilderState$Constants.InCellBody;
            bl3 = StringUtil.inSorted(string3, stringArray2);
            if (bl3) {
                htmlTreeBuilder.error(this);
                return false;
            }
            stringArray2 = HtmlTreeBuilderState$Constants.InCellTable;
            bl3 = StringUtil.inSorted(string3, stringArray2);
            if (bl3) {
                bl2 = htmlTreeBuilder.inTableScope(string3);
                if (!bl2) {
                    htmlTreeBuilder.error(this);
                    return false;
                }
                this.closeCell(htmlTreeBuilder);
                return htmlTreeBuilder.process((Token)object);
            }
            return this.anythingElse((Token)object, htmlTreeBuilder);
        }
        bl2 = object.isStartTag();
        if (bl2 && (bl2 = StringUtil.inSorted(string2 = object.asStartTag().normalName(), stringArray = HtmlTreeBuilderState$Constants.InCellCol))) {
            string2 = "td";
            bl2 = htmlTreeBuilder.inTableScope(string2);
            if (!bl2 && !(bl2 = htmlTreeBuilder.inTableScope(string2 = "th"))) {
                htmlTreeBuilder.error(this);
                return false;
            }
            this.closeCell(htmlTreeBuilder);
            return htmlTreeBuilder.process((Token)object);
        }
        return this.anythingElse((Token)object, htmlTreeBuilder);
    }
}

