/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.Ascii;
import com.google.common.base.CaseFormat;
import com.google.common.base.CharMatcher;

final class CaseFormat$2
extends CaseFormat {
    public CaseFormat$2(CharMatcher charMatcher, String string3) {
    }

    public String convert(CaseFormat caseFormat, String string2) {
        CaseFormat caseFormat2 = CaseFormat.LOWER_HYPHEN;
        if (caseFormat == caseFormat2) {
            return string2.replace('_', '-');
        }
        caseFormat2 = CaseFormat.UPPER_UNDERSCORE;
        if (caseFormat == caseFormat2) {
            return Ascii.toUpperCase(string2);
        }
        return super.convert(caseFormat, string2);
    }

    public String normalizeWord(String string2) {
        return Ascii.toLowerCase(string2);
    }
}

