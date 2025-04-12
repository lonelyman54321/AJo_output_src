/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import java.util.ArrayList;
import java.util.Collection;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document$QuirksMode;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.HtmlTreeBuilderState;
import org.jsoup.parser.HtmlTreeBuilderState$25;
import org.jsoup.parser.HtmlTreeBuilderState$Constants;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.jsoup.parser.Token;
import org.jsoup.parser.Token$Character;
import org.jsoup.parser.Token$Comment;
import org.jsoup.parser.Token$EndTag;
import org.jsoup.parser.TokeniserState;

final class HtmlTreeBuilderState$7
extends HtmlTreeBuilderState {
    private static final int MaxStackScan = 24;

    private boolean inBodyEndTag(Token object, HtmlTreeBuilder htmlTreeBuilder) {
        String[] stringArray = "br";
        boolean bl2 = true;
        String string2 = "template";
        Token$EndTag token$EndTag = object.asEndTag();
        String string3 = token$EndTag.normalName();
        string3.getClass();
        String string4 = "body";
        int n3 = -1;
        int n4 = string3.hashCode();
        switch (n4) {
            default: {
                break;
            }
            case 1869063452: {
                String string5 = "sarcasm";
                n4 = (int)(string3.equals(string5) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 16;
                break;
            }
            case 3536714: {
                String string6 = "span";
                n4 = (int)(string3.equals(string6) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 15;
                break;
            }
            case 3213227: {
                String string7 = "html";
                n4 = (int)(string3.equals(string7) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 14;
                break;
            }
            case 3148996: {
                String string8 = "form";
                n4 = (int)(string3.equals(string8) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 13;
                break;
            }
            case 3029410: {
                n4 = (int)(string3.equals(string4) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 12;
                break;
            }
            case 3453: {
                String string9 = "li";
                n4 = (int)(string3.equals(string9) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 11;
                break;
            }
            case 3278: {
                String string10 = "h6";
                n4 = (int)(string3.equals(string10) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 10;
                break;
            }
            case 3277: {
                String string11 = "h5";
                n4 = (int)(string3.equals(string11) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 9;
                break;
            }
            case 3276: {
                String string12 = "h4";
                n4 = (int)(string3.equals(string12) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 8;
                break;
            }
            case 3275: {
                String string13 = "h3";
                n4 = (int)(string3.equals(string13) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 7;
                break;
            }
            case 3274: {
                String string14 = "h2";
                n4 = (int)(string3.equals(string14) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 6;
                break;
            }
            case 3273: {
                String string15 = "h1";
                n4 = (int)(string3.equals(string15) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 5;
                break;
            }
            case 3216: {
                String string16 = "dt";
                n4 = (int)(string3.equals(string16) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 4;
                break;
            }
            case 3200: {
                String string17 = "dd";
                n4 = (int)(string3.equals(string17) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 3;
                break;
            }
            case 3152: {
                n4 = (int)(string3.equals(stringArray) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 2;
                break;
            }
            case 112: {
                String string18 = "p";
                n4 = (int)(string3.equals(string18) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 1;
                break;
            }
            case -1321546630: {
                n4 = (int)(string3.equals(string2) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 0;
            }
        }
        switch (n3) {
            default: {
                stringArray = HtmlTreeBuilderState$Constants.InBodyEndAdoptionFormatters;
                boolean bl3 = StringUtil.inSorted(string3, stringArray);
                if (bl3) {
                    return this.inBodyEndTagAdoption((Token)object, htmlTreeBuilder);
                }
                stringArray = HtmlTreeBuilderState$Constants.InBodyEndClosers;
                bl3 = StringUtil.inSorted(string3, stringArray);
                if (bl3) {
                    boolean bl4 = htmlTreeBuilder.inScope(string3);
                    if (!bl4) {
                        htmlTreeBuilder.error(this);
                        return false;
                    }
                    htmlTreeBuilder.generateImpliedEndTags();
                    bl4 = htmlTreeBuilder.currentElementIs(string3);
                    if (!bl4) {
                        htmlTreeBuilder.error(this);
                    }
                    htmlTreeBuilder.popStackToClose(string3);
                    break;
                }
                stringArray = HtmlTreeBuilderState$Constants.InBodyStartApplets;
                bl3 = StringUtil.inSorted(string3, stringArray);
                if (bl3) {
                    object = "name";
                    boolean bl5 = htmlTreeBuilder.inScope((String)object);
                    if (bl5) break;
                    bl5 = htmlTreeBuilder.inScope(string3);
                    if (!bl5) {
                        htmlTreeBuilder.error(this);
                        return false;
                    }
                    htmlTreeBuilder.generateImpliedEndTags();
                    bl5 = htmlTreeBuilder.currentElementIs(string3);
                    if (!bl5) {
                        htmlTreeBuilder.error(this);
                    }
                    htmlTreeBuilder.popStackToClose(string3);
                    htmlTreeBuilder.clearFormattingElementsToLastMarker();
                    break;
                }
                return this.anyOtherEndTag((Token)object, htmlTreeBuilder);
            }
            case 15: 
            case 16: {
                return this.anyOtherEndTag((Token)object, htmlTreeBuilder);
            }
            case 14: {
                boolean bl6 = htmlTreeBuilder.onStack(string4);
                if (!bl6) {
                    htmlTreeBuilder.error(this);
                    return false;
                }
                stringArray = HtmlTreeBuilderState$Constants.InBodyEndOtherErrors;
                bl6 = htmlTreeBuilder.onStackNot(stringArray);
                if (bl6) {
                    htmlTreeBuilder.error(this);
                }
                stringArray = HtmlTreeBuilderState.AfterBody;
                htmlTreeBuilder.transition((HtmlTreeBuilderState)stringArray);
                return htmlTreeBuilder.process((Token)object);
            }
            case 13: {
                boolean bl7 = htmlTreeBuilder.onStack(string2);
                if (!bl7) {
                    object = htmlTreeBuilder.getFormElement();
                    boolean bl8 = false;
                    stringArray = null;
                    htmlTreeBuilder.setFormElement(null);
                    if (object != null && (bl8 = htmlTreeBuilder.inScope(string3))) {
                        htmlTreeBuilder.generateImpliedEndTags();
                        bl8 = htmlTreeBuilder.currentElementIs(string3);
                        if (!bl8) {
                            htmlTreeBuilder.error(this);
                        }
                        htmlTreeBuilder.removeFromStack((Element)object);
                        break;
                    }
                    htmlTreeBuilder.error(this);
                    return false;
                }
                bl7 = htmlTreeBuilder.inScope(string3);
                if (!bl7) {
                    htmlTreeBuilder.error(this);
                    return false;
                }
                htmlTreeBuilder.generateImpliedEndTags();
                bl7 = htmlTreeBuilder.currentElementIs(string3);
                if (!bl7) {
                    htmlTreeBuilder.error(this);
                }
                htmlTreeBuilder.popStackToClose(string3);
                break;
            }
            case 12: {
                boolean bl9 = htmlTreeBuilder.inScope(string4);
                if (!bl9) {
                    htmlTreeBuilder.error(this);
                    return false;
                }
                object = HtmlTreeBuilderState$Constants.InBodyEndOtherErrors;
                bl9 = htmlTreeBuilder.onStackNot((String[])object);
                if (bl9) {
                    htmlTreeBuilder.error(this);
                }
                object = htmlTreeBuilder.getFromStack(string4);
                htmlTreeBuilder.onNodeClosed((Node)object);
                object = HtmlTreeBuilderState.AfterBody;
                htmlTreeBuilder.transition((HtmlTreeBuilderState)((Object)object));
                break;
            }
            case 11: {
                boolean bl10 = htmlTreeBuilder.inListItemScope(string3);
                if (!bl10) {
                    htmlTreeBuilder.error(this);
                    return false;
                }
                htmlTreeBuilder.generateImpliedEndTags(string3);
                bl10 = htmlTreeBuilder.currentElementIs(string3);
                if (!bl10) {
                    htmlTreeBuilder.error(this);
                }
                htmlTreeBuilder.popStackToClose(string3);
                break;
            }
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: {
                object = HtmlTreeBuilderState$Constants.Headings;
                boolean bl11 = htmlTreeBuilder.inScope((String[])object);
                if (!bl11) {
                    htmlTreeBuilder.error(this);
                    return false;
                }
                htmlTreeBuilder.generateImpliedEndTags(string3);
                bl11 = htmlTreeBuilder.currentElementIs(string3);
                if (!bl11) {
                    htmlTreeBuilder.error(this);
                }
                htmlTreeBuilder.popStackToClose((String)object);
                break;
            }
            case 3: 
            case 4: {
                boolean bl12 = htmlTreeBuilder.inScope(string3);
                if (!bl12) {
                    htmlTreeBuilder.error(this);
                    return false;
                }
                htmlTreeBuilder.generateImpliedEndTags(string3);
                bl12 = htmlTreeBuilder.currentElementIs(string3);
                if (!bl12) {
                    htmlTreeBuilder.error(this);
                }
                htmlTreeBuilder.popStackToClose(string3);
                break;
            }
            case 2: {
                htmlTreeBuilder.error(this);
                htmlTreeBuilder.processStartTag((String)stringArray);
                return false;
            }
            case 1: {
                boolean bl13 = htmlTreeBuilder.inButtonScope(string3);
                if (!bl13) {
                    htmlTreeBuilder.error(this);
                    htmlTreeBuilder.processStartTag(string3);
                    return htmlTreeBuilder.process(token$EndTag);
                }
                htmlTreeBuilder.generateImpliedEndTags(string3);
                bl13 = htmlTreeBuilder.currentElementIs(string3);
                if (!bl13) {
                    htmlTreeBuilder.error(this);
                }
                htmlTreeBuilder.popStackToClose(string3);
                break;
            }
            case 0: {
                stringArray = HtmlTreeBuilderState.InHead;
                htmlTreeBuilder.process((Token)object, (HtmlTreeBuilderState)stringArray);
            }
        }
        return bl2;
    }

    private boolean inBodyEndTagAdoption(Token token, HtmlTreeBuilder htmlTreeBuilder) {
        boolean bl2;
        HtmlTreeBuilderState$7 htmlTreeBuilderState$7 = this;
        HtmlTreeBuilder htmlTreeBuilder2 = htmlTreeBuilder;
        String string2 = token.asEndTag().normalName();
        ArrayList arrayList = htmlTreeBuilder.getStack();
        int n3 = 0;
        Object object = null;
        int n4 = 0;
        while (true) {
            Object object2;
            Element element;
            int n7;
            int n8 = 8;
            bl2 = true;
            if (n4 >= n8) break;
            Element element2 = htmlTreeBuilder2.getActiveFormattingElement(string2);
            if (element2 == null) {
                return this.anyOtherEndTag(token, htmlTreeBuilder);
            }
            int n10 = htmlTreeBuilder2.onStack(element2);
            if (n10 == 0) {
                htmlTreeBuilder2.error(htmlTreeBuilderState$7);
                htmlTreeBuilder2.removeFromActiveFormattingElements(element2);
                return bl2;
            }
            Object object3 = element2.normalName();
            n10 = htmlTreeBuilder2.inScope((String)object3);
            if (n10 == 0) {
                htmlTreeBuilder2.error(htmlTreeBuilderState$7);
                return false;
            }
            object3 = htmlTreeBuilder.currentElement();
            if (object3 != element2) {
                htmlTreeBuilder2.error(htmlTreeBuilderState$7);
            }
            n10 = arrayList.size();
            Element element3 = null;
            int n14 = -1;
            Element element4 = null;
            boolean bl3 = false;
            Element element5 = null;
            for (int i3 = 1; i3 < n10 && i3 < (n7 = 64); ++i3) {
                boolean bl4;
                element = (Element)arrayList.get(i3);
                if (element == element2) {
                    n14 = i3 + -1;
                    Object e2 = arrayList.get(n14);
                    element4 = e2;
                    element4 = (Element)e2;
                    n14 = htmlTreeBuilder2.positionOfElement(element);
                    bl3 = true;
                    continue;
                }
                if (!bl3 || !(bl4 = HtmlTreeBuilder.isSpecial(element))) continue;
                element3 = element;
                break;
            }
            if (element3 == null) {
                string2 = element2.normalName();
                htmlTreeBuilder2.popStackToClose(string2);
                htmlTreeBuilder2.removeFromActiveFormattingElements(element2);
                return bl2;
            }
            Element element6 = element3;
            element5 = element3;
            object3 = null;
            for (n10 = 0; n10 < (n7 = 3); ++n10) {
                n7 = (int)(htmlTreeBuilder2.onStack(element6) ? 1 : 0);
                if (n7 != 0) {
                    element6 = htmlTreeBuilder2.aboveOnStack(element6);
                }
                if ((n7 = (int)(htmlTreeBuilder2.isInActiveFormattingElements(element6) ? 1 : 0)) == 0) {
                    htmlTreeBuilder2.removeFromStack(element6);
                } else {
                    if (element6 == element2) break;
                    String string3 = element6.nodeName();
                    object = ParseSettings.preserveCase;
                    object = htmlTreeBuilder2.tagFor(string3, (ParseSettings)object);
                    string3 = htmlTreeBuilder.getBaseUri();
                    element = new Element((Tag)object, string3);
                    htmlTreeBuilder2.replaceActiveFormattingElement(element6, element);
                    htmlTreeBuilder2.replaceOnStack(element6, element);
                    if (element5 == element3) {
                        n3 = htmlTreeBuilder2.positionOfElement(element);
                        n14 = n3 + 1;
                    }
                    if ((object = element5.parent()) != null) {
                        element5.remove();
                    }
                    element.appendChild(element5);
                    element6 = element;
                    element5 = element;
                }
                n3 = 0;
                object = null;
            }
            if (element4 != null) {
                object = element4.normalName();
                n3 = StringUtil.inSorted((String)object, (String[])(object2 = HtmlTreeBuilderState$Constants.InBodyEndTableFosters));
                if (n3 != 0) {
                    object = element5.parent();
                    if (object != null) {
                        element5.remove();
                    }
                    htmlTreeBuilder2.insertInFosterParent(element5);
                } else {
                    object = element5.parent();
                    if (object != null) {
                        element5.remove();
                    }
                    element4.appendChild(element5);
                }
            }
            object2 = element2.tag();
            object3 = htmlTreeBuilder.getBaseUri();
            object = new Element((Tag)object2, (String)object3);
            object2 = ((Element)object).attributes();
            object3 = element2.attributes();
            ((Attributes)object2).addAll((Attributes)object3);
            object2 = element3.childNodes();
            ((Element)object).appendChildren((Collection)object2);
            element3.appendChild((Node)object);
            htmlTreeBuilder2.removeFromActiveFormattingElements(element2);
            htmlTreeBuilder2.pushWithBookmark((Element)object, n14);
            htmlTreeBuilder2.removeFromStack(element2);
            htmlTreeBuilder2.insertOnStackAfter(element3, (Element)object);
            ++n4;
            n3 = 0;
            object = null;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean inBodyStartTag(Token var1_1, HtmlTreeBuilder var2_2) {
        block137: {
            var3_3 /* !! */  = this;
            var4_4 = var2_2;
            var5_5 = "isindex";
            var6_6 = "input";
            var7_7 = "nobr";
            var8_8 /* !! */  = "form";
            var9_9 = "svg";
            var10_10 = "rtc";
            var11_11 = "img";
            var12_12 = "li";
            var13_13 = "hr";
            var14_14 = "a";
            var15_15 = "option";
            var16_16 = "button";
            var17_17 = var1_1.asStartTag();
            var18_18 /* !! */  = var17_17.normalName();
            var18_18 /* !! */ .getClass();
            var3_3 /* !! */  = "body";
            var19_19 = "template";
            var20_20 = "ruby";
            var21_21 = var4_4 = "p";
            var22_22 = var18_18 /* !! */ .hashCode();
            switch (var22_22) lbl-1000:
            // 57 sources

            {
                default: {
                    var23_23 = -1;
                    break;
                }
                case 2115613112: {
                    var4_4 = "noembed";
                    var23_23 = (int)var18_18 /* !! */ .equals(var4_4);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 55;
                    break;
                }
                case 2091304424: {
                    var23_23 = (int)var18_18 /* !! */ .equals(var5_5);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 54;
                    break;
                }
                case 1973234167: {
                    var4_4 = "plaintext";
                    var23_23 = (int)var18_18 /* !! */ .equals(var4_4);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 53;
                    break;
                }
                case 181975684: {
                    var4_4 = "listing";
                    var23_23 = (int)var18_18 /* !! */ .equals(var4_4);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 52;
                    break;
                }
                case 110115790: {
                    var4_4 = "table";
                    var23_23 = (int)var18_18 /* !! */ .equals(var4_4);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 51;
                    break;
                }
                case 109548807: {
                    var4_4 = "small";
                    var23_23 = (int)var18_18 /* !! */ .equals(var4_4);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 50;
                    break;
                }
                case 100358090: {
                    var23_23 = (int)var18_18 /* !! */ .equals(var6_6);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 49;
                    break;
                }
                case 100313435: {
                    var4_4 = "image";
                    var23_23 = (int)var18_18 /* !! */ .equals(var4_4);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 48;
                    break;
                }
                case 96620249: {
                    var4_4 = "embed";
                    var23_23 = (int)var18_18 /* !! */ .equals(var4_4);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 47;
                    break;
                }
                case 3536714: {
                    var4_4 = "span";
                    var23_23 = (int)var18_18 /* !! */ .equals(var4_4);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 46;
                    break;
                }
                case 3386833: {
                    var23_23 = (int)var18_18 /* !! */ .equals(var7_7);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 45;
                    break;
                }
                case 3344136: {
                    var4_4 = "math";
                    var23_23 = (int)var18_18 /* !! */ .equals(var4_4);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 44;
                    break;
                }
                case 3213227: {
                    var4_4 = "html";
                    var23_23 = (int)var18_18 /* !! */ .equals(var4_4);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 43;
                    break;
                }
                case 3148996: {
                    var23_23 = (int)var18_18 /* !! */ .equals(var8_8 /* !! */ );
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 42;
                    break;
                }
                case 3148879: {
                    var4_4 = "font";
                    var23_23 = (int)var18_18 /* !! */ .equals(var4_4);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 41;
                    break;
                }
                case 3059181: {
                    var4_4 = "code";
                    var23_23 = (int)var18_18 /* !! */ .equals(var4_4);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 40;
                    break;
                }
                case 3029410: {
                    var23_23 = (int)var18_18 /* !! */ .equals(var3_3 /* !! */ );
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 39;
                    break;
                }
                case 3002509: {
                    var4_4 = "area";
                    var23_23 = (int)var18_18 /* !! */ .equals(var4_4);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 38;
                    break;
                }
                case 118811: {
                    var4_4 = "xmp";
                    var23_23 = (int)var18_18 /* !! */ .equals(var4_4);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 37;
                    break;
                }
                case 117511: {
                    var4_4 = "wbr";
                    var23_23 = (int)var18_18 /* !! */ .equals(var4_4);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 36;
                    break;
                }
                case 114276: {
                    var23_23 = (int)var18_18 /* !! */ .equals(var9_9);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 35;
                    break;
                }
                case 113249: {
                    var23_23 = (int)var18_18 /* !! */ .equals(var10_10);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 34;
                    break;
                }
                case 111267: {
                    var4_4 = "pre";
                    var23_23 = (int)var18_18 /* !! */ .equals(var4_4);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 33;
                    break;
                }
                case 104387: {
                    var23_23 = (int)var18_18 /* !! */ .equals(var11_11);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 32;
                    break;
                }
                case 97536: {
                    var4_4 = "big";
                    var23_23 = (int)var18_18 /* !! */ .equals(var4_4);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 31;
                    break;
                }
                case 3712: {
                    var4_4 = "tt";
                    var23_23 = (int)var18_18 /* !! */ .equals(var4_4);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 30;
                    break;
                }
                case 3650: {
                    var4_4 = "rt";
                    var23_23 = (int)var18_18 /* !! */ .equals(var4_4);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 29;
                    break;
                }
                case 3646: {
                    var4_4 = "rp";
                    var23_23 = (int)var18_18 /* !! */ .equals(var4_4);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 28;
                    break;
                }
                case 3632: {
                    var4_4 = "rb";
                    var23_23 = (int)var18_18 /* !! */ .equals(var4_4);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 27;
                    break;
                }
                case 3453: {
                    var23_23 = (int)var18_18 /* !! */ .equals(var12_12);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 26;
                    break;
                }
                case 3338: {
                    var23_23 = (int)var18_18 /* !! */ .equals(var13_13);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 25;
                    break;
                }
                case 3278: {
                    var4_4 = "h6";
                    var23_23 = (int)var18_18 /* !! */ .equals(var4_4);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 24;
                    break;
                }
                case 3277: {
                    var4_4 = "h5";
                    var23_23 = (int)var18_18 /* !! */ .equals(var4_4);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 23;
                    break;
                }
                case 3276: {
                    var4_4 = "h4";
                    var23_23 = (int)var18_18 /* !! */ .equals(var4_4);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 22;
                    break;
                }
                case 3275: {
                    var4_4 = "h3";
                    var23_23 = (int)var18_18 /* !! */ .equals(var4_4);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 21;
                    break;
                }
                case 3274: {
                    var4_4 = "h2";
                    var23_23 = (int)var18_18 /* !! */ .equals(var4_4);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 20;
                    break;
                }
                case 3273: {
                    var4_4 = "h1";
                    var23_23 = (int)var18_18 /* !! */ .equals(var4_4);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 19;
                    break;
                }
                case 3240: {
                    var4_4 = "em";
                    var23_23 = (int)var18_18 /* !! */ .equals(var4_4);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 18;
                    break;
                }
                case 3216: {
                    var4_4 = "dt";
                    var23_23 = (int)var18_18 /* !! */ .equals(var4_4);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 17;
                    break;
                }
                case 3200: {
                    var4_4 = "dd";
                    var23_23 = (int)var18_18 /* !! */ .equals(var4_4);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 16;
                    break;
                }
                case 3152: {
                    var4_4 = "br";
                    var23_23 = (int)var18_18 /* !! */ .equals(var4_4);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 15;
                    break;
                }
                case 117: {
                    var4_4 = "u";
                    var23_23 = (int)var18_18 /* !! */ .equals(var4_4);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 14;
                    break;
                }
                case 115: {
                    var4_4 = "s";
                    var23_23 = (int)var18_18 /* !! */ .equals(var4_4);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 13;
                    break;
                }
                case 105: {
                    var4_4 = "i";
                    var23_23 = (int)var18_18 /* !! */ .equals(var4_4);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 12;
                    break;
                }
                case 98: {
                    var4_4 = "b";
                    var23_23 = (int)var18_18 /* !! */ .equals(var4_4);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 11;
                    break;
                }
                case 97: {
                    var23_23 = (int)var18_18 /* !! */ .equals(var14_14);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 10;
                    break;
                }
                case -80773204: {
                    var4_4 = "optgroup";
                    var23_23 = (int)var18_18 /* !! */ .equals(var4_4);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 9;
                    break;
                }
                case -891980137: {
                    var4_4 = "strong";
                    var23_23 = (int)var18_18 /* !! */ .equals(var4_4);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 8;
                    break;
                }
                case -891985998: {
                    var4_4 = "strike";
                    var23_23 = (int)var18_18 /* !! */ .equals(var4_4);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 7;
                    break;
                }
                case -906021636: {
                    var4_4 = "select";
                    var23_23 = (int)var18_18 /* !! */ .equals(var4_4);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 6;
                    break;
                }
                case -1003243718: {
                    var4_4 = "textarea";
                    var23_23 = (int)var18_18 /* !! */ .equals(var4_4);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 5;
                    break;
                }
                case -1010136971: {
                    var23_23 = (int)var18_18 /* !! */ .equals(var15_15);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 4;
                    break;
                }
                case -1134665583: {
                    var4_4 = "keygen";
                    var23_23 = (int)var18_18 /* !! */ .equals(var4_4);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 3;
                    break;
                }
                case -1191214428: {
                    var4_4 = "iframe";
                    var23_23 = (int)var18_18 /* !! */ .equals(var4_4);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 2;
                    break;
                }
                case -1377687758: {
                    var23_23 = (int)var18_18 /* !! */ .equals(var16_16);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 1;
                    break;
                }
                case -1644953643: {
                    var4_4 = "frameset";
                    var23_23 = (int)var18_18 /* !! */ .equals(var4_4);
                    if (var23_23 == 0) ** GOTO lbl-1000
                    var23_23 = 0;
                    var4_4 = null;
                }
            }
            block58 : switch (var23_23) {
                default: {
                    var24_24 = Tag.isKnownTag(var18_18 /* !! */ );
                    if (!var24_24) {
                        var4_4 = var2_2;
                        var2_2.insertElementFor(var17_17);
lbl358:
                        // 4 sources

                        while (true) {
                            var18_18 /* !! */  = this;
lbl360:
                            // 39 sources

                            while (true) {
                                var25_42 = 1;
                                break block58;
                                break;
                            }
                            break;
                        }
                    }
                    var4_4 = var2_2;
                    var3_3 /* !! */  = HtmlTreeBuilderState$Constants.InBodyStartPClosers;
                    var24_24 = StringUtil.inSorted(var18_18 /* !! */ , var3_3 /* !! */ );
                    if (!var24_24) ** GOTO lbl375
                    var3_3 /* !! */  = var21_21;
                    var26_43 = var2_2.inButtonScope((String)var21_21);
                    if (var26_43) {
                        var2_2.processEndTag((String)var21_21);
                    }
                    var4_4.insertElementFor(var17_17);
                    ** GOTO lbl358
lbl375:
                    // 1 sources

                    var3_3 /* !! */  = HtmlTreeBuilderState$Constants.InBodyStartToHead;
                    var24_24 = StringUtil.inSorted(var18_18 /* !! */ , var3_3 /* !! */ );
                    if (var24_24) {
                        var3_3 /* !! */  = HtmlTreeBuilderState.InHead;
                        var5_5 = var1_1;
                        return var2_2.process(var1_1, (HtmlTreeBuilderState)var3_3 /* !! */ );
                    }
                    var3_3 /* !! */  = HtmlTreeBuilderState$Constants.InBodyStartApplets;
                    var24_24 = StringUtil.inSorted(var18_18 /* !! */ , var3_3 /* !! */ );
                    if (!var24_24) ** GOTO lbl392
                    var2_2.reconstructFormattingElements();
                    var2_2.insertElementFor(var17_17);
                    var2_2.insertMarkerToFormattingElements();
                    var24_24 = false;
                    var3_3 /* !! */  = null;
                    var2_2.framesetOk(false);
                    ** GOTO lbl358
lbl392:
                    // 1 sources

                    var24_24 = false;
                    var3_3 /* !! */  = null;
                    var5_5 = HtmlTreeBuilderState$Constants.InBodyStartMedia;
                    var26_44 = StringUtil.inSorted(var18_18 /* !! */ , (String[])var5_5);
                    if (var26_44) {
                        var2_2.insertEmptyElementFor(var17_17);
                        ** continue;
                    }
                    var5_5 = HtmlTreeBuilderState$Constants.InBodyStartDrop;
                    var26_44 = StringUtil.inSorted(var18_18 /* !! */ , (String[])var5_5);
                    if (var26_44) {
                        var18_18 /* !! */  = this;
                        var2_2.error(this);
                        return false;
                    }
                    var18_18 /* !! */  = this;
                    var2_2.reconstructFormattingElements();
                    var2_2.insertElementFor(var17_17);
                    ** GOTO lbl360
                }
                case 55: {
                    var18_18 /* !! */  = this;
                    var4_4 = var2_2;
                    HtmlTreeBuilderState.access$300(var17_17, var2_2);
                    ** GOTO lbl360
                }
                case 54: {
                    var18_18 /* !! */  = this;
                    var4_4 = var2_2;
                    var24_25 = false;
                    var3_3 /* !! */  = null;
                    var2_2.error(this);
                    var7_7 = var2_2.getFormElement();
                    if (var7_7 != null) {
                        return false;
                    }
                    var2_2.processStartTag((String)var8_8 /* !! */ );
                    var3_3 /* !! */  = "action";
                    var27_61 = var17_17.hasAttribute((String)var3_3 /* !! */ );
                    if (var27_61 && (var7_7 = var2_2.getFormElement()) != null && (var28_66 = var17_17.hasAttribute((String)var3_3 /* !! */ ))) {
                        var9_9 = var17_17.attributes.get((String)var3_3 /* !! */ );
                        var7_7 = var7_7.attributes();
                        var7_7.put((String)var3_3 /* !! */ , (String)var9_9);
                    }
                    var4_4.processStartTag(var13_13);
                    var3_3 /* !! */  = "label";
                    var4_4.processStartTag((String)var3_3 /* !! */ );
                    var7_7 = "prompt";
                    var28_66 = var17_17.hasAttribute((String)var7_7);
                    if (var28_66) {
                        var9_9 = var17_17.attributes;
                        var7_7 = var9_9.get((String)var7_7);
                    } else {
                        var7_7 = "This is a searchable index. Enter search keywords: ";
                    }
                    var9_9 = new Token$Character();
                    var7_7 = var9_9.data((String)var7_7);
                    var4_4.process((Token)var7_7);
                    var7_7 = new Attributes();
                    var28_66 = var17_17.hasAttributes();
                    if (var28_66) {
                        var9_9 = var17_17.attributes.iterator();
                        while (var29_69 = var9_9.hasNext()) {
                            var10_10 = (Attribute)var9_9.next();
                            var11_11 = var10_10.getKey();
                            var30_70 = StringUtil.inSorted((String)var11_11, var12_12 = HtmlTreeBuilderState$Constants.InBodyStartInputAttribs);
                            if (var30_70) continue;
                            var7_7.put((Attribute)var10_10);
                        }
                    }
                    var9_9 = "name";
                    var7_7.put((String)var9_9, (String)var5_5);
                    var4_4.processStartTag((String)var6_6, (Attributes)var7_7);
                    var4_4.processEndTag((String)var3_3 /* !! */ );
                    var4_4.processStartTag(var13_13);
                    var4_4.processEndTag((String)var8_8 /* !! */ );
                    ** GOTO lbl360
                }
                case 53: {
                    var18_18 /* !! */  = this;
                    var4_4 = var2_2;
                    var3_3 /* !! */  = var21_21;
                    var26_45 = var2_2.inButtonScope((String)var21_21);
                    if (var26_45) {
                        var2_2.processEndTag((String)var21_21);
                    }
                    var4_4.insertElementFor(var17_17);
                    var3_3 /* !! */  = var4_4.tokeniser;
                    var4_4 = TokeniserState.PLAINTEXT;
                    var3_3 /* !! */ .transition((TokeniserState)var4_4);
                    ** GOTO lbl360
                }
                case 51: {
                    var18_18 /* !! */  = this;
                    var4_4 = var2_2;
                    var3_3 /* !! */  = var21_21;
                    var5_5 = var2_2.getDocument().quirksMode();
                    var6_6 = Document$QuirksMode.quirks;
                    if (var5_5 != var6_6 && (var26_46 = var2_2.inButtonScope((String)var21_21))) {
                        var2_2.processEndTag((String)var21_21);
                    }
                    var4_4.insertElementFor(var17_17);
                    var24_26 = false;
                    var4_4.framesetOk(false);
                    var3_3 /* !! */  = HtmlTreeBuilderState.InTable;
                    var4_4.transition((HtmlTreeBuilderState)var3_3 /* !! */ );
                    ** GOTO lbl360
                }
                case 49: {
                    var18_18 /* !! */  = this;
                    var4_4 = var2_2;
                    var24_27 = false;
                    var3_3 /* !! */  = null;
                    var2_2.reconstructFormattingElements();
                    var5_5 = var2_2.insertEmptyElementFor(var17_17).attr("type");
                    var26_47 = var5_5.equalsIgnoreCase((String)(var6_6 = "hidden"));
                    if (var26_47) ** GOTO lbl360
                    var2_2.framesetOk(false);
                    ** GOTO lbl360
                }
                case 48: {
                    var18_18 /* !! */  = this;
                    var4_4 = var2_2;
                    var3_3 /* !! */  = var2_2.getFromStack((String)var9_9);
                    if (var3_3 /* !! */  == null) {
                        var3_3 /* !! */  = var17_17.name((String)var11_11);
                        return var2_2.process((Token)var3_3 /* !! */ );
                    }
                    var2_2.insertElementFor(var17_17);
                    ** GOTO lbl360
                }
                case 46: {
                    var18_18 /* !! */  = this;
                    var4_4 = var2_2;
                    var2_2.reconstructFormattingElements();
                    var2_2.insertElementFor(var17_17);
                    ** GOTO lbl360
                }
                case 45: {
                    var18_18 /* !! */  = this;
                    var4_4 = var2_2;
                    var2_2.reconstructFormattingElements();
                    var24_28 = var2_2.inScope((String)var7_7);
                    if (var24_28) {
                        var2_2.error(this);
                        var2_2.processEndTag((String)var7_7);
                        var2_2.reconstructFormattingElements();
                    }
                    var3_3 /* !! */  = var4_4.insertElementFor(var17_17);
                    var4_4.pushActiveFormattingElements((Element)var3_3 /* !! */ );
                    ** GOTO lbl360
                }
                case 44: {
                    var18_18 /* !! */  = this;
                    var4_4 = var2_2;
                    var2_2.reconstructFormattingElements();
                    var3_3 /* !! */  = "http://www.w3.org/1998/Math/MathML";
                    var2_2.insertForeignElementFor(var17_17, (String)var3_3 /* !! */ );
                    ** GOTO lbl360
                }
                case 43: {
                    var18_18 /* !! */  = this;
                    var4_4 = var2_2;
                    var5_5 = var19_19;
                    var2_2.error(this);
                    var24_29 = var2_2.onStack(var19_19);
                    if (var24_29) {
                        return false;
                    }
                    var24_29 = false;
                    var3_3 /* !! */  = null;
                    var5_5 = var2_2.getStack();
                    var26_48 = var5_5.size();
                    if (var26_48 <= 0) ** GOTO lbl360
                    var4_4 = var2_2.getStack();
                    var3_3 /* !! */  = (Element)var4_4.get(0);
                    var23_23 = (int)var17_17.hasAttributes();
                    if (var23_23 == 0) ** GOTO lbl360
                    var4_4 = var17_17.attributes.iterator();
                    while (true) {
                        if ((var26_48 = (int)var4_4.hasNext()) == 0) ** GOTO lbl360
                        var5_5 = (Attribute)var4_4.next();
                        var6_6 = var5_5.getKey();
                        var31_71 = var3_3 /* !! */ .hasAttr((String)var6_6);
                        if (var31_71) continue;
                        var6_6 = var3_3 /* !! */ .attributes();
                        var6_6.put((Attribute)var5_5);
                    }
                }
                case 42: {
                    var18_18 /* !! */  = this;
                    var4_4 = var2_2;
                    var5_5 = var19_19;
                    var3_3 /* !! */  = var21_21;
                    var6_6 = var2_2.getFormElement();
                    if (var6_6 != null && !(var26_49 = var2_2.onStack(var19_19))) {
                        var2_2.error(this);
                        return false;
                    }
                    var26_49 = var4_4.inButtonScope((String)var3_3 /* !! */ );
                    if (var26_49) {
                        var4_4.closeElement((String)var3_3 /* !! */ );
                    }
                    var31_72 = true;
                    var4_4.insertFormElement(var17_17, var31_72, var31_72);
                    ** GOTO lbl360
                }
                case 39: {
                    var18_18 /* !! */  = this;
                    var4_4 = var2_2;
                    var5_5 = var19_19;
                    var31_73 = 1;
                    var27_62 = 2;
                    var2_2.error(this);
                    var8_8 /* !! */  = var2_2.getStack();
                    var28_67 = var8_8 /* !! */ .size();
                    if (var28_67 != var31_73 && ((var28_67 = var8_8 /* !! */ .size()) <= var27_62 || (var31_73 = (int)(var6_6 = (var7_7 = (Element)var8_8 /* !! */ .get(var31_73)).normalName()).equals(var3_3 /* !! */ )) != 0)) ** GOTO lbl609
                    while (true) {
                        ** GOTO lbl625
                        break;
                    }
lbl609:
                    // 1 sources

                    if (var26_50 = var4_4.onStack((String)var5_5)) ** continue;
                    var5_5 = null;
                    var4_4.framesetOk(false);
                    var26_50 = var17_17.hasAttributes();
                    if (!var26_50 || (var3_3 /* !! */  = var4_4.getFromStack((String)var3_3 /* !! */ )) == null) ** GOTO lbl360
                    var4_4 = var17_17.attributes.iterator();
                    while (true) {
                        if (!(var26_50 = var4_4.hasNext())) ** GOTO lbl360
                        var5_5 = (Attribute)var4_4.next();
                        var6_6 = var5_5.getKey();
                        var31_73 = (int)var3_3 /* !! */ .hasAttr((String)var6_6);
                        if (var31_73 != 0) continue;
                        var6_6 = var3_3 /* !! */ .attributes();
                        var6_6.put((Attribute)var5_5);
                    }
lbl625:
                    // 1 sources

                    var26_50 = false;
                    var5_5 = null;
                    return false;
                }
                case 37: {
                    var18_18 /* !! */  = this;
                    var4_4 = var2_2;
                    var3_3 /* !! */  = var21_21;
                    var26_51 = false;
                    var5_5 = null;
                    var31_74 = var2_2.inButtonScope((String)var21_21);
                    if (var31_74) {
                        var2_2.processEndTag((String)var21_21);
                    }
                    var2_2.reconstructFormattingElements();
                    var4_4.framesetOk(false);
                    HtmlTreeBuilderState.access$300(var17_17, (HtmlTreeBuilder)var4_4);
                    ** GOTO lbl360
                }
                case 35: {
                    var18_18 /* !! */  = this;
                    var4_4 = var2_2;
                    var2_2.reconstructFormattingElements();
                    var3_3 /* !! */  = "http://www.w3.org/2000/svg";
                    var2_2.insertForeignElementFor(var17_17, (String)var3_3 /* !! */ );
                    ** GOTO lbl360
                }
                case 33: 
                case 52: {
                    var18_18 /* !! */  = this;
                    var4_4 = var2_2;
                    var3_3 /* !! */  = var21_21;
                    var26_52 = var2_2.inButtonScope((String)var21_21);
                    if (var26_52) {
                        var2_2.processEndTag((String)var21_21);
                    }
                    var4_4.insertElementFor(var17_17);
                    var3_3 /* !! */  = var4_4.reader;
                    var5_5 = "\n";
                    var3_3 /* !! */ .matchConsume((String)var5_5);
                    var24_30 = false;
                    var3_3 /* !! */  = null;
                    var4_4.framesetOk(false);
                    ** GOTO lbl360
                }
                case 28: 
                case 29: {
                    var18_18 /* !! */  = this;
                    var4_4 = var2_2;
                    var3_3 /* !! */  = var20_20;
                    var26_53 = var2_2.inScope(var20_20);
                    if (var26_53) {
                        var2_2.generateImpliedEndTags((String)var10_10);
                        var26_53 = var2_2.currentElementIs((String)var10_10);
                        if (!var26_53 && !(var24_31 = var2_2.currentElementIs(var20_20))) {
                            var2_2.error(this);
                        }
                    }
                    var4_4.insertElementFor(var17_17);
                    ** GOTO lbl360
                }
                case 27: 
                case 34: {
                    var18_18 /* !! */  = this;
                    var4_4 = var2_2;
                    var3_3 /* !! */  = var20_20;
                    var26_54 = var2_2.inScope(var20_20);
                    if (var26_54) {
                        var2_2.generateImpliedEndTags();
                        var24_32 = var2_2.currentElementIs(var20_20);
                        if (!var24_32) {
                            var2_2.error(this);
                        }
                    }
                    var4_4.insertElementFor(var17_17);
                    ** GOTO lbl360
                }
                case 26: {
                    var18_18 /* !! */  = this;
                    var4_4 = var2_2;
                    var3_3 /* !! */  = var21_21;
                    var26_55 = false;
                    var2_2.framesetOk(false);
                    var5_5 = var2_2.getStack();
                    var31_75 = var5_5.size();
                    var27_63 = 1;
                    var31_75 -= var27_63;
                    while (var31_75 > 0) {
                        var7_7 = (Element)var5_5.get(var31_75);
                        var8_8 /* !! */  = var7_7.normalName();
                        var25_42 = (int)var8_8 /* !! */ .equals(var12_12);
                        if (var25_42 != 0) {
                            var4_4.processEndTag((String)var12_12);
                            break;
                        }
                        var25_42 = (int)HtmlTreeBuilder.isSpecial((Element)var7_7);
                        if (var25_42 != 0 && (var27_63 = (int)StringUtil.inSorted((String)(var7_7 = var7_7.normalName()), var8_8 /* !! */  = HtmlTreeBuilderState$Constants.InBodyStartLiBreakers)) == 0) break;
                        var31_75 += -1;
                    }
                    if (var26_55 = var4_4.inButtonScope((String)var3_3 /* !! */ )) {
                        var4_4.processEndTag((String)var3_3 /* !! */ );
                    }
                    var4_4.insertElementFor(var17_17);
                    ** GOTO lbl360
                }
                case 25: {
                    var18_18 /* !! */  = this;
                    var4_4 = var2_2;
                    var3_3 /* !! */  = var21_21;
                    var26_56 = var2_2.inButtonScope((String)var21_21);
                    if (var26_56) {
                        var2_2.processEndTag((String)var21_21);
                    }
                    var4_4.insertEmptyElementFor(var17_17);
                    var24_33 = false;
                    var3_3 /* !! */  = null;
                    var4_4.framesetOk(false);
                    ** GOTO lbl360
                }
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: {
                    var18_18 /* !! */  = this;
                    var4_4 = var2_2;
                    var3_3 /* !! */  = var21_21;
                    var26_57 = var2_2.inButtonScope((String)var21_21);
                    if (var26_57) {
                        var2_2.processEndTag((String)var21_21);
                    }
                    if (var24_34 = StringUtil.inSorted((String)(var3_3 /* !! */  = var2_2.currentElement().normalName()), (String[])(var5_5 = HtmlTreeBuilderState$Constants.Headings))) {
                        var4_4.error((HtmlTreeBuilderState)var18_18 /* !! */ );
                        var2_2.pop();
                    }
                    var4_4.insertElementFor(var17_17);
                    ** GOTO lbl360
                }
                case 16: 
                case 17: {
                    var18_18 /* !! */  = this;
                    var4_4 = var2_2;
                    var3_3 /* !! */  = var21_21;
                    var26_58 = false;
                    var2_2.framesetOk(false);
                    var5_5 = var2_2.getStack();
                    var31_76 = var5_5.size();
                    var25_42 = var31_76 + -1;
                    var27_64 = 24;
                    if (var25_42 >= var27_64) {
                        var27_64 = 25;
                        var31_76 -= var27_64;
                    } else {
                        var31_76 = 0;
                        var6_6 = null;
                    }
                    while (var25_42 >= var31_76) {
                        var7_7 = (Element)var5_5.get(var25_42);
                        var9_9 = var7_7.normalName();
                        var28_68 = StringUtil.inSorted((String)var9_9, (String[])(var10_10 = HtmlTreeBuilderState$Constants.DdDt));
                        if (var28_68) {
                            var5_5 = var7_7.normalName();
                            var4_4.processEndTag((String)var5_5);
                            break;
                        }
                        var28_68 = HtmlTreeBuilder.isSpecial((Element)var7_7);
                        if (var28_68 && (var27_64 = (int)StringUtil.inSorted((String)(var7_7 = var7_7.normalName()), (String[])(var9_9 = HtmlTreeBuilderState$Constants.InBodyStartLiBreakers))) == 0) break;
                        var25_42 += -1;
                    }
                    if (var26_58 = var4_4.inButtonScope((String)var3_3 /* !! */ )) {
                        var4_4.processEndTag((String)var3_3 /* !! */ );
                    }
                    var4_4.insertElementFor(var17_17);
                    ** GOTO lbl360
                }
                case 10: {
                    var18_18 /* !! */  = this;
                    var4_4 = var2_2;
                    var3_3 /* !! */  = var2_2.getActiveFormattingElement(var14_14);
                    if (var3_3 /* !! */  != null) {
                        var2_2.error(this);
                        var2_2.processEndTag(var14_14);
                        var3_3 /* !! */  = var2_2.getFromStack(var14_14);
                        if (var3_3 /* !! */  != null) {
                            var2_2.removeFromActiveFormattingElements((Element)var3_3 /* !! */ );
                            var2_2.removeFromStack((Element)var3_3 /* !! */ );
                        }
                    }
                    var2_2.reconstructFormattingElements();
                    var3_3 /* !! */  = var4_4.insertElementFor(var17_17);
                    var4_4.pushActiveFormattingElements((Element)var3_3 /* !! */ );
                    ** GOTO lbl360
                }
                case 7: 
                case 8: 
                case 11: 
                case 12: 
                case 13: 
                case 14: 
                case 18: 
                case 30: 
                case 31: 
                case 40: 
                case 41: 
                case 50: {
                    var18_18 /* !! */  = this;
                    var4_4 = var2_2;
                    var2_2.reconstructFormattingElements();
                    var3_3 /* !! */  = var2_2.insertElementFor(var17_17);
                    var2_2.pushActiveFormattingElements((Element)var3_3 /* !! */ );
                    ** GOTO lbl360
                }
                case 6: {
                    var18_18 /* !! */  = this;
                    var4_4 = var2_2;
                    var2_2.reconstructFormattingElements();
                    var2_2.insertElementFor(var17_17);
                    var3_3 /* !! */  = null;
                    var2_2.framesetOk(false);
                    var24_35 = var17_17.selfClosing;
                    if (var24_35) ** GOTO lbl360
                    var3_3 /* !! */  = var2_2.state();
                    var26_59 = var3_3 /* !! */ .equals(var5_5 = HtmlTreeBuilderState.InTable);
                    if (var26_59 || (var26_59 = var3_3 /* !! */ .equals(var5_5 = HtmlTreeBuilderState.InCaption)) || (var26_59 = var3_3 /* !! */ .equals(var5_5 = HtmlTreeBuilderState.InTableBody)) || (var26_59 = var3_3 /* !! */ .equals(var5_5 = HtmlTreeBuilderState.InRow)) || (var24_35 = var3_3 /* !! */ .equals(var5_5 = HtmlTreeBuilderState.InCell))) ** GOTO lbl826
                    var3_3 /* !! */  = HtmlTreeBuilderState.InSelect;
                    var2_2.transition((HtmlTreeBuilderState)var3_3 /* !! */ );
                    ** GOTO lbl360
lbl826:
                    // 1 sources

                    var3_3 /* !! */  = HtmlTreeBuilderState.InSelectInTable;
                    var4_4.transition((HtmlTreeBuilderState)var3_3 /* !! */ );
                    ** GOTO lbl360
                }
                case 5: {
                    var18_18 /* !! */  = this;
                    var4_4 = var2_2;
                    var2_2.insertElementFor(var17_17);
                    var24_36 = var17_17.isSelfClosing();
                    if (var24_36) ** GOTO lbl360
                    var3_3 /* !! */  = var2_2.tokeniser;
                    var5_5 = TokeniserState.Rcdata;
                    var3_3 /* !! */ .transition((TokeniserState)var5_5);
                    var2_2.markInsertionMode();
                    var24_36 = false;
                    var2_2.framesetOk(false);
                    var3_3 /* !! */  = HtmlTreeBuilderState.Text;
                    var2_2.transition((HtmlTreeBuilderState)var3_3 /* !! */ );
                    ** GOTO lbl360
                }
                case 4: 
                case 9: {
                    var18_18 /* !! */  = this;
                    var4_4 = var2_2;
                    var24_37 = var2_2.currentElementIs(var15_15);
                    if (var24_37) {
                        var2_2.processEndTag(var15_15);
                    }
                    var2_2.reconstructFormattingElements();
                    var4_4.insertElementFor(var17_17);
                    ** GOTO lbl360
                }
                case 3: 
                case 15: 
                case 32: 
                case 36: 
                case 38: 
                case 47: {
                    var18_18 /* !! */  = this;
                    var4_4 = var2_2;
                    var2_2.reconstructFormattingElements();
                    var2_2.insertEmptyElementFor(var17_17);
                    var24_38 = false;
                    var3_3 /* !! */  = null;
                    var2_2.framesetOk(false);
                    ** GOTO lbl360
                }
                case 2: {
                    var18_18 /* !! */  = this;
                    var4_4 = var2_2;
                    var24_39 = false;
                    var3_3 /* !! */  = null;
                    var2_2.framesetOk(false);
                    HtmlTreeBuilderState.access$300(var17_17, var2_2);
                    ** GOTO lbl360
                }
                case 1: {
                    var18_18 /* !! */  = this;
                    var4_4 = var2_2;
                    var24_40 = false;
                    var3_3 /* !! */  = null;
                    var26_60 = var2_2.inButtonScope(var16_16);
                    if (!var26_60) ** GOTO lbl887
                    var2_2.error(this);
                    var2_2.processEndTag(var16_16);
                    var2_2.process(var17_17);
                    ** GOTO lbl360
lbl887:
                    // 1 sources

                    var2_2.reconstructFormattingElements();
                    var2_2.insertElementFor(var17_17);
                    var2_2.framesetOk(false);
                    ** continue;
                }
                case 0: {
                    var18_18 /* !! */  = this;
                    var4_4 = var2_2;
                    var27_65 = 2;
                    var2_2.error(this);
                    var5_5 = var2_2.getStack();
                    var31_77 = var5_5.size();
                    var25_42 = 1;
                    if (var31_77 != var25_42 && ((var31_77 = var5_5.size()) <= var27_65 || (var24_41 = (var6_6 = ((Element)var5_5.get(var25_42)).normalName()).equals(var3_3 /* !! */ )) != 0)) ** GOTO lbl904
                    var24_41 = 0;
                    var3_3 /* !! */  = null;
                    break block137;
lbl904:
                    // 1 sources

                    var24_41 = var2_2.framesetOk();
                    if (var24_41 == 0) {
                        return false;
                    }
                    var3_3 /* !! */  = (Element)var5_5.get(var25_42);
                    var6_6 = var3_3 /* !! */ .parent();
                    if (var6_6 != null) {
                        var3_3 /* !! */ .remove();
                    }
                    while ((var24_41 = var5_5.size()) > var25_42) {
                        var24_41 = var5_5.size() - var25_42;
                        var5_5.remove(var24_41);
                    }
                    var4_4.insertElementFor(var17_17);
                    var3_3 /* !! */  = HtmlTreeBuilderState.InFrameset;
                    var4_4.transition((HtmlTreeBuilderState)var3_3 /* !! */ );
                }
            }
            return (boolean)var25_42;
        }
        return false;
    }

    public boolean anyOtherEndTag(Token object, HtmlTreeBuilder htmlTreeBuilder) {
        object = ((Token)object).asEndTag().normalName;
        ArrayList arrayList = htmlTreeBuilder.getStack();
        Element element = htmlTreeBuilder.getFromStack((String)object);
        if (element == null) {
            htmlTreeBuilder.error(this);
            return false;
        }
        int n3 = arrayList.size();
        int n4 = 1;
        n3 -= n4;
        while (n3 >= 0) {
            Element element2 = (Element)arrayList.get(n3);
            String string2 = element2.normalName();
            boolean bl2 = string2.equals(object);
            if (bl2) {
                htmlTreeBuilder.generateImpliedEndTags((String)object);
                boolean bl3 = htmlTreeBuilder.currentElementIs((String)object);
                if (!bl3) {
                    htmlTreeBuilder.error(this);
                }
                htmlTreeBuilder.popStackToClose((String)object);
                break;
            }
            boolean bl4 = HtmlTreeBuilder.isSpecial(element2);
            if (bl4) {
                htmlTreeBuilder.error(this);
                return false;
            }
            n3 += -1;
        }
        return n4 != 0;
    }

    public boolean process(Token stringArray, HtmlTreeBuilder htmlTreeBuilder) {
        Object object = HtmlTreeBuilderState$25.$SwitchMap$org$jsoup$parser$Token$TokenType;
        int n3 = stringArray.type.ordinal();
        int n4 = object[n3];
        n3 = 0;
        switch (n4) {
            default: {
                break;
            }
            case 6: {
                n4 = htmlTreeBuilder.templateModeSize();
                if (n4 > 0) {
                    object = (Object)HtmlTreeBuilderState.InTemplate;
                    return htmlTreeBuilder.process((Token)stringArray, (HtmlTreeBuilderState)((Object)object));
                }
                stringArray = HtmlTreeBuilderState$Constants.InBodyEndOtherErrors;
                boolean bl2 = htmlTreeBuilder.onStackNot(stringArray);
                if (!bl2) break;
                htmlTreeBuilder.error(this);
                break;
            }
            case 5: {
                stringArray = stringArray.asCharacter();
                object = stringArray.getData();
                String string2 = HtmlTreeBuilderState.access$400();
                n4 = (int)(((String)object).equals(string2) ? 1 : 0);
                if (n4 != 0) {
                    htmlTreeBuilder.error(this);
                    return false;
                }
                n4 = (int)(htmlTreeBuilder.framesetOk() ? 1 : 0);
                if (n4 != 0 && (n4 = (int)(HtmlTreeBuilderState.access$100((Token)stringArray) ? 1 : 0)) != 0) {
                    htmlTreeBuilder.reconstructFormattingElements();
                    htmlTreeBuilder.insertCharacterNode((Token$Character)stringArray);
                    break;
                }
                htmlTreeBuilder.reconstructFormattingElements();
                htmlTreeBuilder.insertCharacterNode((Token$Character)stringArray);
                htmlTreeBuilder.framesetOk(false);
                break;
            }
            case 4: {
                return this.inBodyEndTag((Token)stringArray, htmlTreeBuilder);
            }
            case 3: {
                return this.inBodyStartTag((Token)stringArray, htmlTreeBuilder);
            }
            case 2: {
                htmlTreeBuilder.error(this);
                return false;
            }
            case 1: {
                stringArray = stringArray.asComment();
                htmlTreeBuilder.insertCommentNode((Token$Comment)stringArray);
            }
        }
        return true;
    }
}

