/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.firebase.appindexing.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.icing.zzbp;
import com.google.firebase.appindexing.Action;
import com.google.firebase.appindexing.internal.zzb;
import com.google.firebase.appindexing.internal.zzd;

public final class zzc
extends AbstractSafeParcelable
implements Action {
    public static final Parcelable.Creator CREATOR;
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final zzb zze;
    private final String zzf;
    private final Bundle zzg;

    static {
        zzd zzd2 = new zzd();
        CREATOR = zzd2;
    }

    public zzc(String object, String string2, String string3, String string4, zzb zzb2, String string5, Bundle bundle) {
        this.zza = object;
        this.zzb = string2;
        this.zzc = string3;
        this.zzd = string4;
        this.zze = zzb2;
        this.zzf = string5;
        if (bundle != null) {
            this.zzg = bundle;
        } else {
            object = Bundle.EMPTY;
            this.zzg = object;
        }
        object = zzc.class.getClassLoader();
        zzbp.zza(object);
        this.zzg.setClassLoader((ClassLoader)object);
    }

    public final String toString() {
        boolean bl2;
        StringBuilder stringBuilder = new StringBuilder("ActionImpl { { actionType: '");
        String string2 = this.zza;
        stringBuilder.append(string2);
        stringBuilder.append("' } { objectName: '");
        string2 = this.zzb;
        stringBuilder.append(string2);
        stringBuilder.append("' } { objectUrl: '");
        string2 = this.zzc;
        stringBuilder.append(string2);
        string2 = "' } ";
        stringBuilder.append(string2);
        Object object = this.zzd;
        if (object != null) {
            stringBuilder.append("{ objectSameAs: '");
            object = this.zzd;
            stringBuilder.append((String)object);
            stringBuilder.append(string2);
        }
        if ((object = this.zze) != null) {
            stringBuilder.append("{ metadata: '");
            object = this.zze.toString();
            stringBuilder.append((String)object);
            stringBuilder.append(string2);
        }
        if ((object = this.zzf) != null) {
            stringBuilder.append("{ actionStatus: '");
            object = this.zzf;
            stringBuilder.append((String)object);
            stringBuilder.append(string2);
        }
        if (!(bl2 = (string2 = this.zzg).isEmpty())) {
            stringBuilder.append("{ ");
            string2 = this.zzg;
            stringBuilder.append((Object)string2);
            string2 = " } ";
            stringBuilder.append(string2);
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        String string2 = this.zza;
        SafeParcelWriter.writeString(parcel, 1, string2, false);
        Object object = this.zzb;
        SafeParcelWriter.writeString(parcel, 2, (String)object, false);
        object = this.zzc;
        SafeParcelWriter.writeString(parcel, 3, (String)object, false);
        object = this.zzd;
        SafeParcelWriter.writeString(parcel, 4, (String)object, false);
        object = this.zze;
        SafeParcelWriter.writeParcelable(parcel, 5, (Parcelable)object, n3, false);
        string2 = this.zzf;
        SafeParcelWriter.writeString(parcel, 6, string2, false);
        string2 = this.zzg;
        SafeParcelWriter.writeBundle(parcel, 7, (Bundle)string2, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }

    public final zzb zza() {
        return this.zze;
    }
}

