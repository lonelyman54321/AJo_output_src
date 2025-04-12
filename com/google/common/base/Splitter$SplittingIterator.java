/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.AbstractIterator;
import com.google.common.base.CharMatcher;
import com.google.common.base.Splitter;

abstract class Splitter$SplittingIterator
extends AbstractIterator {
    int limit;
    int offset = 0;
    final boolean omitEmptyStrings;
    final CharSequence toSplit;
    final CharMatcher trimmer;

    public Splitter$SplittingIterator(Splitter splitter, CharSequence charSequence) {
        int n3;
        boolean bl2;
        CharMatcher charMatcher;
        this.trimmer = charMatcher = Splitter.access$200(splitter);
        this.omitEmptyStrings = bl2 = Splitter.access$300(splitter);
        this.limit = n3 = Splitter.access$400(splitter);
        this.toSplit = charSequence;
    }

    public String computeNext() {
        int n3;
        int n4;
        int n7 = this.offset;
        while ((n4 = this.offset) != (n3 = -1)) {
            int n8;
            CharSequence charSequence;
            int n10;
            Object object;
            int n14;
            CharSequence charSequence2;
            if ((n4 = this.separatorStart(n4)) == n3) {
                charSequence2 = this.toSplit;
                n4 = charSequence2.length();
                this.offset = n3;
            } else {
                this.offset = n14 = this.separatorEnd(n4);
            }
            n14 = this.offset;
            if (n14 == n7) {
                this.offset = ++n14;
                charSequence2 = this.toSplit;
                n4 = charSequence2.length();
                if (n14 <= n4) continue;
                this.offset = n3;
                continue;
            }
            while (n7 < n4 && (n14 = (int)(((CharMatcher)(object = this.trimmer)).matches((char)(n10 = (charSequence = this.toSplit).charAt(n7))) ? 1 : 0)) != 0) {
                ++n7;
            }
            while (n4 > n7 && (n14 = (int)(((CharMatcher)(object = this.trimmer)).matches((char)(n10 = (charSequence = this.toSplit).charAt(n8 = n4 + -1))) ? 1 : 0)) != 0) {
                n4 += -1;
            }
            n14 = (int)(this.omitEmptyStrings ? 1 : 0);
            if (n14 != 0 && n7 == n4) {
                n7 = this.offset;
                continue;
            }
            n14 = this.limit;
            n10 = 1;
            if (n14 == n10) {
                CharMatcher charMatcher;
                charSequence2 = this.toSplit;
                this.offset = n3;
                for (n4 = charSequence2.length(); n4 > n7 && (n3 = (int)((charMatcher = this.trimmer).matches((char)(n14 = (int)(object = this.toSplit).charAt(n10 = n4 + -1))) ? 1 : 0)) != 0; n4 += -1) {
                }
            } else {
                this.limit = n14 -= n10;
            }
            return this.toSplit.subSequence(n7, n4).toString();
        }
        return (String)this.endOfData();
    }

    public abstract int separatorEnd(int var1);

    public abstract int separatorStart(int var1);
}

