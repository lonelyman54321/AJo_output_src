/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 */
package com.google.android.gms.tagmanager;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.gtm.zzar;
import com.google.android.gms.tagmanager.zzcb;
import java.util.Map;

public final class zzbz
extends zzar
implements zzcb {
    public zzbz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.ICustomEvaluatorProxy");
    }

    public final String zzb(String string2, Map object) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        parcel.writeMap((Map)object);
        string2 = this.zzk(2, parcel);
        object = string2.readString();
        string2.recycle();
        return object;
    }

    public final void zzc(String string2, Map map2) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        parcel.writeMap(map2);
        this.zzl(1, parcel);
    }
}

