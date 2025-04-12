/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.play.core.splitinstall.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.splitinstall.internal.zzbq;
import com.google.android.play.core.splitinstall.internal.zzl;
import com.google.android.play.core.splitinstall.internal.zzm;
import java.util.List;

public abstract class zzbp
extends zzl
implements zzbq {
    public zzbp() {
        super("com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
    }

    public final boolean zza(int n3, Parcel parcel, Parcel parcel2, int n4) {
        switch (n3) {
            default: {
                return false;
            }
            case 13: {
                Parcelable.Creator creator = Bundle.CREATOR;
                creator = (Bundle)zzm.zza(parcel, creator);
                zzm.zzb(parcel);
                this.zze((Bundle)creator);
                break;
            }
            case 12: {
                Parcelable.Creator creator = Bundle.CREATOR;
                creator = (Bundle)zzm.zza(parcel, creator);
                zzm.zzb(parcel);
                this.zzd((Bundle)creator);
                break;
            }
            case 11: {
                Parcelable.Creator creator = Bundle.CREATOR;
                creator = (Bundle)zzm.zza(parcel, creator);
                zzm.zzb(parcel);
                this.zzk((Bundle)creator);
                break;
            }
            case 10: {
                Parcelable.Creator creator = Bundle.CREATOR;
                creator = (Bundle)zzm.zza(parcel, creator);
                zzm.zzb(parcel);
                this.zzm((Bundle)creator);
                break;
            }
            case 9: {
                Parcelable.Creator creator = Bundle.CREATOR;
                creator = (Bundle)zzm.zza(parcel, creator);
                zzm.zzb(parcel);
                this.zzc((Bundle)creator);
                break;
            }
            case 8: {
                Parcelable.Creator creator = Bundle.CREATOR;
                creator = (Bundle)zzm.zza(parcel, creator);
                zzm.zzb(parcel);
                this.zzf((Bundle)creator);
                break;
            }
            case 7: {
                Object object = Bundle.CREATOR;
                object = parcel.createTypedArrayList(object);
                zzm.zzb(parcel);
                this.zzh((List)object);
                break;
            }
            case 6: {
                Parcelable.Creator creator = Bundle.CREATOR;
                creator = (Bundle)zzm.zza(parcel, creator);
                zzm.zzb(parcel);
                this.zzl((Bundle)creator);
                break;
            }
            case 5: {
                n3 = parcel.readInt();
                parcel2 = Bundle.CREATOR;
                parcel2 = (Bundle)zzm.zza(parcel, (Parcelable.Creator)parcel2);
                zzm.zzb(parcel);
                this.zzg(n3, (Bundle)parcel2);
                break;
            }
            case 4: {
                n3 = parcel.readInt();
                parcel2 = Bundle.CREATOR;
                parcel2 = (Bundle)zzm.zza(parcel, (Parcelable.Creator)parcel2);
                zzm.zzb(parcel);
                this.zzb(n3, (Bundle)parcel2);
                break;
            }
            case 3: {
                n3 = parcel.readInt();
                parcel2 = Bundle.CREATOR;
                parcel2 = (Bundle)zzm.zza(parcel, (Parcelable.Creator)parcel2);
                zzm.zzb(parcel);
                this.zzj(n3, (Bundle)parcel2);
                break;
            }
            case 2: {
                n3 = parcel.readInt();
                parcel2 = Bundle.CREATOR;
                parcel2 = (Bundle)zzm.zza(parcel, (Parcelable.Creator)parcel2);
                zzm.zzb(parcel);
                this.zzi(n3, (Bundle)parcel2);
            }
        }
        return true;
    }
}

