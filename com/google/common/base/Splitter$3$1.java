/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.CommonMatcher;
import com.google.common.base.Splitter;
import com.google.common.base.Splitter$3;
import com.google.common.base.Splitter$SplittingIterator;

class Splitter$3$1
extends Splitter$SplittingIterator {
    final /* synthetic */ CommonMatcher val$matcher;

    public Splitter$3$1(Splitter$3 splitter$3, Splitter splitter, CharSequence charSequence, CommonMatcher commonMatcher) {
        this.val$matcher = commonMatcher;
        super(splitter, charSequence);
    }

    public int separatorEnd(int n3) {
        return this.val$matcher.end();
    }

    public int separatorStart(int n3) {
        CommonMatcher commonMatcher = this.val$matcher;
        if ((n3 = (int)(commonMatcher.find(n3) ? 1 : 0)) != 0) {
            CommonMatcher commonMatcher2 = this.val$matcher;
            n3 = commonMatcher2.start();
        } else {
            n3 = -1;
        }
        return n3;
    }
}

