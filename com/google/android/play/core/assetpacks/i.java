/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.assetpacks.l;

public final class i
implements Runnable {
    public final /* synthetic */ l a;
    public final /* synthetic */ String b;
    public final /* synthetic */ TaskCompletionSource c;

    public /* synthetic */ i(l l2, String string2, TaskCompletionSource taskCompletionSource) {
        this.a = l2;
        this.b = string2;
        this.c = taskCompletionSource;
    }

    public final void run() {
        l l2 = this.a;
        String string2 = this.b;
        TaskCompletionSource taskCompletionSource = this.c;
        l.d(l2, string2, taskCompletionSource);
    }
}

