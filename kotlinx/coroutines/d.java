/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.i;
import kotlinx.coroutines.i$a;

public final class d {
    public static final c80 a(CoroutineContext coroutineContext) {
        Object object = i$a.a;
        if ((object = coroutineContext.get((CoroutineContext$a)object)) == null) {
            object = mm0.a();
            coroutineContext = coroutineContext.plus((CoroutineContext)object);
        }
        c80 c802 = new c80(coroutineContext);
        return c802;
    }

    public static final void b(i90_0 object, CancellationException illegalStateException) {
        Object object2 = object.getCoroutineContext();
        i$a i$a = i$a.a;
        if ((object2 = (i)object2.get(i$a)) != null) {
            object2.d((CancellationException)illegalStateException);
            return;
        }
        object2 = new StringBuilder("Scope cannot be cancelled because it does not have a job: ");
        ((StringBuilder)object2).append(object);
        object = ((StringBuilder)object2).toString().toString();
        illegalStateException = new IllegalStateException((String)object);
        throw illegalStateException;
    }

    public static final Object c(Function2 object, f80_0 f80_02) {
        CoroutineContext coroutineContext = f80_02.getContext();
        Object object2 = new ut2_2(f80_02, coroutineContext);
        if ((object = nv3_0.a(object2, object2, (Function2)object)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            object2 = "frame";
            Intrinsics.checkNotNullParameter(f80_02, (String)object2);
        }
        return object;
    }

    public static final boolean d(i90_0 object) {
        object = object.getCoroutineContext();
        i$a i$a = i$a.a;
        boolean bl2 = (object = (i)object.get(i$a)) != null ? object.isActive() : true;
        return bl2;
    }
}

