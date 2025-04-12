/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import androidx.lifecycle.g_0;
import androidx.lifecycle.i;

public final class WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$lambda$2$$inlined$Runnable$1
implements Runnable {
    public final /* synthetic */ i a;
    public final /* synthetic */ g_0 b;

    public WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$lambda$2$$inlined$Runnable$1(i i3, g_0 g_02) {
        this.a = i3;
        this.b = g_02;
    }

    public final void run() {
        i i3 = this.a;
        g_0 g_02 = this.b;
        i3.a(g_02);
    }
}

