/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 */
package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzbo;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzcm;
import com.google.android.gms.ads.internal.client.zzco;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbie;
import com.google.android.gms.internal.ads.zzbif;
import com.google.android.gms.internal.ads.zzbmo;
import com.google.android.gms.internal.ads.zzbmq;
import com.google.android.gms.internal.ads.zzbmr;
import com.google.android.gms.internal.ads.zzbrf;
import com.google.android.gms.internal.ads.zzbuy;
import com.google.android.gms.internal.ads.zzbuz;
import com.google.android.gms.internal.ads.zzbvf;
import com.google.android.gms.internal.ads.zzbvg;
import com.google.android.gms.internal.ads.zzbyk;
import com.google.android.gms.internal.ads.zzbyz;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzcbf;
import com.google.android.gms.internal.ads.zzcbg;

public final class zzcc
extends zzbad
implements zzce {
    public zzcc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    public final zzbq zzb(IObjectWrapper iObjectWrapper, String object, zzbrf object2, int n3) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        parcel.writeString((String)object);
        zzbaf.zzf(parcel, object2);
        parcel.writeInt(241806000);
        int n4 = 3;
        iObjectWrapper = this.zzdb(n4, parcel);
        object = iObjectWrapper.readStrongBinder();
        if (object == null) {
            object = null;
        } else {
            object2 = object.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            n3 = object2 instanceof zzbq;
            if (n3 != 0) {
                object = object2;
                object = (zzbq)object2;
            } else {
                object2 = new zzbo((IBinder)object);
                object = object2;
            }
        }
        iObjectWrapper.recycle();
        return object;
    }

    public final zzbu zzc(IObjectWrapper iObjectWrapper, zzq object, String object2, zzbrf zzbrf2, int n3) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        zzbaf.zzd(parcel, (Parcelable)object);
        parcel.writeString((String)object2);
        zzbaf.zzf(parcel, zzbrf2);
        parcel.writeInt(241806000);
        int n4 = 13;
        iObjectWrapper = this.zzdb(n4, parcel);
        object = iObjectWrapper.readStrongBinder();
        if (object == null) {
            object = null;
        } else {
            object2 = object.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            boolean bl2 = object2 instanceof zzbu;
            if (bl2) {
                object = object2;
                object = (zzbu)object2;
            } else {
                object = object2 = new zzbs((IBinder)object);
            }
        }
        iObjectWrapper.recycle();
        return object;
    }

    public final zzbu zzd(IObjectWrapper iObjectWrapper, zzq object, String object2, zzbrf zzbrf2, int n3) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        zzbaf.zzd(parcel, (Parcelable)object);
        parcel.writeString((String)object2);
        zzbaf.zzf(parcel, zzbrf2);
        parcel.writeInt(241806000);
        int n4 = 1;
        iObjectWrapper = this.zzdb(n4, parcel);
        object = iObjectWrapper.readStrongBinder();
        if (object == null) {
            object = null;
        } else {
            object2 = object.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            boolean bl2 = object2 instanceof zzbu;
            if (bl2) {
                object = object2;
                object = (zzbu)object2;
            } else {
                object = object2 = new zzbs((IBinder)object);
            }
        }
        iObjectWrapper.recycle();
        return object;
    }

    public final zzbu zze(IObjectWrapper iObjectWrapper, zzq object, String object2, zzbrf zzbrf2, int n3) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        zzbaf.zzd(parcel, (Parcelable)object);
        parcel.writeString((String)object2);
        zzbaf.zzf(parcel, zzbrf2);
        parcel.writeInt(241806000);
        int n4 = 2;
        iObjectWrapper = this.zzdb(n4, parcel);
        object = iObjectWrapper.readStrongBinder();
        if (object == null) {
            object = null;
        } else {
            object2 = object.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            boolean bl2 = object2 instanceof zzbu;
            if (bl2) {
                object = object2;
                object = (zzbu)object2;
            } else {
                object = object2 = new zzbs((IBinder)object);
            }
        }
        iObjectWrapper.recycle();
        return object;
    }

    public final zzbu zzf(IObjectWrapper iObjectWrapper, zzq object, String object2, int n3) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        zzbaf.zzd(parcel, (Parcelable)object);
        parcel.writeString((String)object2);
        parcel.writeInt(241806000);
        int n4 = 10;
        iObjectWrapper = this.zzdb(n4, parcel);
        object = iObjectWrapper.readStrongBinder();
        if (object == null) {
            object = null;
        } else {
            object2 = object.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            n3 = object2 instanceof zzbu;
            if (n3 != 0) {
                object = object2;
                object = (zzbu)object2;
            } else {
                object = object2 = new zzbs((IBinder)object);
            }
        }
        iObjectWrapper.recycle();
        return object;
    }

    public final zzco zzg(IObjectWrapper iObjectWrapper, int n3) {
        Object object = this.zza();
        zzbaf.zzf(object, iObjectWrapper);
        object.writeInt(241806000);
        int n4 = 9;
        iObjectWrapper = this.zzdb(n4, (Parcel)object);
        object = iObjectWrapper.readStrongBinder();
        if (object == null) {
            object = null;
        } else {
            IInterface iInterface = object.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            boolean bl2 = iInterface instanceof zzco;
            if (bl2) {
                object = iInterface;
                object = (zzco)iInterface;
            } else {
                iInterface = new zzcm((IBinder)object);
                object = iInterface;
            }
        }
        iObjectWrapper.recycle();
        return object;
    }

    public final zzdj zzh(IObjectWrapper iObjectWrapper, zzbrf object, int n3) {
        Object object2 = this.zza();
        zzbaf.zzf(object2, iObjectWrapper);
        zzbaf.zzf(object2, object);
        object2.writeInt(241806000);
        int n4 = 17;
        iObjectWrapper = this.zzdb(n4, (Parcel)object2);
        object = iObjectWrapper.readStrongBinder();
        if (object == null) {
            object = null;
        } else {
            object2 = object.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            boolean bl2 = object2 instanceof zzdj;
            if (bl2) {
                object = object2;
                object = (zzdj)object2;
            } else {
                object2 = new zzdh((IBinder)object);
                object = object2;
            }
        }
        iObjectWrapper.recycle();
        return object;
    }

    public final zzbhz zzi(IObjectWrapper iObjectWrapper, IObjectWrapper object) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        zzbaf.zzf(parcel, object);
        iObjectWrapper = this.zzdb(5, parcel);
        object = zzbhy.zzdA(iObjectWrapper.readStrongBinder());
        iObjectWrapper.recycle();
        return object;
    }

    public final zzbif zzj(IObjectWrapper iObjectWrapper, IObjectWrapper object, IObjectWrapper iObjectWrapper2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        zzbaf.zzf(parcel, object);
        zzbaf.zzf(parcel, iObjectWrapper2);
        iObjectWrapper = this.zzdb(11, parcel);
        object = zzbie.zze(iObjectWrapper.readStrongBinder());
        iObjectWrapper.recycle();
        return object;
    }

    public final zzbmr zzk(IObjectWrapper iObjectWrapper, zzbrf object, int n3, zzbmo zzbmo2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        zzbaf.zzf(parcel, object);
        parcel.writeInt(241806000);
        zzbaf.zzf(parcel, zzbmo2);
        iObjectWrapper = this.zzdb(16, parcel);
        object = zzbmq.zzb(iObjectWrapper.readStrongBinder());
        iObjectWrapper.recycle();
        return object;
    }

    public final zzbuz zzl(IObjectWrapper iObjectWrapper, zzbrf object, int n3) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        zzbaf.zzf(parcel, object);
        parcel.writeInt(241806000);
        iObjectWrapper = this.zzdb(15, parcel);
        object = zzbuy.zzb(iObjectWrapper.readStrongBinder());
        iObjectWrapper.recycle();
        return object;
    }

    public final zzbvg zzm(IObjectWrapper iObjectWrapper) {
        Object object = this.zza();
        zzbaf.zzf(object, iObjectWrapper);
        iObjectWrapper = this.zzdb(8, (Parcel)object);
        object = zzbvf.zzI(iObjectWrapper.readStrongBinder());
        iObjectWrapper.recycle();
        return object;
    }

    public final zzbyk zzn(IObjectWrapper iObjectWrapper, zzbrf zzbrf2, int n3) {
        throw null;
    }

    public final zzbza zzo(IObjectWrapper iObjectWrapper, String object, zzbrf zzbrf2, int n3) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        parcel.writeString((String)object);
        zzbaf.zzf(parcel, zzbrf2);
        parcel.writeInt(241806000);
        iObjectWrapper = this.zzdb(12, parcel);
        object = zzbyz.zzq(iObjectWrapper.readStrongBinder());
        iObjectWrapper.recycle();
        return object;
    }

    public final zzcbg zzp(IObjectWrapper iObjectWrapper, zzbrf object, int n3) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        zzbaf.zzf(parcel, object);
        parcel.writeInt(241806000);
        iObjectWrapper = this.zzdb(14, parcel);
        object = zzcbf.zzb(iObjectWrapper.readStrongBinder());
        iObjectWrapper.recycle();
        return object;
    }
}

