/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads;

import com.google.android.gms.ads.RequestConfiguration$Builder;
import com.google.android.gms.ads.RequestConfiguration$PublisherPrivacyPersonalizationState;
import com.google.android.gms.ads.zzh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RequestConfiguration {
    public static final String MAX_AD_CONTENT_RATING_G = "G";
    public static final String MAX_AD_CONTENT_RATING_MA = "MA";
    public static final String MAX_AD_CONTENT_RATING_PG = "PG";
    public static final String MAX_AD_CONTENT_RATING_T = "T";
    public static final String MAX_AD_CONTENT_RATING_UNSPECIFIED = "";
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = 255;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_FALSE = 0;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_TRUE = 1;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED = 255;
    public static final List zza = Arrays.asList("MA", "T", "PG", "G");
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private final List zze;
    private final RequestConfiguration$PublisherPrivacyPersonalizationState zzf;

    public /* synthetic */ RequestConfiguration(int n3, int n4, String string2, List list, RequestConfiguration$PublisherPrivacyPersonalizationState requestConfiguration$PublisherPrivacyPersonalizationState, zzh zzh2) {
        this.zzb = n3;
        this.zzc = n4;
        this.zzd = string2;
        this.zze = list;
        this.zzf = requestConfiguration$PublisherPrivacyPersonalizationState;
    }

    public String getMaxAdContentRating() {
        String string2 = this.zzd;
        if (string2 == null) {
            string2 = MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        return string2;
    }

    public RequestConfiguration$PublisherPrivacyPersonalizationState getPublisherPrivacyPersonalizationState() {
        return this.zzf;
    }

    public int getTagForChildDirectedTreatment() {
        return this.zzb;
    }

    public int getTagForUnderAgeOfConsent() {
        return this.zzc;
    }

    public List getTestDeviceIds() {
        List list = this.zze;
        ArrayList arrayList = new ArrayList(list);
        return arrayList;
    }

    public RequestConfiguration$Builder toBuilder() {
        RequestConfiguration$Builder requestConfiguration$Builder = new RequestConfiguration$Builder();
        int n3 = this.zzb;
        requestConfiguration$Builder.setTagForChildDirectedTreatment(n3);
        n3 = this.zzc;
        requestConfiguration$Builder.setTagForUnderAgeOfConsent(n3);
        Object object = this.zzd;
        requestConfiguration$Builder.setMaxAdContentRating((String)object);
        object = this.zze;
        requestConfiguration$Builder.setTestDeviceIds((List)object);
        return requestConfiguration$Builder;
    }
}

