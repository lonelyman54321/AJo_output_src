/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 */
package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbyv;
import com.google.android.gms.internal.ads.zzbyx;
import com.google.android.gms.internal.ads.zzbzd;

public abstract class zzbzc
extends zzbae
implements zzbzd {
    public zzbzc() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        switch (n3) {
            default: {
                return false;
            }
            case 7: {
                this.zze();
                break;
            }
            case 6: {
                this.zzf();
                break;
            }
            case 5: {
                Object object = zze.CREATOR;
                object = (zze)zzbaf.zza(parcel, object);
                zzbaf.zzc(parcel);
                this.zzi((zze)object);
                break;
            }
            case 4: {
                n3 = parcel.readInt();
                zzbaf.zzc(parcel);
                this.zzh(n3);
                break;
            }
            case 3: {
                Object object = parcel.readStrongBinder();
                if (object == null) {
                    n3 = 0;
                    object = null;
                } else {
                    IInterface iInterface = object.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    boolean bl2 = iInterface instanceof zzbyx;
                    if (bl2) {
                        object = iInterface;
                        object = (zzbyx)iInterface;
                    } else {
                        iInterface = new zzbyv((IBinder)object);
                        object = iInterface;
                    }
                }
                zzbaf.zzc(parcel);
                this.zzk((zzbyx)object);
                break;
            }
            case 2: {
                this.zzg();
                break;
            }
            case 1: {
                this.zzj();
            }
        }
        parcel2.writeNoException();
        return true;
    }
}

