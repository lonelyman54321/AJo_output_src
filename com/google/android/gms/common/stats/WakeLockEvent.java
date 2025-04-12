/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 */
package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.stats.StatsEvent;
import com.google.android.gms.common.stats.zza;
import java.util.List;

public final class WakeLockEvent
extends StatsEvent {
    public static final Parcelable.Creator CREATOR;
    final int zza;
    private final long zzb;
    private final int zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final int zzg;
    private final List zzh;
    private final String zzi;
    private final long zzj;
    private final int zzk;
    private final String zzl;
    private final float zzm;
    private final long zzn;
    private final boolean zzo;

    static {
        zza zza2 = new zza();
        CREATOR = zza2;
    }

    public WakeLockEvent(int n3, long l2, int n4, String string2, int n7, List list, String string3, long l3, int n8, String string4, String string5, float f5, long l4, String string6, boolean bl2) {
        this.zza = n3;
        this.zzb = l2;
        this.zzc = n4;
        this.zzd = string2;
        this.zze = string4;
        this.zzf = string6;
        this.zzg = n7;
        this.zzh = list;
        this.zzi = string3;
        this.zzj = l3;
        this.zzk = n8;
        this.zzl = string5;
        this.zzm = f5;
        this.zzn = l4;
        this.zzo = bl2;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        int bl2 = this.zza;
        SafeParcelWriter.writeInt(parcel, 1, bl2);
        long l2 = this.zzb;
        SafeParcelWriter.writeLong(parcel, 2, l2);
        String string2 = this.zzd;
        SafeParcelWriter.writeString(parcel, 4, string2, false);
        int n4 = this.zzg;
        SafeParcelWriter.writeInt(parcel, 5, n4);
        Object object = this.zzh;
        SafeParcelWriter.writeStringList(parcel, 6, (List)object, false);
        long l3 = this.zzj;
        SafeParcelWriter.writeLong(parcel, 8, l3);
        object = this.zze;
        SafeParcelWriter.writeString(parcel, 10, (String)object, false);
        int n7 = this.zzc;
        SafeParcelWriter.writeInt(parcel, 11, n7);
        object = this.zzi;
        SafeParcelWriter.writeString(parcel, 12, (String)object, false);
        object = this.zzl;
        SafeParcelWriter.writeString(parcel, 13, (String)object, false);
        int n8 = this.zzk;
        SafeParcelWriter.writeInt(parcel, 14, n8);
        float f5 = this.zzm;
        SafeParcelWriter.writeFloat(parcel, 15, f5);
        l3 = this.zzn;
        SafeParcelWriter.writeLong(parcel, 16, l3);
        object = this.zzf;
        SafeParcelWriter.writeString(parcel, 17, (String)object, false);
        boolean bl3 = this.zzo;
        SafeParcelWriter.writeBoolean(parcel, 18, bl3);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }

    public final int zza() {
        return this.zzc;
    }

    public final long zzb() {
        return this.zzb;
    }

    public final String zzc() {
        Object object = this.zzh;
        String string2 = "";
        if (object == null) {
            object = string2;
        } else {
            String string3 = ",";
            object = TextUtils.join((CharSequence)string3, (Iterable)object);
        }
        int n3 = this.zzk;
        String string4 = this.zze;
        String string5 = this.zzl;
        float f5 = this.zzm;
        String string6 = this.zzf;
        int n4 = this.zzg;
        String string7 = this.zzd;
        boolean bl2 = this.zzo;
        String string8 = "\t";
        StringBuilder stringBuilder = oe3_0.a(n4, string8, string7, string8, string8);
        stringBuilder.append((String)object);
        stringBuilder.append(string8);
        stringBuilder.append(n3);
        stringBuilder.append(string8);
        if (string4 == null) {
            string4 = string2;
        }
        stringBuilder.append(string4);
        stringBuilder.append(string8);
        if (string5 == null) {
            string5 = string2;
        }
        stringBuilder.append(string5);
        stringBuilder.append(string8);
        stringBuilder.append(f5);
        stringBuilder.append(string8);
        if (string6 != null) {
            string2 = string6;
        }
        stringBuilder.append(string2);
        stringBuilder.append(string8);
        stringBuilder.append(bl2);
        return stringBuilder.toString();
    }
}

