/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 */
package com.google.android.play.core.assetpacks.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.play.core.assetpacks.internal.e;
import com.google.android.play.core.assetpacks.internal.p;
import com.google.android.play.core.assetpacks.internal.x;
import com.google.android.play.core.assetpacks.internal.z;
import java.util.Iterator;

final class v
extends p {
    final /* synthetic */ IBinder a;
    final /* synthetic */ x b;

    public v(x x5, IBinder iBinder) {
        this.a = iBinder;
        this.b = x5;
    }

    public final void a() {
        Iterator iterator = e.b(this.a);
        z.n(this.b.a, (IInterface)iterator);
        z.r(this.b.a);
        iterator = this.b.a;
        boolean bl2 = false;
        Runnable runnable2 = null;
        z.m((z)((Object)iterator), false);
        iterator = z.h(this.b.a).iterator();
        while (bl2 = iterator.hasNext()) {
            runnable2 = (Runnable)iterator.next();
            runnable2.run();
        }
        z.h(this.b.a).clear();
    }
}

