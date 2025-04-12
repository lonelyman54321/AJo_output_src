/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.internal.StringUtil;
import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.HtmlTreeBuilderState$1;
import org.jsoup.parser.HtmlTreeBuilderState$10;
import org.jsoup.parser.HtmlTreeBuilderState$11;
import org.jsoup.parser.HtmlTreeBuilderState$12;
import org.jsoup.parser.HtmlTreeBuilderState$13;
import org.jsoup.parser.HtmlTreeBuilderState$14;
import org.jsoup.parser.HtmlTreeBuilderState$15;
import org.jsoup.parser.HtmlTreeBuilderState$16;
import org.jsoup.parser.HtmlTreeBuilderState$17;
import org.jsoup.parser.HtmlTreeBuilderState$18;
import org.jsoup.parser.HtmlTreeBuilderState$19;
import org.jsoup.parser.HtmlTreeBuilderState$2;
import org.jsoup.parser.HtmlTreeBuilderState$20;
import org.jsoup.parser.HtmlTreeBuilderState$21;
import org.jsoup.parser.HtmlTreeBuilderState$22;
import org.jsoup.parser.HtmlTreeBuilderState$23;
import org.jsoup.parser.HtmlTreeBuilderState$24;
import org.jsoup.parser.HtmlTreeBuilderState$3;
import org.jsoup.parser.HtmlTreeBuilderState$4;
import org.jsoup.parser.HtmlTreeBuilderState$5;
import org.jsoup.parser.HtmlTreeBuilderState$6;
import org.jsoup.parser.HtmlTreeBuilderState$7;
import org.jsoup.parser.HtmlTreeBuilderState$8;
import org.jsoup.parser.HtmlTreeBuilderState$9;
import org.jsoup.parser.Token;
import org.jsoup.parser.Token$StartTag;
import org.jsoup.parser.TokeniserState;

