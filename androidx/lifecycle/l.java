/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import androidx.lifecycle.i;
import androidx.lifecycle.i$a;
import androidx.lifecycle.i$b;
import androidx.lifecycle.n;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.internal.Intrinsics;

public final class l
extends iu1_0
implements n {
    public final i a;
    public final CoroutineContext b;

    public l(i object, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(object, "lifecycle");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.a = object;
        this.b = coroutineContext;
        object = ((i)object).b();
        i$b i$b = i$b.DESTROYED;
        if (object == i$b) {
            object = kotlinx.coroutines.i$a.a;
            if ((object = (kotlinx.coroutines.i)coroutineContext.get((CoroutineContext$a)object)) != null) {
                coroutineContext = null;
                object.d(null);
            }
        }
    }

    public final i b() {
        return this.a;
    }

    public final CoroutineContext getCoroutineContext() {
        return this.b;
    }

    public final void k(mu1_1 object, i$a object2) {
        Intrinsics.checkNotNullParameter(object, "source");
        Intrinsics.checkNotNullParameter(object2, "event");
        object = this.a;
        object2 = ((i)object).b();
        i$b i$b = i$b.DESTROYED;
        int n3 = ((Enum)object2).compareTo(i$b);
        if (n3 <= 0) {
            ((i)object).c(this);
            object = kotlinx.coroutines.i$a.a;
            object2 = this.b;
            object = (kotlinx.coroutines.i)object2.get((CoroutineContext$a)object);
            if (object != null) {
                n3 = 0;
                object2 = null;
                object.d(null);
            }
        }
    }
}

