/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.assetpacks.ed;
import java.util.List;

public final class ea
implements Runnable {
    public final /* synthetic */ ed a;
    public final /* synthetic */ List b;
    public final /* synthetic */ TaskCompletionSource c;

    public /* synthetic */ ea(ed ed2, List list, TaskCompletionSource taskCompletionSource) {
        this.a = ed2;
        this.b = list;
        this.c = taskCompletionSource;
    }

    public final void run() {
        ed ed2 = this.a;
        List list = this.b;
        TaskCompletionSource taskCompletionSource = this.c;
        ed.n(ed2, list, taskCompletionSource);
    }
}

