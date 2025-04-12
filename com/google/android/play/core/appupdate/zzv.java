/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.appupdate;

import com.google.android.play.core.appupdate.AppUpdateOptions;
import com.google.android.play.core.appupdate.AppUpdateOptions$Builder;
import com.google.android.play.core.appupdate.zzx;

final class zzv
extends AppUpdateOptions$Builder {
    private int zza;
    private boolean zzb;
    private byte zzc;

    public final AppUpdateOptions build() {
        int n3 = this.zzc;
        int n4 = 3;
        if (n3 != n4) {
            Object object;
            CharSequence charSequence = new StringBuilder();
            n4 = this.zzc & 1;
            if (n4 == 0) {
                object = " appUpdateType";
                charSequence.append((String)object);
            }
            if ((n4 = this.zzc & 2) == 0) {
                object = " allowAssetPackDeletion";
                charSequence.append((String)object);
            }
            charSequence = ((Object)charSequence).toString();
            charSequence = "Missing required properties:".concat((String)charSequence);
            object = new IllegalStateException((String)charSequence);
            throw object;
        }
        n4 = this.zza;
        boolean bl2 = this.zzb;
        zzx zzx2 = new zzx(n4, bl2, null);
        return zzx2;
    }

    public final AppUpdateOptions$Builder setAllowAssetPackDeletion(boolean bl2) {
        byte by2;
        this.zzb = bl2;
        this.zzc = by2 = (byte)(this.zzc | 2);
        return this;
    }

    public final AppUpdateOptions$Builder setAppUpdateType(int n3) {
        this.zza = n3;
        n3 = (byte)(this.zzc | 1);
        this.zzc = (byte)n3;
        return this;
    }
}

