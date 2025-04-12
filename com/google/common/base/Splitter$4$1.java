/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.Splitter;
import com.google.common.base.Splitter$4;
import com.google.common.base.Splitter$SplittingIterator;

class Splitter$4$1
extends Splitter$SplittingIterator {
    final /* synthetic */ Splitter$4 this$0;

    public Splitter$4$1(Splitter$4 splitter$4, Splitter splitter, CharSequence charSequence) {
        this.this$0 = splitter$4;
        super(splitter, charSequence);
    }

    public int separatorEnd(int n3) {
        return n3;
    }

    public int separatorStart(int n3) {
        int n4 = this.this$0.val$length;
        CharSequence charSequence = this.toSplit;
        if ((n3 += n4) >= (n4 = charSequence.length())) {
            n3 = -1;
        }
        return n3;
    }
}

