/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper$Stub;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbve;
import com.google.android.gms.internal.ads.zzbvg;

public abstract class zzbvf
extends zzbae
implements zzbvg {
    public zzbvf() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static zzbvg zzI(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        boolean bl2 = iInterface instanceof zzbvg;
        if (bl2) {
            return (zzbvg)iInterface;
        }
        iInterface = new zzbve(iBinder);
        return iInterface;
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        switch (n3) {
            default: {
                return false;
            }
            case 15: {
                n3 = parcel.readInt();
                String[] stringArray = parcel.createStringArray();
                int[] nArray = parcel.createIntArray();
                zzbaf.zzc(parcel);
                this.zzp(n3, stringArray, nArray);
                parcel2.writeNoException();
                break;
            }
            case 14: {
                this.zzv();
                parcel2.writeNoException();
                break;
            }
            case 13: {
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                this.zzk(iObjectWrapper);
                parcel2.writeNoException();
                break;
            }
            case 12: {
                parcel.readInt();
                parcel.readInt();
                Parcelable.Creator creator = Intent.CREATOR;
                creator = (Intent)zzbaf.zza(parcel, creator);
                zzbaf.zzc(parcel);
                parcel2.writeNoException();
                break;
            }
            case 11: {
                n3 = (int)(this.zzH() ? 1 : 0);
                parcel2.writeNoException();
                parcel2.writeInt(n3);
                break;
            }
            case 10: {
                this.zzi();
                parcel2.writeNoException();
                break;
            }
            case 9: {
                this.zzx();
                parcel2.writeNoException();
                break;
            }
            case 8: {
                this.zzm();
                parcel2.writeNoException();
                break;
            }
            case 7: {
                this.zzu();
                parcel2.writeNoException();
                break;
            }
            case 6: {
                Parcelable.Creator creator = Bundle.CREATOR;
                creator = (Bundle)zzbaf.zza(parcel, creator);
                zzbaf.zzc(parcel);
                this.zzs((Bundle)creator);
                parcel2.writeNoException();
                zzbaf.zze(parcel2, (Parcelable)creator);
                break;
            }
            case 5: {
                this.zzo();
                parcel2.writeNoException();
                break;
            }
            case 4: {
                this.zzr();
                parcel2.writeNoException();
                break;
            }
            case 3: {
                this.zzt();
                parcel2.writeNoException();
                break;
            }
            case 2: {
                parcel2.writeNoException();
                break;
            }
            case 1: {
                Parcelable.Creator creator = Bundle.CREATOR;
                creator = (Bundle)zzbaf.zza(parcel, creator);
                zzbaf.zzc(parcel);
                this.zzl((Bundle)creator);
                parcel2.writeNoException();
            }
        }
        return true;
    }
}

