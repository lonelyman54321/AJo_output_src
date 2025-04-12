/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.AutoValue_ComplianceData$Builder;
import com.google.android.datatransport.cct.internal.ComplianceData$Builder;
import com.google.android.datatransport.cct.internal.ComplianceData$ProductIdOrigin;
import com.google.android.datatransport.cct.internal.ExternalPrivacyContext;

public abstract class ComplianceData {
    public static ComplianceData$Builder builder() {
        AutoValue_ComplianceData$Builder autoValue_ComplianceData$Builder = new AutoValue_ComplianceData$Builder();
        return autoValue_ComplianceData$Builder;
    }

    public abstract ExternalPrivacyContext getPrivacyContext();

    public abstract ComplianceData$ProductIdOrigin getProductIdOrigin();
}

