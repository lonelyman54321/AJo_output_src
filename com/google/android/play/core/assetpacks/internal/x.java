/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.ServiceConnection
 *  android.os.IBinder
 */
package com.google.android.play.core.assetpacks.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.play.core.assetpacks.internal.o;
import com.google.android.play.core.assetpacks.internal.v;
import com.google.android.play.core.assetpacks.internal.w;
import com.google.android.play.core.assetpacks.internal.y;
import com.google.android.play.core.assetpacks.internal.z;

final class x
implements ServiceConnection {
    final /* synthetic */ z a;

    public /* synthetic */ x(z z5, y y5) {
        this.a = z5;
    }

    public final void onServiceConnected(ComponentName object, IBinder iBinder) {
        o o3 = z.f(this.a);
        Object[] objectArray = new Object[]{object};
        o3.d("ServiceConnectionImpl.onServiceConnected(%s)", objectArray);
        object = new v(this, iBinder);
        this.a.c().post((Runnable)object);
    }

    public final void onServiceDisconnected(ComponentName object) {
        o o3 = z.f(this.a);
        Object[] objectArray = new Object[]{object};
        o3.d("ServiceConnectionImpl.onServiceDisconnected(%s)", objectArray);
        object = new w(this);
        this.a.c().post((Runnable)object);
    }
}

