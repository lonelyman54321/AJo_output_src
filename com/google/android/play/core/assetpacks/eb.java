/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.assetpacks.bf;
import com.google.android.play.core.assetpacks.ed;
import java.util.List;

public final class eb
implements Runnable {
    public final /* synthetic */ ed a;
    public final /* synthetic */ List b;
    public final /* synthetic */ bf c;
    public final /* synthetic */ TaskCompletionSource d;

    public /* synthetic */ eb(ed ed2, List list, bf bf2, TaskCompletionSource taskCompletionSource) {
        this.a = ed2;
        this.b = list;
        this.c = bf2;
        this.d = taskCompletionSource;
    }

    public final void run() {
        ed ed2 = this.a;
        List list = this.b;
        bf bf2 = this.c;
        TaskCompletionSource taskCompletionSource = this.d;
        ed.o(ed2, list, bf2, taskCompletionSource);
    }
}

