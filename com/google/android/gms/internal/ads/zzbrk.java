/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbrj;
import com.google.android.gms.internal.ads.zzbrl;
import com.google.android.gms.internal.ads.zzbrp;
import com.google.android.gms.internal.ads.zzbyt;
import com.google.android.gms.internal.ads.zzbyw;
import com.google.android.gms.internal.ads.zzbyx;

public abstract class zzbrk
extends zzbae
implements zzbrl {
    public zzbrk() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static zzbrl zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        boolean bl2 = iInterface instanceof zzbrl;
        if (bl2) {
            return (zzbrl)iInterface;
        }
        iInterface = new zzbrj(iBinder);
        return iInterface;
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        switch (n3) {
            default: {
                return false;
            }
            case 24: {
                Object object = zze.CREATOR;
                object = (zze)zzbaf.zza(parcel, object);
                zzbaf.zzc(parcel);
                this.zzk((zze)object);
                break;
            }
            case 23: {
                Object object = zze.CREATOR;
                object = (zze)zzbaf.zza(parcel, object);
                zzbaf.zzc(parcel);
                this.zzh((zze)object);
                break;
            }
            case 22: {
                n3 = parcel.readInt();
                String string2 = parcel.readString();
                zzbaf.zzc(parcel);
                this.zzi(n3, string2);
                break;
            }
            case 21: {
                String string3 = parcel.readString();
                zzbaf.zzc(parcel);
                this.zzl(string3);
                break;
            }
            case 20: {
                this.zzx();
                break;
            }
            case 19: {
                Parcelable.Creator creator = Bundle.CREATOR;
                creator = (Bundle)zzbaf.zza(parcel, creator);
                zzbaf.zzc(parcel);
                break;
            }
            case 18: {
                this.zzu();
                break;
            }
            case 17: {
                n3 = parcel.readInt();
                zzbaf.zzc(parcel);
                this.zzj(n3);
                break;
            }
            case 16: {
                zzbyx zzbyx2 = zzbyw.zzb(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                this.zzt(zzbyx2);
                break;
            }
            case 15: {
                this.zzw();
                break;
            }
            case 14: {
                Object object = zzbyt.CREATOR;
                object = (zzbyt)zzbaf.zza(parcel, object);
                zzbaf.zzc(parcel);
                this.zzs((zzbyt)object);
                break;
            }
            case 13: {
                this.zzy();
                break;
            }
            case 12: {
                parcel.readString();
                zzbaf.zzc(parcel);
                break;
            }
            case 11: {
                this.zzv();
                break;
            }
            case 10: {
                IBinder iBinder = parcel.readStrongBinder();
                zzbio.zzb(iBinder);
                parcel.readString();
                zzbaf.zzc(parcel);
                break;
            }
            case 9: {
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                zzbaf.zzc(parcel);
                this.zzq(string4, string5);
                break;
            }
            case 8: {
                this.zzm();
                break;
            }
            case 7: {
                IBinder iBinder = parcel.readStrongBinder();
                if (iBinder != null) {
                    String string6 = "com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata";
                    iBinder = iBinder.queryLocalInterface(string6);
                    n3 = iBinder instanceof zzbrp;
                }
                zzbaf.zzc(parcel);
                break;
            }
            case 6: {
                this.zzo();
                break;
            }
            case 5: {
                this.zzp();
                break;
            }
            case 4: {
                this.zzn();
                break;
            }
            case 3: {
                n3 = parcel.readInt();
                zzbaf.zzc(parcel);
                this.zzg(n3);
                break;
            }
            case 2: {
                this.zzf();
                break;
            }
            case 1: {
                this.zze();
            }
        }
        parcel2.writeNoException();
        return true;
    }
}

