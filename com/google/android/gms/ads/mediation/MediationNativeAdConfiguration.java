/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.location.Location
 *  android.os.Bundle
 */
package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationAdConfiguration;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.internal.ads.zzbhk;

public class MediationNativeAdConfiguration
extends MediationAdConfiguration {
    private final zzbhk zza;

    public MediationNativeAdConfiguration(Context context, String string2, Bundle bundle, Bundle bundle2, boolean bl2, Location location, int n3, int n4, String string3, String string4, zzbhk zzbhk2) {
        super(context, string2, bundle, bundle2, bl2, location, n3, n4, string3, string4);
        this.zza = zzbhk2;
    }

    public NativeAdOptions getNativeAdOptions() {
        return zzbhk.zza(this.zza);
    }
}

