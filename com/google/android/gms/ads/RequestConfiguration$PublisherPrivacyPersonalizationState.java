/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads;

public final class RequestConfiguration$PublisherPrivacyPersonalizationState
extends Enum {
    public static final /* enum */ RequestConfiguration$PublisherPrivacyPersonalizationState DEFAULT;
    public static final /* enum */ RequestConfiguration$PublisherPrivacyPersonalizationState DISABLED;
    public static final /* enum */ RequestConfiguration$PublisherPrivacyPersonalizationState ENABLED;
    private static final /* synthetic */ RequestConfiguration$PublisherPrivacyPersonalizationState[] zza;
    private final int zzb;

    static {
        RequestConfiguration$PublisherPrivacyPersonalizationState requestConfiguration$PublisherPrivacyPersonalizationState;
        RequestConfiguration$PublisherPrivacyPersonalizationState requestConfiguration$PublisherPrivacyPersonalizationState2;
        RequestConfiguration$PublisherPrivacyPersonalizationState requestConfiguration$PublisherPrivacyPersonalizationState3;
        DEFAULT = requestConfiguration$PublisherPrivacyPersonalizationState3 = new RequestConfiguration$PublisherPrivacyPersonalizationState("DEFAULT", 0, 0);
        int n3 = 1;
        ENABLED = requestConfiguration$PublisherPrivacyPersonalizationState2 = new RequestConfiguration$PublisherPrivacyPersonalizationState("ENABLED", n3, n3);
        int n4 = 2;
        DISABLED = requestConfiguration$PublisherPrivacyPersonalizationState = new RequestConfiguration$PublisherPrivacyPersonalizationState("DISABLED", n4, n4);
        RequestConfiguration$PublisherPrivacyPersonalizationState[] requestConfiguration$PublisherPrivacyPersonalizationStateArray = new RequestConfiguration$PublisherPrivacyPersonalizationState[3];
        requestConfiguration$PublisherPrivacyPersonalizationStateArray[0] = requestConfiguration$PublisherPrivacyPersonalizationState3;
        requestConfiguration$PublisherPrivacyPersonalizationStateArray[n3] = requestConfiguration$PublisherPrivacyPersonalizationState2;
        requestConfiguration$PublisherPrivacyPersonalizationStateArray[n4] = requestConfiguration$PublisherPrivacyPersonalizationState;
        zza = requestConfiguration$PublisherPrivacyPersonalizationStateArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private RequestConfiguration$PublisherPrivacyPersonalizationState() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzb = var3_2;
    }

    public static RequestConfiguration$PublisherPrivacyPersonalizationState valueOf(String string2) {
        return Enum.valueOf(RequestConfiguration$PublisherPrivacyPersonalizationState.class, string2);
    }

    public static RequestConfiguration$PublisherPrivacyPersonalizationState[] values() {
        return (RequestConfiguration$PublisherPrivacyPersonalizationState[])zza.clone();
    }

    public int getValue() {
        return this.zzb;
    }
}

