/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;

public abstract class zzbg
extends zzbae
implements zzbh {
    public zzbg() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        switch (n3) {
            default: {
                return false;
            }
            case 9: {
                this.zzk();
                break;
            }
            case 8: {
                Object object = zze.CREATOR;
                object = (zze)zzbaf.zza(parcel, object);
                zzbaf.zzc(parcel);
                this.zzf((zze)object);
                break;
            }
            case 7: {
                this.zzg();
                break;
            }
            case 6: {
                this.zzc();
                break;
            }
            case 5: {
                this.zzj();
                break;
            }
            case 4: {
                this.zzi();
                break;
            }
            case 2: {
                n3 = parcel.readInt();
                zzbaf.zzc(parcel);
                this.zze(n3);
                break;
            }
            case 1: {
                this.zzd();
            }
            case 3: 
        }
        parcel2.writeNoException();
        return true;
    }
}

