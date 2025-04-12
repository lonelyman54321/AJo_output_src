/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.functions;

import io.reactivex.exceptions.OnErrorNotImplementedException;

public final class Functions$e
implements o60_0 {
    public final void accept(Object object) {
        object = (Throwable)object;
        OnErrorNotImplementedException onErrorNotImplementedException = new OnErrorNotImplementedException((Throwable)object);
        dr2_2.b(onErrorNotImplementedException);
    }
}

