/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 */
package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.measurement.internal.zzr;
import java.util.List;

public final class zzp
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final int zzaa;
    public final long zzab;
    public final String zzac;
    public final String zzad;
    public final long zzae;
    public final int zzaf;
    private final String zzag;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final long zze;
    public final long zzf;
    public final String zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final long zzj;
    public final String zzk;
    public final long zzl;
    public final int zzm;
    public final boolean zzn;
    public final boolean zzo;
    public final String zzp;
    public final Boolean zzq;
    public final long zzr;
    public final List zzs;
    public final String zzt;
    public final String zzu;
    public final String zzv;
    public final boolean zzw;
    public final long zzx;
    public final int zzy;
    public final String zzz;

    static {
        zzr zzr2 = new zzr();
        CREATOR = zzr2;
    }

    public zzp(String string2, String string3, String string4, long l2, String string5, long l3, long l4, String string6, boolean n3, boolean n4, String string7, long l7, int n7, boolean bl2, boolean bl3, String string8, Boolean bl4, long l8, List list, String string9, String string10, String string11, String string12, boolean bl5, long l12, int n8, String string13, int n10, long l14, String string14, String string15, long l15, int n14) {
        zzp zzp2 = this;
        Preconditions.checkNotEmpty(string2);
        Object object = string2;
        this.zza = string2;
        int n15 = TextUtils.isEmpty((CharSequence)string3);
        if (n15 != 0) {
            n15 = 0;
            object = null;
        } else {
            object = string3;
        }
        zzp2.zzb = object;
        object = string4;
        zzp2.zzc = string4;
        zzp2.zzj = l2;
        object = string5;
        zzp2.zzd = string5;
        zzp2.zze = l3;
        zzp2.zzf = l4;
        object = string6;
        zzp2.zzg = string6;
        n15 = n3;
        zzp2.zzh = n3;
        n15 = n4;
        zzp2.zzi = n4;
        object = string7;
        zzp2.zzk = string7;
        zzp2.zzl = l7;
        n15 = n7;
        zzp2.zzm = n7;
        n15 = (int)(bl2 ? 1 : 0);
        zzp2.zzn = bl2;
        n15 = (int)(bl3 ? 1 : 0);
        zzp2.zzo = bl3;
        object = string8;
        zzp2.zzp = string8;
        object = bl4;
        zzp2.zzq = bl4;
        zzp2.zzr = l8;
        object = list;
        zzp2.zzs = list;
        zzp2.zzag = null;
        object = string10;
        zzp2.zzt = string10;
        object = string11;
        zzp2.zzu = string11;
        object = string12;
        zzp2.zzv = string12;
        n15 = (int)(bl5 ? 1 : 0);
        zzp2.zzw = bl5;
        zzp2.zzx = l12;
        n15 = n8;
        zzp2.zzy = n8;
        object = string13;
        zzp2.zzz = string13;
        n15 = n10;
        zzp2.zzaa = n10;
        zzp2.zzab = l14;
        object = string14;
        zzp2.zzac = string14;
        object = string15;
        zzp2.zzad = string15;
        zzp2.zzae = l15;
        n15 = n14;
        zzp2.zzaf = n14;
    }

    public zzp(String string2, String string3, String string4, String string5, long l2, long l3, String string6, boolean bl2, boolean bl3, long l4, String string7, long l7, int n3, boolean bl4, boolean bl5, String string8, Boolean bl6, long l8, List list, String string9, String string10, String string11, String string12, boolean bl7, long l12, int n4, String string13, int n7, long l14, String string14, String string15, long l15, int n8) {
        this.zza = string2;
        this.zzb = string3;
        this.zzc = string4;
        this.zzj = l4;
        this.zzd = string5;
        this.zze = l2;
        this.zzf = l3;
        this.zzg = string6;
        this.zzh = bl2;
        this.zzi = bl3;
        this.zzk = string7;
        this.zzl = l7;
        this.zzm = n3;
        this.zzn = bl4;
        this.zzo = bl5;
        this.zzp = string8;
        this.zzq = bl6;
        this.zzr = l8;
        this.zzs = list;
        this.zzag = string9;
        this.zzt = string10;
        this.zzu = string11;
        this.zzv = string12;
        this.zzw = bl7;
        this.zzx = l12;
        this.zzy = n4;
        this.zzz = string13;
        this.zzaa = n7;
        this.zzab = l14;
        this.zzac = string14;
        this.zzad = string15;
        this.zzae = l15;
        this.zzaf = n8;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        String string2 = this.zza;
        SafeParcelWriter.writeString(parcel, 2, string2, false);
        Object object = this.zzb;
        SafeParcelWriter.writeString(parcel, 3, (String)object, false);
        object = this.zzc;
        SafeParcelWriter.writeString(parcel, 4, (String)object, false);
        object = this.zzd;
        SafeParcelWriter.writeString(parcel, 5, (String)object, false);
        long l2 = this.zze;
        SafeParcelWriter.writeLong(parcel, 6, l2);
        l2 = this.zzf;
        SafeParcelWriter.writeLong(parcel, 7, l2);
        object = this.zzg;
        SafeParcelWriter.writeString(parcel, 8, (String)object, false);
        int n4 = this.zzh;
        SafeParcelWriter.writeBoolean(parcel, 9, n4 != 0);
        n4 = this.zzi;
        SafeParcelWriter.writeBoolean(parcel, 10, n4 != 0);
        l2 = this.zzj;
        SafeParcelWriter.writeLong(parcel, 11, l2);
        object = this.zzk;
        SafeParcelWriter.writeString(parcel, 12, (String)object, false);
        l2 = this.zzl;
        SafeParcelWriter.writeLong(parcel, 14, l2);
        n4 = this.zzm;
        SafeParcelWriter.writeInt(parcel, 15, n4);
        n4 = (int)(this.zzn ? 1 : 0);
        SafeParcelWriter.writeBoolean(parcel, 16, n4 != 0);
        n4 = this.zzo;
        SafeParcelWriter.writeBoolean(parcel, 18, n4 != 0);
        object = this.zzp;
        SafeParcelWriter.writeString(parcel, 19, (String)object, false);
        object = this.zzq;
        SafeParcelWriter.writeBooleanObject(parcel, 21, (Boolean)object, false);
        l2 = this.zzr;
        SafeParcelWriter.writeLong(parcel, 22, l2);
        object = this.zzs;
        SafeParcelWriter.writeStringList(parcel, 23, (List)object, false);
        object = this.zzag;
        SafeParcelWriter.writeString(parcel, 24, (String)object, false);
        object = this.zzt;
        SafeParcelWriter.writeString(parcel, 25, (String)object, false);
        object = this.zzu;
        SafeParcelWriter.writeString(parcel, 26, (String)object, false);
        object = this.zzv;
        SafeParcelWriter.writeString(parcel, 27, (String)object, false);
        n4 = this.zzw;
        SafeParcelWriter.writeBoolean(parcel, 28, n4 != 0);
        l2 = this.zzx;
        SafeParcelWriter.writeLong(parcel, 29, l2);
        n4 = this.zzy;
        SafeParcelWriter.writeInt(parcel, 30, n4);
        object = this.zzz;
        SafeParcelWriter.writeString(parcel, 31, (String)object, false);
        n4 = this.zzaa;
        SafeParcelWriter.writeInt(parcel, 32, n4);
        l2 = this.zzab;
        SafeParcelWriter.writeLong(parcel, 34, l2);
        object = this.zzac;
        SafeParcelWriter.writeString(parcel, 35, (String)object, false);
        object = this.zzad;
        SafeParcelWriter.writeString(parcel, 36, (String)object, false);
        long l3 = this.zzae;
        SafeParcelWriter.writeLong(parcel, 37, l3);
        n4 = this.zzaf;
        SafeParcelWriter.writeInt(parcel, 38, n4);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

