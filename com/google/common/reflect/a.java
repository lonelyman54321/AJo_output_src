/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.reflect;

import com.google.common.base.Function;
import com.google.common.reflect.MutableTypeToInstanceMap$UnmodifiableEntry;
import java.util.Map;

public final class a
implements Function {
    public final Object apply(Object object) {
        return MutableTypeToInstanceMap$UnmodifiableEntry.a((Map.Entry)object);
    }
}

