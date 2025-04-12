/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 */
package com.google.android.gms.internal.gtm;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.gtm.zzar;
import java.util.List;
import java.util.Map;

public final class zzel
extends zzar
implements IInterface {
    public zzel(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.analytics.internal.IAnalyticsService");
    }

    public final void zze() {
        Parcel parcel = this.zza();
        this.zzl(2, parcel);
    }

    public final void zzf(Map map2, long l2, String string2, List list) {
        Parcel parcel = this.zza();
        parcel.writeMap(map2);
        parcel.writeLong(l2);
        parcel.writeString(string2);
        parcel.writeTypedList(list);
        this.zzl(1, parcel);
    }
}

