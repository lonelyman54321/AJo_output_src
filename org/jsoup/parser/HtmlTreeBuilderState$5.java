/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.internal.StringUtil;
import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.HtmlTreeBuilderState;
import org.jsoup.parser.HtmlTreeBuilderState$Constants;
import org.jsoup.parser.Token;
import org.jsoup.parser.Token$Character;

final class HtmlTreeBuilderState$5
extends HtmlTreeBuilderState {
    private boolean anythingElse(Token object, HtmlTreeBuilder htmlTreeBuilder) {
        htmlTreeBuilder.error(this);
        Token$Character token$Character = new Token$Character();
        object = object.toString();
        object = token$Character.data((String)object);
        htmlTreeBuilder.insertCharacterNode((Token$Character)object);
        return true;
    }

    public boolean process(Token object, HtmlTreeBuilder htmlTreeBuilder) {
        String[] stringArray;
        Object object2;
        boolean bl2;
        block9: {
            block8: {
                block7: {
                    bl2 = ((Token)object).isDoctype();
                    if (!bl2) break block7;
                    htmlTreeBuilder.error(this);
                    break block8;
                }
                bl2 = ((Token)object).isStartTag();
                if (bl2 && (bl2 = ((String)(object2 = ((Token)object).asStartTag().normalName())).equals(stringArray = "html"))) {
                    object2 = HtmlTreeBuilderState.InBody;
                    return htmlTreeBuilder.process((Token)object, (HtmlTreeBuilderState)((Object)object2));
                }
                bl2 = ((Token)object).isEndTag();
                if (!bl2 || !(bl2 = ((String)(object2 = ((Token)object).asEndTag().normalName())).equals(stringArray = "noscript"))) break block9;
                htmlTreeBuilder.pop();
                object = HtmlTreeBuilderState.InHead;
                htmlTreeBuilder.transition((HtmlTreeBuilderState)((Object)object));
            }
            return true;
        }
        bl2 = HtmlTreeBuilderState.access$100((Token)object);
        if (!(bl2 || (bl2 = ((Token)object).isComment()) || (bl2 = ((Token)object).isStartTag()) && (bl2 = StringUtil.inSorted((String)(object2 = ((Token)object).asStartTag().normalName()), stringArray = HtmlTreeBuilderState$Constants.InHeadNoScriptHead)))) {
            bl2 = ((Token)object).isEndTag();
            if (bl2 && (bl2 = ((String)(object2 = ((Token)object).asEndTag().normalName())).equals(stringArray = "br"))) {
                return this.anythingElse((Token)object, htmlTreeBuilder);
            }
            bl2 = ((Token)object).isStartTag();
            if (bl2 && (bl2 = StringUtil.inSorted((String)(object2 = ((Token)object).asStartTag().normalName()), stringArray = HtmlTreeBuilderState$Constants.InHeadNoscriptIgnore)) || (bl2 = ((Token)object).isEndTag())) {
                htmlTreeBuilder.error(this);
                return false;
            }
            return this.anythingElse((Token)object, htmlTreeBuilder);
        }
        object2 = HtmlTreeBuilderState.InHead;
        return htmlTreeBuilder.process((Token)object, (HtmlTreeBuilderState)((Object)object2));
    }
}

