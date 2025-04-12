/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.TableCollectors;
import com.google.common.collect.TableCollectors$ImmutableTableCollectorState;
import java.util.function.BinaryOperator;

public final class s
implements BinaryOperator {
    public final /* synthetic */ BinaryOperator a;

    public /* synthetic */ s(BinaryOperator binaryOperator) {
        this.a = binaryOperator;
    }

    public final Object apply(Object object, Object object2) {
        BinaryOperator binaryOperator = this.a;
        object = (TableCollectors$ImmutableTableCollectorState)object;
        object2 = (TableCollectors$ImmutableTableCollectorState)object2;
        return TableCollectors.e(binaryOperator, (TableCollectors$ImmutableTableCollectorState)object, (TableCollectors$ImmutableTableCollectorState)object2);
    }
}

