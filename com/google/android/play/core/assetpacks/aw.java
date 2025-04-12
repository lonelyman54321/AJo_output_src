/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.assetpacks.AssetPackStates;
import com.google.android.play.core.assetpacks.am;
import com.google.android.play.core.assetpacks.ax;
import com.google.android.play.core.assetpacks.dd;
import com.google.android.play.core.assetpacks.er;

final class aw
extends am {
    private final dd c;
    private final er d;

    public aw(ax ax2, TaskCompletionSource taskCompletionSource, dd dd2, er er2) {
        super(ax2, taskCompletionSource);
        this.c = dd2;
        this.d = er2;
    }

    public final void n(int n3, Bundle bundle) {
        super.n(n3, bundle);
        Object object = this.c;
        er er2 = this.d;
        TaskCompletionSource taskCompletionSource = this.a;
        object = AssetPackStates.a(bundle, (dd)object, er2);
        taskCompletionSource.trySetResult(object);
    }
}

