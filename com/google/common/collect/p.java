/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.Table;
import com.google.common.collect.TableCollectors;
import java.util.function.BinaryOperator;

public final class p
implements BinaryOperator {
    public final /* synthetic */ BinaryOperator a;

    public /* synthetic */ p(BinaryOperator binaryOperator) {
        this.a = binaryOperator;
    }

    public final Object apply(Object object, Object object2) {
        BinaryOperator binaryOperator = this.a;
        object = (Table)object;
        object2 = (Table)object2;
        return TableCollectors.g(binaryOperator, (Table)object, (Table)object2);
    }
}

