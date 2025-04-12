/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  android.os.RemoteException
 */
package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.common.zzj;
import com.google.android.gms.common.zzk;
import com.google.android.gms.common.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzs
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final String zza;
    private final zzj zzb;
    private final boolean zzc;
    private final boolean zzd;

    static {
        zzt zzt2 = new zzt();
        CREATOR = zzt2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public zzs(String object, IBinder object2, boolean bl2, boolean bl3) {
        void var4_9;
        void var3_8;
        this.zza = object;
        object = null;
        if (object2 != null) {
            void var2_7;
            block5: {
                IObjectWrapper iObjectWrapper;
                block4: {
                    try {
                        zzaa zzaa2 = zzz.zzg(object2);
                        iObjectWrapper = zzaa2.zzd();
                        if (iObjectWrapper != null) break block4;
                        Object var2_5 = null;
                        break block5;
                    }
                    catch (RemoteException remoteException) {}
                }
                byte[] byArray = (byte[])ObjectWrapper.unwrap(iObjectWrapper);
            }
            if (var2_7 != null) {
                object = new zzk((byte[])var2_7);
            }
        }
        this.zzb = object;
        this.zzc = var3_8;
        this.zzd = var4_9;
    }

    public zzs(String string2, zzj zzj2, boolean bl2, boolean bl3) {
        this.zza = string2;
        this.zzb = zzj2;
        this.zzc = bl2;
        this.zzd = bl3;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Object object = this.zza;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        boolean bl2 = true;
        SafeParcelWriter.writeString(parcel, (int)(bl2 ? 1 : 0), (String)object, false);
        object = this.zzb;
        if (object == null) {
            object = null;
        }
        SafeParcelWriter.writeIBinder(parcel, 2, (IBinder)object, false);
        bl2 = this.zzc;
        SafeParcelWriter.writeBoolean(parcel, 3, bl2);
        bl2 = this.zzd;
        SafeParcelWriter.writeBoolean(parcel, 4, bl2);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

