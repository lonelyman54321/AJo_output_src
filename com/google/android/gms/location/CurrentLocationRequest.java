/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.os.WorkSource
 */
package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.internal.location.zze;
import com.google.android.gms.internal.location.zzeo;
import com.google.android.gms.location.zzan;
import com.google.android.gms.location.zzar;
import com.google.android.gms.location.zzj;
import com.google.android.gms.location.zzq;

public final class CurrentLocationRequest
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final long zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;
    private final boolean zze;
    private final int zzf;
    private final WorkSource zzg;
    private final zze zzh;

    static {
        zzj zzj2 = new zzj();
        CREATOR = zzj2;
    }

    public CurrentLocationRequest(long l2, int n3, int n4, long l3, boolean bl2, int n7, WorkSource workSource, zze zze2) {
        this.zza = l2;
        this.zzb = n3;
        this.zzc = n4;
        this.zzd = l3;
        this.zze = bl2;
        this.zzf = n7;
        this.zzg = workSource;
        this.zzh = zze2;
    }

    public boolean equals(Object object) {
        boolean bl2;
        WorkSource workSource;
        Object object2;
        long l2;
        int n3;
        Object object3 = object instanceof CurrentLocationRequest;
        if (object3 == 0) {
            return false;
        }
        object = (CurrentLocationRequest)object;
        long l3 = this.zza;
        long l4 = ((CurrentLocationRequest)object).zza;
        long l7 = l3 - l4;
        object3 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        return object3 == 0 && (object3 = this.zzb) == (n3 = ((CurrentLocationRequest)object).zzb) && (object3 = this.zzc) == (n3 = ((CurrentLocationRequest)object).zzc) && (object3 = (Object)((l2 = (l3 = this.zzd) - (l4 = ((CurrentLocationRequest)object).zzd)) == 0L ? 0 : (l2 < 0L ? -1 : 1))) == 0 && (object3 = (Object)this.zze) == (n3 = (int)(((CurrentLocationRequest)object).zze ? 1 : 0)) && (object3 = this.zzf) == (n3 = ((CurrentLocationRequest)object).zzf) && (object3 = (Object)Objects.equal(object2 = this.zzg, workSource = ((CurrentLocationRequest)object).zzg)) != 0 && (bl2 = Objects.equal(object2 = this.zzh, object = ((CurrentLocationRequest)object).zzh));
    }

    public long getDurationMillis() {
        return this.zzd;
    }

    public int getGranularity() {
        return this.zzb;
    }

    public long getMaxUpdateAgeMillis() {
        return this.zza;
    }

    public int getPriority() {
        return this.zzc;
    }

    public int hashCode() {
        Long l2 = this.zza;
        Integer n3 = this.zzb;
        Integer n4 = this.zzc;
        Long l3 = this.zzd;
        Object[] objectArray = new Object[]{l2, n3, n4, l3};
        return Objects.hashCode(objectArray);
    }

    public String toString() {
        long l2;
        StringBuilder stringBuilder = Ex0.a("CurrentLocationRequest[");
        int n3 = this.zzc;
        Object object = zzan.zzb(n3);
        stringBuilder.append((String)object);
        long l3 = this.zza;
        long l4 = Long.MAX_VALUE;
        long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (l7 != false) {
            object = ", maxAge=";
            stringBuilder.append((String)object);
            l3 = this.zza;
            zzeo.zzc(l3, stringBuilder);
        }
        if ((l7 = (l2 = (l3 = this.zzd) - l4) == 0L ? 0 : (l2 < 0L ? -1 : 1)) != false) {
            stringBuilder.append(", duration=");
            l3 = this.zzd;
            stringBuilder.append(l3);
            object = "ms";
            stringBuilder.append((String)object);
        }
        n3 = this.zzb;
        String string2 = ", ";
        if (n3 != 0) {
            stringBuilder.append(string2);
            n3 = this.zzb;
            object = zzq.zzb(n3);
            stringBuilder.append((String)object);
        }
        if ((n3 = (int)(this.zze ? 1 : 0)) != 0) {
            object = ", bypass";
            stringBuilder.append((String)object);
        }
        if ((n3 = this.zzf) != 0) {
            stringBuilder.append(string2);
            n3 = this.zzf;
            object = zzar.zzb(n3);
            stringBuilder.append((String)object);
        }
        if ((n3 = (int)(WorkSourceUtil.isEmpty((WorkSource)(object = this.zzg)) ? 1 : 0)) == 0) {
            stringBuilder.append(", workSource=");
            object = this.zzg;
            stringBuilder.append(object);
        }
        if ((object = this.zzh) != null) {
            stringBuilder.append(", impersonation=");
            object = this.zzh;
            stringBuilder.append(object);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        long l2 = this.getMaxUpdateAgeMillis();
        SafeParcelWriter.writeLong(parcel, 1, l2);
        int n7 = this.getGranularity();
        SafeParcelWriter.writeInt(parcel, 2, n7);
        n7 = this.getPriority();
        SafeParcelWriter.writeInt(parcel, 3, n7);
        l2 = this.getDurationMillis();
        SafeParcelWriter.writeLong(parcel, 4, l2);
        n7 = (int)(this.zze ? 1 : 0);
        SafeParcelWriter.writeBoolean(parcel, 5, n7 != 0);
        WorkSource workSource = this.zzg;
        SafeParcelWriter.writeParcelable(parcel, 6, (Parcelable)workSource, n3, false);
        n7 = this.zzf;
        SafeParcelWriter.writeInt(parcel, 7, n7);
        zze zze2 = this.zzh;
        SafeParcelWriter.writeParcelable(parcel, 9, zze2, n3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }

    public final boolean zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zzf;
    }

    public final WorkSource zzc() {
        return this.zzg;
    }

    public final zze zzd() {
        return this.zzh;
    }
}

