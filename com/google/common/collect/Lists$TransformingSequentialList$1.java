/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.Lists$TransformingSequentialList;
import com.google.common.collect.TransformedListIterator;
import java.util.ListIterator;

class Lists$TransformingSequentialList$1
extends TransformedListIterator {
    final /* synthetic */ Lists$TransformingSequentialList this$0;

    public Lists$TransformingSequentialList$1(Lists$TransformingSequentialList lists$TransformingSequentialList, ListIterator listIterator) {
        this.this$0 = lists$TransformingSequentialList;
        super(listIterator);
    }

    public Object transform(Object object) {
        return this.this$0.function.apply(object);
    }
}

