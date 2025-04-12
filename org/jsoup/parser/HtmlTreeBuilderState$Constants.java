/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

final class HtmlTreeBuilderState$Constants {
    static final String[] AfterHeadBody;
    static final String[] BeforeHtmlToHead;
    static final String[] DdDt;
    static final String[] Headings;
    static final String[] InBodyEndAdoptionFormatters;
    static final String[] InBodyEndClosers;
    static final String[] InBodyEndOtherErrors;
    static final String[] InBodyEndTableFosters;
    static final String[] InBodyStartApplets;
    static final String[] InBodyStartDrop;
    static final String[] InBodyStartInputAttribs;
    static final String[] InBodyStartLiBreakers;
    static final String[] InBodyStartMedia;
    static final String[] InBodyStartPClosers;
    static final String[] InBodyStartToHead;
    static final String[] InCaptionIgnore;
    static final String[] InCellBody;
    static final String[] InCellCol;
    static final String[] InCellNames;
    static final String[] InCellTable;
    static final String[] InForeignToHtml;
    static final String[] InHeadEmpty;
    static final String[] InHeadEnd;
    static final String[] InHeadNoScriptHead;
    static final String[] InHeadNoscriptIgnore;
    static final String[] InHeadRaw;
    static final String[] InRowIgnore;
    static final String[] InRowMissing;
    static final String[] InSelectEnd;
    static final String[] InSelectTableEnd;
    static final String[] InTableAddBody;
    static final String[] InTableBodyEndIgnore;
    static final String[] InTableBodyExit;
    static final String[] InTableEndErr;
    static final String[] InTableEndIgnore;
    static final String[] InTableFoster;
    static final String[] InTableToBody;
    static final String[] InTableToHead;
    static final String[] InTemplateToHead;
    static final String[] InTemplateToTable;

    static {
        InHeadEmpty = new String[]{"base", "basefont", "bgsound", "command", "link"};
        String string2 = "style";
        InHeadRaw = new String[]{"noframes", string2};
        String string3 = "body";
        String string4 = "br";
        String string5 = "html";
        InHeadEnd = new String[]{string3, string4, string5};
        AfterHeadBody = new String[]{string3, string4, string5};
        String string6 = "head";
        BeforeHtmlToHead = new String[]{string3, string4, string6, string5};
        InHeadNoScriptHead = new String[]{"basefont", "bgsound", "link", "meta", "noframes", "style"};
        InBodyStartToHead = new String[]{"base", "basefont", "bgsound", "command", "link", "meta", "noframes", "script", "style", "template", "title"};
        InBodyStartPClosers = new String[]{"address", "article", "aside", "blockquote", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "menu", "nav", "ol", "p", "section", "summary", "ul"};
        Headings = new String[]{"h1", "h2", "h3", "h4", "h5", "h6"};
        InBodyStartLiBreakers = new String[]{"address", "div", "p"};
        DdDt = new String[]{"dd", "dt"};
        InBodyStartApplets = new String[]{"applet", "marquee", "object"};
        InBodyStartMedia = new String[]{"param", "source", "track"};
        InBodyStartInputAttribs = new String[]{"action", "name", "prompt"};
        InBodyStartDrop = new String[]{"caption", "col", "colgroup", "frame", "head", "tbody", "td", "tfoot", "th", "thead", "tr"};
        InBodyEndClosers = new String[]{"address", "article", "aside", "blockquote", "button", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "listing", "menu", "nav", "ol", "pre", "section", "summary", "ul"};
        InBodyEndOtherErrors = new String[]{"body", "dd", "dt", "html", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};
        InBodyEndAdoptionFormatters = new String[]{"a", "b", "big", "code", "em", "font", "i", "nobr", "s", "small", "strike", "strong", "tt", "u"};
        string4 = "table";
        String string7 = "tbody";
        String string8 = "tfoot";
        String string9 = "thead";
        String string10 = "tr";
        InBodyEndTableFosters = new String[]{string4, string7, string8, string9, string10};
        InTableToBody = new String[]{string7, string8, string9};
        String string11 = "td";
        String string12 = "th";
        InTableAddBody = new String[]{string11, string12, string10};
        InTableToHead = new String[]{"script", string2, "template"};
        InCellNames = new String[]{string11, string12};
        string2 = "caption";
        string12 = "colgroup";
        InCellBody = new String[]{string3, string2, "col", string12, string5};
        InCellTable = new String[]{string4, string7, string8, string9, string10};
        InCellCol = new String[]{"caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr"};
        InTableEndErr = new String[]{"body", "caption", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
        InTableFoster = new String[]{string4, string7, string8, string9, string10};
        InTableBodyExit = new String[]{"caption", "col", "colgroup", "tbody", "tfoot", "thead"};
        InTableBodyEndIgnore = new String[]{"body", "caption", "col", "colgroup", "html", "td", "th", "tr"};
        InRowMissing = new String[]{"caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr"};
        InRowIgnore = new String[]{"body", "caption", "col", "colgroup", "html", "td", "th"};
        InSelectEnd = new String[]{"input", "keygen", "textarea"};
        InSelectTableEnd = new String[]{"caption", "table", "tbody", "td", "tfoot", "th", "thead", "tr"};
        InTableEndIgnore = new String[]{string7, string8, string9};
        InHeadNoscriptIgnore = new String[]{string6, "noscript"};
        InCaptionIgnore = new String[]{"body", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
        InTemplateToHead = new String[]{"base", "basefont", "bgsound", "link", "meta", "noframes", "script", "style", "template", "title"};
        InTemplateToTable = new String[]{string2, string12, string7, string8, string9};
        InForeignToHtml = new String[]{"b", "big", "blockquote", "body", "br", "center", "code", "dd", "div", "dl", "dt", "em", "embed", "h1", "h2", "h3", "h4", "h5", "h6", "head", "hr", "i", "img", "li", "listing", "menu", "meta", "nobr", "ol", "p", "pre", "ruby", "s", "small", "span", "strike", "strong", "sub", "sup", "table", "tt", "u", "ul", "var"};
    }
}

