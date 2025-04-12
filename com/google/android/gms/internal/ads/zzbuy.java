/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.offline.buffering.zza;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper$Stub;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbux;
import com.google.android.gms.internal.ads.zzbuz;

public abstract class zzbuy
extends zzbae
implements zzbuz {
    public zzbuy() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static zzbuz zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        boolean bl2 = iInterface instanceof zzbuz;
        if (bl2) {
            return (zzbuz)iInterface;
        }
        iInterface = new zzbux(iBinder);
        return iInterface;
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        switch (n3) {
            default: {
                return false;
            }
            case 6: {
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                Object object = zza.CREATOR;
                object = (zza)zzbaf.zza(parcel, object);
                zzbaf.zzc(parcel);
                this.zzj(iObjectWrapper, (zza)object);
                break;
            }
            case 5: {
                String[] stringArray = parcel.createStringArray();
                int[] nArray = parcel.createIntArray();
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                this.zzf(stringArray, nArray, iObjectWrapper);
                break;
            }
            case 4: {
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                this.zzg(iObjectWrapper);
                break;
            }
            case 3: {
                this.zzh();
                break;
            }
            case 2: {
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                zzbaf.zzc(parcel);
                this.zzi(iObjectWrapper, string2, string3);
                break;
            }
            case 1: {
                Parcelable.Creator creator = Intent.CREATOR;
                creator = (Intent)zzbaf.zza(parcel, creator);
                zzbaf.zzc(parcel);
                this.zze((Intent)creator);
            }
        }
        parcel2.writeNoException();
        return true;
    }
}

