/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.ServiceConnection
 *  android.os.IBinder
 */
package com.google.android.play.core.review.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.play.core.review.internal.zzi;
import com.google.android.play.core.review.internal.zzp;
import com.google.android.play.core.review.internal.zzq;
import com.google.android.play.core.review.internal.zzs;
import com.google.android.play.core.review.internal.zzt;

final class zzr
implements ServiceConnection {
    final /* synthetic */ zzt zza;

    public /* synthetic */ zzr(zzt zzt2, zzs zzs2) {
        this.zza = zzt2;
    }

    public final void onServiceConnected(ComponentName object, IBinder iBinder) {
        zzi zzi2 = zzt.zzf(this.zza);
        Object[] objectArray = new Object[]{object};
        zzi2.zzc("ServiceConnectionImpl.onServiceConnected(%s)", objectArray);
        object = new zzp(this, iBinder);
        this.zza.zzc().post((Runnable)object);
    }

    public final void onServiceDisconnected(ComponentName object) {
        zzi zzi2 = zzt.zzf(this.zza);
        Object[] objectArray = new Object[]{object};
        zzi2.zzc("ServiceConnectionImpl.onServiceDisconnected(%s)", objectArray);
        object = new zzq(this);
        this.zza.zzc().post((Runnable)object);
    }
}

