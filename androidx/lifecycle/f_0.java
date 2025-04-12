/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2$invoke$$inlined$Runnable$1;
import androidx.lifecycle.g_0;
import androidx.lifecycle.i;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.c;

/*
 * Renamed from androidx.lifecycle.F
 */
public final class f_0
extends Lambda
implements Function1 {
    public final /* synthetic */ c c;
    public final /* synthetic */ i d;
    public final /* synthetic */ g_0 e;

    public f_0(d21_0 d21_02, i i3, g_0 g_02) {
        this.c = d21_02;
        this.d = i3;
        this.e = g_02;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Throwable)object;
        object = f.a;
        c c2 = this.c;
        boolean bl2 = c2.L0((CoroutineContext)object);
        g_0 g_02 = this.e;
        i i3 = this.d;
        if (bl2) {
            WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2$invoke$$inlined$Runnable$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2$invoke$$inlined$Runnable$1 = new WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2$invoke$$inlined$Runnable$1(i3, g_02);
            c2.J0((CoroutineContext)object, withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2$invoke$$inlined$Runnable$1);
        } else {
            i3.c(g_02);
        }
        return Unit.a;
    }
}

