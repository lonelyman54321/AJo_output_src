/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.assetpacks.am;
import com.google.android.play.core.assetpacks.ax;
import java.util.List;

final class ap
extends am {
    final /* synthetic */ ax c;

    public ap(ax ax2, TaskCompletionSource taskCompletionSource) {
        this.c = ax2;
        super(ax2, taskCompletionSource);
    }

    public final void g(List list) {
        super.g(list);
        TaskCompletionSource taskCompletionSource = this.a;
        list = ax.w(this.c, list);
        taskCompletionSource.trySetResult(list);
    }
}

