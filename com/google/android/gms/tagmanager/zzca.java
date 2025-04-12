/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
package com.google.android.gms.tagmanager;

import android.os.Parcel;
import com.google.android.gms.internal.gtm.zzas;
import com.google.android.gms.internal.gtm.zzat;
import com.google.android.gms.tagmanager.zzcb;
import java.util.HashMap;

public abstract class zzca
extends zzas
implements zzcb {
    public zzca() {
        super("com.google.android.gms.tagmanager.ICustomEvaluatorProxy");
    }

    public final boolean zza(int n3, Parcel parcel, Parcel parcel2, int n4) {
        n4 = 1;
        if (n3 != n4) {
            int n7 = 2;
            if (n3 != n7) {
                return false;
            }
            String string2 = parcel.readString();
            HashMap hashMap = zzat.zzb(parcel);
            zzat.zzc(parcel);
            string2 = this.zzb(string2, hashMap);
            parcel2.writeNoException();
            parcel2.writeString(string2);
        } else {
            String string3 = parcel.readString();
            HashMap hashMap = zzat.zzb(parcel);
            zzat.zzc(parcel);
            this.zzc(string3, hashMap);
            parcel2.writeNoException();
        }
        return n4 != 0;
    }
}

