/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.RequestConfiguration$PublisherPrivacyPersonalizationState;
import com.google.android.gms.ads.internal.util.client.zzm;
import java.util.List;

public class RequestConfiguration$Builder {
    private int zza;
    private int zzb;
    private String zzc;
    private final List zzd;
    private RequestConfiguration$PublisherPrivacyPersonalizationState zze;

    public RequestConfiguration$Builder() {
        Object object;
        int n3;
        this.zza = n3 = -1;
        this.zzb = n3;
        this.zzc = null;
        this.zzd = object = new Object();
        object = RequestConfiguration$PublisherPrivacyPersonalizationState.DEFAULT;
        this.zze = object;
    }

    public RequestConfiguration build() {
        int n3 = this.zza;
        int n4 = this.zzb;
        String string2 = this.zzc;
        List list = this.zzd;
        RequestConfiguration$PublisherPrivacyPersonalizationState requestConfiguration$PublisherPrivacyPersonalizationState = this.zze;
        RequestConfiguration requestConfiguration = new RequestConfiguration(n3, n4, string2, list, requestConfiguration$PublisherPrivacyPersonalizationState, null);
        return requestConfiguration;
    }

    public RequestConfiguration$Builder setMaxAdContentRating(String string2) {
        String string3;
        boolean bl2;
        if (string2 != null && !(bl2 = (string3 = "").equals(string2))) {
            string3 = "G";
            bl2 = string3.equals(string2);
            if (!(bl2 || (bl2 = (string3 = "PG").equals(string2)) || (bl2 = (string3 = "T").equals(string2)) || (bl2 = (string3 = "MA").equals(string2)))) {
                string3 = "Invalid value passed to setMaxAdContentRating: ";
                string2 = string3.concat(string2);
                zzm.zzj(string2);
            } else {
                this.zzc = string2;
            }
        } else {
            string2 = null;
            this.zzc = null;
        }
        return this;
    }

    public RequestConfiguration$Builder setPublisherPrivacyPersonalizationState(RequestConfiguration$PublisherPrivacyPersonalizationState requestConfiguration$PublisherPrivacyPersonalizationState) {
        this.zze = requestConfiguration$PublisherPrivacyPersonalizationState;
        return this;
    }

    public RequestConfiguration$Builder setTagForChildDirectedTreatment(int n3) {
        int n4 = -1;
        if (n3 != n4 && n3 != 0 && n3 != (n4 = 1)) {
            String string2 = "Invalid value passed to setTagForChildDirectedTreatment: ";
            StringBuilder stringBuilder = new StringBuilder(string2);
            stringBuilder.append(n3);
            String string3 = stringBuilder.toString();
            zzm.zzj(string3);
        } else {
            this.zza = n3;
        }
        return this;
    }

    public RequestConfiguration$Builder setTagForUnderAgeOfConsent(int n3) {
        int n4 = -1;
        if (n3 != n4 && n3 != 0 && n3 != (n4 = 1)) {
            String string2 = "Invalid value passed to setTagForUnderAgeOfConsent: ";
            StringBuilder stringBuilder = new StringBuilder(string2);
            stringBuilder.append(n3);
            String string3 = stringBuilder.toString();
            zzm.zzj(string3);
        } else {
            this.zzb = n3;
        }
        return this;
    }

    public RequestConfiguration$Builder setTestDeviceIds(List list) {
        List list2 = this.zzd;
        list2.clear();
        if (list != null) {
            list2 = this.zzd;
            list2.addAll(list);
        }
        return this;
    }
}

