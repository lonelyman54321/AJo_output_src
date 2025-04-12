/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbho;
import com.google.android.gms.internal.ads.zzbhv;
import com.google.android.gms.internal.ads.zzbim;
import java.util.List;

public abstract class zzbil
extends zzbae
implements zzbim {
    public zzbil() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        switch (n3) {
            default: {
                return false;
            }
            case 17: {
                String string2 = this.zzl();
                parcel2.writeNoException();
                parcel2.writeString(string2);
                break;
            }
            case 16: {
                IObjectWrapper iObjectWrapper = this.zzf();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, iObjectWrapper);
                break;
            }
            case 15: {
                zzbho zzbho2 = this.zzd();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzbho2);
                break;
            }
            case 14: {
                Parcelable.Creator creator = Bundle.CREATOR;
                creator = (Bundle)zzbaf.zza(parcel, creator);
                zzbaf.zzc(parcel);
                this.zzp((Bundle)creator);
                parcel2.writeNoException();
                break;
            }
            case 13: {
                Parcelable.Creator creator = Bundle.CREATOR;
                creator = (Bundle)zzbaf.zza(parcel, creator);
                zzbaf.zzc(parcel);
                n3 = (int)(this.zzq((Bundle)creator) ? 1 : 0);
                parcel2.writeNoException();
                parcel2.writeInt(n3);
                break;
            }
            case 12: {
                Parcelable.Creator creator = Bundle.CREATOR;
                creator = (Bundle)zzbaf.zza(parcel, creator);
                zzbaf.zzc(parcel);
                this.zzo((Bundle)creator);
                parcel2.writeNoException();
                break;
            }
            case 11: {
                zzdq zzdq2 = this.zzc();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzdq2);
                break;
            }
            case 10: {
                this.zzn();
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
                String string3 = this.zzh();
                parcel2.writeNoException();
                parcel2.writeString(string3);
                break;
            }
            case 7: {
                String string4 = this.zzj();
                parcel2.writeNoException();
                parcel2.writeString(string4);
                break;
            }
            case 6: {
                zzbhv zzbhv2 = this.zze();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzbhv2);
                break;
            }
            case 5: {
                String string5 = this.zzi();
                parcel2.writeNoException();
                parcel2.writeString(string5);
                break;
            }
            case 4: {
                List list = this.zzm();
                parcel2.writeNoException();
                parcel2.writeList(list);
                break;
            }
            case 3: {
                String string6 = this.zzk();
                parcel2.writeNoException();
                parcel2.writeString(string6);
                break;
            }
            case 2: {
                IObjectWrapper iObjectWrapper = this.zzg();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, iObjectWrapper);
            }
        }
        return true;
    }
}

