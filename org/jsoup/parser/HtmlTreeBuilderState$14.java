/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.internal.StringUtil;
import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.HtmlTreeBuilderState;
import org.jsoup.parser.HtmlTreeBuilderState$Constants;
import org.jsoup.parser.Token;
import org.jsoup.parser.Token$StartTag;

final class HtmlTreeBuilderState$14
extends HtmlTreeBuilderState {
    private boolean anythingElse(Token token, HtmlTreeBuilder htmlTreeBuilder) {
        HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.InTable;
        return htmlTreeBuilder.process(token, htmlTreeBuilderState);
    }

    public boolean process(Token object, HtmlTreeBuilder htmlTreeBuilder) {
        block15: {
            boolean bl2;
            Object object2;
            String[] stringArray;
            boolean bl3;
            block16: {
                block14: {
                    block12: {
                        String string2;
                        Object object3;
                        block13: {
                            String[] stringArray2;
                            bl3 = object.isStartTag();
                            stringArray = "tr";
                            if (!bl3) break block12;
                            object3 = object.asStartTag();
                            string2 = object3.normalName();
                            boolean bl4 = StringUtil.inSorted(string2, stringArray2 = HtmlTreeBuilderState$Constants.InCellNames);
                            if (!bl4) break block13;
                            htmlTreeBuilder.clearStackToTableRowContext();
                            htmlTreeBuilder.insertElementFor((Token$StartTag)object3);
                            object = HtmlTreeBuilderState.InCell;
                            htmlTreeBuilder.transition((HtmlTreeBuilderState)((Object)object));
                            htmlTreeBuilder.insertMarkerToFormattingElements();
                            break block14;
                        }
                        object3 = HtmlTreeBuilderState$Constants.InRowMissing;
                        bl3 = StringUtil.inSorted(string2, object3);
                        if (bl3) {
                            bl3 = htmlTreeBuilder.inTableScope((String)stringArray);
                            if (!bl3) {
                                htmlTreeBuilder.error(this);
                                return false;
                            }
                            htmlTreeBuilder.clearStackToTableRowContext();
                            htmlTreeBuilder.pop();
                            object3 = HtmlTreeBuilderState.InTableBody;
                            htmlTreeBuilder.transition((HtmlTreeBuilderState)((Object)object3));
                            return htmlTreeBuilder.process((Token)object);
                        }
                        return this.anythingElse((Token)object, htmlTreeBuilder);
                    }
                    bl3 = object.isEndTag();
                    if (!bl3) break block15;
                    object2 = object.asEndTag().normalName();
                    bl2 = object2.equals(stringArray);
                    if (!bl2) break block16;
                    boolean bl5 = htmlTreeBuilder.inTableScope((String)object2);
                    if (!bl5) {
                        htmlTreeBuilder.error(this);
                        return false;
                    }
                    htmlTreeBuilder.clearStackToTableRowContext();
                    htmlTreeBuilder.pop();
                    object = HtmlTreeBuilderState.InTableBody;
                    htmlTreeBuilder.transition((HtmlTreeBuilderState)((Object)object));
                }
                return true;
            }
            String[] stringArray3 = "table";
            bl2 = object2.equals(stringArray3);
            if (bl2) {
                bl3 = htmlTreeBuilder.inTableScope((String)stringArray);
                if (!bl3) {
                    htmlTreeBuilder.error(this);
                    return false;
                }
                htmlTreeBuilder.clearStackToTableRowContext();
                htmlTreeBuilder.pop();
                object2 = HtmlTreeBuilderState.InTableBody;
                htmlTreeBuilder.transition((HtmlTreeBuilderState)((Object)object2));
                return htmlTreeBuilder.process((Token)object);
            }
            stringArray3 = HtmlTreeBuilderState$Constants.InTableToBody;
            bl2 = StringUtil.inSorted(object2, stringArray3);
            if (bl2) {
                bl3 = htmlTreeBuilder.inTableScope((String)object2);
                if (!bl3) {
                    htmlTreeBuilder.error(this);
                    return false;
                }
                bl3 = htmlTreeBuilder.inTableScope((String)stringArray);
                if (!bl3) {
                    return false;
                }
                htmlTreeBuilder.clearStackToTableRowContext();
                htmlTreeBuilder.pop();
                object2 = HtmlTreeBuilderState.InTableBody;
                htmlTreeBuilder.transition((HtmlTreeBuilderState)((Object)object2));
                return htmlTreeBuilder.process((Token)object);
            }
            stringArray = HtmlTreeBuilderState$Constants.InRowIgnore;
            bl3 = StringUtil.inSorted(object2, stringArray);
            if (bl3) {
                htmlTreeBuilder.error(this);
                return false;
            }
            return this.anythingElse((Token)object, htmlTreeBuilder);
        }
        return this.anythingElse((Token)object, htmlTreeBuilder);
    }
}

