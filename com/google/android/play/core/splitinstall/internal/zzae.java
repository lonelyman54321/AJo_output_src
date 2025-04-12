/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.ServiceConnection
 *  android.os.IBinder
 */
package com.google.android.play.core.splitinstall.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.play.core.splitinstall.internal.zzab;
import com.google.android.play.core.splitinstall.internal.zzac;
import com.google.android.play.core.splitinstall.internal.zzad;
import com.google.android.play.core.splitinstall.internal.zzaf;
import com.google.android.play.core.splitinstall.internal.zzu;

final class zzae
implements ServiceConnection {
    final /* synthetic */ zzaf zza;

    public /* synthetic */ zzae(zzaf zzaf2, zzad zzad2) {
        this.zza = zzaf2;
    }

    public final void onServiceConnected(ComponentName object, IBinder iBinder) {
        Object object2 = zzaf.zzf(this.zza);
        Object[] objectArray = new Object[]{object};
        ((zzu)object2).zzd("ServiceConnectionImpl.onServiceConnected(%s)", objectArray);
        object = this.zza;
        object2 = new zzab(this, iBinder);
        ((zzaf)object).zzc().post((Runnable)object2);
    }

    public final void onServiceDisconnected(ComponentName object) {
        Object object2 = zzaf.zzf(this.zza);
        Object[] objectArray = new Object[]{object};
        ((zzu)object2).zzd("ServiceConnectionImpl.onServiceDisconnected(%s)", objectArray);
        object = this.zza;
        object2 = new zzac(this);
        ((zzaf)object).zzc().post((Runnable)object2);
    }
}

