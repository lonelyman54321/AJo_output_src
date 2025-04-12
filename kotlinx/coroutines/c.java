/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$Element;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.coroutines.a;
import kotlin.coroutines.b;
import kotlin.coroutines.d;
import kotlin.coroutines.d$a;
import kotlin.coroutines.f;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.c$a;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.LimitedDispatcher;
import kotlinx.coroutines.l;

public abstract class c
extends a
implements d {
    public static final c$a a;

    static {
        c$a c$a;
        d$a d$a = d.n0;
        b90_0 b90_02 = new b90_0(0);
        a = c$a = new b(d$a, b90_02);
    }

    public c() {
        d$a d$a = d.n0;
        super(d$a);
    }

    public final void F0(f80_0 f80_02) {
        gh3_2 gh3_22;
        Object v4;
        Object object = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>";
        Intrinsics.checkNotNull(f80_02, (String)object);
        f80_02 = (DispatchedContinuation)f80_02;
        f80_02.getClass();
        while ((v4 = ((AtomicReferenceFieldUpdater)(object = DispatchedContinuation.h)).get(f80_02)) == (gh3_22 = dr0_2.b)) {
        }
        boolean bl2 = (f80_02 = ((AtomicReferenceFieldUpdater)object).get(f80_02)) instanceof CancellableContinuationImpl;
        if ((f80_02 = bl2 ? (CancellableContinuationImpl)f80_02 : null) != null) {
            ((CancellableContinuationImpl)f80_02).l();
        }
    }

    public abstract void J0(CoroutineContext var1, Runnable var2);

    public void K0(CoroutineContext coroutineContext, Runnable runnable2) {
        dr0_2.b(this, coroutineContext, runnable2);
    }

    public boolean L0(CoroutineContext coroutineContext) {
        return this instanceof l ^ true;
    }

    public c M0(int n3, String string2) {
        tu1_2.a(n3);
        LimitedDispatcher limitedDispatcher = new LimitedDispatcher(this, n3, string2);
        return limitedDispatcher;
    }

    public final DispatchedContinuation O(f80_0 f80_02) {
        DispatchedContinuation dispatchedContinuation = new DispatchedContinuation(this, f80_02);
        return dispatchedContinuation;
    }

    public final CoroutineContext$Element get(CoroutineContext$a object) {
        Object object2 = "key";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        boolean bl2 = object instanceof b;
        Object object3 = null;
        if (bl2) {
            object = (b)object;
            CoroutineContext$a coroutineContext$a = this.getKey();
            object.getClass();
            Intrinsics.checkNotNullParameter(coroutineContext$a, (String)object2);
            if (coroutineContext$a == object || (object2 = ((b)object).b) == coroutineContext$a) {
                object2 = "element";
                Intrinsics.checkNotNullParameter(this, (String)object2);
                object = (CoroutineContext$Element)((b)object).a.invoke(this);
                boolean bl3 = object instanceof CoroutineContext$Element;
                if (bl3) {
                    object3 = object;
                }
            }
        } else {
            object2 = d.n0;
            if (object2 == object) {
                object = "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get";
                Intrinsics.checkNotNull(this, (String)object);
                object3 = this;
            }
        }
        return (CoroutineContext$Element)object3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final CoroutineContext minusKey(CoroutineContext$a object) {
        Object object2 = "key";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        boolean bl2 = object instanceof b;
        if (bl2) {
            object = (b)object;
            CoroutineContext$a coroutineContext$a = this.getKey();
            object.getClass();
            Intrinsics.checkNotNullParameter(coroutineContext$a, (String)object2);
            if (coroutineContext$a != object) {
                object2 = ((b)object).b;
                if (object2 != coroutineContext$a) return this;
            }
            object2 = "element";
            Intrinsics.checkNotNullParameter(this, (String)object2);
            object = (CoroutineContext$Element)((b)object).a.invoke(this);
            if (object == null) return this;
            return f.a;
        }
        object2 = d.n0;
        if (object2 != object) return this;
        return f.a;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.getClass().getSimpleName();
        stringBuilder.append(string2);
        stringBuilder.append('@');
        string2 = si0_2.d(this);
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }
}

