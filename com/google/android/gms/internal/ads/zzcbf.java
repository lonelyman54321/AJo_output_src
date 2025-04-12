/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 */
package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper$Stub;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbvu;
import com.google.android.gms.internal.ads.zzbvv;
import com.google.android.gms.internal.ads.zzbwe;
import com.google.android.gms.internal.ads.zzcbb;
import com.google.android.gms.internal.ads.zzcbd;
import com.google.android.gms.internal.ads.zzcbe;
import com.google.android.gms.internal.ads.zzcbg;
import com.google.android.gms.internal.ads.zzcbk;
import java.util.List;

public abstract class zzcbf
extends zzbae
implements zzcbg {
    public zzcbf() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static zzcbg zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        boolean bl2 = iInterface instanceof zzcbg;
        if (bl2) {
            return (zzcbg)iInterface;
        }
        iInterface = new zzcbe(iBinder);
        return iInterface;
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        Object object = null;
        switch (n3) {
            default: {
                return false;
            }
            case 11: {
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                object = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                String string2 = parcel.readString();
                IObjectWrapper iObjectWrapper2 = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                iObjectWrapper = this.zze(iObjectWrapper, (IObjectWrapper)object, string2, iObjectWrapper2);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, iObjectWrapper);
                break;
            }
            case 10: {
                Object object2 = Uri.CREATOR;
                object2 = parcel.createTypedArrayList(object2);
                object = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                zzbvv zzbvv2 = zzbvu.zzb(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                this.zzh((List)object2, (IObjectWrapper)object, zzbvv2);
                parcel2.writeNoException();
                break;
            }
            case 9: {
                Object object3 = Uri.CREATOR;
                object3 = parcel.createTypedArrayList(object3);
                object = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                zzbvv zzbvv3 = zzbvu.zzb(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                this.zzi((List)object3, (IObjectWrapper)object, zzbvv3);
                parcel2.writeNoException();
                break;
            }
            case 8: {
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                this.zzj(iObjectWrapper);
                parcel2.writeNoException();
                break;
            }
            case 7: {
                Object object4 = zzbwe.CREATOR;
                object4 = (zzbwe)zzbaf.zza(parcel, object4);
                zzbaf.zzc(parcel);
                this.zzg((zzbwe)object4);
                parcel2.writeNoException();
                break;
            }
            case 6: {
                Object object5 = Uri.CREATOR;
                object5 = parcel.createTypedArrayList(object5);
                object = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                zzbvv zzbvv4 = zzbvu.zzb(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                this.zzl((List)object5, (IObjectWrapper)object, zzbvv4);
                parcel2.writeNoException();
                break;
            }
            case 5: {
                Object object6 = Uri.CREATOR;
                object6 = parcel.createTypedArrayList(object6);
                object = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                zzbvv zzbvv5 = zzbvu.zzb(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                this.zzm((List)object6, (IObjectWrapper)object, zzbvv5);
                parcel2.writeNoException();
                break;
            }
            case 4: {
                IBinder iBinder = parcel.readStrongBinder();
                IObjectWrapper$Stub.asInterface(iBinder);
                zzbaf.zzc(parcel);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, null);
                break;
            }
            case 3: {
                IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                IBinder iBinder = parcel.readStrongBinder();
                IObjectWrapper$Stub.asInterface(iBinder);
                zzbaf.zzc(parcel);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, null);
                break;
            }
            case 2: {
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                this.zzk(iObjectWrapper);
                parcel2.writeNoException();
                break;
            }
            case 1: {
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                Object object7 = zzcbk.CREATOR;
                object7 = (zzcbk)zzbaf.zza(parcel, object7);
                IBinder iBinder = parcel.readStrongBinder();
                if (iBinder != null) {
                    object = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    boolean bl2 = object instanceof zzcbd;
                    object = bl2 ? (zzcbd)object : new zzcbb(iBinder);
                }
                zzbaf.zzc(parcel);
                this.zzf(iObjectWrapper, (zzcbk)object7, (zzcbd)object);
                parcel2.writeNoException();
            }
        }
        return true;
    }
}

