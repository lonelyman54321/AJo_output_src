/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.TableCollectors;
import com.google.common.collect.TableCollectors$ImmutableTableCollectorState;
import java.util.function.Function;

public final class l
implements Function {
    public final Object apply(Object object) {
        return TableCollectors.d((TableCollectors$ImmutableTableCollectorState)object);
    }
}

