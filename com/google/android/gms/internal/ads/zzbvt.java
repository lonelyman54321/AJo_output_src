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
import com.google.android.gms.internal.ads.zzbvv;
import java.util.List;

public final class zzbvt
extends zzbad
implements zzbvv {
    public zzbvt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    public final void zze(String string2) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        this.zzdc(2, parcel);
    }

    public final void zzf(List list) {
        Parcel parcel = this.zza();
        parcel.writeTypedList(list);
        this.zzdc(1, parcel);
    }
}

