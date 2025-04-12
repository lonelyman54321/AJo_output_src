/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.zzbw;
import com.google.android.gms.internal.measurement.zzbx;
import com.google.android.gms.measurement.internal.zzae;
import com.google.android.gms.measurement.internal.zzag;
import com.google.android.gms.measurement.internal.zzbl;
import com.google.android.gms.measurement.internal.zzfz;
import com.google.android.gms.measurement.internal.zzga;
import com.google.android.gms.measurement.internal.zzgc;
import com.google.android.gms.measurement.internal.zzgf;
import com.google.android.gms.measurement.internal.zzgh;
import com.google.android.gms.measurement.internal.zzop;
import com.google.android.gms.measurement.internal.zzp;
import com.google.android.gms.measurement.internal.zzpm;
import java.util.List;

public abstract class zzfy
extends zzbx
implements zzfz {
    public zzfy() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    public final boolean zza(int n3, Parcel parcel, Parcel parcel2, int n4) {
        n4 = 0;
        Object object = null;
        switch (n3) {
            default: {
                return false;
            }
            case 31: {
                Object object2 = zzp.CREATOR;
                object2 = (zzp)zzbw.zza(parcel, object2);
                Parcelable.Creator creator = Bundle.CREATOR;
                creator = (Bundle)zzbw.zza(parcel, creator);
                IBinder iBinder = parcel.readStrongBinder();
                if (iBinder != null) {
                    object = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    boolean bl2 = object instanceof zzga;
                    object = bl2 ? (zzga)object : new zzgc(iBinder);
                }
                zzbw.zzb(parcel);
                this.zza((zzp)object2, (Bundle)creator, (zzga)object);
                parcel2.writeNoException();
                break;
            }
            case 30: {
                Object object3 = zzp.CREATOR;
                object3 = (zzp)zzbw.zza(parcel, object3);
                object = zzae.CREATOR;
                object = (zzae)zzbw.zza(parcel, (Parcelable.Creator)object);
                zzbw.zzb(parcel);
                this.zza((zzp)object3, (zzae)object);
                parcel2.writeNoException();
                break;
            }
            case 29: {
                Object object4 = zzp.CREATOR;
                object4 = (zzp)zzbw.zza(parcel, object4);
                Object object5 = zzop.CREATOR;
                object5 = (zzop)zzbw.zza(parcel, object5);
                IBinder iBinder = parcel.readStrongBinder();
                if (iBinder != null) {
                    object = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    boolean bl3 = object instanceof zzgf;
                    object = bl3 ? (zzgf)object : new zzgh(iBinder);
                }
                zzbw.zzb(parcel);
                this.zza((zzp)object4, (zzop)object5, (zzgf)object);
                parcel2.writeNoException();
                break;
            }
            case 27: {
                Object object6 = zzp.CREATOR;
                object6 = (zzp)zzbw.zza(parcel, object6);
                zzbw.zzb(parcel);
                this.zzc((zzp)object6);
                parcel2.writeNoException();
                break;
            }
            case 26: {
                Object object7 = zzp.CREATOR;
                object7 = (zzp)zzbw.zza(parcel, object7);
                zzbw.zzb(parcel);
                this.zzg((zzp)object7);
                parcel2.writeNoException();
                break;
            }
            case 25: {
                Object object8 = zzp.CREATOR;
                object8 = (zzp)zzbw.zza(parcel, object8);
                zzbw.zzb(parcel);
                this.zzi((zzp)object8);
                parcel2.writeNoException();
                break;
            }
            case 24: {
                Object object9 = zzp.CREATOR;
                object9 = (zzp)zzbw.zza(parcel, object9);
                object = Bundle.CREATOR;
                object = (Bundle)zzbw.zza(parcel, (Parcelable.Creator)object);
                zzbw.zzb(parcel);
                object9 = this.zza((zzp)object9, (Bundle)object);
                parcel2.writeNoException();
                parcel2.writeTypedList((List)object9);
                break;
            }
            case 21: {
                Object object10 = zzp.CREATOR;
                object10 = (zzp)zzbw.zza(parcel, object10);
                zzbw.zzb(parcel);
                object10 = this.zza((zzp)object10);
                parcel2.writeNoException();
                zzbw.zzb(parcel2, (Parcelable)object10);
                break;
            }
            case 20: {
                Object object11 = zzp.CREATOR;
                object11 = (zzp)zzbw.zza(parcel, object11);
                zzbw.zzb(parcel);
                this.zzf((zzp)object11);
                parcel2.writeNoException();
                break;
            }
            case 19: {
                Parcelable.Creator creator = Bundle.CREATOR;
                creator = (Bundle)zzbw.zza(parcel, creator);
                object = zzp.CREATOR;
                object = (zzp)zzbw.zza(parcel, (Parcelable.Creator)object);
                zzbw.zzb(parcel);
                this.zza((Bundle)creator, (zzp)object);
                parcel2.writeNoException();
                break;
            }
            case 18: {
                Object object12 = zzp.CREATOR;
                object12 = (zzp)zzbw.zza(parcel, object12);
                zzbw.zzb(parcel);
                this.zze((zzp)object12);
                parcel2.writeNoException();
                break;
            }
            case 17: {
                Object object13 = parcel.readString();
                object = parcel.readString();
                String string2 = parcel.readString();
                zzbw.zzb(parcel);
                object13 = this.zza((String)object13, (String)object, string2);
                parcel2.writeNoException();
                parcel2.writeTypedList((List)object13);
                break;
            }
            case 16: {
                Object object14 = parcel.readString();
                object = parcel.readString();
                Object object15 = zzp.CREATOR;
                object15 = (zzp)zzbw.zza(parcel, object15);
                zzbw.zzb(parcel);
                object14 = this.zza((String)object14, (String)object, (zzp)object15);
                parcel2.writeNoException();
                parcel2.writeTypedList((List)object14);
                break;
            }
            case 15: {
                Object object16 = parcel.readString();
                object = parcel.readString();
                String string3 = parcel.readString();
                boolean bl4 = zzbw.zzc(parcel);
                zzbw.zzb(parcel);
                object16 = this.zza((String)object16, (String)object, string3, bl4);
                parcel2.writeNoException();
                parcel2.writeTypedList((List)object16);
                break;
            }
            case 14: {
                Object object17 = parcel.readString();
                object = parcel.readString();
                boolean bl5 = zzbw.zzc(parcel);
                Object object18 = zzp.CREATOR;
                object18 = (zzp)zzbw.zza(parcel, object18);
                zzbw.zzb(parcel);
                object17 = this.zza((String)object17, (String)object, bl5, (zzp)object18);
                parcel2.writeNoException();
                parcel2.writeTypedList((List)object17);
                break;
            }
            case 13: {
                Object object19 = zzag.CREATOR;
                object19 = (zzag)zzbw.zza(parcel, object19);
                zzbw.zzb(parcel);
                this.zza((zzag)object19);
                parcel2.writeNoException();
                break;
            }
            case 12: {
                Object object20 = zzag.CREATOR;
                object20 = (zzag)zzbw.zza(parcel, object20);
                object = zzp.CREATOR;
                object = (zzp)zzbw.zza(parcel, (Parcelable.Creator)object);
                zzbw.zzb(parcel);
                this.zza((zzag)object20, (zzp)object);
                parcel2.writeNoException();
                break;
            }
            case 11: {
                Object object21 = zzp.CREATOR;
                object21 = (zzp)zzbw.zza(parcel, object21);
                zzbw.zzb(parcel);
                object21 = this.zzb((zzp)object21);
                parcel2.writeNoException();
                parcel2.writeString((String)object21);
                break;
            }
            case 10: {
                long l2 = parcel.readLong();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                zzbw.zzb(parcel);
                zzfy zzfy2 = this;
                this.zza(l2, string4, string5, string6);
                parcel2.writeNoException();
                break;
            }
            case 9: {
                Object object22 = zzbl.CREATOR;
                object22 = (zzbl)zzbw.zza(parcel, object22);
                object = parcel.readString();
                zzbw.zzb(parcel);
                object22 = this.zza((zzbl)object22, (String)object);
                parcel2.writeNoException();
                parcel2.writeByteArray((byte[])object22);
                break;
            }
            case 7: {
                Object object23 = zzp.CREATOR;
                object23 = (zzp)zzbw.zza(parcel, object23);
                n4 = (int)(zzbw.zzc(parcel) ? 1 : 0);
                zzbw.zzb(parcel);
                object23 = this.zza((zzp)object23, n4 != 0);
                parcel2.writeNoException();
                parcel2.writeTypedList((List)object23);
                break;
            }
            case 6: {
                Object object24 = zzp.CREATOR;
                object24 = (zzp)zzbw.zza(parcel, object24);
                zzbw.zzb(parcel);
                this.zzh((zzp)object24);
                parcel2.writeNoException();
                break;
            }
            case 5: {
                Object object25 = zzbl.CREATOR;
                object25 = (zzbl)zzbw.zza(parcel, object25);
                object = parcel.readString();
                String string7 = parcel.readString();
                zzbw.zzb(parcel);
                this.zza((zzbl)object25, (String)object, string7);
                parcel2.writeNoException();
                break;
            }
            case 4: {
                Object object26 = zzp.CREATOR;
                object26 = (zzp)zzbw.zza(parcel, object26);
                zzbw.zzb(parcel);
                this.zzd((zzp)object26);
                parcel2.writeNoException();
                break;
            }
            case 2: {
                Object object27 = zzpm.CREATOR;
                object27 = (zzpm)zzbw.zza(parcel, object27);
                object = zzp.CREATOR;
                object = (zzp)zzbw.zza(parcel, (Parcelable.Creator)object);
                zzbw.zzb(parcel);
                this.zza((zzpm)object27, (zzp)object);
                parcel2.writeNoException();
                break;
            }
            case 1: {
                Object object28 = zzbl.CREATOR;
                object28 = (zzbl)zzbw.zza(parcel, object28);
                object = zzp.CREATOR;
                object = (zzp)zzbw.zza(parcel, (Parcelable.Creator)object);
                zzbw.zzb(parcel);
                this.zza((zzbl)object28, (zzp)object);
                parcel2.writeNoException();
            }
        }
        return true;
    }
}

