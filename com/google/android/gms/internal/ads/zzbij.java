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
import com.google.android.gms.internal.ads.zzbik;
import java.util.List;

public abstract class zzbij
extends zzbae
implements zzbik {
    public zzbij() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        switch (n3) {
            default: {
                return false;
            }
            case 19: {
                String string2 = this.zzl();
                parcel2.writeNoException();
                parcel2.writeString(string2);
                break;
            }
            case 18: {
                IObjectWrapper iObjectWrapper = this.zzg();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, iObjectWrapper);
                break;
            }
            case 17: {
                zzbho zzbho2 = this.zze();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzbho2);
                break;
            }
            case 16: {
                Parcelable.Creator creator = Bundle.CREATOR;
                creator = (Bundle)zzbaf.zza(parcel, creator);
                zzbaf.zzc(parcel);
                this.zzr((Bundle)creator);
                parcel2.writeNoException();
                break;
            }
            case 15: {
                Parcelable.Creator creator = Bundle.CREATOR;
                creator = (Bundle)zzbaf.zza(parcel, creator);
                zzbaf.zzc(parcel);
                n3 = (int)(this.zzs((Bundle)creator) ? 1 : 0);
                parcel2.writeNoException();
                parcel2.writeInt(n3);
                break;
            }
            case 14: {
                Parcelable.Creator creator = Bundle.CREATOR;
                creator = (Bundle)zzbaf.zza(parcel, creator);
                zzbaf.zzc(parcel);
                this.zzq((Bundle)creator);
                parcel2.writeNoException();
                break;
            }
            case 13: {
                zzdq zzdq2 = this.zzd();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzdq2);
                break;
            }
            case 12: {
                this.zzp();
                parcel2.writeNoException();
                break;
            }
            case 11: {
                Bundle bundle = this.zzc();
                parcel2.writeNoException();
                zzbaf.zze(parcel2, (Parcelable)bundle);
                break;
            }
            case 10: {
                String string3 = this.zzm();
                parcel2.writeNoException();
                parcel2.writeString(string3);
                break;
            }
            case 9: {
                String string4 = this.zzn();
                parcel2.writeNoException();
                parcel2.writeString(string4);
                break;
            }
            case 8: {
                double d2 = this.zzb();
                parcel2.writeNoException();
                parcel2.writeDouble(d2);
                break;
            }
            case 7: {
                String string5 = this.zzj();
                parcel2.writeNoException();
                parcel2.writeString(string5);
                break;
            }
            case 6: {
                zzbhv zzbhv2 = this.zzf();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzbhv2);
                break;
            }
            case 5: {
                String string6 = this.zzi();
                parcel2.writeNoException();
                parcel2.writeString(string6);
                break;
            }
            case 4: {
                List list = this.zzo();
                parcel2.writeNoException();
                parcel2.writeList(list);
                break;
            }
            case 3: {
                String string7 = this.zzk();
                parcel2.writeNoException();
                parcel2.writeString(string7);
                break;
            }
            case 2: {
                IObjectWrapper iObjectWrapper = this.zzh();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, iObjectWrapper);
            }
        }
        return true;
    }
}

