/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.functions;

import java.util.concurrent.Callable;

public final class Functions$d
implements Callable,
bx0_2 {
    public final Object a;

    public Functions$d(Object object) {
        this.a = object;
    }

    public final Object apply(Object object) {
        return this.a;
    }

    public final Object call() {
        return this.a;
    }
}

