/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.base.Supplier;
import com.google.common.hash.LongAddable;
import com.google.common.hash.LongAddables$PureJavaLongAddable;

class LongAddables$2
implements Supplier {
    public LongAddable get() {
        LongAddables$PureJavaLongAddable longAddables$PureJavaLongAddable = new LongAddables$PureJavaLongAddable(null);
        return longAddables$PureJavaLongAddable;
    }
}

