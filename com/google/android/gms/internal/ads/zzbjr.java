/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzcr;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzcv;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzdf;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbho;
import com.google.android.gms.internal.ads.zzbhs;
import com.google.android.gms.internal.ads.zzbhv;
import com.google.android.gms.internal.ads.zzbjn;
import com.google.android.gms.internal.ads.zzbjp;
import com.google.android.gms.internal.ads.zzbjs;
import java.util.List;

public abstract class zzbjr
extends zzbae
implements zzbjs {
    public zzbjr() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        switch (n3) {
            default: {
                return false;
            }
            case 32: {
                zzdg zzdg2 = zzdf.zzb(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                this.zzE(zzdg2);
                parcel2.writeNoException();
                break;
            }
            case 31: {
                zzdn zzdn2 = this.zzg();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzdn2);
                break;
            }
            case 30: {
                n3 = (int)(this.zzG() ? 1 : 0);
                parcel2.writeNoException();
                parcel2.writeInt(n3);
                break;
            }
            case 29: {
                zzbhs zzbhs2 = this.zzj();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzbhs2);
                break;
            }
            case 28: {
                this.zzA();
                parcel2.writeNoException();
                break;
            }
            case 27: {
                this.zzC();
                parcel2.writeNoException();
                break;
            }
            case 26: {
                zzcs zzcs2 = zzcr.zzb(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                this.zzD(zzcs2);
                parcel2.writeNoException();
                break;
            }
            case 25: {
                zzcw zzcw2 = zzcv.zzb(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                this.zzy(zzcw2);
                parcel2.writeNoException();
                break;
            }
            case 24: {
                n3 = (int)(this.zzH() ? 1 : 0);
                parcel2.writeNoException();
                parcel2.writeInt(n3);
                break;
            }
            case 23: {
                List list = this.zzv();
                parcel2.writeNoException();
                parcel2.writeList(list);
                break;
            }
            case 22: {
                this.zzw();
                parcel2.writeNoException();
                break;
            }
            case 21: {
                Object object = parcel.readStrongBinder();
                if (object == null) {
                    n3 = 0;
                    object = null;
                } else {
                    IInterface iInterface = object.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    boolean bl2 = iInterface instanceof zzbjp;
                    if (bl2) {
                        object = iInterface;
                        object = (zzbjp)iInterface;
                    } else {
                        iInterface = new zzbjn((IBinder)object);
                        object = iInterface;
                    }
                }
                zzbaf.zzc(parcel);
                this.zzF((zzbjp)object);
                parcel2.writeNoException();
                break;
            }
            case 20: {
                Bundle bundle = this.zzf();
                parcel2.writeNoException();
                zzbaf.zze(parcel2, (Parcelable)bundle);
                break;
            }
            case 19: {
                IObjectWrapper iObjectWrapper = this.zzl();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, iObjectWrapper);
                break;
            }
            case 18: {
                IObjectWrapper iObjectWrapper = this.zzm();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, iObjectWrapper);
                break;
            }
            case 17: {
                Parcelable.Creator creator = Bundle.CREATOR;
                creator = (Bundle)zzbaf.zza(parcel, creator);
                zzbaf.zzc(parcel);
                this.zzB((Bundle)creator);
                parcel2.writeNoException();
                break;
            }
            case 16: {
                Parcelable.Creator creator = Bundle.CREATOR;
                creator = (Bundle)zzbaf.zza(parcel, creator);
                zzbaf.zzc(parcel);
                n3 = (int)(this.zzI((Bundle)creator) ? 1 : 0);
                parcel2.writeNoException();
                parcel2.writeInt(n3);
                break;
            }
            case 15: {
                Parcelable.Creator creator = Bundle.CREATOR;
                creator = (Bundle)zzbaf.zza(parcel, creator);
                zzbaf.zzc(parcel);
                this.zzz((Bundle)creator);
                parcel2.writeNoException();
                break;
            }
            case 14: {
                zzbho zzbho2 = this.zzi();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzbho2);
                break;
            }
            case 13: {
                this.zzx();
                parcel2.writeNoException();
                break;
            }
            case 12: {
                String string2 = this.zzr();
                parcel2.writeNoException();
                parcel2.writeString(string2);
                break;
            }
            case 11: {
                zzdq zzdq2 = this.zzh();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzdq2);
                break;
            }
            case 10: {
                String string3 = this.zzs();
                parcel2.writeNoException();
                parcel2.writeString(string3);
                break;
            }
            case 9: {
                String string4 = this.zzt();
                parcel2.writeNoException();
                parcel2.writeString(string4);
                break;
            }
            case 8: {
                double d2 = this.zze();
                parcel2.writeNoException();
                parcel2.writeDouble(d2);
                break;
            }
            case 7: {
                String string5 = this.zzn();
                parcel2.writeNoException();
                parcel2.writeString(string5);
                break;
            }
            case 6: {
                String string6 = this.zzp();
                parcel2.writeNoException();
                parcel2.writeString(string6);
                break;
            }
            case 5: {
                zzbhv zzbhv2 = this.zzk();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzbhv2);
                break;
            }
            case 4: {
                String string7 = this.zzo();
                parcel2.writeNoException();
                parcel2.writeString(string7);
                break;
            }
            case 3: {
                List list = this.zzu();
                parcel2.writeNoException();
                parcel2.writeList(list);
                break;
            }
            case 2: {
                String string8 = this.zzq();
                parcel2.writeNoException();
                parcel2.writeString(string8);
            }
        }
        return true;
    }
}

