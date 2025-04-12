/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.ServiceConnection
 *  android.os.IBinder
 */
package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.ads.zzfwv;
import com.google.android.gms.internal.ads.zzfxc;
import com.google.android.gms.internal.ads.zzfxd;
import com.google.android.gms.internal.ads.zzfxe;
import com.google.android.gms.internal.ads.zzfxg;

final class zzfxf
implements ServiceConnection {
    final /* synthetic */ zzfxg zza;

    public /* synthetic */ zzfxf(zzfxg zzfxg2, zzfxe zzfxe2) {
        this.zza = zzfxg2;
    }

    public final void onServiceConnected(ComponentName object, IBinder iBinder) {
        zzfwv zzfwv2 = zzfxg.zzf(this.zza);
        Object[] objectArray = new Object[]{object};
        zzfwv2.zzc("ServiceConnectionImpl.onServiceConnected(%s)", objectArray);
        object = new zzfxc(this, iBinder);
        this.zza.zzc().post((Runnable)object);
    }

    public final void onServiceDisconnected(ComponentName object) {
        zzfwv zzfwv2 = zzfxg.zzf(this.zza);
        Object[] objectArray = new Object[]{object};
        zzfwv2.zzc("ServiceConnectionImpl.onServiceDisconnected(%s)", objectArray);
        object = new zzfxd(this);
        this.zza.zzc().post((Runnable)object);
    }
}

