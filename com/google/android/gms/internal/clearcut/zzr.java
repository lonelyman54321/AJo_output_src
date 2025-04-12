/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.clearcut.zzge$zzv$zzb;
import com.google.android.gms.internal.clearcut.zzs;

public final class zzr
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final String packageName;
    private final boolean zzay;
    private final int zzaz;
    private final int zzi;
    public final String zzj;
    public final int zzk;
    private final String zzl;
    private final String zzm;
    private final boolean zzn;

    static {
        zzs zzs2 = new zzs();
        CREATOR = zzs2;
    }

    public zzr(String string2, int n3, int n4, String string3, String string4, String string5, boolean bl2, zzge$zzv$zzb zzge$zzv$zzb) {
        int n7;
        this.packageName = string2 = (String)Preconditions.checkNotNull(string2);
        this.zzi = n3;
        this.zzk = n4;
        this.zzj = string3;
        this.zzl = string4;
        this.zzm = string5;
        this.zzay = n7 = bl2 ^ 1;
        this.zzn = bl2;
        this.zzaz = n7 = zzge$zzv$zzb.zzc();
    }

    public zzr(String string2, int n3, int n4, String string3, String string4, boolean bl2, String string5, boolean bl3, int n7) {
        this.packageName = string2;
        this.zzi = n3;
        this.zzk = n4;
        this.zzl = string3;
        this.zzm = string4;
        this.zzay = bl2;
        this.zzj = string5;
        this.zzn = bl3;
        this.zzaz = n7;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof zzr;
        if (n3 != 0) {
            int n4;
            int n7;
            object = (zzr)object;
            String string2 = this.packageName;
            String string3 = ((zzr)object).packageName;
            n3 = Objects.equal(string2, string3);
            if (n3 != 0 && (n3 = this.zzi) == (n7 = ((zzr)object).zzi) && (n3 = this.zzk) == (n7 = ((zzr)object).zzk) && (n3 = (int)(Objects.equal(string2 = this.zzj, string3 = ((zzr)object).zzj) ? 1 : 0)) != 0 && (n3 = (int)(Objects.equal(string2 = this.zzl, string3 = ((zzr)object).zzl) ? 1 : 0)) != 0 && (n3 = (int)(Objects.equal(string2 = this.zzm, string3 = ((zzr)object).zzm) ? 1 : 0)) != 0 && (n3 = (int)(this.zzay ? 1 : 0)) == (n7 = (int)(((zzr)object).zzay ? 1 : 0)) && (n3 = (int)(this.zzn ? 1 : 0)) == (n7 = (int)(((zzr)object).zzn ? 1 : 0)) && (n3 = this.zzaz) == (n4 = ((zzr)object).zzaz)) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        String string2 = this.packageName;
        Integer n3 = this.zzi;
        Integer n4 = this.zzk;
        String string3 = this.zzj;
        String string4 = this.zzl;
        String string5 = this.zzm;
        Boolean bl2 = this.zzay;
        Boolean bl3 = this.zzn;
        Integer n7 = this.zzaz;
        Object[] objectArray = new Object[]{string2, n3, n4, string3, string4, string5, bl2, bl3, n7};
        return Objects.hashCode(objectArray);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PlayLoggerContext[package=");
        String string2 = this.packageName;
        stringBuilder.append(string2);
        stringBuilder.append(",packageVersionCode=");
        int bl2 = this.zzi;
        stringBuilder.append(bl2);
        stringBuilder.append(",logSource=");
        int n3 = this.zzk;
        stringBuilder.append(n3);
        stringBuilder.append(",logSourceName=");
        string2 = this.zzj;
        stringBuilder.append(string2);
        stringBuilder.append(",uploadAccount=");
        string2 = this.zzl;
        stringBuilder.append(string2);
        stringBuilder.append(",loggingId=");
        string2 = this.zzm;
        stringBuilder.append(string2);
        stringBuilder.append(",logAndroidId=");
        boolean bl3 = this.zzay;
        stringBuilder.append(bl3);
        stringBuilder.append(",isAnonymous=");
        boolean bl4 = this.zzn;
        stringBuilder.append(bl4);
        stringBuilder.append(",qosTier=");
        return g30.a(this.zzaz, "]", stringBuilder);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        String string2 = this.packageName;
        SafeParcelWriter.writeString(parcel, 2, string2, false);
        int n4 = this.zzi;
        SafeParcelWriter.writeInt(parcel, 3, n4);
        n4 = this.zzk;
        SafeParcelWriter.writeInt(parcel, 4, n4);
        String string3 = this.zzl;
        SafeParcelWriter.writeString(parcel, 5, string3, false);
        string3 = this.zzm;
        SafeParcelWriter.writeString(parcel, 6, string3, false);
        n4 = (int)(this.zzay ? 1 : 0);
        SafeParcelWriter.writeBoolean(parcel, 7, n4 != 0);
        string3 = this.zzj;
        SafeParcelWriter.writeString(parcel, 8, string3, false);
        n4 = this.zzn;
        SafeParcelWriter.writeBoolean(parcel, 9, n4 != 0);
        n4 = this.zzaz;
        SafeParcelWriter.writeInt(parcel, 10, n4);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

