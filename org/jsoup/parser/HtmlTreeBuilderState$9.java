/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.internal.StringUtil;
import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.HtmlTreeBuilderState;
import org.jsoup.parser.HtmlTreeBuilderState$Constants;
import org.jsoup.parser.Token;
import org.jsoup.parser.Token$Comment;
import org.jsoup.parser.Token$StartTag;
import org.jsoup.parser.Token$Tag;

final class HtmlTreeBuilderState$9
extends HtmlTreeBuilderState {
    public boolean anythingElse(Token token, HtmlTreeBuilder htmlTreeBuilder) {
        htmlTreeBuilder.error(this);
        boolean bl2 = true;
        htmlTreeBuilder.setFosterInserts(bl2);
        HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.InBody;
        htmlTreeBuilder.process(token, htmlTreeBuilderState);
        htmlTreeBuilder.setFosterInserts(false);
        return bl2;
    }

    public boolean process(Token object, HtmlTreeBuilder htmlTreeBuilder) {
        boolean bl2;
        boolean bl3;
        block28: {
            block31: {
                block30: {
                    Object object2;
                    String string2;
                    Object object3;
                    block29: {
                        block19: {
                            block26: {
                                block27: {
                                    block21: {
                                        boolean bl4;
                                        boolean bl5;
                                        String string3;
                                        block24: {
                                            block25: {
                                                boolean bl6;
                                                Object object4;
                                                String string4;
                                                boolean bl7;
                                                block23: {
                                                    boolean bl8;
                                                    block22: {
                                                        block20: {
                                                            String[] stringArray;
                                                            bl3 = ((Token)object).isCharacter();
                                                            if (bl3 && (bl3 = StringUtil.inSorted((String)(object3 = htmlTreeBuilder.currentElement().normalName()), stringArray = HtmlTreeBuilderState$Constants.InTableFoster))) {
                                                                htmlTreeBuilder.resetPendingTableCharacters();
                                                                htmlTreeBuilder.markInsertionMode();
                                                                object3 = HtmlTreeBuilderState.InTableText;
                                                                htmlTreeBuilder.transition((HtmlTreeBuilderState)((Object)object3));
                                                                return htmlTreeBuilder.process((Token)object);
                                                            }
                                                            bl3 = ((Token)object).isComment();
                                                            bl2 = true;
                                                            if (bl3) {
                                                                object = ((Token)object).asComment();
                                                                htmlTreeBuilder.insertCommentNode((Token$Comment)object);
                                                                return bl2;
                                                            }
                                                            bl3 = ((Token)object).isDoctype();
                                                            bl7 = false;
                                                            string4 = null;
                                                            if (bl3) {
                                                                htmlTreeBuilder.error(this);
                                                                return false;
                                                            }
                                                            bl3 = ((Token)object).isStartTag();
                                                            string2 = "template";
                                                            object2 = "table";
                                                            if (!bl3) break block19;
                                                            object3 = ((Token)object).asStartTag();
                                                            string3 = ((Token$Tag)object3).normalName();
                                                            bl6 = string3.equals(object4 = "caption");
                                                            if (!bl6) break block20;
                                                            htmlTreeBuilder.clearStackToTableContext();
                                                            htmlTreeBuilder.insertMarkerToFormattingElements();
                                                            htmlTreeBuilder.insertElementFor((Token$StartTag)object3);
                                                            object = HtmlTreeBuilderState.InCaption;
                                                            htmlTreeBuilder.transition((HtmlTreeBuilderState)((Object)object));
                                                            break block21;
                                                        }
                                                        object4 = "colgroup";
                                                        bl8 = string3.equals(object4);
                                                        if (!bl8) break block22;
                                                        htmlTreeBuilder.clearStackToTableContext();
                                                        htmlTreeBuilder.insertElementFor((Token$StartTag)object3);
                                                        object = HtmlTreeBuilderState.InColumnGroup;
                                                        htmlTreeBuilder.transition((HtmlTreeBuilderState)((Object)object));
                                                        break block21;
                                                    }
                                                    String string5 = "col";
                                                    bl8 = string3.equals(string5);
                                                    if (bl8) {
                                                        htmlTreeBuilder.clearStackToTableContext();
                                                        htmlTreeBuilder.processStartTag((String)object4);
                                                        return htmlTreeBuilder.process((Token)object);
                                                    }
                                                    object4 = HtmlTreeBuilderState$Constants.InTableToBody;
                                                    bl6 = StringUtil.inSorted(string3, object4);
                                                    if (!bl6) break block23;
                                                    htmlTreeBuilder.clearStackToTableContext();
                                                    htmlTreeBuilder.insertElementFor((Token$StartTag)object3);
                                                    object = HtmlTreeBuilderState.InTableBody;
                                                    htmlTreeBuilder.transition((HtmlTreeBuilderState)((Object)object));
                                                    break block21;
                                                }
                                                object4 = HtmlTreeBuilderState$Constants.InTableAddBody;
                                                bl6 = StringUtil.inSorted(string3, object4);
                                                if (bl6) {
                                                    htmlTreeBuilder.clearStackToTableContext();
                                                    htmlTreeBuilder.processStartTag("tbody");
                                                    return htmlTreeBuilder.process((Token)object);
                                                }
                                                bl5 = string3.equals(object2);
                                                if (bl5) {
                                                    htmlTreeBuilder.error(this);
                                                    boolean bl9 = htmlTreeBuilder.inTableScope(string3);
                                                    if (!bl9) {
                                                        return false;
                                                    }
                                                    htmlTreeBuilder.popStackToClose(string3);
                                                    bl7 = htmlTreeBuilder.resetInsertionMode();
                                                    if (!bl7) {
                                                        htmlTreeBuilder.insertElementFor((Token$StartTag)object3);
                                                        return bl2;
                                                    }
                                                    return htmlTreeBuilder.process((Token)object);
                                                }
                                                object2 = HtmlTreeBuilderState$Constants.InTableToHead;
                                                bl5 = StringUtil.inSorted(string3, object2);
                                                if (bl5) {
                                                    object3 = HtmlTreeBuilderState.InHead;
                                                    return htmlTreeBuilder.process((Token)object, (HtmlTreeBuilderState)((Object)object3));
                                                }
                                                object2 = "input";
                                                bl5 = string3.equals(object2);
                                                if (!bl5) break block24;
                                                bl7 = ((Token$Tag)object3).hasAttributes();
                                                if (!bl7 || !(bl7 = (string4 = ((Token$Tag)object3).attributes.get("type")).equalsIgnoreCase(string2 = "hidden"))) break block25;
                                                htmlTreeBuilder.insertEmptyElementFor((Token$StartTag)object3);
                                                break block21;
                                            }
                                            return this.anythingElse((Token)object, htmlTreeBuilder);
                                        }
                                        object2 = "form";
                                        bl5 = string3.equals(object2);
                                        if (!bl5) break block26;
                                        htmlTreeBuilder.error(this);
                                        object = htmlTreeBuilder.getFormElement();
                                        if (object != null || (bl4 = htmlTreeBuilder.onStack(string2))) break block27;
                                        htmlTreeBuilder.insertFormElement((Token$StartTag)object3, false, false);
                                    }
                                    return bl2;
                                }
                                return false;
                            }
                            return this.anythingElse((Token)object, htmlTreeBuilder);
                        }
                        bl3 = ((Token)object).isEndTag();
                        if (!bl3) break block28;
                        object3 = ((Token)object).asEndTag().normalName();
                        boolean bl10 = ((String)object3).equals(object2);
                        if (!bl10) break block29;
                        boolean bl11 = htmlTreeBuilder.inTableScope((String)object3);
                        if (!bl11) {
                            htmlTreeBuilder.error(this);
                            return false;
                        }
                        htmlTreeBuilder.popStackToClose((String)object2);
                        htmlTreeBuilder.resetInsertionMode();
                        break block30;
                    }
                    object2 = HtmlTreeBuilderState$Constants.InTableEndErr;
                    boolean bl12 = StringUtil.inSorted((String)object3, object2);
                    if (bl12) {
                        htmlTreeBuilder.error(this);
                        return false;
                    }
                    bl3 = ((String)object3).equals(string2);
                    if (!bl3) break block31;
                    object3 = HtmlTreeBuilderState.InHead;
                    htmlTreeBuilder.process((Token)object, (HtmlTreeBuilderState)((Object)object3));
                }
                return bl2;
            }
            return this.anythingElse((Token)object, htmlTreeBuilder);
        }
        bl3 = ((Token)object).isEOF();
        if (bl3) {
            object = "html";
            boolean bl13 = htmlTreeBuilder.currentElementIs((String)object);
            if (bl13) {
                htmlTreeBuilder.error(this);
            }
            return bl2;
        }
        return this.anythingElse((Token)object, htmlTreeBuilder);
    }
}

