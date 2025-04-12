/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 */
package com.google.android.play.core.review;

import android.app.PendingIntent;
import com.google.android.play.core.review.ReviewInfo;

final class zza
extends ReviewInfo {
    private final PendingIntent zza;
    private final boolean zzb;

    public zza(PendingIntent object, boolean bl2) {
        if (object != null) {
            this.zza = object;
            this.zzb = bl2;
            return;
        }
        super("Null pendingIntent");
        throw object;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        boolean bl3 = true;
        if (object == this) {
            return bl3;
        }
        boolean bl4 = object instanceof ReviewInfo;
        if (bl4 && (bl4 = (pendingIntent2 = this.zza).equals((Object)(pendingIntent = ((ReviewInfo)(object = (ReviewInfo)object)).zza()))) && (bl4 = this.zzb) == (bl2 = ((ReviewInfo)object).zzb())) {
            return bl3;
        }
        return false;
    }

    public final int hashCode() {
        PendingIntent pendingIntent = this.zza;
        int n3 = pendingIntent.hashCode();
        int n4 = 1000003;
        int n7 = 1;
        int n8 = this.zzb;
        n7 = n7 != n8 ? 1237 : 1231;
        return (n3 ^= n4) * n4 ^ n7;
    }

    public final String toString() {
        CharSequence charSequence = this.zza.toString();
        charSequence = Gn.a("ReviewInfo{pendingIntent=", charSequence, ", isNoOp=");
        boolean bl2 = this.zzb;
        return Vm.a("}", bl2, (StringBuilder)charSequence);
    }

    public final PendingIntent zza() {
        return this.zza;
    }

    public final boolean zzb() {
        return this.zzb;
    }
}

