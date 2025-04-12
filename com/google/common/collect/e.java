/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.collect.Multimaps$AsMap$EntrySet;

public final class e
implements Function {
    public final /* synthetic */ Multimaps$AsMap$EntrySet a;

    public /* synthetic */ e(Multimaps$AsMap$EntrySet multimaps$AsMap$EntrySet) {
        this.a = multimaps$AsMap$EntrySet;
    }

    public final Object apply(Object object) {
        return Multimaps$AsMap$EntrySet.a(this.a, object);
    }
}

