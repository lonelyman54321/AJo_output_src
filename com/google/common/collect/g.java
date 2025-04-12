/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.collect.Multimaps$UnmodifiableMultimap;
import java.util.Collection;

public final class g
implements Function {
    public final Object apply(Object object) {
        return Multimaps$UnmodifiableMultimap.a((Collection)object);
    }
}

