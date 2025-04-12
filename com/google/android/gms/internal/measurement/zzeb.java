/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.measurement.zzee;
import java.util.Objects;

public final class zzeb
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int zza;
    public final String zzb;
    public final Intent zzc;

    static {
        zzee zzee2 = new zzee();
        CREATOR = zzee2;
    }

    public zzeb(int n3, String string2, Intent intent) {
        this.zza = n3;
        this.zzb = string2;
        this.zzc = intent;
    }

    public static zzeb zza(Activity activity) {
        int n3 = activity.hashCode();
        String string2 = activity.getClass().getCanonicalName();
        activity = activity.getIntent();
        zzeb zzeb2 = new zzeb(n3, string2, (Intent)activity);
        return zzeb2;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        String string2;
        String string3;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        int n3 = object instanceof zzeb;
        if (n3 == 0) {
            return false;
        }
        object = (zzeb)object;
        n3 = this.zza;
        int n4 = ((zzeb)object).zza;
        if (n3 == n4 && (n3 = (int)(Objects.equals(string3 = this.zzb, string2 = ((zzeb)object).zzb) ? 1 : 0)) != 0 && (bl2 = Objects.equals(string3 = this.zzc, object = ((zzeb)object).zzc))) {
            return bl3;
        }
        return false;
    }

    public final int hashCode() {
        return this.zza;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        int n7 = this.zza;
        SafeParcelWriter.writeInt(parcel, 1, n7);
        String string2 = this.zzb;
        SafeParcelWriter.writeString(parcel, 2, string2, false);
        Intent intent = this.zzc;
        SafeParcelWriter.writeParcelable(parcel, 3, (Parcelable)intent, n3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

