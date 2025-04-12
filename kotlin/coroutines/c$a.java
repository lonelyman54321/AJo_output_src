/*
 * Decompiled with CFR 0.152.
 */
package kotlin.coroutines;

import java.io.Serializable;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c$a$a;
import kotlin.coroutines.f;
import kotlin.jvm.internal.Intrinsics;

public final class c$a
implements Serializable {
    public static final c$a$a b;
    private static final long serialVersionUID;
    public final CoroutineContext[] a;

    static {
        c$a$a c$a$a;
        b = c$a$a = new c$a$a(null);
    }

    public c$a(CoroutineContext[] coroutineContextArray) {
        Intrinsics.checkNotNullParameter(coroutineContextArray, "elements");
        this.a = coroutineContextArray;
    }

    private final Object readResolve() {
        CoroutineContext coroutineContext = f.a;
        for (CoroutineContext coroutineContext2 : this.a) {
            coroutineContext = coroutineContext.plus(coroutineContext2);
        }
        return coroutineContext;
    }
}

