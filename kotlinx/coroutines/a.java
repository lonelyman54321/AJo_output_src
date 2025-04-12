/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$a;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.i;
import kotlinx.coroutines.i$a;

public abstract class a
extends JobSupport
implements f80_0,
i90_0 {
    public final CoroutineContext c;

    public a(CoroutineContext coroutineContext, boolean bl2, boolean bl3) {
        super(bl3);
        if (bl2) {
            Object object = i$a.a;
            object = (i)coroutineContext.get((CoroutineContext$a)object);
            this.h0((i)object);
        }
        this.c = coroutineContext = coroutineContext.plus(this);
    }

    public void B0(Throwable throwable, boolean bl2) {
    }

    public void C0(Object object) {
    }

    public final String S() {
        return this.getClass().getSimpleName().concat(" was cancelled");
    }

    public final void g0(CompletionHandlerException completionHandlerException) {
        g90_0.a(this.c, completionHandlerException);
    }

    public final CoroutineContext getContext() {
        return this.c;
    }

    public final CoroutineContext getCoroutineContext() {
        return this.c;
    }

    public final void r0(Object object) {
        boolean bl2 = object instanceof m00_0;
        if (bl2) {
            object = (m00_0)object;
            Throwable throwable = ((m00_0)object).a;
            object.getClass();
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = m00_0.b;
            boolean bl3 = atomicIntegerFieldUpdater.get(object);
            boolean bl4 = true;
            if (bl3 != bl4) {
                bl4 = false;
                atomicIntegerFieldUpdater = null;
            }
            this.B0(throwable, bl4);
        } else {
            this.C0(object);
        }
    }

    public final void resumeWith(Object object) {
        Object object2 = tl2_2.a(object);
        if (object2 != null) {
            object = new m00_0((Throwable)object2, false);
        }
        object = this.m0(object);
        object2 = y61.b;
        if (object == object2) {
            return;
        }
        this.t(object);
    }
}

