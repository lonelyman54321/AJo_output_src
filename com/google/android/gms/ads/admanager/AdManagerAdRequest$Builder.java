/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.ads.admanager;

import android.text.TextUtils;
import com.google.android.gms.ads.AbstractAdRequestBuilder;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.internal.client.zzdw;
import java.util.List;

public final class AdManagerAdRequest$Builder
extends AbstractAdRequestBuilder {
    public AdManagerAdRequest$Builder addCategoryExclusion(String string2) {
        this.zza.zzn(string2);
        return this;
    }

    public AdManagerAdRequest$Builder addCustomTargeting(String string2, String string3) {
        this.zza.zzp(string2, string3);
        return this;
    }

    public AdManagerAdRequest$Builder addCustomTargeting(String string2, List object) {
        if (object != null) {
            zzdw zzdw2 = this.zza;
            String string3 = ",";
            object = TextUtils.join((CharSequence)string3, (Iterable)object);
            zzdw2.zzp(string2, (String)object);
        }
        return this;
    }

    public AdManagerAdRequest build() {
        AdManagerAdRequest adManagerAdRequest = new AdManagerAdRequest(this, null);
        return adManagerAdRequest;
    }

    public AdManagerAdRequest$Builder self() {
        return this;
    }

    public AdManagerAdRequest$Builder setPublisherProvidedId(String string2) {
        this.zza.zzA(string2);
        return this;
    }
}

