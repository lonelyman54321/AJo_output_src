/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 */
package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.zzm;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;

public class TokenData
extends AbstractSafeParcelable
implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zza;
    private final String zzb;
    private final Long zzc;
    private final boolean zzd;
    private final boolean zze;
    private final List zzf;
    private final String zzg;

    static {
        zzm zzm2 = new zzm();
        CREATOR = zzm2;
    }

    public TokenData(int n3, String string2, Long l2, boolean bl2, boolean bl3, List list, String string3) {
        String string4;
        this.zza = n3;
        this.zzb = string4 = Preconditions.checkNotEmpty(string2);
        this.zzc = l2;
        this.zzd = bl2;
        this.zze = bl3;
        this.zzf = list;
        this.zzg = string3;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3;
        boolean bl4 = object instanceof TokenData;
        if (!bl4) {
            return false;
        }
        object = (TokenData)object;
        Object object2 = this.zzb;
        Object object3 = ((TokenData)object).zzb;
        bl4 = TextUtils.equals((CharSequence)object2, (CharSequence)object3);
        return bl4 && (bl4 = Objects.equal(object2 = this.zzc, object3 = ((TokenData)object).zzc)) && (bl4 = this.zzd) == (bl3 = ((TokenData)object).zzd) && (bl4 = this.zze) == (bl3 = ((TokenData)object).zze) && (bl4 = Objects.equal(object2 = this.zzf, object3 = ((TokenData)object).zzf)) && (bl2 = Objects.equal(object2 = this.zzg, object = ((TokenData)object).zzg));
    }

    public final int hashCode() {
        String string2 = this.zzb;
        Long l2 = this.zzc;
        Boolean bl2 = this.zzd;
        Boolean bl3 = this.zze;
        List list = this.zzf;
        String string3 = this.zzg;
        Object[] objectArray = new Object[]{string2, l2, bl2, bl3, list, string3};
        return Objects.hashCode(objectArray);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        int bl2 = this.zza;
        SafeParcelWriter.writeInt(parcel, 1, bl2);
        String string2 = this.zzb;
        SafeParcelWriter.writeString(parcel, 2, string2, false);
        Object object = this.zzc;
        SafeParcelWriter.writeLongObject(parcel, 3, (Long)object, false);
        boolean bl3 = this.zzd;
        SafeParcelWriter.writeBoolean(parcel, 4, bl3);
        boolean bl4 = this.zze;
        SafeParcelWriter.writeBoolean(parcel, 5, bl4);
        object = this.zzf;
        SafeParcelWriter.writeStringList(parcel, 6, (List)object, false);
        object = this.zzg;
        SafeParcelWriter.writeString(parcel, 7, (String)object, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }

    public final String zza() {
        return this.zzb;
    }
}

