/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.parser.ParseSettings;

public class Tag
implements Cloneable {
    private static final Map Tags;
    private static final String[] blockTags;
    private static final String[] emptyTags;
    private static final String[] formListedTags;
    private static final String[] formSubmitTags;
    private static final String[] formatAsInlineTags;
    private static final String[] inlineTags;
    private static final Map namespaces;
    private static final String[] preserveWhitespaceTags;
    private boolean empty;
    private boolean formList;
    private boolean formSubmit;
    private boolean formatAsBlock;
    private boolean isBlock;
    private String namespace;
    private final String normalName;
    private boolean preserveWhitespace;
    private boolean selfClosing;
    private String tagName;

    static {
        boolean bl2;
        Object object = new HashMap();
        Tags = object;
        object = new String[]{"html", "head", "body", "frameset", "script", "noscript", "style", "meta", "link", "title", "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", "p", "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "ins", "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "video", "audio", "canvas", "details", "menu", "plaintext", "template", "article", "main", "svg", "math", "center", "template", "dir", "applet", "marquee", "listing"};
        blockTags = object;
        String string2 = "mn";
        String string3 = "mtext";
        String string4 = "rt";
        String string5 = "rp";
        String string6 = "rtc";
        String string7 = "a";
        String string8 = "img";
        String string9 = "br";
        String string10 = "wbr";
        String string11 = "map";
        String string12 = "q";
        String string13 = "sub";
        String string14 = "sup";
        String string15 = "bdo";
        String string16 = "iframe";
        String string17 = "embed";
        String string18 = "span";
        String string19 = "input";
        String string20 = "select";
        String string21 = "textarea";
        String string22 = "label";
        String string23 = "button";
        String string24 = "optgroup";
        String string25 = "option";
        String string26 = "legend";
        String string27 = "datalist";
        String string28 = "keygen";
        String string29 = "output";
        String string30 = "progress";
        String string31 = "meter";
        String string32 = "area";
        String string33 = "param";
        String string34 = "source";
        String string35 = "track";
        String string36 = "summary";
        String string37 = "command";
        String string38 = "device";
        String string39 = "area";
        String string40 = "basefont";
        String string41 = "bgsound";
        String string42 = "menuitem";
        String string43 = "param";
        String string44 = "source";
        String string45 = "track";
        String string46 = "data";
        String string47 = "bdi";
        String string48 = "s";
        String string49 = "strike";
        String string50 = "nobr";
        String string51 = "rb";
        String string52 = "text";
        String string53 = "mi";
        String string54 = "mo";
        String string55 = "msup";
        Object object2 = new String[]{"object", "base", "font", "tt", "i", "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, string19, string20, string21, string22, string23, string24, string25, string26, string27, string28, string29, string30, string31, string32, string33, string34, string35, string36, string37, string38, string39, string40, string41, string42, string43, string44, string45, string46, string47, string48, string49, string50, string51, string52, string53, string54, string55, string2, string3};
        inlineTags = object2;
        String string56 = "track";
        String[] stringArray = new String[]{"meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", string56};
        emptyTags = stringArray;
        String string57 = "del";
        String string58 = "s";
        String string59 = "td";
        String string60 = "script";
        String string61 = "style";
        String string62 = "ins";
        Object object3 = new String[]{"title", "a", "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", string59, string60, string61, string62, string57, string58};
        formatAsInlineTags = object3;
        HashMap<String, String[]> hashMap = "textarea";
        String[] stringArray2 = new String[]{"pre", "plaintext", "title", hashMap};
        preserveWhitespaceTags = stringArray2;
        String string63 = "select";
        String string64 = "textarea";
        String[] stringArray3 = new String[]{"button", "fieldset", "input", "keygen", "object", "output", string63, string64};
        formListedTags = stringArray3;
        String[] stringArray4 = new String[]{"input", "keygen", "object", "select", hashMap};
        formSubmitTags = stringArray4;
        namespaces = hashMap = new HashMap<String, String[]>();
        String string65 = "mn";
        String string66 = "mtext";
        String string67 = "mo";
        String string68 = "msup";
        Object object4 = new String[]{"math", "mi", string67, string68, string65, string66};
        hashMap.put("http://www.w3.org/1998/Math/MathML", (String[])object4);
        object4 = new String[]{"svg", "text"};
        String string69 = "http://www.w3.org/2000/svg";
        hashMap.put(string69, (String[])object4);
        object4 = new Object();
        Tag.setupTags((String[])object, (Consumer)object4);
        object = new Object();
        Tag.setupTags((String[])object2, (Consumer)object);
        object = new Object();
        Tag.setupTags(stringArray, (Consumer)object);
        object = new Object();
        Tag.setupTags(object3, (Consumer)object);
        object = new Object();
        Tag.setupTags(stringArray2, (Consumer)object);
        object = new Object();
        Tag.setupTags(stringArray3, (Consumer)object);
        object = new Object();
        Tag.setupTags(stringArray4, (Consumer)object);
        object = hashMap.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            object2 = (Map.Entry)object.next();
            stringArray = (String[])object2.getValue();
            object3 = new ti3_1((Map.Entry)object2);
            Tag.setupTags(stringArray, (Consumer)object3);
        }
    }

    private Tag(String string2, String string3) {
        boolean bl2;
        this.isBlock = bl2 = true;
        this.formatAsBlock = bl2;
        this.empty = false;
        this.selfClosing = false;
        this.preserveWhitespace = false;
        this.formList = false;
        this.formSubmit = false;
        this.tagName = string2;
        this.normalName = string2 = Normalizer.lowerCase(string2);
        this.namespace = string3;
    }

    public static /* synthetic */ void b(Tag tag) {
        tag.formatAsBlock = false;
    }

    public static /* synthetic */ void d(Tag tag) {
        tag.preserveWhitespace = true;
    }

    public static /* synthetic */ void e(Tag tag) {
        tag.formSubmit = true;
    }

    public static /* synthetic */ void f(Map.Entry entry, Tag tag) {
        tag.namespace = (entry = (String)entry.getKey());
    }

    public static /* synthetic */ void g(Tag tag) {
        Tag.lambda$static$1(tag);
    }

    public static /* synthetic */ void i(Tag tag) {
        tag.empty = true;
    }

    public static boolean isKnownTag(String string2) {
        return Tags.containsKey(string2);
    }

    public static /* synthetic */ void j(Tag tag) {
        Tag.lambda$static$0(tag);
    }

    public static /* synthetic */ void k(Tag tag) {
        tag.formList = true;
    }

    private static /* synthetic */ void lambda$static$0(Tag tag) {
        boolean bl2;
        tag.isBlock = bl2 = true;
        tag.formatAsBlock = bl2;
    }

    private static /* synthetic */ void lambda$static$1(Tag tag) {
        tag.isBlock = false;
        tag.formatAsBlock = false;
    }

    private static void setupTags(String[] stringArray, Consumer consumer) {
        int n3 = stringArray.length;
        for (int i3 = 0; i3 < n3; ++i3) {
            Map map2 = Tags;
            String string2 = stringArray[i3];
            Tag tag = (Tag)map2.get(string2);
            if (tag == null) {
                String string3 = "http://www.w3.org/1999/xhtml";
                tag = new Tag(string2, string3);
                string2 = tag.tagName;
                map2.put(string2, tag);
            }
            li3_2.a(consumer, tag);
        }
    }

    public static Tag valueOf(String string2) {
        ParseSettings parseSettings = ParseSettings.preserveCase;
        return Tag.valueOf(string2, "http://www.w3.org/1999/xhtml", parseSettings);
    }

    public static Tag valueOf(String string2, String string3, ParseSettings object) {
        String string4;
        boolean bl2;
        Validate.notEmpty(string2);
        Validate.notNull(string3);
        Object object2 = Tags;
        Object object3 = (Tag)object2.get(string2);
        if (object3 != null && (bl2 = (string4 = ((Tag)object3).namespace).equals(string3))) {
            return object3;
        }
        string2 = ((ParseSettings)object).normalizeTag(string2);
        Validate.notEmpty(string2);
        object3 = Normalizer.lowerCase(string2);
        object2 = (Tag)object2.get(object3);
        if (object2 != null && (bl2 = (string4 = ((Tag)object2).namespace).equals(string3))) {
            boolean bl3 = ((ParseSettings)object).preserveTagCase();
            if (bl3 && !(bl3 = string2.equals(object3))) {
                object2 = ((Tag)object2).clone();
                ((Tag)object2).tagName = string2;
            }
            return object2;
        }
        object = new Tag(string2, string3);
        ((Tag)object).isBlock = false;
        return object;
    }

    public static Tag valueOf(String string2, ParseSettings parseSettings) {
        return Tag.valueOf(string2, "http://www.w3.org/1999/xhtml", parseSettings);
    }

    public Tag clone() {
        Object object;
        try {
            object = super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            RuntimeException runtimeException = new RuntimeException(cloneNotSupportedException);
            throw runtimeException;
        }
        return (Tag)object;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Tag;
        if (!bl3) {
            return false;
        }
        object = (Tag)object;
        String string2 = this.tagName;
        String string3 = ((Tag)object).tagName;
        bl3 = string2.equals(string3);
        if (!bl3) {
            return false;
        }
        bl3 = this.empty;
        boolean bl4 = ((Tag)object).empty;
        if (bl3 != bl4) {
            return false;
        }
        bl3 = this.formatAsBlock;
        bl4 = ((Tag)object).formatAsBlock;
        if (bl3 != bl4) {
            return false;
        }
        bl3 = this.isBlock;
        bl4 = ((Tag)object).isBlock;
        if (bl3 != bl4) {
            return false;
        }
        bl3 = this.preserveWhitespace;
        bl4 = ((Tag)object).preserveWhitespace;
        if (bl3 != bl4) {
            return false;
        }
        bl3 = this.selfClosing;
        bl4 = ((Tag)object).selfClosing;
        if (bl3 != bl4) {
            return false;
        }
        bl3 = this.formList;
        bl4 = ((Tag)object).formList;
        if (bl3 != bl4) {
            return false;
        }
        bl3 = this.formSubmit;
        boolean bl5 = ((Tag)object).formSubmit;
        if (bl3 != bl5) {
            bl2 = false;
        }
        return bl2;
    }

    public boolean formatAsBlock() {
        return this.formatAsBlock;
    }

    public String getName() {
        return this.tagName;
    }

    public int hashCode() {
        int n3 = this.tagName.hashCode() * 31;
        int n4 = this.isBlock;
        n3 = (n3 + n4) * 31;
        int n7 = this.formatAsBlock;
        n3 = (n3 + n7) * 31;
        int n8 = this.empty;
        n3 = (n3 + n8) * 31;
        int n10 = this.selfClosing;
        n3 = (n3 + n10) * 31;
        int n14 = this.preserveWhitespace;
        n3 = (n3 + n14) * 31;
        int n15 = this.formList;
        n3 = (n3 + n15) * 31;
        int n16 = this.formSubmit;
        return n3 + n16;
    }

    public boolean isBlock() {
        return this.isBlock;
    }

    public boolean isEmpty() {
        return this.empty;
    }

    public boolean isFormListed() {
        return this.formList;
    }

    public boolean isFormSubmittable() {
        return this.formSubmit;
    }

    public boolean isInline() {
        return this.isBlock ^ true;
    }

    public boolean isKnownTag() {
        Map map2 = Tags;
        String string2 = this.tagName;
        return map2.containsKey(string2);
    }

    public boolean isSelfClosing() {
        boolean bl2 = this.empty;
        bl2 = bl2 || (bl2 = this.selfClosing);
        return bl2;
    }

    public String namespace() {
        return this.namespace;
    }

    public String normalName() {
        return this.normalName;
    }

    public boolean preserveWhitespace() {
        return this.preserveWhitespace;
    }

    public Tag setSelfClosing() {
        this.selfClosing = true;
        return this;
    }

    public String toString() {
        return this.tagName;
    }
}

