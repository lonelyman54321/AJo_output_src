/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder$DeathRecipient
 */
package com.google.android.play.core.assetpacks.internal;

import android.os.IBinder;
import com.google.android.play.core.assetpacks.internal.z;

public final class q
implements IBinder.DeathRecipient {
    public final /* synthetic */ z a;

    public /* synthetic */ q(z z5) {
        this.a = z5;
    }

    public final void binderDied() {
        z.j(this.a);
    }
}

