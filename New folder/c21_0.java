/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.i;
import kotlinx.coroutines.i$a;

/*
 * Renamed from C21
 */
public final class c21_0
extends d21_0 {
    public final Handler b;
    public final String c;
    public final boolean d;
    public final c21_0 e;

    public c21_0(Handler handler) {
        this(handler, null, false);
    }

    public c21_0(Handler handler, String string2, boolean bl2) {
        c21_0 c21_02;
        this.b = handler;
        this.c = string2;
        this.d = bl2;
        if (bl2) {
            c21_02 = this;
        } else {
            boolean bl3 = true;
            c21_02 = new c21_0(handler, string2, bl3);
        }
        this.e = c21_02;
    }

    public final fr0_1 H(long l2, Runnable runnable2, CoroutineContext coroutineContext) {
        Handler handler = this.b;
        long l3 = 0x3FFFFFFFFFFFFFFFL;
        boolean bl2 = handler.postDelayed(runnable2, l2 = f.d(l2, l3));
        if (bl2) {
            z21_0 z21_02 = new z21_0(this, runnable2);
            return z21_02;
        }
        this.O0(coroutineContext, runnable2);
        return l42_0.a;
    }

    public final void J0(CoroutineContext coroutineContext, Runnable runnable2) {
        Handler handler = this.b;
        boolean bl2 = handler.post(runnable2);
        if (!bl2) {
            this.O0(coroutineContext, runnable2);
        }
    }

    public final boolean L0(CoroutineContext coroutineContext) {
        Looper looper;
        boolean bl2 = this.d;
        if (bl2 && (bl2 = Intrinsics.areEqual(coroutineContext = Looper.myLooper(), looper = this.b.getLooper()))) {
            bl2 = false;
            coroutineContext = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public final d21_0 N0() {
        return this.e;
    }

    public final void O0(CoroutineContext coroutineContext, Runnable runnable2) {
        Object object = new StringBuilder("The task was rejected, the handler underlying the dispatcher '");
        ((StringBuilder)object).append(this);
        String string2 = "' was closed";
        ((StringBuilder)object).append(string2);
        object = ((StringBuilder)object).toString();
        Object object2 = new CancellationException((String)object);
        object = i$a.a;
        object = (i)coroutineContext.get((CoroutineContext$a)object);
        if (object != null) {
            object.d((CancellationException)object2);
        }
        object2 = ir0_2.a;
        em0_2.b.J0(coroutineContext, runnable2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        boolean bl2 = object instanceof c21_0;
        if (!bl2) return false;
        object = (c21_0)object;
        Handler handler = ((c21_0)object).b;
        Handler handler2 = this.b;
        if (handler != handler2) return false;
        boolean bl3 = ((c21_0)object).d;
        bl2 = this.d;
        if (bl3 != bl2) return false;
        return true;
    }

    public final int hashCode() {
        Handler handler = this.b;
        int n3 = System.identityHashCode(handler);
        int n4 = this.d;
        n4 = n4 != 0 ? 1231 : 1237;
        return n3 ^ n4;
    }

    public final void l0(long l2, CancellableContinuationImpl cancellableContinuationImpl) {
        Handler handler = this.b;
        a21_0 a21_02 = new a21_0(cancellableContinuationImpl, this);
        long l3 = 0x3FFFFFFFFFFFFFFFL;
        boolean bl2 = handler.postDelayed((Runnable)a21_02, l2 = f.d(l2, l3));
        if (bl2) {
            b21_0 b21_02 = new b21_0(this, a21_02);
            cancellableContinuationImpl.x(b21_02);
        } else {
            CoroutineContext coroutineContext = cancellableContinuationImpl.e;
            this.O0(coroutineContext, a21_02);
        }
    }

    public final String toString() {
        String string2;
        boolean bl2;
        Object object = ir0_2.a;
        object = bg1_1.a;
        if (this == object) {
            object = "Dispatchers.Main";
        } else {
            bl2 = false;
            string2 = null;
            try {
                object = ((d21_0)object).N0();
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                object = null;
            }
            object = this == object ? "Dispatchers.Main.immediate" : null;
        }
        if (object == null) {
            object = this.c;
            if (object == null) {
                object = this.b.toString();
            }
            if (bl2 = this.d) {
                string2 = ".immediate";
                object = Ft2.a((String)object, string2);
            }
        }
        return object;
    }
}

