/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.view.MotionEvent
 */
package com.google.android.gms.ads.query;

import android.net.Uri;
import android.view.MotionEvent;
import com.google.android.gms.ads.query.ReportingInfo$Builder;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import com.google.android.gms.ads.query.zzb;
import com.google.android.gms.internal.ads.zzbwc;
import com.google.android.gms.internal.ads.zzbwd;
import java.util.List;

public final class ReportingInfo {
    private final zzbwd zza;

    public /* synthetic */ ReportingInfo(ReportingInfo$Builder object, zzb object2) {
        object = ReportingInfo$Builder.zza((ReportingInfo$Builder)object);
        this.zza = object2 = new zzbwd((zzbwc)object);
    }

    public void recordClick(List list) {
        this.zza.zza(list);
    }

    public void recordImpression(List list) {
        this.zza.zzb(list);
    }

    public void reportTouchEvent(MotionEvent motionEvent) {
        this.zza.zzc(motionEvent);
    }

    public void updateClickUrl(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        this.zza.zzd(uri, updateClickUrlCallback);
    }

    public void updateImpressionUrls(List list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.zza.zze(list, updateImpressionUrlsCallback);
    }
}

