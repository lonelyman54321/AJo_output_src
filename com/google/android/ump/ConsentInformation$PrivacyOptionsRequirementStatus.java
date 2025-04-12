/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.ump;

public final class ConsentInformation$PrivacyOptionsRequirementStatus
extends Enum {
    public static final /* enum */ ConsentInformation$PrivacyOptionsRequirementStatus NOT_REQUIRED;
    public static final /* enum */ ConsentInformation$PrivacyOptionsRequirementStatus REQUIRED;
    public static final /* enum */ ConsentInformation$PrivacyOptionsRequirementStatus UNKNOWN;
    private static final /* synthetic */ ConsentInformation$PrivacyOptionsRequirementStatus[] zza;

    static {
        ConsentInformation$PrivacyOptionsRequirementStatus consentInformation$PrivacyOptionsRequirementStatus;
        ConsentInformation$PrivacyOptionsRequirementStatus consentInformation$PrivacyOptionsRequirementStatus2;
        ConsentInformation$PrivacyOptionsRequirementStatus consentInformation$PrivacyOptionsRequirementStatus3;
        UNKNOWN = consentInformation$PrivacyOptionsRequirementStatus3 = new ConsentInformation$PrivacyOptionsRequirementStatus("UNKNOWN", 0);
        int n3 = 1;
        NOT_REQUIRED = consentInformation$PrivacyOptionsRequirementStatus2 = new ConsentInformation$PrivacyOptionsRequirementStatus("NOT_REQUIRED", n3);
        int n4 = 2;
        REQUIRED = consentInformation$PrivacyOptionsRequirementStatus = new ConsentInformation$PrivacyOptionsRequirementStatus("REQUIRED", n4);
        ConsentInformation$PrivacyOptionsRequirementStatus[] consentInformation$PrivacyOptionsRequirementStatusArray = new ConsentInformation$PrivacyOptionsRequirementStatus[3];
        consentInformation$PrivacyOptionsRequirementStatusArray[0] = consentInformation$PrivacyOptionsRequirementStatus3;
        consentInformation$PrivacyOptionsRequirementStatusArray[n3] = consentInformation$PrivacyOptionsRequirementStatus2;
        consentInformation$PrivacyOptionsRequirementStatusArray[n4] = consentInformation$PrivacyOptionsRequirementStatus;
        zza = consentInformation$PrivacyOptionsRequirementStatusArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ConsentInformation$PrivacyOptionsRequirementStatus() {
        void var2_-1;
        void var1_-1;
    }

    public static ConsentInformation$PrivacyOptionsRequirementStatus valueOf(String string2) {
        return Enum.valueOf(ConsentInformation$PrivacyOptionsRequirementStatus.class, string2);
    }

    public static ConsentInformation$PrivacyOptionsRequirementStatus[] values() {
        return (ConsentInformation$PrivacyOptionsRequirementStatus[])zza.clone();
    }
}

