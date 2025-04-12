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
import com.google.android.gms.ads.internal.client.zzbx;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper$Stub;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbyi;
import com.google.android.gms.internal.ads.zzbyk;
import com.google.android.gms.internal.ads.zzbyl;
import com.google.android.gms.internal.ads.zzbyn;
import com.google.android.gms.internal.ads.zzbyo;

public abstract class zzbyj
extends zzbae
implements zzbyk {
    public zzbyj() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        n4 = 1;
        if (n3 != n4) {
            int n7 = 2;
            if (n3 != n7) {
                n7 = 3;
                boolean bl2 = false;
                IInterface iInterface = null;
                if (n3 != n7) {
                    n7 = 34;
                    if (n3 != n7) {
                        switch (n3) {
                            default: {
                                return false;
                            }
                            case 21: {
                                zzdn zzdn2 = this.zzc();
                                parcel2.writeNoException();
                                zzbaf.zzf(parcel2, zzdn2);
                                break;
                            }
                            case 20: {
                                n3 = (int)(this.zzt() ? 1 : 0);
                                parcel2.writeNoException();
                                parcel2.writeInt(n3);
                                break;
                            }
                            case 19: {
                                String string2 = parcel.readString();
                                zzbaf.zzc(parcel);
                                this.zzm(string2);
                                parcel2.writeNoException();
                                break;
                            }
                            case 18: {
                                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                                zzbaf.zzc(parcel);
                                this.zzr(iObjectWrapper);
                                parcel2.writeNoException();
                                break;
                            }
                            case 17: {
                                parcel.readString();
                                zzbaf.zzc(parcel);
                                parcel2.writeNoException();
                                break;
                            }
                            case 16: {
                                IBinder iBinder = parcel.readStrongBinder();
                                if (iBinder != null) {
                                    IInterface iInterface2 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                                    bl2 = iInterface2 instanceof zzbyi;
                                    if (bl2) {
                                        iInterface = iInterface2;
                                        iInterface = (zzbyi)iInterface2;
                                    } else {
                                        iInterface = new zzbyi(iBinder);
                                    }
                                }
                                zzbaf.zzc(parcel);
                                this.zzu((zzbyi)iInterface);
                                parcel2.writeNoException();
                                break;
                            }
                            case 15: {
                                Bundle bundle = this.zzb();
                                parcel2.writeNoException();
                                zzbaf.zze(parcel2, (Parcelable)bundle);
                                break;
                            }
                            case 14: {
                                zzby zzby2 = zzbx.zzb(parcel.readStrongBinder());
                                zzbaf.zzc(parcel);
                                this.zzl(zzby2);
                                parcel2.writeNoException();
                                break;
                            }
                            case 13: {
                                String string3 = parcel.readString();
                                zzbaf.zzc(parcel);
                                this.zzp(string3);
                                parcel2.writeNoException();
                                break;
                            }
                            case 12: {
                                String string4 = this.zzd();
                                parcel2.writeNoException();
                                parcel2.writeString(string4);
                                break;
                            }
                            case 11: {
                                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                                zzbaf.zzc(parcel);
                                this.zzf(iObjectWrapper);
                                parcel2.writeNoException();
                                break;
                            }
                            case 10: {
                                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                                zzbaf.zzc(parcel);
                                this.zzk(iObjectWrapper);
                                parcel2.writeNoException();
                                break;
                            }
                            case 9: {
                                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                                zzbaf.zzc(parcel);
                                this.zzi(iObjectWrapper);
                                parcel2.writeNoException();
                                break;
                            }
                            case 8: {
                                this.zze();
                                parcel2.writeNoException();
                                break;
                            }
                            case 7: {
                                this.zzj();
                                parcel2.writeNoException();
                                break;
                            }
                            case 6: {
                                this.zzh();
                                parcel2.writeNoException();
                                break;
                            }
                            case 5: {
                                n3 = (int)(this.zzs() ? 1 : 0);
                                parcel2.writeNoException();
                                parcel2.writeInt(n3);
                                break;
                            }
                        }
                    } else {
                        n3 = (int)(zzbaf.zzg(parcel) ? 1 : 0);
                        zzbaf.zzc(parcel);
                        this.zzn(n3 != 0);
                        parcel2.writeNoException();
                    }
                } else {
                    IBinder iBinder = parcel.readStrongBinder();
                    if (iBinder != null) {
                        IInterface iInterface3 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                        bl2 = iInterface3 instanceof zzbyn;
                        if (bl2) {
                            iInterface = iInterface3;
                            iInterface = (zzbyn)iInterface3;
                        } else {
                            iInterface = new zzbyl(iBinder);
                        }
                    }
                    zzbaf.zzc(parcel);
                    this.zzo((zzbyn)iInterface);
                    parcel2.writeNoException();
                }
            } else {
                this.zzq();
                parcel2.writeNoException();
            }
        } else {
            Object object = zzbyo.CREATOR;
            object = (zzbyo)zzbaf.zza(parcel, object);
            zzbaf.zzc(parcel);
            this.zzg((zzbyo)object);
            parcel2.writeNoException();
        }
        return n4 != 0;
    }
}

