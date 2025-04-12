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
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper$Stub;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbhv;
import com.google.android.gms.internal.ads.zzbrs;
import com.google.android.gms.internal.ads.zzbru;
import java.util.List;

public abstract class zzbrt
extends zzbae
implements zzbru {
    public zzbrt() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    public static zzbru zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        boolean bl2 = iInterface instanceof zzbru;
        if (bl2) {
            return (zzbru)iInterface;
        }
        iInterface = new zzbrs(iBinder);
        return iInterface;
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        switch (n3) {
            default: {
                return false;
            }
            case 25: {
                float f5 = this.zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(f5);
                break;
            }
            case 24: {
                float f6 = this.zzh();
                parcel2.writeNoException();
                parcel2.writeFloat(f6);
                break;
            }
            case 23: {
                float f7 = this.zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(f7);
                break;
            }
            case 22: {
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                this.zzz(iObjectWrapper);
                parcel2.writeNoException();
                break;
            }
            case 21: {
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapper2 = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapper3 = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                this.zzy(iObjectWrapper, iObjectWrapper2, iObjectWrapper3);
                parcel2.writeNoException();
                break;
            }
            case 20: {
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                this.zzw(iObjectWrapper);
                parcel2.writeNoException();
                break;
            }
            case 19: {
                this.zzx();
                parcel2.writeNoException();
                break;
            }
            case 18: {
                n3 = (int)(this.zzA() ? 1 : 0);
                parcel2.writeNoException();
                parcel2.writeInt(n3);
                break;
            }
            case 17: {
                n3 = (int)(this.zzB() ? 1 : 0);
                parcel2.writeNoException();
                parcel2.writeInt(n3);
                break;
            }
            case 16: {
                Bundle bundle = this.zzi();
                parcel2.writeNoException();
                zzbaf.zze(parcel2, (Parcelable)bundle);
                break;
            }
            case 15: {
                IObjectWrapper iObjectWrapper = this.zzo();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, iObjectWrapper);
                break;
            }
            case 14: {
                IObjectWrapper iObjectWrapper = this.zzn();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, iObjectWrapper);
                break;
            }
            case 13: {
                IObjectWrapper iObjectWrapper = this.zzm();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, iObjectWrapper);
                break;
            }
            case 12: {
                parcel2.writeNoException();
                n3 = 0;
                float f8 = 0.0f;
                Object var6_16 = null;
                zzbaf.zzf(parcel2, null);
                break;
            }
            case 11: {
                zzdq zzdq2 = this.zzj();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzdq2);
                break;
            }
            case 10: {
                String string2 = this.zzt();
                parcel2.writeNoException();
                parcel2.writeString(string2);
                break;
            }
            case 9: {
                String string3 = this.zzu();
                parcel2.writeNoException();
                parcel2.writeString(string3);
                break;
            }
            case 8: {
                double d2 = this.zze();
                parcel2.writeNoException();
                parcel2.writeDouble(d2);
                break;
            }
            case 7: {
                String string4 = this.zzp();
                parcel2.writeNoException();
                parcel2.writeString(string4);
                break;
            }
            case 6: {
                String string5 = this.zzr();
                parcel2.writeNoException();
                parcel2.writeString(string5);
                break;
            }
            case 5: {
                zzbhv zzbhv2 = this.zzl();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzbhv2);
                break;
            }
            case 4: {
                String string6 = this.zzq();
                parcel2.writeNoException();
                parcel2.writeString(string6);
                break;
            }
            case 3: {
                List list = this.zzv();
                parcel2.writeNoException();
                parcel2.writeList(list);
                break;
            }
            case 2: {
                String string7 = this.zzs();
                parcel2.writeNoException();
                parcel2.writeString(string7);
            }
        }
        return true;
    }
}

