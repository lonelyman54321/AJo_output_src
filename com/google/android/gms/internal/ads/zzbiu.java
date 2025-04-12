/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 */
package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbim;
import com.google.android.gms.internal.ads.zzbiw;

public final class zzbiu
extends zzbad
implements zzbiw {
    public zzbiu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    public final void zze(zzbim zzbim2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, zzbim2);
        this.zzdc(1, parcel);
    }
}

