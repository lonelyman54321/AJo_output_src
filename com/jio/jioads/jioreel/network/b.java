/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.jioreel.network;

import com.jio.jioads.jioreel.network.a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class b {
    public final ExecutorService a;

    public b() {
        ExecutorService executorService;
        this.a = executorService = Executors.newSingleThreadExecutor();
    }

    public final void a(int n3, String string2, Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "networkResult");
        a a2 = new a(this, string2, n3, function1);
        ExecutorService executorService = this.a;
        if (executorService != null) {
            executorService.submit(a2);
        }
    }
}

