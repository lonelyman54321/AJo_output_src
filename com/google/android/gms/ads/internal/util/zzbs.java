/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import com.google.android.gms.ads.internal.offline.buffering.zza;
import com.google.android.gms.ads.internal.util.zzbt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper$Stub;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;

public abstract class zzbs
extends zzbae
implements zzbt {
    public zzbs() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        n4 = 1;
        if (n3 != n4) {
            int n7 = 2;
            if (n3 != n7) {
                n7 = 3;
                if (n3 != n7) {
                    return false;
                }
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                Object object = zza.CREATOR;
                object = (zza)zzbaf.zza(parcel, object);
                zzbaf.zzc(parcel);
                n3 = (int)(this.zzg(iObjectWrapper, (zza)object) ? 1 : 0);
                parcel2.writeNoException();
                parcel2.writeInt(n3);
            } else {
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                this.zze(iObjectWrapper);
                parcel2.writeNoException();
            }
        } else {
            IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            zzbaf.zzc(parcel);
            n3 = (int)(this.zzf(iObjectWrapper, string2, string3) ? 1 : 0);
            parcel2.writeNoException();
            parcel2.writeInt(n3);
        }
        return n4 != 0;
    }
}

