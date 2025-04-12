/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.appupdate;

import com.google.android.play.core.appupdate.AppUpdateOptions;
import com.google.android.play.core.appupdate.zzw;

final class zzx
extends AppUpdateOptions {
    private final int zza;
    private final boolean zzb;

    public /* synthetic */ zzx(int n3, boolean bl2, zzw zzw2) {
        this.zza = n3;
        this.zzb = bl2;
    }

    public final boolean allowAssetPackDeletion() {
        return this.zzb;
    }

    public final int appUpdateType() {
        return this.zza;
    }

    public final boolean equals(Object object) {
        int n3;
        int n4;
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        int n7 = object instanceof AppUpdateOptions;
        if (n7 != 0 && (n7 = this.zza) == (n4 = ((AppUpdateOptions)(object = (AppUpdateOptions)object)).appUpdateType()) && (n7 = (int)(this.zzb ? 1 : 0)) == (n3 = ((AppUpdateOptions)object).allowAssetPackDeletion())) {
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.zza;
        int n4 = 1000003;
        int n7 = 1;
        int n8 = this.zzb;
        n7 = n7 != n8 ? 1237 : 1231;
        return (n3 ^= n4) * n4 ^ n7;
    }

    public final String toString() {
        int n3 = this.zza;
        boolean bl2 = this.zzb;
        StringBuilder stringBuilder = new StringBuilder("AppUpdateOptions{appUpdateType=");
        stringBuilder.append(n3);
        stringBuilder.append(", allowAssetPackDeletion=");
        stringBuilder.append(bl2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

