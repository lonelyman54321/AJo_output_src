/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzc;
import com.google.android.gms.ads.internal.client.zzfh;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;

public final class zzl
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int zza;
    public final long zzb;
    public final Bundle zzc;
    public final int zzd;
    public final List zze;
    public final boolean zzf;
    public final int zzg;
    public final boolean zzh;
    public final String zzi;
    public final zzfh zzj;
    public final Location zzk;
    public final String zzl;
    public final Bundle zzm;
    public final Bundle zzn;
    public final List zzo;
    public final String zzp;
    public final String zzq;
    public final boolean zzr;
    public final zzc zzs;
    public final int zzt;
    public final String zzu;
    public final List zzv;
    public final int zzw;
    public final String zzx;
    public final int zzy;
    public final long zzz;

    static {
        zzn zzn2 = new zzn();
        CREATOR = zzn2;
    }

    public zzl(int n3, long l2, Bundle bundle, int n4, List list, boolean bl2, int n7, boolean bl3, String string2, zzfh zzfh2, Location location, String string3, Bundle bundle2, Bundle bundle3, List list2, String string4, String string5, boolean bl4, zzc zzc2, int n8, String string6, List list3, int n10, String string7, int n14, long l3) {
        zzl zzl2 = this;
        this.zza = n3;
        this.zzb = l2;
        Object object = bundle == null ? new Bundle() : bundle;
        zzl2.zzc = object;
        zzl2.zzd = n4;
        object = list;
        zzl2.zze = list;
        zzl2.zzf = bl2;
        zzl2.zzg = n7;
        zzl2.zzh = bl3;
        object = string2;
        zzl2.zzi = string2;
        object = zzfh2;
        zzl2.zzj = zzfh2;
        object = location;
        zzl2.zzk = location;
        object = string3;
        zzl2.zzl = string3;
        object = bundle2 == null ? new Bundle() : bundle2;
        zzl2.zzm = object;
        object = bundle3;
        zzl2.zzn = bundle3;
        object = list2;
        zzl2.zzo = list2;
        object = string4;
        zzl2.zzp = string4;
        object = string5;
        zzl2.zzq = string5;
        zzl2.zzr = bl4;
        object = zzc2;
        zzl2.zzs = zzc2;
        zzl2.zzt = n8;
        object = string6;
        zzl2.zzu = string6;
        if (list3 == null) {
        } else {
            object = list3;
        }
        zzl2.zzv = object;
        zzl2.zzw = n10;
        object = string7;
        zzl2.zzx = string7;
        zzl2.zzy = n14;
        zzl2.zzz = l3;
    }

    public final boolean equals(Object object) {
        long l2;
        long l3;
        Object object2;
        Object object3;
        long l4;
        long l7;
        long l8;
        int n3 = object instanceof zzl;
        if (n3 == 0) {
            return false;
        }
        object = (zzl)object;
        n3 = this.zza;
        int n4 = ((zzl)object).zza;
        return n3 == n4 && (n3 = (int)((l8 = (l7 = this.zzb) - (l4 = ((zzl)object).zzb)) == 0L ? 0 : (l8 < 0L ? -1 : 1))) == 0 && (n3 = (int)(com.google.android.gms.ads.internal.util.client.zzn.zza(object3 = this.zzc, object2 = ((zzl)object).zzc) ? 1 : 0)) != 0 && (n3 = this.zzd) == (n4 = ((zzl)object).zzd) && (n3 = (int)(Objects.equal(object3 = this.zze, object2 = ((zzl)object).zze) ? 1 : 0)) != 0 && (n3 = (int)(this.zzf ? 1 : 0)) == (n4 = (int)(((zzl)object).zzf ? 1 : 0)) && (n3 = this.zzg) == (n4 = ((zzl)object).zzg) && (n3 = (int)(this.zzh ? 1 : 0)) == (n4 = (int)(((zzl)object).zzh ? 1 : 0)) && (n3 = (int)(Objects.equal(object3 = this.zzi, object2 = ((zzl)object).zzi) ? 1 : 0)) != 0 && (n3 = (int)(Objects.equal(object3 = this.zzj, object2 = ((zzl)object).zzj) ? 1 : 0)) != 0 && (n3 = (int)(Objects.equal(object3 = this.zzk, object2 = ((zzl)object).zzk) ? 1 : 0)) != 0 && (n3 = (int)(Objects.equal(object3 = this.zzl, object2 = ((zzl)object).zzl) ? 1 : 0)) != 0 && (n3 = (int)(com.google.android.gms.ads.internal.util.client.zzn.zza(object3 = this.zzm, object2 = ((zzl)object).zzm) ? 1 : 0)) != 0 && (n3 = (int)(com.google.android.gms.ads.internal.util.client.zzn.zza(object3 = this.zzn, object2 = ((zzl)object).zzn) ? 1 : 0)) != 0 && (n3 = (int)(Objects.equal(object3 = this.zzo, object2 = ((zzl)object).zzo) ? 1 : 0)) != 0 && (n3 = (int)(Objects.equal(object3 = this.zzp, object2 = ((zzl)object).zzp) ? 1 : 0)) != 0 && (n3 = (int)(Objects.equal(object3 = this.zzq, object2 = ((zzl)object).zzq) ? 1 : 0)) != 0 && (n3 = (int)(this.zzr ? 1 : 0)) == (n4 = (int)(((zzl)object).zzr ? 1 : 0)) && (n3 = this.zzt) == (n4 = ((zzl)object).zzt) && (n3 = (int)(Objects.equal(object3 = this.zzu, object2 = ((zzl)object).zzu) ? 1 : 0)) != 0 && (n3 = (int)(Objects.equal(object3 = this.zzv, object2 = ((zzl)object).zzv) ? 1 : 0)) != 0 && (n3 = this.zzw) == (n4 = ((zzl)object).zzw) && (n3 = (int)(Objects.equal(object3 = this.zzx, object2 = ((zzl)object).zzx) ? 1 : 0)) != 0 && (n3 = this.zzy) == (n4 = ((zzl)object).zzy) && (l3 = (l2 = (l7 = this.zzz) - (l4 = ((zzl)object).zzz)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false;
    }

    public final int hashCode() {
        Integer n3 = this.zza;
        Long l2 = this.zzb;
        Bundle bundle = this.zzc;
        Integer n4 = this.zzd;
        List list = this.zze;
        Boolean bl2 = this.zzf;
        Integer n7 = this.zzg;
        Boolean bl3 = this.zzh;
        String string2 = this.zzi;
        zzfh zzfh2 = this.zzj;
        Location location = this.zzk;
        String string3 = this.zzl;
        Bundle bundle2 = this.zzm;
        Object object = this.zzn;
        List list2 = this.zzo;
        String string4 = this.zzp;
        String string5 = this.zzq;
        Boolean bl4 = this.zzr;
        Integer n8 = this.zzt;
        String string6 = this.zzu;
        List list3 = this.zzv;
        Integer n10 = this.zzw;
        String string7 = this.zzx;
        Object[] objectArray = Integer.valueOf(this.zzy);
        Bundle bundle3 = object;
        Object[] objectArray2 = objectArray;
        object = this.zzz;
        objectArray = new Object[]{n3, l2, bundle, n4, list, bl2, n7, bl3, string2, zzfh2, location, string3, bundle2, bundle3, list2, string4, string5, bl4, n8, string6, list3, n10, string7, objectArray2, object};
        return Objects.hashCode(objectArray);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4 = this.zza;
        int n7 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, n4);
        long l2 = this.zzb;
        SafeParcelWriter.writeLong(parcel, 2, l2);
        Object object = this.zzc;
        SafeParcelWriter.writeBundle(parcel, 3, object, false);
        int bl2 = this.zzd;
        SafeParcelWriter.writeInt(parcel, 4, bl2);
        Object object2 = this.zze;
        SafeParcelWriter.writeStringList(parcel, 5, (List)object2, false);
        boolean bl3 = this.zzf;
        SafeParcelWriter.writeBoolean(parcel, 6, bl3);
        int n8 = this.zzg;
        SafeParcelWriter.writeInt(parcel, 7, n8);
        boolean bl4 = this.zzh;
        SafeParcelWriter.writeBoolean(parcel, 8, bl4);
        object2 = this.zzi;
        SafeParcelWriter.writeString(parcel, 9, (String)object2, false);
        object2 = this.zzj;
        SafeParcelWriter.writeParcelable(parcel, 10, (Parcelable)object2, n3, false);
        object2 = this.zzk;
        SafeParcelWriter.writeParcelable(parcel, 11, (Parcelable)object2, n3, false);
        object2 = this.zzl;
        SafeParcelWriter.writeString(parcel, 12, (String)object2, false);
        object2 = this.zzm;
        SafeParcelWriter.writeBundle(parcel, 13, (Bundle)object2, false);
        object2 = this.zzn;
        SafeParcelWriter.writeBundle(parcel, 14, (Bundle)object2, false);
        object2 = this.zzo;
        SafeParcelWriter.writeStringList(parcel, 15, (List)object2, false);
        object2 = this.zzp;
        SafeParcelWriter.writeString(parcel, 16, (String)object2, false);
        object2 = this.zzq;
        SafeParcelWriter.writeString(parcel, 17, (String)object2, false);
        boolean bl5 = this.zzr;
        SafeParcelWriter.writeBoolean(parcel, 18, bl5);
        object2 = this.zzs;
        SafeParcelWriter.writeParcelable(parcel, 19, (Parcelable)object2, n3, false);
        n4 = this.zzt;
        SafeParcelWriter.writeInt(parcel, 20, n4);
        object = this.zzu;
        SafeParcelWriter.writeString(parcel, 21, (String)object, false);
        object = this.zzv;
        SafeParcelWriter.writeStringList(parcel, 22, (List)object, false);
        n4 = this.zzw;
        SafeParcelWriter.writeInt(parcel, 23, n4);
        object = this.zzx;
        SafeParcelWriter.writeString(parcel, 24, (String)object, false);
        n4 = this.zzy;
        SafeParcelWriter.writeInt(parcel, 25, n4);
        l2 = this.zzz;
        SafeParcelWriter.writeLong(parcel, 26, l2);
        SafeParcelWriter.finishObjectHeader(parcel, n7);
    }
}

