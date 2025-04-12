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
import org.jsoup.parser.Token$StartTag;
import org.jsoup.parser.Token$Tag;

final class HtmlTreeBuilderState$13
extends HtmlTreeBuilderState {
    private boolean anythingElse(Token token, HtmlTreeBuilder htmlTreeBuilder) {
        HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.InTable;
        return htmlTreeBuilder.process(token, htmlTreeBuilderState);
    }

    private boolean exitTableBody(Token token, HtmlTreeBuilder htmlTreeBuilder) {
        String string2 = "tbody";
        boolean bl2 = htmlTreeBuilder.inTableScope(string2);
        if (!(bl2 || (bl2 = htmlTreeBuilder.inTableScope(string2 = "thead")) || (bl2 = htmlTreeBuilder.inScope(string2 = "tfoot")))) {
            htmlTreeBuilder.error(this);
            return false;
        }
        htmlTreeBuilder.clearStackToTableBodyContext();
        string2 = htmlTreeBuilder.currentElement().normalName();
        htmlTreeBuilder.processEndTag(string2);
        return htmlTreeBuilder.process(token);
    }

    public boolean process(Token object, HtmlTreeBuilder htmlTreeBuilder) {
        boolean bl2;
        String string2;
        int n3;
        Object object2;
        Object object3;
        block12: {
            block11: {
                block9: {
                    int n4;
                    block10: {
                        object3 = HtmlTreeBuilderState$25.$SwitchMap$org$jsoup$parser$Token$TokenType;
                        object2 = object.type;
                        n4 = object2.ordinal();
                        n3 = object3[n4];
                        if (n3 == (n4 = 3)) break block9;
                        n4 = 4;
                        if (n3 != n4) {
                            return this.anythingElse((Token)object, htmlTreeBuilder);
                        }
                        object3 = object.asEndTag().normalName();
                        object2 = HtmlTreeBuilderState$Constants.InTableEndIgnore;
                        n4 = (int)(StringUtil.inSorted((String)object3, object2) ? 1 : 0);
                        Object var7_7 = null;
                        if (n4 == 0) break block10;
                        boolean bl3 = htmlTreeBuilder.inTableScope((String)object3);
                        if (!bl3) {
                            htmlTreeBuilder.error(this);
                            return false;
                        }
                        htmlTreeBuilder.clearStackToTableBodyContext();
                        htmlTreeBuilder.pop();
                        object = HtmlTreeBuilderState.InTable;
                        htmlTreeBuilder.transition((HtmlTreeBuilderState)((Object)object));
                        break block11;
                    }
                    object2 = "table";
                    n4 = (int)(((String)object3).equals(object2) ? 1 : 0);
                    if (n4 != 0) {
                        return this.exitTableBody((Token)object, htmlTreeBuilder);
                    }
                    object2 = HtmlTreeBuilderState$Constants.InTableBodyEndIgnore;
                    n3 = (int)(StringUtil.inSorted((String)object3, object2) ? 1 : 0);
                    if (n3 != 0) {
                        htmlTreeBuilder.error(this);
                        return false;
                    }
                    return this.anythingElse((Token)object, htmlTreeBuilder);
                }
                object3 = object.asStartTag();
                object2 = ((Token$Tag)object3).normalName();
                bl2 = object2.equals(string2 = "tr");
                if (!bl2) break block12;
                htmlTreeBuilder.clearStackToTableBodyContext();
                htmlTreeBuilder.insertElementFor((Token$StartTag)object3);
                object = HtmlTreeBuilderState.InRow;
                htmlTreeBuilder.transition((HtmlTreeBuilderState)((Object)object));
            }
            return true;
        }
        String[] stringArray = HtmlTreeBuilderState$Constants.InCellNames;
        bl2 = StringUtil.inSorted((String)object2, stringArray);
        if (bl2) {
            htmlTreeBuilder.error(this);
            htmlTreeBuilder.processStartTag(string2);
            return htmlTreeBuilder.process((Token)object3);
        }
        object3 = HtmlTreeBuilderState$Constants.InTableBodyExit;
        n3 = (int)(StringUtil.inSorted((String)object2, (String[])object3) ? 1 : 0);
        if (n3 != 0) {
            return this.exitTableBody((Token)object, htmlTreeBuilder);
        }
        return this.anythingElse((Token)object, htmlTreeBuilder);
    }
}

