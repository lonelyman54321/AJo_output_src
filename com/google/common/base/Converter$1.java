/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.Converter;
import com.google.common.base.Converter$1$1;
import java.util.Iterator;

class Converter$1
implements Iterable {
    final /* synthetic */ Converter this$0;
    final /* synthetic */ Iterable val$fromIterable;

    public Converter$1(Converter converter, Iterable iterable) {
        this.this$0 = converter;
        this.val$fromIterable = iterable;
    }

    public Iterator iterator() {
        Converter$1$1 converter$1$1 = new Converter$1$1(this);
        return converter$1$1;
    }
}

