/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.ParcelFileDescriptor
 */
package com.google.android.gms.internal.icing;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.icing.zzac;
import com.google.android.gms.internal.icing.zzb;
import com.google.android.gms.internal.icing.zzc;
import com.google.android.gms.internal.icing.zzo;

public abstract class zzab
extends zzb
implements zzac {
    public zzab() {
        super("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
    }

    public final boolean zza(int n3, Parcel parcel, Parcel parcel2, int n4) {
        int n7 = 1;
        if (n3 != n7) {
            n4 = 2;
            if (n3 != n4) {
                n4 = 4;
                if (n3 != n4) {
                    return false;
                }
                Object object = zzo.CREATOR;
                object = (zzo)zzc.zza(parcel, object);
            } else {
                Object object = Status.CREATOR;
                object = (Status)zzc.zza(parcel, object);
                object = ParcelFileDescriptor.CREATOR;
                object = (ParcelFileDescriptor)zzc.zza(parcel, object);
            }
        } else {
            Object object = Status.CREATOR;
            object = (Status)zzc.zza(parcel, object);
            this.zzb((Status)object);
        }
        return n7;
    }
}

