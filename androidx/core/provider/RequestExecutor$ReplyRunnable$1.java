/*
 * Decompiled with CFR 0.152.
 */
package androidx.core.provider;

import androidx.core.provider.f;

class RequestExecutor$ReplyRunnable$1
implements Runnable {
    public final /* synthetic */ p60_0 a;
    public final /* synthetic */ Object b;

    public RequestExecutor$ReplyRunnable$1(f f5, Object object) {
        this.a = f5;
        this.b = object;
    }

    public final void run() {
        p60_0 p60_02 = this.a;
        Object object = this.b;
        p60_02.accept(object);
    }
}

