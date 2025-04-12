/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import java.util.Map;

public interface NativeMediationAdRequest
extends MediationAdRequest {
    public float getAdVolume();

    public com.google.android.gms.ads.formats.NativeAdOptions getNativeAdOptions();

    public NativeAdOptions getNativeAdRequestOptions();

    public boolean isAdMuted();

    public boolean isUnifiedNativeAdRequested();

    public Map zza();

    public boolean zzb();
}

