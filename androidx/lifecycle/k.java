/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import androidx.lifecycle.i;
import androidx.lifecycle.i$b;
import androidx.lifecycle.l;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.i$a;

public final class k
extends qg3_2
implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ l b;

    public k(l l2, f80_0 f80_02) {
        this.b = l2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        l l2 = this.b;
        k k2 = new k(l2, f80_02);
        k2.a = object;
        return k2;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (k)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((k)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = (i90_0)this.a;
        object2 = this.b;
        i$b i$b = ((l)object2).a.b();
        i$b i$b2 = i$b.INITIALIZED;
        int n3 = i$b.compareTo(i$b2);
        if (n3 >= 0) {
            object = ((l)object2).a;
            ((i)object).a((lu1)object2);
        } else {
            object = object.getCoroutineContext();
            object2 = i$a.a;
            if ((object = (kotlinx.coroutines.i)object.get((CoroutineContext$a)object2)) != null) {
                object2 = null;
                object.d(null);
            }
        }
        return Unit.a;
    }
}

