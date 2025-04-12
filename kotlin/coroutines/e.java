/*
 * Decompiled with CFR 0.152.
 */
package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$Element;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.coroutines.c;
import kotlin.coroutines.d;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class e
extends Lambda
implements Function2 {
    public static final e c;

    static {
        e e2;
        c = e2 = new Lambda(2);
    }

    public e() {
        super(2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext$Element object) {
        Intrinsics.checkNotNullParameter(coroutineContext, "acc");
        Intrinsics.checkNotNullParameter(object, "element");
        Object object2 = object.getKey();
        coroutineContext = coroutineContext.minusKey((CoroutineContext$a)object2);
        object2 = f.a;
        if (coroutineContext == object2) return object;
        Object object3 = d.n0;
        d d2 = (d)coroutineContext.get((CoroutineContext$a)object3);
        if (d2 == null) {
            object2 = new c(coroutineContext, (CoroutineContext$Element)object);
            return object2;
        }
        if ((coroutineContext = coroutineContext.minusKey((CoroutineContext$a)object3)) == object2) {
            coroutineContext = new c((CoroutineContext)object, d2);
            return coroutineContext;
        }
        object3 = new c(coroutineContext, (CoroutineContext$Element)object);
        return new c((CoroutineContext)object3, d2);
    }
}

