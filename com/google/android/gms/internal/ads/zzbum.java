/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd$DisplayOpenMeasurement;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbip;

public final class zzbum
implements NativeCustomFormatAd$DisplayOpenMeasurement {
    private final zzbip zza;

    public zzbum(zzbip zzbip2) {
        this.zza = zzbip2;
        try {
            zzbip2.zzm();
            return;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("", remoteException);
            return;
        }
    }

    public final void setView(View object) {
        zzbip zzbip2;
        try {
            zzbip2 = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("", remoteException);
            return;
        }
        object = ObjectWrapper.wrap(object);
        zzbip2.zzp((IObjectWrapper)object);
    }

    public final boolean start() {
        zzbip zzbip2;
        try {
            zzbip2 = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("", remoteException);
            return false;
        }
        return zzbip2.zzt();
    }
}

