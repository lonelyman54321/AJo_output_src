/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
package androidx.core.provider;

import android.os.Handler;
import androidx.core.provider.RequestExecutor$ReplyRunnable$1;
import androidx.core.provider.f;
import java.util.concurrent.Callable;

class RequestExecutor$ReplyRunnable
implements Runnable {
    public Callable a;
    public p60_0 b;
    public Handler c;

    public RequestExecutor$ReplyRunnable() {
        throw null;
    }

    public final void run() {
        Callable callable = this.a;
        try {
            callable = callable.call();
        }
        catch (Exception exception) {
            callable = null;
        }
        f f5 = (f)this.b;
        RequestExecutor$ReplyRunnable$1 requestExecutor$ReplyRunnable$1 = new RequestExecutor$ReplyRunnable$1(f5, callable);
        this.c.post((Runnable)requestExecutor$ReplyRunnable$1);
    }
}

