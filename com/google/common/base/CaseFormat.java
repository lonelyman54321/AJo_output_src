/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.Ascii;
import com.google.common.base.CaseFormat$1;
import com.google.common.base.CaseFormat$2;
import com.google.common.base.CaseFormat$3;
import com.google.common.base.CaseFormat$4;
import com.google.common.base.CaseFormat$5;
import com.google.common.base.CaseFormat$StringConverter;
import com.google.common.base.CharMatcher;
import com.google.common.base.Converter;
import com.google.common.base.Preconditions;
import java.util.Objects;

public abstract class CaseFormat
extends Enum {
    private static final /* synthetic */ CaseFormat[] $VALUES;
    public static final /* enum */ CaseFormat LOWER_CAMEL;
    public static final /* enum */ CaseFormat LOWER_HYPHEN;
    public static final /* enum */ CaseFormat LOWER_UNDERSCORE;
    public static final /* enum */ CaseFormat UPPER_CAMEL;
    public static final /* enum */ CaseFormat UPPER_UNDERSCORE;
    private final CharMatcher wordBoundary;
    private final String wordSeparator;

    private static /* synthetic */ CaseFormat[] $values() {
        CaseFormat caseFormat = LOWER_HYPHEN;
        caseFormat = LOWER_UNDERSCORE;
        caseFormat = LOWER_CAMEL;
        caseFormat = UPPER_CAMEL;
        caseFormat = UPPER_UNDERSCORE;
        CaseFormat[] caseFormatArray = new CaseFormat[]{caseFormat, caseFormat, caseFormat, caseFormat, caseFormat};
        return caseFormatArray;
    }

    static {
        CharMatcher charMatcher = CharMatcher.is('-');
        CaseFormat caseFormat = new CaseFormat$1(charMatcher, "-");
        LOWER_HYPHEN = caseFormat;
        char c2 = '_';
        CharMatcher charMatcher2 = CharMatcher.is(c2);
        String string2 = "_";
        caseFormat = new CaseFormat$2(charMatcher2, string2);
        LOWER_UNDERSCORE = caseFormat;
        char c3 = 'A';
        char c5 = 'Z';
        CharMatcher charMatcher3 = CharMatcher.inRange(c3, c5);
        String string3 = "";
        caseFormat = new CaseFormat$3(charMatcher3, string3);
        LOWER_CAMEL = caseFormat;
        charMatcher2 = CharMatcher.inRange(c3, c5);
        caseFormat = new CaseFormat$4(charMatcher2, string3);
        UPPER_CAMEL = caseFormat;
        charMatcher = CharMatcher.is(c2);
        caseFormat = new CaseFormat$5(charMatcher, string2);
        UPPER_UNDERSCORE = caseFormat;
        $VALUES = CaseFormat.$values();
    }

    /*
     * WARNING - void declaration
     */
    private CaseFormat() {
        void var4_1;
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.wordBoundary = var3_2;
        this.wordSeparator = var4_1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ CaseFormat(CharMatcher charMatcher, String string2, CaseFormat$1 caseFormat$1) {
        this((String)var1_-1, (int)string2, (CharMatcher)((Object)caseFormat$1), (String)var4_3);
        void var4_3;
        void var1_-1;
    }

    public static /* synthetic */ String access$100(String string2) {
        return CaseFormat.firstCharOnlyToUpper(string2);
    }

    private static String firstCharOnlyToUpper(String string2) {
        boolean bl2 = string2.isEmpty();
        if (!bl2) {
            StringBuilder stringBuilder = new StringBuilder();
            char c2 = Ascii.toUpperCase(string2.charAt(0));
            stringBuilder.append(c2);
            c2 = '\u0001';
            string2 = Ascii.toLowerCase(string2.substring(c2));
            stringBuilder.append(string2);
            string2 = stringBuilder.toString();
        }
        return string2;
    }

    public static CaseFormat valueOf(String string2) {
        return Enum.valueOf(CaseFormat.class, string2);
    }

    public static CaseFormat[] values() {
        return (CaseFormat[])$VALUES.clone();
    }

    public String convert(CaseFormat object, String string2) {
        StringBuilder stringBuilder = null;
        int n3 = 0;
        String string3 = null;
        int n4 = -1;
        int n7 = -1;
        while (true) {
            CharMatcher charMatcher = this.wordBoundary;
            ++n7;
            if ((n7 = charMatcher.indexIn(string2, n7)) == n4) break;
            if (n3 == 0) {
                int n8 = string2.length();
                String string4 = ((CaseFormat)((Object)object)).wordSeparator;
                int n10 = string4.length() * 4 + n8;
                stringBuilder = new StringBuilder(n10);
                string3 = string2.substring(n3, n7);
                string3 = ((CaseFormat)((Object)object)).normalizeFirstWord(string3);
                stringBuilder.append(string3);
            } else {
                Objects.requireNonNull(stringBuilder);
                string3 = string2.substring(n3, n7);
                string3 = ((CaseFormat)((Object)object)).normalizeWord(string3);
                stringBuilder.append(string3);
            }
            string3 = ((CaseFormat)((Object)object)).wordSeparator;
            stringBuilder.append(string3);
            string3 = this.wordSeparator;
            n3 = string3.length() + n7;
        }
        if (n3 == 0) {
            object = ((CaseFormat)((Object)object)).normalizeFirstWord(string2);
        } else {
            Objects.requireNonNull(stringBuilder);
            string2 = string2.substring(n3);
            object = ((CaseFormat)((Object)object)).normalizeWord(string2);
            stringBuilder.append((String)object);
            object = stringBuilder.toString();
        }
        return object;
    }

    public Converter converterTo(CaseFormat caseFormat) {
        CaseFormat$StringConverter caseFormat$StringConverter = new CaseFormat$StringConverter(this, caseFormat);
        return caseFormat$StringConverter;
    }

    public String normalizeFirstWord(String string2) {
        return this.normalizeWord(string2);
    }

    public abstract String normalizeWord(String var1);

    public final String to(CaseFormat caseFormat, String string2) {
        Preconditions.checkNotNull((Object)caseFormat);
        Preconditions.checkNotNull(string2);
        if (caseFormat != this) {
            string2 = this.convert(caseFormat, string2);
        }
        return string2;
    }
}

