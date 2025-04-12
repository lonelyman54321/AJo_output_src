/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.zzo;
import com.google.android.gms.auth.api.accounttransfer.zzw;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth.zzat;
import com.google.android.gms.internal.auth.zzb;
import com.google.android.gms.internal.auth.zzc;

public abstract class zzas
extends zzb
implements zzat {
    public zzas() {
        super("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
    }

    public final boolean zza(int n3, Parcel parcel, Parcel object, int n4) {
        switch (n3) {
            default: {
                return false;
            }
            case 7: {
                Object object2 = DeviceMetaData.CREATOR;
                object2 = (DeviceMetaData)zzc.zza(parcel, object2);
                zzc.zzb(parcel);
                this.zzc((DeviceMetaData)object2);
                break;
            }
            case 6: {
                byte[] byArray = parcel.createByteArray();
                zzc.zzb(parcel);
                this.zzb(byArray);
                break;
            }
            case 5: {
                Object object3 = Status.CREATOR;
                object3 = (Status)zzc.zza(parcel, object3);
                zzc.zzb(parcel);
                this.zzd((Status)object3);
                break;
            }
            case 4: {
                this.zze();
                break;
            }
            case 3: {
                Object object4 = Status.CREATOR;
                object4 = (Status)zzc.zza(parcel, object4);
                object = zzo.CREATOR;
                object = (zzo)zzc.zza(parcel, (Parcelable.Creator)object);
                zzc.zzb(parcel);
                this.zzg((Status)object4, (zzo)object);
                break;
            }
            case 2: {
                Object object5 = Status.CREATOR;
                object5 = (Status)zzc.zza(parcel, object5);
                object = zzw.CREATOR;
                object = (zzw)zzc.zza(parcel, (Parcelable.Creator)object);
                zzc.zzb(parcel);
                this.zzf((Status)object5, (zzw)object);
                break;
            }
            case 1: {
                Object object6 = Status.CREATOR;
                object6 = (Status)zzc.zza(parcel, object6);
                zzc.zzb(parcel);
                this.zzh((Status)object6);
            }
        }
        return true;
    }
}