abstract class HtmlTreeBuilderState
extends Enum {
    private static final /* synthetic */ HtmlTreeBuilderState[] $VALUES;
    public static final /* enum */ HtmlTreeBuilderState AfterAfterBody;
    public static final /* enum */ HtmlTreeBuilderState AfterAfterFrameset;
    public static final /* enum */ HtmlTreeBuilderState AfterBody;
    public static final /* enum */ HtmlTreeBuilderState AfterFrameset;
    public static final /* enum */ HtmlTreeBuilderState AfterHead;
    public static final /* enum */ HtmlTreeBuilderState BeforeHead;
    public static final /* enum */ HtmlTreeBuilderState BeforeHtml;
    public static final /* enum */ HtmlTreeBuilderState ForeignContent;
    public static final /* enum */ HtmlTreeBuilderState InBody;
    public static final /* enum */ HtmlTreeBuilderState InCaption;
    public static final /* enum */ HtmlTreeBuilderState InCell;
    public static final /* enum */ HtmlTreeBuilderState InColumnGroup;
    public static final /* enum */ HtmlTreeBuilderState InFrameset;
    public static final /* enum */ HtmlTreeBuilderState InHead;
    public static final /* enum */ HtmlTreeBuilderState InHeadNoscript;
    public static final /* enum */ HtmlTreeBuilderState InRow;
    public static final /* enum */ HtmlTreeBuilderState InSelect;
    public static final /* enum */ HtmlTreeBuilderState InSelectInTable;
    public static final /* enum */ HtmlTreeBuilderState InTable;
    public static final /* enum */ HtmlTreeBuilderState InTableBody;
    public static final /* enum */ HtmlTreeBuilderState InTableText;
    public static final /* enum */ HtmlTreeBuilderState InTemplate;
    public static final /* enum */ HtmlTreeBuilderState Initial;
    public static final /* enum */ HtmlTreeBuilderState Text;
    private static final String nullString;

    private static /* synthetic */ HtmlTreeBuilderState[] $values() {
        HtmlTreeBuilderState htmlTreeBuilderState = Initial;
        htmlTreeBuilderState = BeforeHtml;
        htmlTreeBuilderState = BeforeHead;
        htmlTreeBuilderState = InHead;
        htmlTreeBuilderState = InHeadNoscript;
        htmlTreeBuilderState = AfterHead;
        htmlTreeBuilderState = InBody;
        htmlTreeBuilderState = Text;
        htmlTreeBuilderState = InTable;
        htmlTreeBuilderState = InTableText;
        htmlTreeBuilderState = InCaption;
        htmlTreeBuilderState = InColumnGroup;
        htmlTreeBuilderState = InTableBody;
        htmlTreeBuilderState = InRow;
        htmlTreeBuilderState = InCell;
        htmlTreeBuilderState = InSelect;
        htmlTreeBuilderState = InSelectInTable;
        htmlTreeBuilderState = InTemplate;
        htmlTreeBuilderState = AfterBody;
        htmlTreeBuilderState = InFrameset;
        htmlTreeBuilderState = AfterFrameset;
        htmlTreeBuilderState = AfterAfterBody;
        htmlTreeBuilderState = AfterAfterFrameset;
        htmlTreeBuilderState = ForeignContent;
        HtmlTreeBuilderState[] htmlTreeBuilderStateArray = new HtmlTreeBuilderState[]{htmlTreeBuilderState, htmlTreeBuilderState, htmlTreeBuilderState, htmlTreeBuilderState, htmlTreeBuilderState, htmlTreeBuilderState, htmlTreeBuilderState, htmlTreeBuilderState, htmlTreeBuilderState, htmlTreeBuilderState, htmlTreeBuilderState, htmlTreeBuilderState, htmlTreeBuilderState, htmlTreeBuilderState, htmlTreeBuilderState, htmlTreeBuilderState, htmlTreeBuilderState, htmlTreeBuilderState, htmlTreeBuilderState, htmlTreeBuilderState, htmlTreeBuilderState, htmlTreeBuilderState, htmlTreeBuilderState, htmlTreeBuilderState};
        return htmlTreeBuilderStateArray;
    }

    static {
        HtmlTreeBuilderState htmlTreeBuilderState = new HtmlTreeBuilderState$1();
        Initial = htmlTreeBuilderState;
        htmlTreeBuilderState = new HtmlTreeBuilderState$2();
        BeforeHtml = htmlTreeBuilderState;
        htmlTreeBuilderState = new HtmlTreeBuilderState$3();
        BeforeHead = htmlTreeBuilderState;
        htmlTreeBuilderState = new HtmlTreeBuilderState$4();
        InHead = htmlTreeBuilderState;
        htmlTreeBuilderState = new HtmlTreeBuilderState$5();
        InHeadNoscript = htmlTreeBuilderState;
        htmlTreeBuilderState = new HtmlTreeBuilderState$6();
        AfterHead = htmlTreeBuilderState;
        htmlTreeBuilderState = new HtmlTreeBuilderState$7();
        InBody = htmlTreeBuilderState;
        htmlTreeBuilderState = new HtmlTreeBuilderState$8();
        Text = htmlTreeBuilderState;
        htmlTreeBuilderState = new HtmlTreeBuilderState$9();
        InTable = htmlTreeBuilderState;
        htmlTreeBuilderState = new HtmlTreeBuilderState$10();
        InTableText = htmlTreeBuilderState;
        htmlTreeBuilderState = new HtmlTreeBuilderState$11();
        InCaption = htmlTreeBuilderState;
        htmlTreeBuilderState = new HtmlTreeBuilderState$12();
        InColumnGroup = htmlTreeBuilderState;
        htmlTreeBuilderState = new HtmlTreeBuilderState$13();
        InTableBody = htmlTreeBuilderState;
        htmlTreeBuilderState = new HtmlTreeBuilderState$14();
        InRow = htmlTreeBuilderState;
        htmlTreeBuilderState = new HtmlTreeBuilderState$15();
        InCell = htmlTreeBuilderState;
        htmlTreeBuilderState = new HtmlTreeBuilderState$16();
        InSelect = htmlTreeBuilderState;
        htmlTreeBuilderState = new HtmlTreeBuilderState$17();
        InSelectInTable = htmlTreeBuilderState;
        htmlTreeBuilderState = new HtmlTreeBuilderState$18();
        InTemplate = htmlTreeBuilderState;
        htmlTreeBuilderState = new HtmlTreeBuilderState$19();
        AfterBody = htmlTreeBuilderState;
        htmlTreeBuilderState = new HtmlTreeBuilderState$20();
        InFrameset = htmlTreeBuilderState;
        htmlTreeBuilderState = new HtmlTreeBuilderState$21();
        AfterFrameset = htmlTreeBuilderState;
        htmlTreeBuilderState = new HtmlTreeBuilderState$22();
        AfterAfterBody = htmlTreeBuilderState;
        htmlTreeBuilderState = new HtmlTreeBuilderState$23();
        AfterAfterFrameset = htmlTreeBuilderState;
        htmlTreeBuilderState = new HtmlTreeBuilderState$24();
        ForeignContent = htmlTreeBuilderState;
        $VALUES = HtmlTreeBuilderState.$values();
        nullString = String.valueOf('\u0000');
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private HtmlTreeBuilderState() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ HtmlTreeBuilderState(HtmlTreeBuilderState$1 varnull) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    public static /* synthetic */ boolean access$100(Token token) {
        return HtmlTreeBuilderState.isWhitespace(token);
    }

    public static /* synthetic */ void access$200(Token.StartTag startTag, HtmlTreeBuilder htmlTreeBuilder) {
        HtmlTreeBuilderState.handleRcData(startTag, htmlTreeBuilder);
    }

    public static /* synthetic */ void access$300(Token.StartTag startTag, HtmlTreeBuilder htmlTreeBuilder) {
        HtmlTreeBuilderState.handleRawtext(startTag, htmlTreeBuilder);
    }

    public static /* synthetic */ String access$400() {
        return nullString;
    }

    private static void handleRawtext(Token.StartTag startTag, HtmlTreeBuilder htmlTreeBuilder) {
        Object object = htmlTreeBuilder.tokeniser;
        TokeniserState tokeniserState = TokeniserState.Rawtext;
        object.transition(tokeniserState);
        htmlTreeBuilder.markInsertionMode();
        object = Text;
        htmlTreeBuilder.transition((HtmlTreeBuilderState)((Object)object));
        htmlTreeBuilder.insertElementFor(startTag);
    }

    private static void handleRcData(Token.StartTag startTag, HtmlTreeBuilder htmlTreeBuilder) {
        Object object = htmlTreeBuilder.tokeniser;
        TokeniserState tokeniserState = TokeniserState.Rcdata;
        object.transition(tokeniserState);
        htmlTreeBuilder.markInsertionMode();
        object = Text;
        htmlTreeBuilder.transition((HtmlTreeBuilderState)((Object)object));
        htmlTreeBuilder.insertElementFor(startTag);
    }

    private static boolean isWhitespace(Token token) {
        boolean bl2 = token.isCharacter();
        if (bl2) {
            return StringUtil.isBlank(token.asCharacter().getData());
        }
        return false;
    }

    public static HtmlTreeBuilderState valueOf(String string2) {
        return Enum.valueOf(HtmlTreeBuilderState.class, string2);
    }

    public static HtmlTreeBuilderState[] values() {
        return (HtmlTreeBuilderState[])$VALUES.clone();
    }

    public abstract boolean process(Token var1, HtmlTreeBuilder var2);
}

