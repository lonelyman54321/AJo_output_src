/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$a;
import kotlinx.coroutines.c;
import kotlinx.coroutines.m;

public final class l
extends c {
    public static final l b;

    static {
        l l2;
        b = l2 = new c();
    }

    public final void J0(CoroutineContext object, Runnable object2) {
        object2 = m.b;
        if ((object = (m)object.get((CoroutineContext$a)object2)) != null) {
            ((m)object).a = true;
            return;
        }
        object = new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        throw object;
    }

    public final c M0(int n3, String string2) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
        throw unsupportedOperationException;
    }

    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}

