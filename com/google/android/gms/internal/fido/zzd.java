/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
package com.google.android.gms.internal.fido;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.fido.zzb;
import com.google.android.gms.internal.fido.zzc;
import com.google.android.gms.internal.fido.zze;

public abstract class zzd
extends zzb
implements zze {
    public zzd() {
        super("com.google.android.gms.fido.fido2.api.IBooleanCallback");
    }

    public final boolean zza(int n3, Parcel parcel, Parcel parcel2, int n4) {
        n4 = 0;
        int n7 = 1;
        if (n3 != n7) {
            int n8 = 2;
            if (n3 != n8) {
                return false;
            }
            Object object = Status.CREATOR;
            object = (Status)zzc.zza(parcel, object);
            zzc.zzc(parcel);
            this.zzc((Status)object);
        } else {
            n3 = zzc.zza;
            n3 = parcel.readInt();
            zzc.zzc(parcel);
            if (n3 != 0) {
                n4 = 1;
            }
            this.zzb(n4 != 0);
        }
        parcel2.writeNoException();
        return n7;
    }
}

