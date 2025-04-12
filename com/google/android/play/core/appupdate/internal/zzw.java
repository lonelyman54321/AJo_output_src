/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.ServiceConnection
 *  android.os.IBinder
 */
package com.google.android.play.core.appupdate.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.play.core.appupdate.internal.zzm;
import com.google.android.play.core.appupdate.internal.zzt;
import com.google.android.play.core.appupdate.internal.zzu;
import com.google.android.play.core.appupdate.internal.zzv;
import com.google.android.play.core.appupdate.internal.zzx;

final class zzw
implements ServiceConnection {
    final /* synthetic */ zzx zza;

    public /* synthetic */ zzw(zzx zzx2, zzv zzv2) {
        this.zza = zzx2;
    }

    public final void onServiceConnected(ComponentName object, IBinder iBinder) {
        Object object2 = zzx.zzf(this.zza);
        Object[] objectArray = new Object[]{object};
        ((zzm)object2).zzd("ServiceConnectionImpl.onServiceConnected(%s)", objectArray);
        object = this.zza;
        object2 = new zzt(this, iBinder);
        ((zzx)object).zzc().post((Runnable)object2);
    }

    public final void onServiceDisconnected(ComponentName object) {
        Object object2 = zzx.zzf(this.zza);
        Object[] objectArray = new Object[]{object};
        ((zzm)object2).zzd("ServiceConnectionImpl.onServiceDisconnected(%s)", objectArray);
        object = this.zza;
        object2 = new zzu(this);
        ((zzx)object).zzc().post((Runnable)object2);
    }
}

