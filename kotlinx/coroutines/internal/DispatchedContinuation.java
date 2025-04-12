/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.DispatchedTask;
import kotlinx.coroutines.c;

public final class DispatchedContinuation
extends DispatchedTask
implements k90_0,
f80_0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater h;
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final c d;
    public final f80_0 e;
    public Object f;
    public final Object g;

    static {
        h = AtomicReferenceFieldUpdater.newUpdater(DispatchedContinuation.class, Object.class, "_reusableCancellableContinuation$volatile");
    }

    public DispatchedContinuation(c object, f80_0 f80_02) {
        super(-1);
        this.d = object;
        this.e = f80_02;
        this.f = object = dr0_2.a;
        this.g = object = bn3_0.b(f80_02.getContext());
    }

    public final f80_0 c() {
        return this;
    }

    public final k90_0 getCallerFrame() {
        Object object = this.e;
        boolean bl2 = object instanceof k90_0;
        object = bl2 ? (k90_0)object : null;
        return object;
    }

    public final CoroutineContext getContext() {
        return this.e.getContext();
    }

    public final Object h() {
        Object object = this.f;
        gh3_2 gh3_22 = dr0_2.a;
        this.f = gh3_22;
        return object;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void resumeWith(Object object) {
        Throwable throwable222222;
        boolean bl2;
        Object object2 = tl2_2.a(object);
        boolean bl3 = false;
        Object object3 = object2 == null ? object : new m00_0((Throwable)object2, false);
        Object object4 = this.d;
        object2 = this.e;
        CoroutineContext coroutineContext = object2.getContext();
        boolean bl4 = dr0_2.c((c)object4, coroutineContext);
        if (bl4) {
            this.f = object3;
            this.c = 0;
            object = object2.getContext();
            dr0_2.b((c)object4, (CoroutineContext)object, this);
            return;
        }
        coroutineContext = cn3_0.a();
        boolean bl5 = ((jb0_2)coroutineContext).Q0();
        if (bl5) {
            this.f = object3;
            this.c = 0;
            ((jb0_2)coroutineContext).O0(this);
            return;
        }
        bl3 = true;
        ((jb0_2)coroutineContext).P0(bl3);
        object3 = object2.getContext();
        object4 = this.g;
        object4 = bn3_0.c((CoroutineContext)object3, object4);
        object2.resumeWith(object);
        object = Unit.a;
        bn3_0.a((CoroutineContext)object3, object4);
        while (bl2 = ((jb0_2)coroutineContext).S0()) {
        }
        return;
        {
            catch (Throwable throwable222222) {}
        }
        catch (Throwable throwable3) {
            bn3_0.a((CoroutineContext)object3, object4);
            throw throwable3;
        }
        try {
            this.g(throwable222222);
            return;
        }
        finally {
            ((jb0_2)coroutineContext).N0(bl3);
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DispatchedContinuation[");
        Object object = this.d;
        stringBuilder.append(object);
        stringBuilder.append(", ");
        object = si0_2.h(this.e);
        stringBuilder.append((String)object);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

