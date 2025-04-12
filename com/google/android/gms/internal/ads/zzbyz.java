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
import com.google.android.gms.ads.internal.client.zzdc;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzdf;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper$Stub;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbyx;
import com.google.android.gms.internal.ads.zzbyy;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzbzb;
import com.google.android.gms.internal.ads.zzbzd;
import com.google.android.gms.internal.ads.zzbzf;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzbzi;
import com.google.android.gms.internal.ads.zzbzo;

public abstract class zzbyz
extends zzbae
implements zzbza {
    public zzbyz() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzbza zzq(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        boolean bl2 = iInterface instanceof zzbza;
        if (bl2) {
            return (zzbza)iInterface;
        }
        iInterface = new zzbyy(iBinder);
        return iInterface;
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        String string2 = "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback";
        boolean bl2 = false;
        Object object = null;
        switch (n3) {
            default: {
                return false;
            }
            case 15: {
                n3 = (int)(zzbaf.zzg(parcel) ? 1 : 0);
                zzbaf.zzc(parcel);
                this.zzh(n3 != 0);
                parcel2.writeNoException();
                break;
            }
            case 14: {
                Object object2 = zzl.CREATOR;
                object2 = (zzl)zzbaf.zza(parcel, object2);
                IBinder iBinder = parcel.readStrongBinder();
                if (iBinder != null) {
                    bl2 = (string2 = iBinder.queryLocalInterface(string2)) instanceof zzbzh;
                    if (bl2) {
                        object = string2;
                        object = (zzbzh)((Object)string2);
                    } else {
                        object = new zzbzf(iBinder);
                    }
                }
                zzbaf.zzc(parcel);
                this.zzg((zzl)object2, (zzbzh)object);
                parcel2.writeNoException();
                break;
            }
            case 13: {
                zzdg zzdg2 = zzdf.zzb(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                this.zzj(zzdg2);
                parcel2.writeNoException();
                break;
            }
            case 12: {
                zzdn zzdn2 = this.zzc();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzdn2);
                break;
            }
            case 11: {
                zzbyx zzbyx2 = this.zzd();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzbyx2);
                break;
            }
            case 10: {
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                n4 = (int)(zzbaf.zzg(parcel) ? 1 : 0);
                zzbaf.zzc(parcel);
                this.zzn(iObjectWrapper, n4 != 0);
                parcel2.writeNoException();
                break;
            }
            case 9: {
                Bundle bundle = this.zzb();
                parcel2.writeNoException();
                zzbaf.zze(parcel2, (Parcelable)bundle);
                break;
            }
            case 8: {
                zzdd zzdd2 = zzdc.zzb(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                this.zzi(zzdd2);
                parcel2.writeNoException();
                break;
            }
            case 7: {
                Object object3 = zzbzo.CREATOR;
                object3 = (zzbzo)zzbaf.zza(parcel, object3);
                zzbaf.zzc(parcel);
                this.zzl((zzbzo)object3);
                parcel2.writeNoException();
                break;
            }
            case 6: {
                IBinder iBinder = parcel.readStrongBinder();
                if (iBinder != null) {
                    string2 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    bl2 = string2 instanceof zzbzi;
                    if (bl2) {
                        object = string2;
                        object = (zzbzi)((Object)string2);
                    } else {
                        object = new zzbzi(iBinder);
                    }
                }
                zzbaf.zzc(parcel);
                this.zzp((zzbzi)object);
                parcel2.writeNoException();
                break;
            }
            case 5: {
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                this.zzm(iObjectWrapper);
                parcel2.writeNoException();
                break;
            }
            case 4: {
                String string3 = this.zze();
                parcel2.writeNoException();
                parcel2.writeString(string3);
                break;
            }
            case 3: {
                n3 = (int)(this.zzo() ? 1 : 0);
                parcel2.writeNoException();
                parcel2.writeInt(n3);
                break;
            }
            case 2: {
                IBinder iBinder = parcel.readStrongBinder();
                if (iBinder != null) {
                    string2 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    bl2 = string2 instanceof zzbzd;
                    if (bl2) {
                        object = string2;
                        object = (zzbzd)((Object)string2);
                    } else {
                        object = new zzbzb(iBinder);
                    }
                }
                zzbaf.zzc(parcel);
                this.zzk((zzbzd)object);
                parcel2.writeNoException();
                break;
            }
            case 1: {
                Object object4 = zzl.CREATOR;
                object4 = (zzl)zzbaf.zza(parcel, object4);
                IBinder iBinder = parcel.readStrongBinder();
                if (iBinder != null) {
                    bl2 = (string2 = iBinder.queryLocalInterface(string2)) instanceof zzbzh;
                    if (bl2) {
                        object = string2;
                        object = (zzbzh)((Object)string2);
                    } else {
                        object = new zzbzf(iBinder);
                    }
                }
                zzbaf.zzc(parcel);
                this.zzf((zzl)object4, (zzbzh)object);
                parcel2.writeNoException();
            }
        }
        return true;
    }
}

