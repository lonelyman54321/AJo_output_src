/*
 * Decompiled with CFR 0.152.
 */
package androidx.work.impl;

import androidx.work.c;
import androidx.work.impl.WorkerStoppedException;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class a$a
extends Lambda
implements Function1 {
    public final /* synthetic */ c c;
    public final /* synthetic */ ListenableFuture d;

    public a$a(c c2, ListenableFuture listenableFuture) {
        this.c = c2;
        this.d = listenableFuture;
        super(1);
    }

    public final Object invoke(Object object) {
        boolean bl2 = (object = (Throwable)object) instanceof WorkerStoppedException;
        if (bl2) {
            object = (WorkerStoppedException)object;
            int n3 = ((WorkerStoppedException)object).a;
            c c2 = this.c;
            c2.stop(n3);
        }
        this.d.cancel(false);
        return Unit.a;
    }
}

