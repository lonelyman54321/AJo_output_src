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
import com.google.android.gms.internal.ads.zzbnu;
import java.util.List;

public final class zzbns
extends zzbad
implements zzbnu {
    public zzbns(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    public final void zzb(List list) {
        Parcel parcel = this.zza();
        parcel.writeTypedList(list);
        this.zzdc(1, parcel);
    }
}

