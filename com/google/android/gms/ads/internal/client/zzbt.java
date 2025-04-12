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
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbf;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbi;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzbw;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzbz;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzcg;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper$Stub;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbcj;
import com.google.android.gms.internal.ads.zzbfj;
import com.google.android.gms.internal.ads.zzbfk;
import com.google.android.gms.internal.ads.zzbvo;
import com.google.android.gms.internal.ads.zzbvp;
import com.google.android.gms.internal.ads.zzbvr;
import com.google.android.gms.internal.ads.zzbvs;
import com.google.android.gms.internal.ads.zzbym;
import com.google.android.gms.internal.ads.zzbyn;

public abstract class zzbt
extends zzbae
implements zzbu {
    public zzbt() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static zzbu zzad(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        boolean bl2 = iInterface instanceof zzbu;
        if (bl2) {
            return (zzbu)iInterface;
        }
        iInterface = new zzbs(iBinder);
        return iInterface;
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        Object object = null;
        switch (n3) {
            default: {
                return false;
            }
            case 46: {
                n3 = (int)(this.zzY() ? 1 : 0);
                parcel2.writeNoException();
                parcel2.writeInt(n3);
                break;
            }
            case 45: {
                IBinder iBinder = parcel.readStrongBinder();
                if (iBinder != null) {
                    object = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    boolean bl2 = object instanceof zzci;
                    object = bl2 ? (zzci)object : new zzcg(iBinder);
                }
                zzbaf.zzc(parcel);
                this.zzJ((zzci)object);
                parcel2.writeNoException();
                break;
            }
            case 44: {
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                this.zzW(iObjectWrapper);
                parcel2.writeNoException();
                break;
            }
            case 43: {
                Object object2 = zzl.CREATOR;
                object2 = (zzl)zzbaf.zza(parcel, object2);
                IBinder iBinder = parcel.readStrongBinder();
                if (iBinder != null) {
                    object = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    boolean bl3 = object instanceof zzbk;
                    object = bl3 ? (zzbk)object : new zzbi(iBinder);
                }
                zzbaf.zzc(parcel);
                this.zzy((zzl)object2, (zzbk)object);
                parcel2.writeNoException();
                break;
            }
            case 42: {
                IBinder iBinder = parcel.readStrongBinder();
                if (iBinder != null) {
                    object = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    boolean bl4 = object instanceof zzdg;
                    object = bl4 ? (zzdg)object : new zzde(iBinder);
                }
                zzbaf.zzc(parcel);
                this.zzP((zzdg)object);
                parcel2.writeNoException();
                break;
            }
            case 41: {
                zzdn zzdn2 = this.zzk();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzdn2);
                break;
            }
            case 40: {
                zzbcj zzbcj2 = zzbci.zze(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                this.zzH(zzbcj2);
                parcel2.writeNoException();
                break;
            }
            case 39: {
                Object object3 = zzw.CREATOR;
                object3 = (zzw)zzbaf.zza(parcel, object3);
                zzbaf.zzc(parcel);
                this.zzI((zzw)object3);
                parcel2.writeNoException();
                break;
            }
            case 38: {
                String string2 = parcel.readString();
                zzbaf.zzc(parcel);
                this.zzR(string2);
                parcel2.writeNoException();
                break;
            }
            case 37: {
                Bundle bundle = this.zzd();
                parcel2.writeNoException();
                zzbaf.zze(parcel2, (Parcelable)bundle);
                break;
            }
            case 36: {
                IBinder iBinder = parcel.readStrongBinder();
                if (iBinder != null) {
                    object = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    boolean bl5 = object instanceof zzby;
                    object = bl5 ? (zzby)object : new zzbw(iBinder);
                }
                zzbaf.zzc(parcel);
                this.zzE((zzby)object);
                parcel2.writeNoException();
                break;
            }
            case 35: {
                String string3 = this.zzt();
                parcel2.writeNoException();
                parcel2.writeString(string3);
                break;
            }
            case 34: {
                n3 = (int)(zzbaf.zzg(parcel) ? 1 : 0);
                zzbaf.zzc(parcel);
                this.zzL(n3 != 0);
                parcel2.writeNoException();
                break;
            }
            case 33: {
                zzbh zzbh2 = this.zzi();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzbh2);
                break;
            }
            case 32: {
                zzcb zzcb2 = this.zzj();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzcb2);
                break;
            }
            case 31: {
                String string4 = this.zzr();
                parcel2.writeNoException();
                parcel2.writeString(string4);
                break;
            }
            case 30: {
                Object object4 = zzdu.CREATOR;
                object4 = (zzdu)zzbaf.zza(parcel, object4);
                zzbaf.zzc(parcel);
                this.zzK((zzdu)object4);
                parcel2.writeNoException();
                break;
            }
            case 29: {
                Object object5 = zzfk.CREATOR;
                object5 = (zzfk)zzbaf.zza(parcel, object5);
                zzbaf.zzc(parcel);
                this.zzU((zzfk)object5);
                parcel2.writeNoException();
                break;
            }
            case 26: {
                zzdq zzdq2 = this.zzl();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzdq2);
                break;
            }
            case 25: {
                String string5 = parcel.readString();
                zzbaf.zzc(parcel);
                this.zzT(string5);
                parcel2.writeNoException();
                break;
            }
            case 24: {
                zzbyn zzbyn2 = zzbym.zzb(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                this.zzS(zzbyn2);
                parcel2.writeNoException();
                break;
            }
            case 23: {
                n3 = (int)(this.zzZ() ? 1 : 0);
                parcel2.writeNoException();
                parcel2.writeInt(n3);
                break;
            }
            case 22: {
                n3 = (int)(zzbaf.zzg(parcel) ? 1 : 0);
                zzbaf.zzc(parcel);
                this.zzN(n3 != 0);
                parcel2.writeNoException();
                break;
            }
            case 21: {
                IBinder iBinder = parcel.readStrongBinder();
                if (iBinder != null) {
                    object = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    boolean bl6 = object instanceof zzcf;
                    object = bl6 ? (zzcf)object : new zzcf(iBinder);
                }
                zzbaf.zzc(parcel);
                this.zzac((zzcf)object);
                parcel2.writeNoException();
                break;
            }
            case 20: {
                IBinder iBinder = parcel.readStrongBinder();
                if (iBinder != null) {
                    object = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    boolean bl7 = object instanceof zzbe;
                    object = bl7 ? (zzbe)object : new zzbc(iBinder);
                }
                zzbaf.zzc(parcel);
                this.zzC((zzbe)object);
                parcel2.writeNoException();
                break;
            }
            case 19: {
                zzbfk zzbfk2 = zzbfj.zzb(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                this.zzO(zzbfk2);
                parcel2.writeNoException();
                break;
            }
            case 18: {
                String string6 = this.zzs();
                parcel2.writeNoException();
                parcel2.writeString(string6);
                break;
            }
            case 15: {
                zzbvs zzbvs2 = zzbvr.zzb(parcel.readStrongBinder());
                object = parcel.readString();
                zzbaf.zzc(parcel);
                this.zzQ(zzbvs2, (String)object);
                parcel2.writeNoException();
                break;
            }
            case 14: {
                zzbvp zzbvp2 = zzbvo.zzb(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                this.zzM(zzbvp2);
                parcel2.writeNoException();
                break;
            }
            case 13: {
                Object object6 = zzq.CREATOR;
                object6 = (zzq)zzbaf.zza(parcel, object6);
                zzbaf.zzc(parcel);
                this.zzF((zzq)object6);
                parcel2.writeNoException();
                break;
            }
            case 12: {
                zzq zzq2 = this.zzg();
                parcel2.writeNoException();
                zzbaf.zze(parcel2, zzq2);
                break;
            }
            case 11: {
                this.zzA();
                parcel2.writeNoException();
                break;
            }
            case 10: {
                parcel2.writeNoException();
                break;
            }
            case 9: {
                this.zzX();
                parcel2.writeNoException();
                break;
            }
            case 8: {
                IBinder iBinder = parcel.readStrongBinder();
                if (iBinder != null) {
                    object = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    boolean bl8 = object instanceof zzcb;
                    object = bl8 ? (zzcb)object : new zzbz(iBinder);
                }
                zzbaf.zzc(parcel);
                this.zzG((zzcb)object);
                parcel2.writeNoException();
                break;
            }
            case 7: {
                IBinder iBinder = parcel.readStrongBinder();
                if (iBinder != null) {
                    object = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    boolean bl9 = object instanceof zzbh;
                    object = bl9 ? (zzbh)object : new zzbf(iBinder);
                }
                zzbaf.zzc(parcel);
                this.zzD((zzbh)object);
                parcel2.writeNoException();
                break;
            }
            case 6: {
                this.zzB();
                parcel2.writeNoException();
                break;
            }
            case 5: {
                this.zzz();
                parcel2.writeNoException();
                break;
            }
            case 4: {
                Object object7 = zzl.CREATOR;
                object7 = (zzl)zzbaf.zza(parcel, object7);
                zzbaf.zzc(parcel);
                n3 = (int)(this.zzab((zzl)object7) ? 1 : 0);
                parcel2.writeNoException();
                parcel2.writeInt(n3);
                break;
            }
            case 3: {
                n3 = (int)(this.zzaa() ? 1 : 0);
                parcel2.writeNoException();
                parcel2.writeInt(n3);
                break;
            }
            case 2: {
                this.zzx();
                parcel2.writeNoException();
                break;
            }
            case 1: {
                IObjectWrapper iObjectWrapper = this.zzn();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, iObjectWrapper);
            }
        }
        return true;
    }
}

