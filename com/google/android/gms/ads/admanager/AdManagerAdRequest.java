/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.ads.admanager;

import android.os.Bundle;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.admanager.AdManagerAdRequest$Builder;
import com.google.android.gms.ads.admanager.zza;

public final class AdManagerAdRequest
extends AdRequest {
    public /* synthetic */ AdManagerAdRequest(AdManagerAdRequest$Builder adManagerAdRequest$Builder, zza zza2) {
        super(adManagerAdRequest$Builder);
    }

    public Bundle getCustomTargeting() {
        return this.zza.zze();
    }

    public String getPublisherProvidedId() {
        return this.zza.zzl();
    }
}

