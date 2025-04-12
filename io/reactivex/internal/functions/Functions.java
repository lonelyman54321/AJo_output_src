/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.functions;

import io.reactivex.internal.functions.Functions$EmptyRunnable;
import io.reactivex.internal.functions.Functions$b;
import io.reactivex.internal.functions.Functions$c;
import io.reactivex.internal.functions.Functions$e;

public final class Functions {
    public static final Runnable a;
    public static final Functions$b b;
    public static final Functions$c c;
    public static final Functions$e d;

    static {
        Object object = new Functions$EmptyRunnable();
        a = object;
        b = object = new Object();
        c = object = new Object();
        d = object = new Object();
    }
}

