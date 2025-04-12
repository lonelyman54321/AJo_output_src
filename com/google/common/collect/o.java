/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.Table;
import com.google.common.collect.TableCollectors;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public final class o
implements BiConsumer {
    public final /* synthetic */ Function a;
    public final /* synthetic */ Function b;
    public final /* synthetic */ Function c;
    public final /* synthetic */ BinaryOperator d;

    public /* synthetic */ o(Function function, Function function2, Function function3, BinaryOperator binaryOperator) {
        this.a = function;
        this.b = function2;
        this.c = function3;
        this.d = binaryOperator;
    }

    public final void accept(Object object, Object object2) {
        Function function = this.a;
        Function function2 = this.b;
        Function function3 = this.c;
        BinaryOperator binaryOperator = this.d;
        Object object3 = object;
        object3 = (Table)object;
        TableCollectors.c(function, function2, function3, binaryOperator, (Table)object3, object2);
    }
}

