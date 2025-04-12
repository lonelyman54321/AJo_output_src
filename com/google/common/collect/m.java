/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ImmutableTable$Builder;
import com.google.common.collect.TableCollectors;
import java.util.function.BiConsumer;
import java.util.function.Function;

public final class m
implements BiConsumer {
    public final /* synthetic */ Function a;
    public final /* synthetic */ Function b;
    public final /* synthetic */ Function c;

    public /* synthetic */ m(Function function, Function function2, Function function3) {
        this.a = function;
        this.b = function2;
        this.c = function3;
    }

    public final void accept(Object object, Object object2) {
        Function function = this.a;
        Function function2 = this.b;
        Function function3 = this.c;
        object = (ImmutableTable$Builder)object;
        TableCollectors.h(function, function2, function3, (ImmutableTable$Builder)object, object2);
    }
}

