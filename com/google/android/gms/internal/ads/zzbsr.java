/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper$Stub;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbrn;
import com.google.android.gms.internal.ads.zzbro;
import com.google.android.gms.internal.ads.zzbss;

public abstract class zzbsr
extends zzbae
implements zzbss {
    public zzbsr() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        n4 = 1;
        if (n3 != n4) {
            int n7 = 2;
            if (n3 != n7) {
                n7 = 3;
                if (n3 != n7) {
                    n7 = 4;
                    if (n3 != n7) {
                        return false;
                    }
                    zzbro zzbro2 = zzbrn.zzb(parcel.readStrongBinder());
                    zzbaf.zzc(parcel);
                    this.zzh(zzbro2);
                } else {
                    Object object = zze.CREATOR;
                    object = (zze)zzbaf.zza(parcel, object);
                    zzbaf.zzc(parcel);
                    this.zzf((zze)object);
                }
            } else {
                String string2 = parcel.readString();
                zzbaf.zzc(parcel);
                this.zze(string2);
            }
        } else {
            IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
            zzbaf.zzc(parcel);
            this.zzg(iObjectWrapper);
        }
        parcel2.writeNoException();
        return n4 != 0;
    }
}

