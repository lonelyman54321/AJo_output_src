/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.Splitter;
import com.google.common.base.Splitter$2;
import com.google.common.base.Splitter$SplittingIterator;

class Splitter$2$1
extends Splitter$SplittingIterator {
    final /* synthetic */ Splitter$2 this$0;

    public Splitter$2$1(Splitter$2 splitter$2, Splitter splitter, CharSequence charSequence) {
        this.this$0 = splitter$2;
        super(splitter, charSequence);
    }

    public int separatorEnd(int n3) {
        return this.this$0.val$separator.length() + n3;
    }

    public int separatorStart(int n3) {
        String string2 = this.this$0.val$separator;
        int n4 = string2.length();
        CharSequence charSequence = this.toSplit;
        int n7 = charSequence.length() - n4;
        block0: while (n3 <= n7) {
            for (int i3 = 0; i3 < n4; ++i3) {
                String string3;
                CharSequence charSequence2 = this.toSplit;
                int n8 = i3 + n3;
                char c2 = charSequence2.charAt(n8);
                if (c2 == (n8 = (int)(string3 = this.this$0.val$separator).charAt(i3))) continue;
                ++n3;
                continue block0;
            }
            return n3;
        }
        return -1;
    }
}

