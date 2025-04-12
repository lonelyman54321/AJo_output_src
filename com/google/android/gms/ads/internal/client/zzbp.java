/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 */
package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzbf;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbn;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbhk;
import com.google.android.gms.internal.ads.zzbis;
import com.google.android.gms.internal.ads.zzbit;
import com.google.android.gms.internal.ads.zzbiv;
import com.google.android.gms.internal.ads.zzbiw;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzbiz;
import com.google.android.gms.internal.ads.zzbjb;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbjf;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbji;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzbnz;
import com.google.android.gms.internal.ads.zzboh;
import com.google.android.gms.internal.ads.zzboi;

public abstract class zzbp
extends zzbae
implements zzbq {
    public zzbp() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        Object object = null;
        switch (n3) {
            default: {
                return false;
            }
            case 15: {
                Object object2 = AdManagerAdViewOptions.CREATOR;
                object2 = (AdManagerAdViewOptions)zzbaf.zza(parcel, object2);
                zzbaf.zzc(parcel);
                this.zzm((AdManagerAdViewOptions)object2);
                parcel2.writeNoException();
                break;
            }
            case 14: {
                zzboi zzboi2 = zzboh.zzb(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                this.zzi(zzboi2);
                parcel2.writeNoException();
                break;
            }
            case 13: {
                Object object3 = zzbnz.CREATOR;
                object3 = (zzbnz)zzbaf.zza(parcel, object3);
                zzbaf.zzc(parcel);
                this.zzn((zzbnz)object3);
                parcel2.writeNoException();
                break;
            }
            case 10: {
                zzbjj zzbjj2 = zzbji.zzb(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                this.zzk(zzbjj2);
                parcel2.writeNoException();
                break;
            }
            case 9: {
                Object object4 = PublisherAdViewOptions.CREATOR;
                object4 = (PublisherAdViewOptions)zzbaf.zza(parcel, object4);
                zzbaf.zzc(parcel);
                this.zzp((PublisherAdViewOptions)object4);
                parcel2.writeNoException();
                break;
            }
            case 8: {
                zzbjg zzbjg2 = zzbjf.zzb(parcel.readStrongBinder());
                object = zzq.CREATOR;
                object = (zzq)zzbaf.zza(parcel, object);
                zzbaf.zzc(parcel);
                this.zzj(zzbjg2, (zzq)object);
                parcel2.writeNoException();
                break;
            }
            case 7: {
                IBinder iBinder = parcel.readStrongBinder();
                if (iBinder != null) {
                    object = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    boolean bl2 = object instanceof zzcf;
                    object = bl2 ? (zzcf)object : new zzcf(iBinder);
                }
                zzbaf.zzc(parcel);
                this.zzq((zzcf)object);
                parcel2.writeNoException();
                break;
            }
            case 6: {
                Object object5 = zzbhk.CREATOR;
                object5 = (zzbhk)zzbaf.zza(parcel, object5);
                zzbaf.zzc(parcel);
                this.zzo((zzbhk)object5);
                parcel2.writeNoException();
                break;
            }
            case 5: {
                String string2 = parcel.readString();
                object = zzbjb.zzb(parcel.readStrongBinder());
                zzbiz zzbiz2 = zzbiy.zzb(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                this.zzh(string2, (zzbjc)object, zzbiz2);
                parcel2.writeNoException();
                break;
            }
            case 4: {
                zzbiw zzbiw2 = zzbiv.zzb(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                this.zzg(zzbiw2);
                parcel2.writeNoException();
                break;
            }
            case 3: {
                zzbit zzbit2 = zzbis.zzb(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                this.zzf(zzbit2);
                parcel2.writeNoException();
                break;
            }
            case 2: {
                IBinder iBinder = parcel.readStrongBinder();
                if (iBinder != null) {
                    object = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    boolean bl3 = object instanceof zzbh;
                    object = bl3 ? (zzbh)object : new zzbf(iBinder);
                }
                zzbaf.zzc(parcel);
                this.zzl((zzbh)object);
                parcel2.writeNoException();
                break;
            }
            case 1: {
                zzbn zzbn2 = this.zze();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzbn2);
            }
        }
        return true;
    }
}

