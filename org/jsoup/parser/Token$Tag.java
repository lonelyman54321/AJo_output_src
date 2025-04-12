/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import java.util.HashMap;
import java.util.Map;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Range;
import org.jsoup.nodes.Range$AttributeRange;
import org.jsoup.nodes.Range$Position;
import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Token;

abstract class Token$Tag
extends Token {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int MaxAttributes = 512;
    private String attrName;
    int attrNameEnd;
    private final StringBuilder attrNameSb;
    int attrNameStart;
    int attrValEnd;
    int attrValStart;
    private String attrValue;
    private final StringBuilder attrValueSb;
    Attributes attributes;
    private boolean hasAttrName;
    private boolean hasAttrValue;
    private boolean hasEmptyAttrValue;
    protected String normalName;
    boolean selfClosing = false;
    protected String tagName;
    final boolean trackSource;

    public Token$Tag(boolean bl2) {
        super(null);
        StringBuilder stringBuilder;
        this.attrNameSb = stringBuilder = new StringBuilder();
        this.hasAttrName = false;
        this.attrValueSb = stringBuilder = new StringBuilder();
        this.hasAttrValue = false;
        this.hasEmptyAttrValue = false;
        this.trackSource = bl2;
    }

    private void ensureAttrName(int n3, int n4) {
        int n7;
        this.hasAttrName = n7 = 1;
        String string2 = this.attrName;
        if (string2 != null) {
            StringBuilder stringBuilder = this.attrNameSb;
            stringBuilder.append(string2);
            n7 = 0;
            string2 = null;
            this.attrName = null;
        }
        if ((n7 = this.trackSource) != 0) {
            n7 = this.attrNameStart;
            int n8 = -1;
            if (n7 > n8) {
                n3 = n7;
            }
            this.attrNameStart = n3;
            this.attrNameEnd = n4;
        }
    }

    private void ensureAttrValue(int n3, int n4) {
        int n7;
        this.hasAttrValue = n7 = 1;
        String string2 = this.attrValue;
        if (string2 != null) {
            StringBuilder stringBuilder = this.attrValueSb;
            stringBuilder.append(string2);
            n7 = 0;
            string2 = null;
            this.attrValue = null;
        }
        if ((n7 = this.trackSource) != 0) {
            n7 = this.attrValStart;
            int n8 = -1;
            if (n7 > n8) {
                n3 = n7;
            }
            this.attrValStart = n3;
            this.attrValEnd = n4;
        }
    }

    private void resetPendingAttr() {
        Token.reset(this.attrNameSb);
        this.attrName = null;
        this.hasAttrName = false;
        StringBuilder stringBuilder = this.attrValueSb;
        Token.reset(stringBuilder);
        this.attrValue = null;
        this.hasEmptyAttrValue = false;
        this.hasAttrValue = false;
        int n3 = this.trackSource;
        if (n3 != 0) {
            this.attrValEnd = n3 = -1;
            this.attrValStart = n3;
            this.attrNameEnd = n3;
            this.attrNameStart = n3;
        }
    }

    private void trackAttributeRange(String string2) {
        int n3 = this.trackSource;
        if (n3 != 0 && (n3 = this.isStartTag()) != 0) {
            int n4;
            Object object;
            CharacterReader characterReader = this.asStartTag().reader;
            HashMap<String, Object> hashMap = this.attributes;
            Object object2 = "jsoup.attrs";
            if ((hashMap = (Map)((Attributes)((Object)hashMap)).userData((String)object2)) == null) {
                hashMap = new HashMap<String, Object>();
                object = this.attributes;
                ((Attributes)object).userData((String)object2, hashMap);
            }
            if ((n4 = hashMap.containsKey(string2)) != 0) {
                return;
            }
            n4 = this.hasAttrValue;
            if (n4 == 0) {
                this.attrValEnd = n4 = this.attrNameEnd;
                this.attrValStart = n4;
            }
            int n7 = this.attrNameStart;
            int n8 = characterReader.lineNumber(n7);
            int n10 = this.attrNameStart;
            n10 = characterReader.columnNumber(n10);
            Object object3 = new Range$Position(n7, n8, n10);
            n8 = this.attrNameEnd;
            n10 = characterReader.lineNumber(n8);
            int n14 = this.attrNameEnd;
            n14 = characterReader.columnNumber(n14);
            Range$Position range$Position = new Range$Position(n8, n10, n14);
            object = new Range((Range$Position)object3, range$Position);
            n8 = this.attrValStart;
            n10 = characterReader.lineNumber(n8);
            n14 = this.attrValStart;
            n14 = characterReader.columnNumber(n14);
            range$Position = new Range$Position(n8, n10, n14);
            n10 = this.attrValEnd;
            n14 = characterReader.lineNumber(n10);
            int n15 = this.attrValEnd;
            n3 = characterReader.columnNumber(n15);
            Range$Position range$Position2 = new Range$Position(n10, n14, n3);
            object3 = new Range(range$Position, range$Position2);
            object2 = new Range$AttributeRange((Range)object, (Range)object3);
            hashMap.put(string2, object2);
        }
    }

    public final void appendAttributeName(char c2, int n3, int n4) {
        this.ensureAttrName(n3, n4);
        this.attrNameSb.append(c2);
    }

    public final void appendAttributeName(String string2, int n3, int n4) {
        char c2 = (char)-3;
        string2 = string2.replace('\u0000', c2);
        this.ensureAttrName(n3, n4);
        StringBuilder stringBuilder = this.attrNameSb;
        n3 = stringBuilder.length();
        if (n3 == 0) {
            this.attrName = string2;
        } else {
            stringBuilder = this.attrNameSb;
            stringBuilder.append(string2);
        }
    }

    public final void appendAttributeValue(char c2, int n3, int n4) {
        this.ensureAttrValue(n3, n4);
        this.attrValueSb.append(c2);
    }

    public final void appendAttributeValue(String string2, int n3, int n4) {
        this.ensureAttrValue(n3, n4);
        StringBuilder stringBuilder = this.attrValueSb;
        n3 = stringBuilder.length();
        if (n3 == 0) {
            this.attrValue = string2;
        } else {
            stringBuilder = this.attrValueSb;
            stringBuilder.append(string2);
        }
    }

    public final void appendAttributeValue(int[] nArray, int n3, int n4) {
        this.ensureAttrValue(n3, n4);
        for (int n7 : nArray) {
            StringBuilder stringBuilder = this.attrValueSb;
            stringBuilder.appendCodePoint(n7);
        }
    }

    public final void appendTagName(char c2) {
        String string2 = String.valueOf(c2);
        this.appendTagName(string2);
    }

    public final void appendTagName(String string2) {
        char c2 = (char)-3;
        string2 = string2.replace('\u0000', c2);
        String string3 = this.tagName;
        if (string3 != null) {
            string2 = string3.concat(string2);
        }
        this.tagName = string2;
        this.normalName = string2 = ParseSettings.normalName(string2);
    }

    public final void finaliseTag() {
        boolean bl2 = this.hasAttrName;
        if (bl2) {
            this.newAttribute();
        }
    }

    public final boolean hasAttribute(String string2) {
        boolean bl2;
        Attributes attributes = this.attributes;
        if (attributes != null && (bl2 = attributes.hasKey(string2))) {
            bl2 = true;
        } else {
            bl2 = false;
            string2 = null;
        }
        return bl2;
    }

    public final boolean hasAttributeIgnoreCase(String string2) {
        boolean bl2;
        Attributes attributes = this.attributes;
        if (attributes != null && (bl2 = attributes.hasKeyIgnoreCase(string2))) {
            bl2 = true;
        } else {
            bl2 = false;
            string2 = null;
        }
        return bl2;
    }

    public final boolean hasAttributes() {
        boolean bl2;
        Attributes attributes = this.attributes;
        if (attributes != null) {
            bl2 = true;
        } else {
            bl2 = false;
            attributes = null;
        }
        return bl2;
    }

    public final boolean isSelfClosing() {
        return this.selfClosing;
    }

    public final String name() {
        boolean bl2;
        String string2 = this.tagName;
        if (string2 != null && (bl2 = string2.length())) {
            bl2 = false;
            string2 = null;
        } else {
            bl2 = true;
        }
        Validate.isFalse(bl2);
        return this.tagName;
    }

    public final Token$Tag name(String string2) {
        this.tagName = string2;
        this.normalName = string2 = ParseSettings.normalName(string2);
        return this;
    }

    public final void newAttribute() {
        int n3;
        int n4;
        Object object = this.attributes;
        if (object == null) {
            object = new Attributes();
            this.attributes = object;
        }
        if ((n4 = this.hasAttrName) != 0 && (n4 = ((Attributes)(object = this.attributes)).size()) < (n3 = 512)) {
            object = this.attrNameSb;
            n4 = ((StringBuilder)object).length();
            object = n4 > 0 ? this.attrNameSb.toString() : this.attrName;
            n3 = ((String)(object = ((String)object).trim())).length();
            if (n3 > 0) {
                CharSequence charSequence;
                n3 = (int)(this.hasAttrValue ? 1 : 0);
                if (n3 != 0) {
                    charSequence = this.attrValueSb;
                    n3 = charSequence.length();
                    charSequence = n3 > 0 ? this.attrValueSb.toString() : this.attrValue;
                } else {
                    n3 = (int)(this.hasEmptyAttrValue ? 1 : 0);
                    if (n3 != 0) {
                        charSequence = "";
                    } else {
                        n3 = 0;
                        charSequence = null;
                    }
                }
                Attributes attributes = this.attributes;
                attributes.add((String)object, (String)charSequence);
                this.trackAttributeRange((String)object);
            }
        }
        this.resetPendingAttr();
    }

    public final String normalName() {
        return this.normalName;
    }

    public Token$Tag reset() {
        super.reset();
        this.tagName = null;
        this.normalName = null;
        this.selfClosing = false;
        this.attributes = null;
        this.resetPendingAttr();
        return this;
    }

    public final void setEmptyAttributeValue() {
        this.hasEmptyAttrValue = true;
    }

    public abstract String toString();

    public final String toStringName() {
        String string2 = this.tagName;
        if (string2 == null) {
            string2 = "[unset]";
        }
        return string2;
    }
}

