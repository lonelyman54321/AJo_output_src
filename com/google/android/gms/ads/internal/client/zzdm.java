/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 */
package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzdl;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;
import java.util.List;

public abstract class zzdm
extends zzbae
implements zzdn {
    public zzdm() {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    public static zzdn zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        boolean bl2 = iInterface instanceof zzdn;
        if (bl2) {
            return (zzdn)iInterface;
        }
        iInterface = new zzdl(iBinder);
        return iInterface;
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        switch (n3) {
            default: {
                return false;
            }
            case 6: {
                String string2 = this.zzh();
                parcel2.writeNoException();
                parcel2.writeString(string2);
                break;
            }
            case 5: {
                Bundle bundle = this.zze();
                parcel2.writeNoException();
                zzbaf.zze(parcel2, (Parcelable)bundle);
                break;
            }
            case 4: {
                zzu zzu2 = this.zzf();
                parcel2.writeNoException();
                zzbaf.zze(parcel2, zzu2);
                break;
            }
            case 3: {
                List list = this.zzj();
                parcel2.writeNoException();
                parcel2.writeTypedList(list);
                break;
            }
            case 2: {
                String string3 = this.zzi();
                parcel2.writeNoException();
                parcel2.writeString(string3);
                break;
            }
            case 1: {
                String string4 = this.zzg();
                parcel2.writeNoException();
                parcel2.writeString(string4);
            }
        }
        return true;
    }
}

