/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.zzaw;
import com.google.android.gms.fido.fido2.api.common.zzax;

public final class zzay
extends Enum
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public static final /* enum */ zzay zza;
    public static final /* enum */ zzay zzb;
    public static final /* enum */ zzay zzc;
    private static final /* synthetic */ zzay[] zzd;
    private final String zze;

    static {
        zzay zzay2;
        zzay zzay3;
        Object object;
        zza = object = new zzay("USER_VERIFICATION_REQUIRED", 0, "required");
        int n3 = 1;
        zzb = zzay3 = new zzay("USER_VERIFICATION_PREFERRED", n3, "preferred");
        int n4 = 2;
        zzc = zzay2 = new zzay("USER_VERIFICATION_DISCOURAGED", n4, "discouraged");
        zzay[] zzayArray = new zzay[3];
        zzayArray[0] = object;
        zzayArray[n3] = zzay3;
        zzayArray[n4] = zzay2;
        zzd = zzayArray;
        object = new zzaw();
        CREATOR = object;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzay() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zze = var3_2;
    }

    public static zzay[] values() {
        return (zzay[])zzd.clone();
    }

    public static zzay zza(String string2) {
        for (zzay zzay2 : zzay.values()) {
            String string3 = zzay2.zze;
            boolean bl2 = string2.equals(string3);
            if (!bl2) continue;
            return zzay2;
        }
        zzax zzax2 = new zzax(string2);
        throw zzax2;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.zze;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        String string2 = this.zze;
        parcel.writeString(string2);
    }
}

