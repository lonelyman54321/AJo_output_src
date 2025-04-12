/*
 * Decompiled with CFR 0.152.
 */
package androidx.concurrent.futures;

import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class a$a
extends Lambda
implements Function1 {
    public final /* synthetic */ ListenableFuture c;

    public a$a(ListenableFuture listenableFuture) {
        this.c = listenableFuture;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Throwable)object;
        this.c.cancel(false);
        return Unit.a;
    }
}

