/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.internal.StringUtil;
import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.HtmlTreeBuilderState;
import org.jsoup.parser.HtmlTreeBuilderState$25;
import org.jsoup.parser.HtmlTreeBuilderState$Constants;
import org.jsoup.parser.Token;

final class HtmlTreeBuilderState$18
extends HtmlTreeBuilderState {
    public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
        Object object = HtmlTreeBuilderState$25.$SwitchMap$org$jsoup$parser$Token$TokenType;
        Object object2 = token.type;
        int bl2 = object2.ordinal();
        int n3 = object[bl2];
        boolean bl3 = true;
        Object object3 = "template";
        switch (n3) {
            default: {
                break;
            }
            case 6: {
                int n4;
                n3 = (int)(htmlTreeBuilder.onStack((String)object3) ? 1 : 0);
                if (n3 == 0) {
                    return bl3;
                }
                htmlTreeBuilder.error(this);
                htmlTreeBuilder.popStackToClose((String)object3);
                htmlTreeBuilder.clearFormattingElementsToLastMarker();
                htmlTreeBuilder.popTemplateMode();
                htmlTreeBuilder.resetInsertionMode();
                object = (Object)htmlTreeBuilder.state();
                object3 = HtmlTreeBuilderState.InTemplate;
                if (object != object3 && (n3 = htmlTreeBuilder.templateModeSize()) < (n4 = 12)) {
                    return htmlTreeBuilder.process(token);
                }
                return bl3;
            }
            case 4: {
                object = token.asEndTag().normalName();
                n3 = (int)(object.equals(object3) ? 1 : 0);
                if (n3 != 0) {
                    object = HtmlTreeBuilderState.InHead;
                    htmlTreeBuilder.process(token, (HtmlTreeBuilderState)((Object)object));
                    break;
                }
                htmlTreeBuilder.error(this);
                return false;
            }
            case 3: {
                object = token.asStartTag().normalName();
                object3 = HtmlTreeBuilderState$Constants.InTemplateToHead;
                boolean bl4 = StringUtil.inSorted((String)object, object3);
                if (bl4) {
                    object = (Object)HtmlTreeBuilderState.InHead;
                    htmlTreeBuilder.process(token, (HtmlTreeBuilderState)((Object)object));
                    break;
                }
                object2 = HtmlTreeBuilderState$Constants.InTemplateToTable;
                boolean bl5 = StringUtil.inSorted((String)object, object2);
                if (bl5) {
                    htmlTreeBuilder.popTemplateMode();
                    object = (Object)HtmlTreeBuilderState.InTable;
                    htmlTreeBuilder.pushTemplateMode((HtmlTreeBuilderState)((Object)object));
                    htmlTreeBuilder.transition((HtmlTreeBuilderState)((Object)object));
                    return htmlTreeBuilder.process(token);
                }
                object2 = "col";
                boolean bl6 = object.equals(object2);
                if (bl6) {
                    htmlTreeBuilder.popTemplateMode();
                    object = (Object)HtmlTreeBuilderState.InColumnGroup;
                    htmlTreeBuilder.pushTemplateMode((HtmlTreeBuilderState)((Object)object));
                    htmlTreeBuilder.transition((HtmlTreeBuilderState)((Object)object));
                    return htmlTreeBuilder.process(token);
                }
                object2 = "tr";
                boolean bl7 = object.equals(object2);
                if (bl7) {
                    htmlTreeBuilder.popTemplateMode();
                    object = (Object)HtmlTreeBuilderState.InTableBody;
                    htmlTreeBuilder.pushTemplateMode((HtmlTreeBuilderState)((Object)object));
                    htmlTreeBuilder.transition((HtmlTreeBuilderState)((Object)object));
                    return htmlTreeBuilder.process(token);
                }
                object2 = "td";
                boolean bl8 = object.equals(object2);
                if (!bl8 && (n3 = (int)(object.equals(object2 = "th") ? 1 : 0)) == 0) {
                    htmlTreeBuilder.popTemplateMode();
                    object = (Object)HtmlTreeBuilderState.InBody;
                    htmlTreeBuilder.pushTemplateMode((HtmlTreeBuilderState)((Object)object));
                    htmlTreeBuilder.transition((HtmlTreeBuilderState)((Object)object));
                    return htmlTreeBuilder.process(token);
                }
                htmlTreeBuilder.popTemplateMode();
                object = HtmlTreeBuilderState.InRow;
                htmlTreeBuilder.pushTemplateMode((HtmlTreeBuilderState)((Object)object));
                htmlTreeBuilder.transition((HtmlTreeBuilderState)((Object)object));
                return htmlTreeBuilder.process(token);
            }
            case 1: 
            case 2: 
            case 5: {
                object = (Object)HtmlTreeBuilderState.InBody;
                htmlTreeBuilder.process(token, (HtmlTreeBuilderState)((Object)object));
            }
        }
        return bl3;
    }
}

