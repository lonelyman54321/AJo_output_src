/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.gms.ads.query;

import android.view.View;
import com.google.android.gms.ads.query.ReportingInfo;
import com.google.android.gms.internal.ads.zzbwc;
import java.util.Map;

public final class ReportingInfo$Builder {
    private final zzbwc zza;

    public ReportingInfo$Builder(View view) {
        zzbwc zzbwc2;
        this.zza = zzbwc2 = new zzbwc();
        zzbwc2.zzb(view);
    }

    public static /* bridge */ /* synthetic */ zzbwc zza(ReportingInfo$Builder reportingInfo$Builder) {
        return reportingInfo$Builder.zza;
    }

    public ReportingInfo build() {
        ReportingInfo reportingInfo = new ReportingInfo(this, null);
        return reportingInfo;
    }

    public ReportingInfo$Builder setAssetViews(Map map2) {
        this.zza.zzc(map2);
        return this;
    }
}

