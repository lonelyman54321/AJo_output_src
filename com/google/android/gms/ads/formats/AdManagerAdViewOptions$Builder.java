/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.formats;

import com.google.android.gms.ads.formats.AdManagerAdViewOptions;

public final class AdManagerAdViewOptions$Builder {
    private boolean zza = false;

    public static /* bridge */ /* synthetic */ boolean zza(AdManagerAdViewOptions$Builder adManagerAdViewOptions$Builder) {
        return adManagerAdViewOptions$Builder.zza;
    }

    public AdManagerAdViewOptions build() {
        AdManagerAdViewOptions adManagerAdViewOptions = new AdManagerAdViewOptions(this, null);
        return adManagerAdViewOptions;
    }

    public AdManagerAdViewOptions$Builder setManualImpressionsEnabled(boolean bl2) {
        this.zza = bl2;
        return this;
    }
}

