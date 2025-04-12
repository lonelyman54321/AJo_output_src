/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Function;
import com.google.common.util.concurrent.FuturesGetChecked;
import java.util.List;

public final class l
implements Function {
    public final Object apply(Object object) {
        return FuturesGetChecked.a((List)object);
    }
}

