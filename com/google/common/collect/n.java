/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.TableCollectors;
import java.util.function.BinaryOperator;

public final class n
implements BinaryOperator {
    public final Object apply(Object object, Object object2) {
        return TableCollectors.b(object, object2);
    }
}

