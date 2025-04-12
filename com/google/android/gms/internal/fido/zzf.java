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
import com.google.android.gms.internal.fido.zzg;
import java.util.ArrayList;

public abstract class zzf
extends zzb
implements zzg {
    public zzf() {
        super("com.google.android.gms.fido.fido2.api.ICredentialListCallback");
    }

    public final boolean zza(int n3, Parcel parcel, Parcel parcel2, int n4) {
        n4 = 1;
        if (n3 != n4) {
            int n7 = 2;
            if (n3 != n7) {
                return false;
            }
            Object object = Status.CREATOR;
            object = (Status)zzc.zza(parcel, object);
            zzc.zzc(parcel);
            this.zzc((Status)object);
        } else {
            ArrayList arrayList = zzc.zzb(parcel);
            zzc.zzc(parcel);
            this.zzb(arrayList);
        }
        parcel2.writeNoException();
        return n4 != 0;
    }
}

