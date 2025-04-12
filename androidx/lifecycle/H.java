/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$lambda$2$$inlined$Runnable$1;
import androidx.lifecycle.f_0;
import androidx.lifecycle.g_0;
import androidx.lifecycle.i;
import androidx.lifecycle.i$b;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

public final class H {
    public static final Object a(i object, i$b object2, boolean bl2, d21_0 d21_02, Function0 function0, f80_0 f80_02) {
        Object object3 = zj1_2.b(f80_02);
        int n3 = 1;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(n3, (f80_0)object3);
        cancellableContinuationImpl.r();
        object3 = new g_0((i$b)((Object)object2), (i)object, cancellableContinuationImpl, function0);
        if (bl2) {
            object2 = f.a;
            WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$lambda$2$$inlined$Runnable$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$lambda$2$$inlined$Runnable$1 = new WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$lambda$2$$inlined$Runnable$1((i)object, (g_0)object3);
            d21_02.J0((CoroutineContext)object2, withLifecycleStateKt$suspendWithStateAtLeastUnchecked$lambda$2$$inlined$Runnable$1);
        } else {
            ((i)object).a((lu1)object3);
        }
        object2 = new f_0(d21_02, (i)object, (g_0)object3);
        cancellableContinuationImpl.x((Function1)object2);
        object = cancellableContinuationImpl.q();
        object2 = j90_0.COROUTINE_SUSPENDED;
        if (object == object2) {
            object2 = "frame";
            Intrinsics.checkNotNullParameter(f80_02, (String)object2);
        }
        return object;
    }
}

