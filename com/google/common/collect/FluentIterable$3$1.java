/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractIndexedListIterator;
import com.google.common.collect.FluentIterable$3;
import java.util.Iterator;

class FluentIterable$3$1
extends AbstractIndexedListIterator {
    final /* synthetic */ FluentIterable$3 this$0;

    public FluentIterable$3$1(FluentIterable$3 fluentIterable$3, int n3) {
        this.this$0 = fluentIterable$3;
        super(n3);
    }

    public Iterator get(int n3) {
        return this.this$0.val$inputs[n3].iterator();
    }
}

