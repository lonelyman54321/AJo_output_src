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
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper$Stub;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzciz;
import java.util.List;
import java.util.Map;

public abstract class zzciy
extends zzbae
implements zzciz {
    public zzciy() {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        switch (n3) {
            default: {
                return false;
            }
            case 19: {
                Parcelable.Creator creator = Bundle.CREATOR;
                creator = (Bundle)zzbaf.zza(parcel, creator);
                zzbaf.zzc(parcel);
                this.zzr((Bundle)creator);
                parcel2.writeNoException();
                break;
            }
            case 18: {
                String string2 = this.zze();
                parcel2.writeNoException();
                parcel2.writeString(string2);
                break;
            }
            case 17: {
                String string3 = this.zzg();
                parcel2.writeNoException();
                parcel2.writeString(string3);
                break;
            }
            case 16: {
                String string4 = this.zzh();
                parcel2.writeNoException();
                parcel2.writeString(string4);
                break;
            }
            case 15: {
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                zzbaf.zzc(parcel);
                this.zzs(iObjectWrapper, string5, string6);
                parcel2.writeNoException();
                break;
            }
            case 14: {
                String string7 = parcel.readString();
                zzbaf.zzc(parcel);
                this.zzn(string7);
                parcel2.writeNoException();
                break;
            }
            case 13: {
                String string8 = parcel.readString();
                zzbaf.zzc(parcel);
                this.zzl(string8);
                parcel2.writeNoException();
                break;
            }
            case 12: {
                long l2 = this.zzc();
                parcel2.writeNoException();
                parcel2.writeLong(l2);
                break;
            }
            case 11: {
                String string9 = this.zzi();
                parcel2.writeNoException();
                parcel2.writeString(string9);
                break;
            }
            case 10: {
                String string10 = this.zzf();
                parcel2.writeNoException();
                parcel2.writeString(string10);
                break;
            }
            case 9: {
                Object object = parcel.readString();
                String string11 = parcel.readString();
                zzbaf.zzc(parcel);
                object = this.zzj((String)object, string11);
                parcel2.writeNoException();
                parcel2.writeList((List)object);
                break;
            }
            case 8: {
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                Parcelable.Creator creator = Bundle.CREATOR;
                creator = (Bundle)zzbaf.zza(parcel, creator);
                zzbaf.zzc(parcel);
                this.zzm(string12, string13, (Bundle)creator);
                parcel2.writeNoException();
                break;
            }
            case 7: {
                Parcelable.Creator creator = Bundle.CREATOR;
                creator = (Bundle)zzbaf.zza(parcel, creator);
                zzbaf.zzc(parcel);
                this.zzq((Bundle)creator);
                parcel2.writeNoException();
                break;
            }
            case 6: {
                String string14 = parcel.readString();
                zzbaf.zzc(parcel);
                n3 = this.zzb(string14);
                parcel2.writeNoException();
                parcel2.writeInt(n3);
                break;
            }
            case 5: {
                Object object = parcel.readString();
                String string15 = parcel.readString();
                boolean bl2 = zzbaf.zzg(parcel);
                zzbaf.zzc(parcel);
                object = this.zzk((String)object, string15, bl2);
                parcel2.writeNoException();
                parcel2.writeMap((Map)object);
                break;
            }
            case 4: {
                String string16 = parcel.readString();
                String string17 = parcel.readString();
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                this.zzt(string16, string17, iObjectWrapper);
                parcel2.writeNoException();
                break;
            }
            case 3: {
                String string18 = parcel.readString();
                String string19 = parcel.readString();
                Parcelable.Creator creator = Bundle.CREATOR;
                creator = (Bundle)zzbaf.zza(parcel, creator);
                zzbaf.zzc(parcel);
                this.zzo(string18, string19, (Bundle)creator);
                parcel2.writeNoException();
                break;
            }
            case 2: {
                Parcelable.Creator creator = Bundle.CREATOR;
                creator = (Bundle)zzbaf.zza(parcel, creator);
                zzbaf.zzc(parcel);
                creator = this.zzd((Bundle)creator);
                parcel2.writeNoException();
                zzbaf.zze(parcel2, (Parcelable)creator);
                break;
            }
            case 1: {
                Parcelable.Creator creator = Bundle.CREATOR;
                creator = (Bundle)zzbaf.zza(parcel, creator);
                zzbaf.zzc(parcel);
                this.zzp((Bundle)creator);
                parcel2.writeNoException();
            }
        }
        return true;
    }
}

