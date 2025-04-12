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
import com.google.android.play.core.assetpacks.bf;
import com.google.android.play.core.assetpacks.dd;
import com.google.android.play.core.assetpacks.er;

final class av
extends am {
    private final dd c;
    private final er d;
    private final bf e;

    public av(ax ax2, TaskCompletionSource taskCompletionSource, dd dd2, er er2, bf bf2) {
        super(ax2, taskCompletionSource);
        this.c = dd2;
        this.d = er2;
        this.e = bf2;
    }

    public final void m(Bundle object, Bundle object2) {
        super.m((Bundle)object, (Bundle)object2);
        object2 = this.c;
        er er2 = this.d;
        bf bf2 = this.e;
        TaskCompletionSource taskCompletionSource = this.a;
        object = AssetPackStates.b(object, (dd)object2, er2, bf2);
        taskCompletionSource.trySetResult(object);
    }
}

