/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.internal.StringUtil;
import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.HtmlTreeBuilderState;
import org.jsoup.parser.HtmlTreeBuilderState$Constants;
import org.jsoup.parser.Token;

final class HtmlTreeBuilderState$17
extends HtmlTreeBuilderState {
    public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
        String[] stringArray;
        Object object;
        boolean bl2 = token.isStartTag();
        String string2 = "select";
        if (bl2 && (bl2 = StringUtil.inSorted(object = token.asStartTag().normalName(), stringArray = HtmlTreeBuilderState$Constants.InSelectTableEnd))) {
            htmlTreeBuilder.error(this);
            htmlTreeBuilder.popStackToClose(string2);
            htmlTreeBuilder.resetInsertionMode();
            return htmlTreeBuilder.process(token);
        }
        bl2 = token.isEndTag();
        if (bl2 && (bl2 = StringUtil.inSorted(object = token.asEndTag().normalName(), stringArray = HtmlTreeBuilderState$Constants.InSelectTableEnd))) {
            htmlTreeBuilder.error(this);
            object = token.asEndTag().normalName();
            bl2 = htmlTreeBuilder.inTableScope((String)object);
            if (bl2) {
                htmlTreeBuilder.popStackToClose(string2);
                htmlTreeBuilder.resetInsertionMode();
                return htmlTreeBuilder.process(token);
            }
            return false;
        }
        object = HtmlTreeBuilderState.InSelect;
        return htmlTreeBuilder.process(token, (HtmlTreeBuilderState)((Object)object));
    }
}

