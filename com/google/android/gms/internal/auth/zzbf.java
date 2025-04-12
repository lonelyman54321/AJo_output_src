/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
package com.google.android.gms.internal.auth;

import android.os.Parcel;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.internal.auth.zzb;
import com.google.android.gms.internal.auth.zzbg;
import com.google.android.gms.internal.auth.zzc;

public abstract class zzbf
extends zzb
implements zzbg {
    public zzbf() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    public final boolean zza(int n3, Parcel parcel, Parcel parcel2, int n4) {
        n4 = 1;
        if (n3 != n4) {
            int n7 = 2;
            if (n3 != n7) {
                return false;
            }
            String string2 = parcel.readString();
            zzc.zzb(parcel);
            this.zzc(string2);
        } else {
            Object object = ProxyResponse.CREATOR;
            object = (ProxyResponse)zzc.zza(parcel, object);
            zzc.zzb(parcel);
            this.zzb((ProxyResponse)object);
        }
        parcel2.writeNoException();
        return n4 != 0;
    }
}

