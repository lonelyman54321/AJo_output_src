/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.ServiceConnection
 *  android.os.IBinder
 */
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.io.Serializable;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

public final class Zq$c
implements ServiceConnection {
    public final AtomicBoolean a;
    public final LinkedBlockingDeque b;

    public Zq$c() {
        Serializable serializable;
        this.a = serializable = new AtomicBoolean(false);
        this.b = serializable;
    }

    public final IBinder a() {
        Serializable serializable = this.a;
        boolean bl2 = true;
        boolean bl3 = serializable.compareAndSet(bl2, bl2) ^ bl2;
        if (bl3) {
            serializable = this.b.take();
            Intrinsics.checkNotNullExpressionValue(serializable, "queue.take()");
            return (IBinder)serializable;
        }
        String string2 = "Binder already consumed".toString();
        serializable = new IllegalStateException(string2);
        throw serializable;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onServiceConnected(ComponentName object, IBinder iBinder) {
        if (iBinder == null) return;
        try {
            object = this.b;
            ((LinkedBlockingDeque)object).put(iBinder);
            return;
        }
        catch (InterruptedException interruptedException) {
            return;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}

